package com.visa.developer.sample.stormapi.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.stormapi.ApiException;
import com.visa.developer.sample.stormapi.ApiClient;
import com.visa.developer.sample.stormapi.Configuration;
import com.visa.developer.sample.stormapi.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.stormapi.auth.Authentication;
import com.visa.developer.sample.stormapi.auth.HttpBasicAuth;
import com.visa.developer.sample.stormapi.auth.ApiKeyAuth;

public class StormapiApi {
  private ApiClient apiClient;

  public StormapiApi(HashMap<String, String> auth) {
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
   * Cancel Claim
   * Cancel Claim
   * @param cancelclaimPOSTPayload Resource body for Cancel Claim (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String cancelclaim(
      
       String 
      cancelclaimPOSTPayload) throws ApiException {
    Object localVarPostBody = cancelclaimPOSTPayload;
    //
    
    // verify the required parameter 'cancelclaimPOSTPayload' is set
    if (cancelclaimPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'cancelclaimPOSTPayload' when calling cancelclaim");
    }
    if(localVarPostBody != null) {
        cancelclaimPOSTPayload = cancelclaimPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = cancelclaimPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/storm/v1/cancelclaim";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "storm/v1/cancelclaim";
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
    public void cancelclaim_Example() throws ApiException,IOException {
      String cancelclaimPOSTPayload = "21042016";
      cancelclaimPOSTPayload = "{\"acquiringBin\": \"408999\", \"acquirerCountryCode\": \"840\", \"id\": \"etdgaj3r\"}";
      String response = this.cancelclaim(cancelclaimPOSTPayload);

    }

  /**
   * Claim Details
   * Claim Details
   * @param claimdetailsPOSTPayload Resource body for Claim Details (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String claimdetails(
      
       String 
      claimdetailsPOSTPayload) throws ApiException {
    Object localVarPostBody = claimdetailsPOSTPayload;
    //
    
    // verify the required parameter 'claimdetailsPOSTPayload' is set
    if (claimdetailsPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'claimdetailsPOSTPayload' when calling claimdetails");
    }
    if(localVarPostBody != null) {
        claimdetailsPOSTPayload = claimdetailsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = claimdetailsPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/storm/v1/claimdetails";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "storm/v1/claimdetails";
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
    public void claimdetails_Example() throws ApiException,IOException {
      String claimdetailsPOSTPayload = "21042016";
      claimdetailsPOSTPayload = "{\"acquiringBin\": \"408999\", \"acquirerCountryCode\": \"840\", \"id\": \"e9w2qg2y\"}";
      String response = this.claimdetails(claimdetailsPOSTPayload);

    }

  /**
   * Claim Summary
   * Claim Summary
   * @param claimsummaryPOSTPayload Resource body for Claim Summary (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String claimsummary(
      
       String 
      claimsummaryPOSTPayload) throws ApiException {
    Object localVarPostBody = claimsummaryPOSTPayload;
    //
    
    // verify the required parameter 'claimsummaryPOSTPayload' is set
    if (claimsummaryPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'claimsummaryPOSTPayload' when calling claimsummary");
    }
    if(localVarPostBody != null) {
        claimsummaryPOSTPayload = claimsummaryPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = claimsummaryPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/storm/v1/claimsummary";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "storm/v1/claimsummary";
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
    public void claimsummary_Example() throws ApiException,IOException {
      String claimsummaryPOSTPayload = "21042016";
      claimsummaryPOSTPayload = "{\"acquiringBin\": \"408999\", \"acquirerCountryCode\": \"840\", \"id\": \"e9w2qg2y\"}";
      String response = this.claimsummary(claimsummaryPOSTPayload);

    }

  /**
   * Initiate Fund Transfer
   * Initiate Fund Transfer
   * @param initiatefundtransferPOSTPayload Resource body for Initiate Fund Transfer (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String initiatefundtransfer(
      
       String 
      initiatefundtransferPOSTPayload) throws ApiException {
    Object localVarPostBody = initiatefundtransferPOSTPayload;
    //
    
    // verify the required parameter 'initiatefundtransferPOSTPayload' is set
    if (initiatefundtransferPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'initiatefundtransferPOSTPayload' when calling initiatefundtransfer");
    }
    if(localVarPostBody != null) {
        initiatefundtransferPOSTPayload = initiatefundtransferPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = initiatefundtransferPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/storm/v1/initiatefundtransfer";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "storm/v1/initiatefundtransfer";
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
    public void initiatefundtransfer_Example() throws ApiException,IOException {
      String initiatefundtransferPOSTPayload = "21042016";
      initiatefundtransferPOSTPayload = "{\"senderAccountNumber\": \"4957030420210496\", \"merchantCategoryCode\": \"4829\", \"feeProgramIndicator\": \"123\", \"amount\": \"108.00\", \"acquirerCountryCode\": \"840\", \"sourceOfFundsCode\": \"01\", \"cardAcceptor\": {\"idCode\": \"AbBCDEFGH\", \"terminalId\": \"ABCD1234\", \"name\": \"Visa Inc. USA-Foster City\", \"address\": {\"county\": \"San Mateo\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}}, \"acquiringBin\": \"408999\", \"recipientEmail\": \"vdpheartbeat1@gmail.com\", \"senderEmail\": \"vdpheartbeat1@gmail.com\", \"senderCountryCode\": \"USA\", \"transactionCurrencyCode\": \"USD\", \"senderName\": \"sendernamecontains12345\", \"clientTransactionId\": \"044437\"}";
      String response = this.initiatefundtransfer(initiatefundtransferPOSTPayload);

    }

  /**
   * Redeem Claim
   * Redeem Claim
   * @param redeemclaimPOSTPayload Resource body for Redeem Claim (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String redeemclaim(
      
       String 
      redeemclaimPOSTPayload) throws ApiException {
    Object localVarPostBody = redeemclaimPOSTPayload;
    //
    
    // verify the required parameter 'redeemclaimPOSTPayload' is set
    if (redeemclaimPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'redeemclaimPOSTPayload' when calling redeemclaim");
    }
    if(localVarPostBody != null) {
        redeemclaimPOSTPayload = redeemclaimPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = redeemclaimPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/storm/v1/redeemclaim";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "storm/v1/redeemclaim";
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
    public void redeemclaim_Example() throws ApiException,IOException {
      String redeemclaimPOSTPayload = "21042016";
      redeemclaimPOSTPayload = "{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"acquiringBin\": \"408999\", \"recipientMobile\": {\"number\": \"85155024\", \"countryCode\": \"01\"}, \"acquirerCountryCode\": \"840\", \"claimCode\": \"527809\", \"retrievalReferenceNumber\": \"700929277449\", \"cardIssuerCountryCode\": \"840\", \"recipientCardExpiryDate\": \"2019-03\", \"recipientPrimaryAccountNumber\": \"4012130902848301\", \"systemsTraceAuditNumber\": \"279323\", \"id\": \"u2vivh7x\"}";
      String response = this.redeemclaim(redeemclaimPOSTPayload);

    }



}
