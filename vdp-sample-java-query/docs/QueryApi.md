# QueryApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionQuery**](QueryApi.md#transactionQuery) | **GET** /visadirect/v1/transactionquery | Transaction Query using GET


<a name="transactionQuery"></a>
# **transactionQuery**
> TransactionQueryGETResponse transactionQuery(acquiringBIN)

Transaction Query using GET

The Transaction Query API can be used to determine the processing status of a transaction or to retreive the lifecycle of a transaction. This API can be used to check whether a PullFunds, PushFunds or ReverseFunds transaction processed successfully if received by Visa. This API could also be used to retrieve the detailed lifecycle or history of a transaction (e.g. original transaction, chargeback, chargeback reversal etc).

### Example
```java
// Import classes:
//import com.visa.developer.sample.query.ApiClient;
//import com.visa.developer.sample.query.ApiException;
//import com.visa.developer.sample.query.Configuration;
//import com.visa.developer.sample.query.auth.*;
//import com.visa.developer.sample.query.api.QueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

QueryApi apiInstance = new QueryApi();
String acquiringBIN = "acquiringBIN_example"; // String | 
try {
    TransactionQueryGETResponse result = apiInstance.transactionQuery(acquiringBIN);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#transactionQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acquiringBIN** | **String**|  | [optional]

### Return type

[**TransactionQueryGETResponse**](TransactionQueryGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

