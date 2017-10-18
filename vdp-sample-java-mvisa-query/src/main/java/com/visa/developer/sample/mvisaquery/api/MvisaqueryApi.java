package com.visa.developer.sample.mvisaquery.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.mvisaquery.ApiException;
import com.visa.developer.sample.mvisaquery.ApiClient;
import com.visa.developer.sample.mvisaquery.Configuration;
import com.visa.developer.sample.mvisaquery.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.mvisaquery.auth.Authentication;
import com.visa.developer.sample.mvisaquery.auth.HttpBasicAuth;
import com.visa.developer.sample.mvisaquery.auth.ApiKeyAuth;

public class MvisaqueryApi {
  private ApiClient apiClient;

  public MvisaqueryApi(HashMap<String, String> auth) {
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
   * Transaction Query
   * The MVISA Transaction Query API can be used to determine the processing status of a transaction or to retreive the lifecycle of a transaction. This API can be used to check whether a PullFunds, PushFunds or ReverseFunds transaction processed successfully if received by Visa. This API could also be used to retrieve the detailed lifecycle or history of a transaction (e.g. original transaction, chargeback, chargeback reversal etc).
   * @param mvisaTranactionQueryPOSTPayload Resource body for Transaction Query (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String mvisaTranactionQuery(
      
       String 
      mvisaTranactionQueryPOSTPayload) throws ApiException {
    Object localVarPostBody = mvisaTranactionQueryPOSTPayload;
    //
    
    // verify the required parameter 'mvisaTranactionQueryPOSTPayload' is set
    if (mvisaTranactionQueryPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'mvisaTranactionQueryPOSTPayload' when calling mvisaTranactionQuery");
    }
    if(localVarPostBody != null) {
        mvisaTranactionQueryPOSTPayload = mvisaTranactionQueryPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = mvisaTranactionQueryPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/v1/mvisa/transactionquery";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "v1/mvisa/transactionquery";
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
    public void mvisaTranactionQuery_Example() throws ApiException,IOException {
      String mvisaTranactionQueryPOSTPayload = "21042016";
      mvisaTranactionQueryPOSTPayload = "{\"consumerPAN\": \"4761360055652118\", \"merchantPAN\": \"4761360055652118\", \"offset\": \"11\"}";
      String response = this.mvisaTranactionQuery(mvisaTranactionQueryPOSTPayload);

    }



}
