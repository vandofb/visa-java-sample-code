package com.visa.developer.sample.mvisa.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.mvisa.ApiException;
import com.visa.developer.sample.mvisa.ApiClient;
import com.visa.developer.sample.mvisa.Configuration;
import com.visa.developer.sample.mvisa.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.mvisa.auth.Authentication;
import com.visa.developer.sample.mvisa.auth.HttpBasicAuth;
import com.visa.developer.sample.mvisa.auth.ApiKeyAuth;

public class MvisaApi {
  private ApiClient apiClient;

  public MvisaApi(HashMap<String, String> auth) {
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
   * CashInPushPayments POST
   * 
   * @param cashInPushPaymentsPOSTPayload Resource body for CashInPushPayments POST (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String cashInPushPayments(
      
       String 
      cashInPushPaymentsPOSTPayload) throws ApiException {
    Object localVarPostBody = cashInPushPaymentsPOSTPayload;
    //
    
    // verify the required parameter 'cashInPushPaymentsPOSTPayload' is set
    if (cashInPushPaymentsPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'cashInPushPaymentsPOSTPayload' when calling cashInPushPayments");
    }
    if(localVarPostBody != null) {
        cashInPushPaymentsPOSTPayload = cashInPushPaymentsPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = cashInPushPaymentsPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/cashinpushpayments";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "mvisa/v1/cashinpushpayments";
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
    public void cashInPushPayments_Example() throws ApiException,IOException {
      String cashInPushPaymentsPOSTPayload = "21042016";
      cashInPushPaymentsPOSTPayload = "{\"senderAccountNumber\": \"4541237895236\", \"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"businessApplicationId\": \"CI\", \"merchantCategoryCode\": \"4829\", \"transactionCurrencyCode\": \"USD\", \"acquiringBin\": \"400171\", \"acquirerCountryCode\": \"643\", \"transactionIdentifier\": \"381228649430015\", \"senderReference\": \"1234\", \"cardAcceptor\": {\"idCode\": \"ID-Code123\", \"name\": \"Card Accpector ABC\", \"address\": {\"country\": \"IND\", \"city\": \"Bangalore\"}}, \"recipientPrimaryAccountNumber\": \"4123640062698797\", \"retrievalReferenceNumber\": \"430000367618\", \"systemsTraceAuditNumber\": \"313042\", \"amount\": \"124.05\", \"senderName\": \"Mohammed Qasim\"}";
      String response = this.cashInPushPayments(cashInPushPaymentsPOSTPayload);

    }

  /**
   * GET /visadirect/mvisa/v1/CashInPushPayments/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String cashInPushPaymentsGet(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling cashInPushPaymentsGet");
    }
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/cashinpushpayments/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "mvisa/v1/cashinpushpayments/{statusIdentifier}";
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
    public void cashInPushPaymentsGet_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.cashInPushPaymentsGet( statusIdentifier);
    }

  /**
   * GET /visadirect/mvisa/v1/CashOutPushPayments/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String cashOutPaymentsGet(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling cashOutPaymentsGet");
    }
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/cashoutpushpayments/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "mvisa/v1/cashoutpushpayments/{statusIdentifier}";
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
    public void cashOutPaymentsGet_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.cashOutPaymentsGet( statusIdentifier);
    }

  /**
   * CashOutPushPayments POST
   * 
   * @param cashOutPushPaymentsPostPOSTPayload Resource body for CashOutPushPayments POST (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String cashOutPushPaymentsPost(
      
       String 
      cashOutPushPaymentsPostPOSTPayload) throws ApiException {
    Object localVarPostBody = cashOutPushPaymentsPostPOSTPayload;
    //
    
    // verify the required parameter 'cashOutPushPaymentsPostPOSTPayload' is set
    if (cashOutPushPaymentsPostPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'cashOutPushPaymentsPostPOSTPayload' when calling cashOutPushPaymentsPost");
    }
    if(localVarPostBody != null) {
        cashOutPushPaymentsPostPOSTPayload = cashOutPushPaymentsPostPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = cashOutPushPaymentsPostPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/cashoutpushpayments";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "mvisa/v1/cashoutpushpayments";
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
    public void cashOutPushPaymentsPost_Example() throws ApiException,IOException {
      String cashOutPushPaymentsPostPOSTPayload = "21042016";
      cashOutPushPaymentsPostPOSTPayload = "{\"senderAccountNumber\": \"456789123456\", \"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"businessApplicationId\": \"CO\", \"merchantCategoryCode\": \"6012\", \"transactionCurrencyCode\": \"USD\", \"acquiringBin\": \"400171\", \"acquirerCountryCode\": \"643\", \"transactionIdentifier\": \"381228649430015\", \"senderReference\": \"REFNUM123\", \"cardAcceptor\": {\"idCode\": \"CA-IDCode-77765\", \"name\": \"mVisa cashout\", \"address\": {\"country\": \"IND\", \"city\": \"mVisa cashout\"}}, \"recipientPrimaryAccountNumber\": \"4123640062698797\", \"retrievalReferenceNumber\": \"412123412878\", \"systemsTraceAuditNumber\": \"567889\", \"amount\": \"124.05\", \"senderName\": \"Mohammed Qasim\"}";
      String response = this.cashOutPushPaymentsPost(cashOutPushPaymentsPostPOSTPayload);

    }

  /**
   * GET /visadirect/mvisa/v1/MerchantPushPayments/{statusIdentifier}
   * 
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String merchantPushPaymentGet(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling merchantPushPaymentGet");
    }
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/merchantpushpayments/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "mvisa/v1/merchantpushpayments/{statusIdentifier}";
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
    public void merchantPushPaymentGet_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.merchantPushPaymentGet( statusIdentifier);
    }

  /**
   * MerchantPushPayments POST
   * MerchantPushPayments is used for payment to a merchant for goods or services purchased, either face-to-face or remote.  This API is invoked in the following sequence:&lt;br&gt;&lt;br&gt;1.The consumer connects the account through the mobile device, provides payment instructions and authenticates themselves. The merchant information is captured by the consumer’s mobile from the merchant information display which can be through key entry, QR code, NFC or other means. The payment instructions include mVisa merchant ID (which is used to identify the merchant PAN), the amount to be paid and optionally a payment reference such as an invoice or bill number.&lt;br&gt;&lt;br&gt;2. Upon receiving the payment instructions, the consumer’s issuer invokes MerchantPushPayments POST operation to push payment instructions to the merchant’s account.&lt;br&gt;&lt;br&gt;3. The merchant acquirer processes the Visa message, creates a record of merchant payment and reverts back with a response message containing the MerchantPushPayments Response Attributes.&lt;br&gt;&lt;br&gt;4. On completion, both the consumer and the merchant receive confirmation or denial notification. &lt;br&gt;&lt;br&gt;Note: If the POST call times out, the resource will return a statusIdentifier which can be used in the MerchantPushPayments Transactions GET operation as the {statusIdentifier} in the URL.&lt;br&gt;&lt;br&gt;HEADER : X-Client-Transaction-ID&lt;br&gt;Optional&lt;br&gt;A unique value for a transaction (unique at the level of the individual service invoker and can be recycled every 24 hours). This identifies the transaction uniquely and can help reference the results of the original transaction.
   * @param merchantPushPaymentsPostPOSTPayload Resource body for MerchantPushPayments POST (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String merchantPushPaymentsPost(
      
       String 
      merchantPushPaymentsPostPOSTPayload) throws ApiException {
    Object localVarPostBody = merchantPushPaymentsPostPOSTPayload;
    //
    
    // verify the required parameter 'merchantPushPaymentsPostPOSTPayload' is set
    if (merchantPushPaymentsPostPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantPushPaymentsPostPOSTPayload' when calling merchantPushPaymentsPost");
    }
    if(localVarPostBody != null) {
        merchantPushPaymentsPostPOSTPayload = merchantPushPaymentsPostPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = merchantPushPaymentsPostPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/mvisa/v1/merchantpushpayments";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "mvisa/v1/merchantpushpayments";
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
    public void merchantPushPaymentsPost_Example() throws ApiException,IOException {
      String merchantPushPaymentsPostPOSTPayload = "21042016";
      merchantPushPaymentsPostPOSTPayload = "{\"senderAccountNumber\": \"4027290077881587\", \"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"purchaseIdentifier\": {\"type\": \"1\", \"referenceNumber\": \"REF_123456789123456789123\"}, \"feeProgramIndicator\": \"123\", \"transactionCurrencyCode\": \"INR\", \"businessApplicationId\": \"MP\", \"acquirerCountryCode\": \"356\", \"transactionIdentifier\": \"381228649430015\", \"senderReference\": \"\", \"secondaryId\": \"123TEST\", \"cardAcceptor\": {\"idCode\": \"CA-IDCode-77765\", \"name\": \"Visa Inc. USA-Foster City\", \"address\": {\"country\": \"IND\", \"city\": \"KOLKATA\"}}, \"recipientPrimaryAccountNumber\": \"4123640062698797\", \"retrievalReferenceNumber\": \"412770451035\", \"systemsTraceAuditNumber\": \"451035\", \"recipientName\": \"Jasper\", \"amount\": \"124.05\", \"senderName\": \"Jasper\", \"acquiringBin\": \"408972\"}";
      String response = this.merchantPushPaymentsPost(merchantPushPaymentsPostPOSTPayload);

    }



}
