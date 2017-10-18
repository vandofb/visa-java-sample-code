package com.visa.developer.sample.fundstransfer.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.fundstransfer.ApiException;
import com.visa.developer.sample.fundstransfer.ApiClient;
import com.visa.developer.sample.fundstransfer.Configuration;
import com.visa.developer.sample.fundstransfer.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.fundstransfer.auth.Authentication;
import com.visa.developer.sample.fundstransfer.auth.HttpBasicAuth;
import com.visa.developer.sample.fundstransfer.auth.ApiKeyAuth;

public class FundstransferApi {
  private ApiClient apiClient;

  public FundstransferApi(HashMap<String, String> auth) {
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
   * POST /visadirect/fundstransfer/v1/multipullfundstransactions
   * The MultiPullFundsTransactions resource debits (pulls) funds from multiple sender’s Visa accounts (in preparation for pushing funds to one or many recipient’s accounts) by initiating an extension of the Account Funding Transaction (AFT) financial message.&lt;br&gt;The MultiPullFundsTransactions resource can be used to submit large API requests with multiple transactions to gain operational efficiencies.
   * @param xClientTransactionId  (required)
   * @param multipullfundsPOSTPayload Resource body for POST /visadirect/fundstransfer/v1/multipullfundstransactions (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String multipullfunds(
      
       String 
      xClientTransactionId, 
      
       String 
      multipullfundsPOSTPayload) throws ApiException {
    Object localVarPostBody = multipullfundsPOSTPayload;
    //
    
    // verify the required parameter 'xClientTransactionId' is set
    if (xClientTransactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'xClientTransactionId' when calling multipullfunds");
    }
    if(localVarPostBody != null) {
        multipullfundsPOSTPayload = multipullfundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = multipullfundsPOSTPayload;
    }
    
    // verify the required parameter 'multipullfundsPOSTPayload' is set
    if (multipullfundsPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'multipullfundsPOSTPayload' when calling multipullfunds");
    }
    if(localVarPostBody != null) {
        multipullfundsPOSTPayload = multipullfundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = multipullfundsPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/multipullfundstransactions";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "fundstransfer/v1/multipullfundstransactions";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xClientTransactionId != null)localVarHeaderParams.put("x-client-transaction-id", apiClient.parameterToString(xClientTransactionId));final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void multipullfunds_Example() throws ApiException,IOException {
      String xClientTransactionId = "21042016";String multipullfundsPOSTPayload = "21042016";
      multipullfundsPOSTPayload = "{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"businessApplicationId\": \"AA\", \"merchantCategoryCode\": \"6012\", \"acquirerCountryCode\": \"608\", \"request\": [{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"senderCardExpiryDate\": \"2020-12\", \"amount\": \"100.00\", \"retrievalReferenceNumber\": \"401010101011\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"systemsTraceAuditNumber\": \"101011\", \"senderCurrencyCode\": \"USD\", \"cavv\": \"0700020718799100000002980179911000000000\", \"senderPrimaryAccountNumber\": \"4895140000066666\"}, {\"localTransactionDateTime\": \"2016-01-06T21:32:52\", \"senderCardExpiryDate\": \"2020-12\", \"amount\": \"100.00\", \"retrievalReferenceNumber\": \"401010101011\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"systemsTraceAuditNumber\": \"101011\", \"senderCurrencyCode\": \"USD\", \"cavv\": \"0700020718799100000002980179911000000000\", \"senderPrimaryAccountNumber\": \"4895140000066666\"}], \"acquiringBin\": \"408999\"}";
      String response = this.multipullfunds(xClientTransactionId, multipullfundsPOSTPayload);

    }

  /**
   * GET /visadirect/fundstransfer/v1/multipullfundstransactions/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String multipullfundstransactions(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling multipullfundstransactions");
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/multipullfundstransactions/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "fundstransfer/v1/multipullfundstransactions/{statusIdentifier}";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
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
    public void multipullfundstransactions_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.multipullfundstransactions( statusIdentifier);
    }

  /**
   * POST /visadirect/fundstransfer/v1/multipushfundstransactions
   * The MultiPushFundsTransactions resource credits (pushes) funds to multiple recipient&#39;s Visa accounts  by initiating an extension of the Original Credit Transaction (OCT) financial message. &lt;br&gt;&lt;br&gt;The MultiPushFundsTransactions resource can be used to submit large API requests with multiple transactions to gain operational efficiencies.
   * @param xClientTransactionId  (required)
   * @param multipushfundsPOSTPayload Resource body for POST /visadirect/fundstransfer/v1/multipushfundstransactions (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String multipushfunds(
      
       String 
      xClientTransactionId, 
      
       String 
      multipushfundsPOSTPayload) throws ApiException {
    Object localVarPostBody = multipushfundsPOSTPayload;
    //
    
    // verify the required parameter 'xClientTransactionId' is set
    if (xClientTransactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'xClientTransactionId' when calling multipushfunds");
    }
    if(localVarPostBody != null) {
        multipushfundsPOSTPayload = multipushfundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = multipushfundsPOSTPayload;
    }
    
    // verify the required parameter 'multipushfundsPOSTPayload' is set
    if (multipushfundsPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'multipushfundsPOSTPayload' when calling multipushfunds");
    }
    if(localVarPostBody != null) {
        multipushfundsPOSTPayload = multipushfundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = multipushfundsPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/multipushfundstransactions";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "fundstransfer/v1/multipushfundstransactions";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xClientTransactionId != null)localVarHeaderParams.put("x-client-transaction-id", apiClient.parameterToString(xClientTransactionId));final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void multipushfunds_Example() throws ApiException,IOException {
      String xClientTransactionId = "21042016";String multipushfundsPOSTPayload = "21042016";
      multipushfundsPOSTPayload = "{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"businessApplicationId\": \"AA\", \"merchantCategoryCode\": \"6012\", \"acquirerCountryCode\": \"840\", \"request\": [{\"senderCity\": \"My City\", \"senderAccountNumber\": \"4005520000011126\", \"senderStateCode\": \"CA\", \"feeProgramIndicator\": \"123\", \"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"recipientPrimaryAccountNumber\": \"4957030420210454\", \"transactionCurrencyCode\": \"USD\", \"transactionIdentifier\": \"234234234234234\", \"sourceOfFundsCode\": \"01\", \"senderReference\": \"\", \"senderAddress\": \"My Address\", \"retrievalReferenceNumber\": \"401010101011\", \"systemsTraceAuditNumber\": \"101011\", \"senderCountryCode\": \"USA\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"recipientName\": \"Akhila\", \"amount\": \"100.00\", \"senderName\": \"Mr Name\"}, {\"senderCity\": \"My City\", \"senderAccountNumber\": \"4840920103511221\", \"senderStateCode\": \"CA\", \"feeProgramIndicator\": \"123\", \"localTransactionDateTime\": \"2016-01-06T21:32:52\", \"recipientPrimaryAccountNumber\": \"4957030420210454\", \"transactionCurrencyCode\": \"USD\", \"transactionIdentifier\": \"234234234234234\", \"sourceOfFundsCode\": \"01\", \"senderReference\": \"\", \"senderAddress\": \"My Address\", \"retrievalReferenceNumber\": \"401010101012\", \"systemsTraceAuditNumber\": \"101012\", \"senderCountryCode\": \"USA\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"recipientName\": \"Akhila\", \"amount\": \"100.00\", \"senderName\": \"Mr Name\"}], \"acquiringBin\": \"408999\"}";
      String response = this.multipushfunds(xClientTransactionId, multipushfundsPOSTPayload);

    }

  /**
   * GET /visadirect/fundstransfer/v1/multipushfundstransactions/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String multipushfundstransactions(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling multipushfundstransactions");
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/multipushfundstransactions/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "fundstransfer/v1/multipushfundstransactions/{statusIdentifier}";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
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
    public void multipushfundstransactions_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.multipushfundstransactions( statusIdentifier);
    }

  /**
   * POST /visadirect/fundstransfer/v1/multireversefundstransactions
   * The MultiReverseFundsTransactions resource credits (pushes back) funds to multiple sender’s Visa accounts  by initiating an extension of the  Account Funding Transaction Reversal (AFTR) financial message
   * @param xClientTransactionId  (required)
   * @param multireversefundsPOSTPayload Resource body for POST /visadirect/fundstransfer/v1/multireversefundstransactions (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String multireversefunds(
      
       String 
      xClientTransactionId, 
      
       String 
      multireversefundsPOSTPayload) throws ApiException {
    Object localVarPostBody = multireversefundsPOSTPayload;
    //
    
    // verify the required parameter 'xClientTransactionId' is set
    if (xClientTransactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'xClientTransactionId' when calling multireversefunds");
    }
    if(localVarPostBody != null) {
        multireversefundsPOSTPayload = multireversefundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = multireversefundsPOSTPayload;
    }
    
    // verify the required parameter 'multireversefundsPOSTPayload' is set
    if (multireversefundsPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'multireversefundsPOSTPayload' when calling multireversefunds");
    }
    if(localVarPostBody != null) {
        multireversefundsPOSTPayload = multireversefundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = multireversefundsPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/multireversefundstransactions";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "fundstransfer/v1/multireversefundstransactions";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xClientTransactionId != null)localVarHeaderParams.put("x-client-transaction-id", apiClient.parameterToString(xClientTransactionId));final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void multireversefunds_Example() throws ApiException,IOException {
      String xClientTransactionId = "21042016";String multireversefundsPOSTPayload = "21042016";
      multireversefundsPOSTPayload = "{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"acquiringBin\": \"408999\", \"acquirerCountryCode\": \"840\", \"request\": [{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"senderCardExpiryDate\": \"2020-12\", \"transactionIdentifier\": \"101010101010\", \"retrievalReferenceNumber\": \"401010101011\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"originalDataElements\": {\"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"228112\", \"approvalCode\": \"1ABCDE\", \"transmissionDateTime\": \"2021-10-26T21:32:52\"}, \"systemsTraceAuditNumber\": \"101011\", \"senderCurrencyCode\": \"USD\", \"amount\": \"100.00\", \"senderPrimaryAccountNumber\": \"4485810000000131\"}, {\"localTransactionDateTime\": \"2016-01-06T21:32:52\", \"senderCardExpiryDate\": \"2020-12\", \"transactionIdentifier\": \"101010101010\", \"retrievalReferenceNumber\": \"401010101011\", \"cardAcceptor\": {\"idCode\": \"5678\", \"address\": {\"county\": \"00\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94454\"}, \"terminalId\": \"1234\", \"name\": \"Mr Smith\"}, \"originalDataElements\": {\"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"228112\", \"approvalCode\": \"1ABCDE\", \"transmissionDateTime\": \"2021-10-26T21:32:52\"}, \"systemsTraceAuditNumber\": \"101011\", \"senderCurrencyCode\": \"USD\", \"amount\": \"100.00\", \"senderPrimaryAccountNumber\": \"4485810000000131\"}]}";
      String response = this.multireversefunds(xClientTransactionId, multireversefundsPOSTPayload);

    }

  /**
   * GET /visadirect/fundstransfer/v1/multireversefundstransactions/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String multireversefundstransactions(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling multireversefundstransactions");
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/multireversefundstransactions/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "fundstransfer/v1/multireversefundstransactions/{statusIdentifier}";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
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
    public void multireversefundstransactions_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.multireversefundstransactions( statusIdentifier);
    }

  /**
   * POST /visadirect/fundstransfer/v1/pullfundstransactions
   * The PullFundsTransactions Resource debits (pulls) funds from a sender’s Visa account (in preparation for pushing funds to a recipient’s account) by initiating a financial message called an Account Funding Transaction (AFT)
   * @param pullfundsPOSTPayload Resource body for POST /visadirect/fundstransfer/v1/pullfundstransactions (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String pullfunds(
      
       String 
      pullfundsPOSTPayload) throws ApiException {
    Object localVarPostBody = pullfundsPOSTPayload;
    //
    
    // verify the required parameter 'pullfundsPOSTPayload' is set
    if (pullfundsPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'pullfundsPOSTPayload' when calling pullfunds");
    }
    if(localVarPostBody != null) {
        pullfundsPOSTPayload = pullfundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = pullfundsPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/pullfundstransactions";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "fundstransfer/v1/pullfundstransactions";
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
    public void pullfunds_Example() throws ApiException,IOException {
      String pullfundsPOSTPayload = "21042016";
      pullfundsPOSTPayload = "{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"businessApplicationId\": \"AA\", \"senderCardExpiryDate\": \"2015-10\", \"amount\": \"124.02\", \"acquirerCountryCode\": \"840\", \"retrievalReferenceNumber\": \"330000550000\", \"cardAcceptor\": {\"idCode\": \"ABCD1234ABCD123\", \"address\": {\"county\": \"San Mateo\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"ABCD1234\", \"name\": \"Visa Inc. USA-Foster City\"}, \"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"451001\", \"senderCurrencyCode\": \"USD\", \"cavv\": \"0700100038238906000013405823891061668252\", \"foreignExchangeFeeTransaction\": \"11.99\", \"senderPrimaryAccountNumber\": \"4895142232120006\", \"surcharge\": \"11.99\"}";
      String response = this.pullfunds(pullfundsPOSTPayload);

    }

  /**
   * GET /visadirect/fundstransfer/v1/pullfundstransactions/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String pullfundstransactions(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling pullfundstransactions");
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/pullfundstransactions/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "fundstransfer/v1/pullfundstransactions/{statusIdentifier}";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
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
    public void pullfundstransactions_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.pullfundstransactions( statusIdentifier);
    }

  /**
   * POST /visadirect/fundstransfer/v1/pushfundstransactions
   * The PushFundsTransactions resource credits (pushes) funds to a recipient&#39;s Visa account  by initiating a financial message called an Original Credit Transaction (OCT).
   * @param xClientTransactionId  (required)
   * @param pushfundsPOSTPayload Resource body for POST /visadirect/fundstransfer/v1/pushfundstransactions (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String pushfunds(
      
       String 
      xClientTransactionId, 
      
       String 
      pushfundsPOSTPayload) throws ApiException {
    Object localVarPostBody = pushfundsPOSTPayload;
    //
    
    // verify the required parameter 'xClientTransactionId' is set
    if (xClientTransactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'xClientTransactionId' when calling pushfunds");
    }
    if(localVarPostBody != null) {
        pushfundsPOSTPayload = pushfundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = pushfundsPOSTPayload;
    }
    
    // verify the required parameter 'pushfundsPOSTPayload' is set
    if (pushfundsPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'pushfundsPOSTPayload' when calling pushfunds");
    }
    if(localVarPostBody != null) {
        pushfundsPOSTPayload = pushfundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = pushfundsPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/pushfundstransactions";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "fundstransfer/v1/pushfundstransactions";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json");
    // query params in resource path
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xClientTransactionId != null)localVarHeaderParams.put("x-client-transaction-id", apiClient.parameterToString(xClientTransactionId));final String[] localVarAccepts = {  };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    String[] localVarAuthNames = new String[] { "mutualAuth" };
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, resourcePath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
    public void pushfunds_Example() throws ApiException,IOException {
      String xClientTransactionId = "21042016";String pushfundsPOSTPayload = "21042016";
      pushfundsPOSTPayload = "{\"businessApplicationId\": \"AA\", \"transactionIdentifier\": \"381228649430015\", \"cardAcceptor\": {\"idCode\": \"CA-IDCode-77765\", \"address\": {\"county\": \"San Mateo\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"TID-9999\", \"name\": \"Visa Inc. USA-Foster City\"}, \"senderAddress\": \"901 Metro Center Blvd\", \"sourceOfFundsCode\": \"05\", \"recipientName\": \"rohan\", \"senderName\": \"Mohammed Qasim\", \"senderStateCode\": \"CA\", \"merchantCategoryCode\": \"6012\", \"acquirerCountryCode\": \"840\", \"senderReference\": \"\", \"recipientPrimaryAccountNumber\": \"4957030420210462\", \"retrievalReferenceNumber\": \"412770451018\", \"senderAccountNumber\": \"4957030420210454\", \"transactionCurrencyCode\": \"USD\", \"acquiringBin\": \"408999\", \"pointOfServiceData\": {\"posConditionCode\": \"00\", \"panEntryMode\": \"90\", \"motoECIIndicator\": \"0\"}, \"senderCity\": \"Foster City\", \"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"amount\": \"124.05\", \"systemsTraceAuditNumber\": \"451018\", \"senderCountryCode\": \"124\"}";
      String response = this.pushfunds(xClientTransactionId, pushfundsPOSTPayload);

    }

  /**
   * GET /visadirect/fundstransfer/v1/pushfundstransactions/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String pushfundstransactions(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling pushfundstransactions");
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/pushfundstransactions/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "fundstransfer/v1/pushfundstransactions/{statusIdentifier}";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
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
    public void pushfundstransactions_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.pushfundstransactions( statusIdentifier);
    }

  /**
   * POST /visadirect/fundstransfer/v1/reversefundstransactions
   * The ReverseFundsTransactions resource credits (pushes back) funds to the sender’s Visa account  by initiating a financial message called an Account Funding Transaction Reversal (AFTR).
   * @param reversefundsPOSTPayload Resource body for POST /visadirect/fundstransfer/v1/reversefundstransactions (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String reversefunds(
      
       String 
      reversefundsPOSTPayload) throws ApiException {
    Object localVarPostBody = reversefundsPOSTPayload;
    //
    
    // verify the required parameter 'reversefundsPOSTPayload' is set
    if (reversefundsPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'reversefundsPOSTPayload' when calling reversefunds");
    }
    if(localVarPostBody != null) {
        reversefundsPOSTPayload = reversefundsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = reversefundsPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/reversefundstransactions";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "fundstransfer/v1/reversefundstransactions";
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
    public void reversefunds_Example() throws ApiException,IOException {
      String reversefundsPOSTPayload = "21042016";
      reversefundsPOSTPayload = "{\"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"senderCardExpiryDate\": \"2015-10\", \"transactionIdentifier\": \"381228649430011\", \"acquirerCountryCode\": \"608\", \"retrievalReferenceNumber\": \"330000550000\", \"cardAcceptor\": {\"idCode\": \"VMT200911026070\", \"address\": {\"county\": \"San Mateo\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}, \"terminalId\": \"365539\", \"name\": \"Visa Inc. USA-Foster City\"}, \"originalDataElements\": {\"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"897825\", \"approvalCode\": \"20304B\", \"transmissionDateTime\": \"2021-10-26T21:32:52\"}, \"acquiringBin\": \"408999\", \"systemsTraceAuditNumber\": \"451050\", \"senderCurrencyCode\": \"USD\", \"pointOfServiceCapability\": {\"posTerminalType\": \"4\", \"posTerminalEntryCapability\": \"2\"}, \"amount\": \"24.01\", \"pointOfServiceData\": {\"posConditionCode\": \"00\", \"panEntryMode\": \"90\", \"motoECIIndicator\": \"0\"}, \"senderPrimaryAccountNumber\": \"4895100000055127\"}";
      String response = this.reversefunds(reversefundsPOSTPayload);

    }

  /**
   * GET /visadirect/fundstransfer/v1/reversefundstransactions/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String reversefundstransactions(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling reversefundstransactions");
    }
    
    // create path and map variables
    String path = "/visadirect/fundstransfer/v1/reversefundstransactions/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "fundstransfer/v1/reversefundstransactions/{statusIdentifier}";
    resourcePath = resourcePath.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
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
    public void reversefundstransactions_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.reversefundstransactions( statusIdentifier);
    }



}
