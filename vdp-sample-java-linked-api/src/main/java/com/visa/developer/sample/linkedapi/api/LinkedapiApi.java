package com.visa.developer.sample.linkedapi.api;

import com.sun.jersey.api.client.GenericType;
import com.visa.developer.sample.linkedapi.ApiException;
import com.visa.developer.sample.linkedapi.ApiClient;
import com.visa.developer.sample.linkedapi.Configuration;
import com.visa.developer.sample.linkedapi.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.time.format.*;
import com.visa.developer.sample.linkedapi.auth.Authentication;
import com.visa.developer.sample.linkedapi.auth.HttpBasicAuth;
import com.visa.developer.sample.linkedapi.auth.ApiKeyAuth;

public class LinkedapiApi {
  private ApiClient apiClient;

  public LinkedapiApi(HashMap<String, String> auth) {
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
   * Combo Response GET
   * GetComboResponse
   * @param statusIdentifier  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String comboGet(
      
       String 
      statusIdentifier) throws ApiException {
    Object localVarPostBody = null;
    //String statusIdentifier = null;
    
    // verify the required parameter 'statusIdentifier' is set
    if (statusIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'statusIdentifier' when calling comboGet");
    }
    
    // create path and map variables
    String path = "/visadirect/linked/v1/combo/{statusIdentifier}";
    path = path.replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusIdentifier" + "\\}", apiClient.escapeString(statusIdentifier.toString()));
    String resourcePath = "linked/v1/combo/{statusIdentifier}";
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
    public void comboGet_Example() throws ApiException,IOException {
      String statusIdentifier = "21042016";
       String response = this.comboGet( statusIdentifier);
    }

  /**
   * Combo POST
   *  The Combo API is a single API invocation which can pull funds from a sender&#39;s card and  push funds to a recipient&#39;s card. Ifthe push fails, the  API will   revert  funds back to the sender&#39;s funding card.
   * @param comboPostPOSTPayload Resource body for Combo POST (required)
   * @return String
   * @throws ApiException if fails to make API call
   */

  public String comboPost(
      
       String 
      comboPostPOSTPayload) throws ApiException {
    Object localVarPostBody = comboPostPOSTPayload;
    //
    
    // verify the required parameter 'comboPostPOSTPayload' is set
    if (comboPostPOSTPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'comboPostPOSTPayload' when calling comboPost");
    }
    if(localVarPostBody != null) {
        comboPostPOSTPayload = comboPostPOSTPayload.replaceAll("\"localTransactionDateTime\": ?\".{19}\"", "\"localTransactionDateTime\": \"" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "\"");
        localVarPostBody = comboPostPOSTPayload;
    }
    
    // create path and map variables
    String path = "/visadirect/linked/v1/combo";
    path = path.replaceAll("\\{format\\}","json");
    String resourcePath = "linked/v1/combo";
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
    public void comboPost_Example() throws ApiException,IOException {
      String comboPostPOSTPayload = "21042016";
      comboPostPOSTPayload = "{\"businessApplicationId\": \"AA\", \"cardCvv2Value\": \"123\", \"merchantPseudoAbaNumber\": \"abcdefghi\", \"pullSharingGroupCode\": \"G\", \"surcharge\": \"11.88\", \"purchaseIdentifier\": {\"type\": \"1\", \"referenceNumber\": \"REF_123456789123456789123\"}, \"settlementServiceIndicator\": \"08\", \"merchantVerificationValue\": {\"mvvAcquirerAssigned\": \"98FC\", \"mvvVisaAssigned\": \"0A45AF\"}, \"acquirerCountryCode\": \"840\", \"cavv\": \"0000010926000071934977253000000000000000\", \"localTransactionDateTime\": \"2017-10-09T13:28:35\", \"pushSharingGroupCode\": \"S\", \"transactionCurrencyCode\": \"USD\", \"pushCardAcceptor\": {\"idCode\": \"CA-IDCode-77765\", \"terminalId\": \"TID-5632\", \"name\": \"Visa Inc. USA-Foster City\", \"address\": {\"county\": \"SAN MATEO\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}}, \"secondaryId\": \"123TEST\", \"magneticStripeData\": {\"track2Data\": \"4008310000000007D130310191014085\"}, \"acquiringBin\": \"408999\", \"accountType\": \"10\", \"pushSystemsTraceAuditNumber\": \"451021\", \"pullCardExpiryDate\": \"2020-08\", \"foreignExchangeFeeTransaction\": \"11.99\", \"pointOfServiceData\": {\"posConditionCode\": \"0\", \"panEntryMode\": \"2\", \"motoECIIndicator\": \"0\"}, \"pullSystemsTraceAuditNumber\": \"451020\", \"pushPrimaryAccountNumber\": \"4957030420210462\", \"pullRetrievalReferenceNumber\": \"717311813559\", \"pushRetrievalReferenceNumber\": \"717311813690\", \"pullPrimaryAccountNumber\": \"4895142232120006\", \"senderDataFields\": {\"senderCity\": \"Foster City\", \"senderAccountNumber\": \"4957030420210454\", \"senderStateCode\": \"CA\", \"senderDateOfBirth\": \"1970-03-03\", \"senderReference\": \"Ref\", \"senderAddress\": \"901 Metro Center Blvd\", \"sourceOfFundsCode\": \"01\", \"senderCountryCode\": \"840\", \"recipientName\": \"Subbaiah\", \"senderPostalCode\": \"ABCD EF\", \"senderName\": \"Mohammed Qasim\"}, \"amount\": \"100\", \"pullCardAcceptor\": {\"idCode\": \"CA-IDCode-54798\", \"terminalId\": \"TID-8270\", \"name\": \"Visa Inc. USA-Foster City\", \"address\": {\"county\": \"SAN MATEO\", \"country\": \"USA\", \"state\": \"CA\", \"zipCode\": \"94404\"}}, \"pushCardExpiryDate\": \"2020-08\", \"pointOfServiceCapability\": {\"posTerminalType\": \"4\", \"posTerminalEntryCapability\": \"2\"}}";
      String response = this.comboPost(comboPostPOSTPayload);

    }



}
