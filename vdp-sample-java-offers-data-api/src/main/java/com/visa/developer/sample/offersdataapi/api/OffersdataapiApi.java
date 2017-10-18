package com.visa.developer.sample.offersdataapi.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.offersdataapi.ApiException;
import com.visa.developer.sample.offersdataapi.ApiClient;
import com.visa.developer.sample.offersdataapi.Configuration;
import com.visa.developer.sample.offersdataapi.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.offersdataapi.auth.Authentication;
import com.visa.developer.sample.offersdataapi.auth.HttpBasicAuth;
import com.visa.developer.sample.offersdataapi.auth.ApiKeyAuth;

public class OffersdataapiApi {
  private ApiClient apiClient;

  public OffersdataapiApi(HashMap<String, String> auth) {
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
   * Retrieve All Offers
   * Request for all offers
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String retrieveAllOffers() throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/vmorc/offers/v1/all";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "offers/v1/all";
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
    public void retrieveAllOffers_Example() throws ApiException,IOException {
      
       String response = this.retrieveAllOffers();
    }

  /**
   * Retrieve Offers by a Content Id
   * Request for offers by content id
   * @param contentid  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String retrieveOffersByContentId(
      
       String 
      contentid) throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/vmorc/offers/v1/bycontentid";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "offers/v1/bycontentid";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentid", contentid));
    final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void retrieveOffersByContentId_Example() throws ApiException,IOException {
      String contentid = "21042016";
       String response = this.retrieveOffersByContentId( contentid);
    }

  /**
   * List of Offers By Filter
   * Request for offers by filter
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String retrieveOffersByFilter() throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/vmorc/offers/v1/byfilter";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "offers/v1/byfilter";
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
    public void retrieveOffersByFilter_Example() throws ApiException,IOException {
      
       String response = this.retrieveOffersByFilter();
    }

  /**
   * Retrieve Offers By Offer Id
   * Request for offers by an offer id
   * @param offerid  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String retrieveOffersByOfferId(
      
       String 
      offerid) throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/vmorc/offers/v1/byofferid";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "offers/v1/byofferid";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offerid", offerid));
    final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void retrieveOffersByOfferId_Example() throws ApiException,IOException {
      String offerid = "21042016";
       String response = this.retrieveOffersByOfferId( offerid);
    }



}
