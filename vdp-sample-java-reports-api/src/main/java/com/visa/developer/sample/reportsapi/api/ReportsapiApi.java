package com.visa.developer.sample.reportsapi.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.reportsapi.ApiException;
import com.visa.developer.sample.reportsapi.ApiClient;
import com.visa.developer.sample.reportsapi.Configuration;
import com.visa.developer.sample.reportsapi.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.reportsapi.auth.Authentication;
import com.visa.developer.sample.reportsapi.auth.HttpBasicAuth;
import com.visa.developer.sample.reportsapi.auth.ApiKeyAuth;

public class ReportsapiApi {
  private ApiClient apiClient;

  public ReportsapiApi(HashMap<String, String> auth) {
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
   * TransactionData
   * Transaction Data
   * @param fromDate  (optional)
   * @param toDate  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String reportingApi(
      
       String 
      fromDate, 
      
       String 
      toDate) throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/visadirect/reports/v1/transactiondata";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "reports/v1/transactiondata";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromDate", fromDate));    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toDate", toDate));
    final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void reportingApi_Example() throws ApiException,IOException {
      String fromDate = "21042016";String toDate = "21042016";
       String response = this.reportingApi( fromDate,  toDate);
    }



}
