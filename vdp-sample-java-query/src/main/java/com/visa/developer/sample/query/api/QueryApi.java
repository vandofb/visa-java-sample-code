package com.visa.developer.sample.query.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.query.ApiException;
import com.visa.developer.sample.query.ApiClient;
import com.visa.developer.sample.query.Configuration;
import com.visa.developer.sample.query.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.query.auth.Authentication;
import com.visa.developer.sample.query.auth.HttpBasicAuth;
import com.visa.developer.sample.query.auth.ApiKeyAuth;

public class QueryApi {
  private ApiClient apiClient;

  public QueryApi(HashMap<String, String> auth) {
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
   * Transaction Query using GET
   * The Transaction Query API can be used to determine the processing status of a transaction or to retreive the lifecycle of a transaction. This API can be used to check whether a PullFunds, PushFunds or ReverseFunds transaction processed successfully if received by Visa. This API could also be used to retrieve the detailed lifecycle or history of a transaction (e.g. original transaction, chargeback, chargeback reversal etc).
   * @param acquiringBIN  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String transactionQuery(
      
       String 
      acquiringBIN) throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/visadirect/v1/transactionquery";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "v1/transactionquery";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "acquiringBIN", acquiringBIN));
    final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void transactionQuery_Example() throws ApiException,IOException {
      String acquiringBIN = "21042016";
       String response = this.transactionQuery( acquiringBIN);
    }



}
