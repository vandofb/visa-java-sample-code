package com.visa.developer.sample.aliasapi.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.aliasapi.ApiException;
import com.visa.developer.sample.aliasapi.ApiClient;
import com.visa.developer.sample.aliasapi.Configuration;
import com.visa.developer.sample.aliasapi.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.aliasapi.auth.Authentication;
import com.visa.developer.sample.aliasapi.auth.HttpBasicAuth;
import com.visa.developer.sample.aliasapi.auth.ApiKeyAuth;

public class AliasapiApi {
  private ApiClient apiClient;

  public AliasapiApi(HashMap<String, String> auth) {
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
   * Create Alias
   * Create an alias in the Alias Directory.
   * @param createAliasPOSTPayload Resource body for Create Alias (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String createAlias(
      
       String 
      createAliasPOSTPayload) throws ApiException {
    Object localVarPostBody = createAliasPOSTPayload;
    //
    
    // verify the required parameter 'createAliasPOSTPayload' is set
    if (createAliasPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'createAliasPOSTPayload' when calling createAlias");
    }
    if(localVarPostBody != null) {
        createAliasPOSTPayload = createAliasPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = createAliasPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/v1/vad/manage/createalias";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "v1/vad/manage/createalias";
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
    public void createAlias_Example() throws ApiException,IOException {
      String createAliasPOSTPayload = "21042016";
      createAliasPOSTPayload = "{\"city\": \"Mombasa\", \"consentDateTime\": \"2017-08-01 01:02:03\", \"country\": \"KEN\", \"recipientPrimaryAccountNumber\": \"4761104386270368\", \"alias\": \"254711001139\", \"cardType\": \"Orange Money Visa Card\", \"aliasType\": \"01\", \"postalCode\": \"80100\", \"recipientName\": \"John Kamau\", \"issuerName\": \"EQUITY BANK\", \"guid\": \"xs126C28F09C76ED17944660\"}";
      String response = this.createAlias(createAliasPOSTPayload);

    }

  /**
   * Delete Alias
   * Delete alias of a recipient from the Alias Directory.
   * @param deleteAliasPOSTPayload Resource body for Delete Alias (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String deleteAlias(
      
       String 
      deleteAliasPOSTPayload) throws ApiException {
    Object localVarPostBody = deleteAliasPOSTPayload;
    //
    
    // verify the required parameter 'deleteAliasPOSTPayload' is set
    if (deleteAliasPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteAliasPOSTPayload' when calling deleteAlias");
    }
    if(localVarPostBody != null) {
        deleteAliasPOSTPayload = deleteAliasPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = deleteAliasPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/v1/vad/manage/deletealias";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "v1/vad/manage/deletealias";
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
    public void deleteAlias_Example() throws ApiException,IOException {
      String deleteAliasPOSTPayload = "21042016";
      deleteAliasPOSTPayload = "{\"alias\": \"254712001166\", \"guid\": \"xs126c28f09c76ed17944660\"}";
      String response = this.deleteAlias(deleteAliasPOSTPayload);

    }

  /**
   * GetAlias
   * Get alias and recipient&#39;s related data.
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String getAlias() throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/visadirect/v1/vad/manage/{guid}";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "v1/vad/manage/{guid}";
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
    public void getAlias_Example() throws ApiException,IOException {
      
       String response = this.getAlias();
    }

  /**
   * Resolve
   * Resolve an alias for recipient&#39;s primary account number (PAN) and related data.
   * @param resolvePOSTPayload Resource body for Resolve (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String resolve(
      
       String 
      resolvePOSTPayload) throws ApiException {
    Object localVarPostBody = resolvePOSTPayload;
    //
    
    // verify the required parameter 'resolvePOSTPayload' is set
    if (resolvePOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'resolvePOSTPayload' when calling resolve");
    }
    if(localVarPostBody != null) {
        resolvePOSTPayload = resolvePOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = resolvePOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/v1/vad/resolve";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "v1/vad/resolve";
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
    public void resolve_Example() throws ApiException,IOException {
      String resolvePOSTPayload = "21042016";
      resolvePOSTPayload = "{\"alias\": \"254711001139\", \"businessApplicationId\": \"PP\"}";
      String response = this.resolve(resolvePOSTPayload);

    }

  /**
   * Update Alias
   * Update alias and recipient data in the Alias Directory
   * @param updateAliasPOSTPayload Resource body for Update Alias (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String updateAlias(
      
       String 
      updateAliasPOSTPayload) throws ApiException {
    Object localVarPostBody = updateAliasPOSTPayload;
    //
    
    // verify the required parameter 'updateAliasPOSTPayload' is set
    if (updateAliasPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'updateAliasPOSTPayload' when calling updateAlias");
    }
    if(localVarPostBody != null) {
        updateAliasPOSTPayload = updateAliasPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = updateAliasPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/v1/vad/manage/updatealias";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "v1/vad/manage/updatealias";
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
    public void updateAlias_Example() throws ApiException,IOException {
      String updateAliasPOSTPayload = "21042016";
      updateAliasPOSTPayload = "{\"city\": \"Nairobi\", \"consentDateTime\": \"2017-08-01 01:02:03\", \"country\": \"KEN\", \"recipientPrimaryAccountNumber\": \"4761102848743550\", \"alias\": \"254712001166\", \"cardType\": \"Local Visa Classic\", \"aliasType\": \"01\", \"postalCode\": \"00101\", \"recipientName\": \"Ike Njoroge\", \"issuerName\": \"CO-OPERATIVE BANK\", \"guid\": \"xs126C28F09C76ED17944660\"}";
      String response = this.updateAlias(updateAliasPOSTPayload);

    }



}
