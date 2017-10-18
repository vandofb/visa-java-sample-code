# MerchantsearchApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**merchantSearch**](MerchantsearchApi.md#merchantSearch) | **POST** /merchantsearch/v1/search | Merchant Search


<a name="merchantSearch"></a>
# **merchantSearch**
> MerchantSearchPOSTResponse merchantSearch(merchantSearchPOSTPayload)

Merchant Search



### Example
```java
// Import classes:
//import com.visa.developer.sample.merchantsearch.ApiClient;
//import com.visa.developer.sample.merchantsearch.ApiException;
//import com.visa.developer.sample.merchantsearch.Configuration;
//import com.visa.developer.sample.merchantsearch.auth.*;
//import com.visa.developer.sample.merchantsearch.api.MerchantsearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

MerchantsearchApi apiInstance = new MerchantsearchApi();
MerchantSearchPOSTPayload merchantSearchPOSTPayload = new MerchantSearchPOSTPayload(); // MerchantSearchPOSTPayload | Resource body for Merchant Search
try {
    MerchantSearchPOSTResponse result = apiInstance.merchantSearch(merchantSearchPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantsearchApi#merchantSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantSearchPOSTPayload** | [**MerchantSearchPOSTPayload**](MerchantSearchPOSTPayload.md)| Resource body for Merchant Search |

### Return type

[**MerchantSearchPOSTResponse**](MerchantSearchPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

