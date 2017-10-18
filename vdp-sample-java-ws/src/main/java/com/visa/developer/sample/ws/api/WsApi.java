package com.visa.developer.sample.ws.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.ws.ApiException;
import com.visa.developer.sample.ws.ApiClient;
import com.visa.developer.sample.ws.Configuration;
import com.visa.developer.sample.ws.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.ws.auth.Authentication;
import com.visa.developer.sample.ws.auth.HttpBasicAuth;
import com.visa.developer.sample.ws.auth.ApiKeyAuth;

public class WsApi {
  private ApiClient apiClient;

  public WsApi(HashMap<String, String> auth) {
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
   * Get Status
   * Provide an OFAC score value used for evaluation on how closely an individual&#39;s name, city, and country input fields match against entries on the OFAC SDN lists. It also provides an OFAC status value which represents how VisaNet would process the individual&#39;s information if used in a cross-border OCT transaction.
   * @param watchlistinquiryPOSTPayload Resource body for Get Status (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String watchlistinquiry(
      
       String 
      watchlistinquiryPOSTPayload) throws ApiException {
    Object localVarPostBody = watchlistinquiryPOSTPayload;
    //
    
    // verify the required parameter 'watchlistinquiryPOSTPayload' is set
    if (watchlistinquiryPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'watchlistinquiryPOSTPayload' when calling watchlistinquiry");
    }
    if(localVarPostBody != null) {
        watchlistinquiryPOSTPayload = watchlistinquiryPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = watchlistinquiryPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/watchlistscreening/v1/watchlistinquiry";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "watchlistscreening/v1/watchlistinquiry";
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
    public void watchlistinquiry_Example() throws ApiException,IOException {
      String watchlistinquiryPOSTPayload = "21042016";
      watchlistinquiryPOSTPayload = "{\"acquiringBin\": \"408999\", \"address\": {\"city\": \"San Francisco\", \"cardIssuerCountryCode\": \"USA\"}, \"acquirerCountryCode\": \"840\", \"name\": \"Mohammed Qasim\", \"referenceNumber\": \"330000550000\"}";
      String response = this.watchlistinquiry(watchlistinquiryPOSTPayload);

    }



}
