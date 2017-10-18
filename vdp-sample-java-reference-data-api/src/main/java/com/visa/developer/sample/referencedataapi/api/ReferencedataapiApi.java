package com.visa.developer.sample.referencedataapi.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.referencedataapi.ApiException;
import com.visa.developer.sample.referencedataapi.ApiClient;
import com.visa.developer.sample.referencedataapi.Configuration;
import com.visa.developer.sample.referencedataapi.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.referencedataapi.auth.Authentication;
import com.visa.developer.sample.referencedataapi.auth.HttpBasicAuth;
import com.visa.developer.sample.referencedataapi.auth.ApiKeyAuth;

public class ReferencedataapiApi {
  private ApiClient apiClient;

  public ReferencedataapiApi(HashMap<String, String> auth) {
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
   * Retrieve Data by Merchant
   * Retrieve Data by merchant
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String retrieveDataByMerchant() throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/vmorc/data/v1/merchant";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "data/v1/merchant";
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
    return apiClient.invokeAPI(path, resourcePath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void retrieveDataByMerchant_Example() throws ApiException,IOException {
      
       String response = this.retrieveDataByMerchant();
    }

  /**
   * Retrieve Data by Merchant Address
   * Get merchant address data
   * @param merchantIds  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String retrieveDataByMerchantAddress(
      
       String 
      merchantIds) throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/vmorc/data/v1/merchantAddress";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "data/v1/merchantAddress";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "merchantIds", merchantIds));
    final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void retrieveDataByMerchantAddress_Example() throws ApiException,IOException {
      String merchantIds = "21042016";
       String response = this.retrieveDataByMerchantAddress( merchantIds);
    }

  /**
   * Retrieve Data by Reference
   * Retrieve Data by reference
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String retrieveDataByReference() throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/vmorc/data/v1/ref";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "data/v1/ref";
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
    return apiClient.invokeAPI(path, resourcePath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void retrieveDataByReference_Example() throws ApiException,IOException {
      
       String response = this.retrieveDataByReference();
    }



}
