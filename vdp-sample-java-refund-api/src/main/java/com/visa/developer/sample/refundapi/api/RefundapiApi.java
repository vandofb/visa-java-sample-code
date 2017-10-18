package com.visa.developer.sample.refundapi.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.refundapi.ApiException;
import com.visa.developer.sample.refundapi.ApiClient;
import com.visa.developer.sample.refundapi.Configuration;
import com.visa.developer.sample.refundapi.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.refundapi.auth.Authentication;
import com.visa.developer.sample.refundapi.auth.HttpBasicAuth;
import com.visa.developer.sample.refundapi.auth.ApiKeyAuth;

public class RefundapiApi {
  private ApiClient apiClient;

  public RefundapiApi(HashMap<String, String> auth) {
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
   * Merchandise Return GET
   * Read Merchandise Return Transaction
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String merchandiseReturnGet() throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/mr/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "mvisa/v1/mr/{statusIdentifier}";
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
    public void merchandiseReturnGet_Example() throws ApiException,IOException {
      
       String response = this.merchandiseReturnGet();
    }

  /**
   * MerchandiseReturn POST
   * Merchandise Return Transaction is used to refund (full or partial) sale amount back to mVisa consumer.  A merchant may, at its discretion, process a credit into consumer account when a valid transaction was previously processed. This situation can arise when the consumer cancels the purchase, or returns the goods in part or in full, or the merchant agrees to return a part of the payment.
   * @param merchandiseReturnPostPOSTPayload Resource body for MerchandiseReturn POST (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String merchandiseReturnPost(
      
       String 
      merchandiseReturnPostPOSTPayload) throws ApiException {
    Object localVarPostBody = merchandiseReturnPostPOSTPayload;
    //
    
    // verify the required parameter 'merchandiseReturnPostPOSTPayload' is set
    if (merchandiseReturnPostPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'merchandiseReturnPostPOSTPayload' when calling merchandiseReturnPost");
    }
    if(localVarPostBody != null) {
        merchandiseReturnPostPOSTPayload = merchandiseReturnPostPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = merchandiseReturnPostPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/mr";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "mvisa/v1/mr";
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
    public void merchandiseReturnPost_Example() throws ApiException,IOException {
      String merchandiseReturnPostPOSTPayload = "21042016";
      merchandiseReturnPostPOSTPayload = "{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"recipientPrimaryAccountNumber\": \"4761360055652118\", \"merchantCategoryCode\": \"4829\", \"systemsTraceAuditNumber\": \"313042\", \"transactionCurrencyCode\": \"USD\", \"acquirerCountryCode\": \"643\", \"cardAcceptor\": {\"idCode\": \"ID-Code123\", \"name\": \"Card Accpector ABC\", \"address\": {\"country\": \"IND\", \"city\": \"Bangalore\"}}, \"acquiringBin\": \"400171\", \"retrievalReferenceNumber\": \"430000367618\", \"amount\": \"124.05\"}";
      String response = this.merchandiseReturnPost(merchandiseReturnPostPOSTPayload);

    }

  /**
   * Merchandise Return Reversal GET
   * Read Merchandise Return Reversal Transaction
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String merchandiseReturnReversalGet() throws ApiException {
    Object localVarPostBody = null;
    //
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/mrr/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "mvisa/v1/mrr/{statusIdentifier}";
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
    public void merchandiseReturnReversalGet_Example() throws ApiException,IOException {
      
       String response = this.merchandiseReturnReversalGet();
    }

  /**
   * Merchandise Return Reversal POST
   * Merchandise Return Reversal Transaction is used to reverse the refund amount that sent to the mVisa consumer. 
   * @param merchandiseReturnReversalPostPOSTPayload Resource body for Merchandise Return Reversal POST (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String merchandiseReturnReversalPost(
      
       String 
      merchandiseReturnReversalPostPOSTPayload) throws ApiException {
    Object localVarPostBody = merchandiseReturnReversalPostPOSTPayload;
    //
    
    // verify the required parameter 'merchandiseReturnReversalPostPOSTPayload' is set
    if (merchandiseReturnReversalPostPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'merchandiseReturnReversalPostPOSTPayload' when calling merchandiseReturnReversalPost");
    }
    if(localVarPostBody != null) {
        merchandiseReturnReversalPostPOSTPayload = merchandiseReturnReversalPostPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = merchandiseReturnReversalPostPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/mrr";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "mvisa/v1/mrr";
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
    public void merchandiseReturnReversalPost_Example() throws ApiException,IOException {
      String merchandiseReturnReversalPostPOSTPayload = "21042016";
      merchandiseReturnReversalPostPOSTPayload = "{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"acquiringBin\": \"400171\", \"feeProgramIndicator\": \"aaa\", \"transactionFeeAmt\": \"2\", \"merchantVerificationValue\": {\"mvvAcquirerAssigned\": \"41394644363445313243\", \"mvvVisaAssigned\": \"41394644363445313243\"}, \"acquirerCountryCode\": \"643\", \"transactionIdentifier\": \"234234322342343\", \"cardAcceptor\": {\"idCode\": \"VMT200911026070\", \"address\": {\"county\": \"kolkata\", \"country\": \"IND\", \"state\": \"KO\", \"zipCode\": \"94404\"}, \"terminalId\": \"365539\", \"name\": \"Visa Inc. USA-Foster City\"}, \"originalDataElements\": {\"acquiringBin\": \"400171\", \"systemsTraceAuditNumber\": \"313042\", \"approvalCode\": \"20304B\", \"transmissionDateTime\": \"2016-11-30T03:00:37\"}, \"recipientPrimaryAccountNumber\": \"4761360055652118\", \"retrievalReferenceNumber\": \"430000367618\", \"systemsTraceAuditNumber\": \"451050\", \"senderCurrencyCode\": \"USD\", \"amount\": \"24.01\"}";
      String response = this.merchandiseReturnReversalPost(merchandiseReturnReversalPostPOSTPayload);

    }



}
