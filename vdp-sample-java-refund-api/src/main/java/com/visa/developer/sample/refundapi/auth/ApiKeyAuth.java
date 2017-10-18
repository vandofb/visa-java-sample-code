package com.visa.developer.sample.refundapi.auth;

import com.visa.developer.sample.refundapi.Pair;

import java.util.Map;
import java.util.List;
import java.math.BigInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import org.apache.commons.lang3.RandomStringUtils;

public class ApiKeyAuth implements Authentication{

  private final String X_PAY_TOKEN_PARAM_NAME = "x-pay-token";
  private final String CORRELATION_ID ="ex-correlation-id";
      private String apiKey;
      private String apiKeyValue;
      private String apiKeyPrefix;
      private String sharedSecret;

      public ApiKeyAuth() {
      }

      public String getApiKey() {
          return apiKey;
      }

      public void setApiKey(String apiKey) {
          this.apiKey = "apikey=" + apiKey;
          this.apiKeyValue = apiKey;
      }

      public String getApiKeyPrefix() {
          return apiKeyPrefix;
      }

      public void setApiKeyPrefix(String apiKeyPrefix) {
          this.apiKeyPrefix = apiKeyPrefix;
      }

      public String getSharedSecret() {
          return sharedSecret;
      }

      public void setSharedSecret(String sharedSecret) {
          this.sharedSecret = sharedSecret;
      }

      @Override
      public void applyToParams(String path, Object requestBody, Map<String, String> headerParams, List<Pair> queryParams) {
          if (apiKey == null) {
              return;
          }
          String token;
          try {
              token = generateXpaytoken(path, apiKey, requestBody==null?"":requestBody.toString(),sharedSecret);
              headerParams.put(X_PAY_TOKEN_PARAM_NAME, token);
              queryParams.add(new Pair("apikey",apiKeyValue));
              headerParams.put(CORRELATION_ID, getCorrelationId());
          } catch (SignatureException e) {
              // FIXME Handle the exception
              e.printStackTrace();
          }
      }

public static String generateXpaytoken(String resourcePath, String queryString,
		String requestBody, String sharedSecret) throws SignatureException {
    String timestamp = timeStamp();
    String beforeHash = timestamp + resourcePath + queryString + requestBody;
    String hash = hmacSha256Digest(beforeHash, sharedSecret);
    String token = "xv2:" + timestamp + ":" + hash;
    return token;
}

private static String timeStamp() {
        return String.valueOf(System.currentTimeMillis()/ 1000L);
    }

private static String hmacSha256Digest(String data, String sharedSecret)
        throws SignatureException {
    return getDigest("HmacSHA256", sharedSecret, data, true);
}

private static String getDigest(String algorithm, String sharedSecret, String data,  boolean toLower) throws SignatureException {
    try {
        Mac sha256HMAC = Mac.getInstance(algorithm);
        SecretKeySpec secretKey = new SecretKeySpec(sharedSecret.getBytes(StandardCharsets.UTF_8), algorithm);
        sha256HMAC.init(secretKey);

        byte[] hashByte = sha256HMAC.doFinal(data.getBytes(StandardCharsets.UTF_8));
        String hashString = toHex(hashByte);

        return toLower ? hashString.toLowerCase() : hashString;
    } catch (Exception e) {
        throw new SignatureException(e);
    }
}

private static String toHex(byte[] bytes) {
    BigInteger bi = new BigInteger(1, bytes);
    return String.format("%0" + (bytes.length << 1) + "X", bi);
}
/**
 * Get Correlation Id for the API Call.
 * @return correlation Id
 */
private String getCorrelationId() {
    //Passing correlation Id header is optional while making an API call.
    return RandomStringUtils.random(10, true, true) + "_SC";
}
}
