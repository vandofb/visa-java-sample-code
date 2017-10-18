package com.visa.developer.sample.merchantsearch.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.merchantsearch.ApiException;
import com.visa.developer.sample.merchantsearch.ApiClient;
import com.visa.developer.sample.merchantsearch.Configuration;
import com.visa.developer.sample.merchantsearch.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.merchantsearch.auth.Authentication;
import com.visa.developer.sample.merchantsearch.auth.HttpBasicAuth;
import com.visa.developer.sample.merchantsearch.auth.ApiKeyAuth;

public class MerchantsearchApi {
  private ApiClient apiClient;

  public MerchantsearchApi(HashMap<String, String> auth) {
    HttpBasicAuth authInstance = new HttpBasicAuth();
    authInstance.setPassword(auth.get("password"));
    authInstance.setUsername(auth.get("username"));
    authInstance.setKEYSTORE_PATH(auth.get("keystore_path"));
    authInstance.setKEYSTORE_PASSWORD(auth.get("keystore_password"));
    authInstance.setPRIVATE_KEY_PASSWORD(auth.get("private_key_password"));
    ApiClient apiClient = new ApiClient(authInstance);
    this.apiClient = apiClient;
  }

  /**
   * Merchant Search
   * 
   * @param merchantSearchPOSTPayload Resource body for Merchant Search (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String merchantSearch(
      
       String 
      merchantSearchPOSTPayload) throws ApiException {
    Object localVarPostBody = merchantSearchPOSTPayload;
    //
    
    // verify the required parameter 'merchantSearchPOSTPayload' is set
    if (merchantSearchPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantSearchPOSTPayload' when calling merchantSearch");
    }
    if(localVarPostBody != null) {
        merchantSearchPOSTPayload = merchantSearchPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = merchantSearchPOSTPayload;
    }
    
    // create path and map variables
    String path = "/merchantsearch/v1/search";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "v1/search";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void merchantSearch_Example() throws ApiException,IOException {
      String merchantSearchPOSTPayload = "21042016";
      merchantSearchPOSTPayload = "{\"responseAttrList\": [\"GNSTANDARD\"], \"header\": {\"messageDateTime\": \"2016-05-02T02:33:55.903\", \"startIndex\": \"0\", \"requestMessageId\": \"Request_001\"}, \"searchOptions\": {\"matchScore\": \"true\", \"proximity\": [\"merchantName\"], \"wildCard\": [\"merchantName\"], \"maxRecords\": \"5\", \"matchIndicators\": \"true\"}, \"searchAttrList\": {\"merchantPostalCode\": \"48858\", \"merchantCity\": \"Mount Pleasant\", \"merchantState\": \"MI\", \"merchantName\": \"cmu edctn materials cntr\", \"merchantCountryCode\": \"840\"}}";
      String response = this.merchantSearch(merchantSearchPOSTPayload);

    }



}
