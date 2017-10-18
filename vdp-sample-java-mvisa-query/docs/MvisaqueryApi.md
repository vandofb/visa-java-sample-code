# MvisaqueryApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mvisaTranactionQuery**](MvisaqueryApi.md#mvisaTranactionQuery) | **POST** /visadirect/v1/mvisa/transactionquery | Transaction Query


<a name="mvisaTranactionQuery"></a>
# **mvisaTranactionQuery**
> MvisaTranactionQueryPOSTResponse mvisaTranactionQuery(mvisaTranactionQueryPOSTPayload)

Transaction Query

The MVISA Transaction Query API can be used to determine the processing status of a transaction or to retreive the lifecycle of a transaction. This API can be used to check whether a PullFunds, PushFunds or ReverseFunds transaction processed successfully if received by Visa. This API could also be used to retrieve the detailed lifecycle or history of a transaction (e.g. original transaction, chargeback, chargeback reversal etc).

### Example
```java
// Import classes:
//import com.visa.developer.sample.mvisaquery.ApiClient;
//import com.visa.developer.sample.mvisaquery.ApiException;
//import com.visa.developer.sample.mvisaquery.Configuration;
//import com.visa.developer.sample.mvisaquery.auth.*;
//import com.visa.developer.sample.mvisaquery.api.MvisaqueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

MvisaqueryApi apiInstance = new MvisaqueryApi();
MvisaTranactionQueryPOSTPayload mvisaTranactionQueryPOSTPayload = new MvisaTranactionQueryPOSTPayload(); // MvisaTranactionQueryPOSTPayload | Resource body for Transaction Query
try {
    MvisaTranactionQueryPOSTResponse result = apiInstance.mvisaTranactionQuery(mvisaTranactionQueryPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MvisaqueryApi#mvisaTranactionQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mvisaTranactionQueryPOSTPayload** | [**MvisaTranactionQueryPOSTPayload**](MvisaTranactionQueryPOSTPayload.md)| Resource body for Transaction Query |

### Return type

[**MvisaTranactionQueryPOSTResponse**](MvisaTranactionQueryPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

