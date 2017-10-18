# ReferencedataapiApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveDataByMerchant**](ReferencedataapiApi.md#retrieveDataByMerchant) | **GET** /vmorc/data/v1/merchant | Retrieve Data by Merchant
[**retrieveDataByMerchantAddress**](ReferencedataapiApi.md#retrieveDataByMerchantAddress) | **GET** /vmorc/data/v1/merchantAddress | Retrieve Data by Merchant Address
[**retrieveDataByReference**](ReferencedataapiApi.md#retrieveDataByReference) | **GET** /vmorc/data/v1/ref | Retrieve Data by Reference


<a name="retrieveDataByMerchant"></a>
# **retrieveDataByMerchant**
> RetrieveDataByMerchantGETResponse retrieveDataByMerchant()

Retrieve Data by Merchant

Retrieve Data by merchant

### Example
```java
// Import classes:
//import com.visa.developer.sample.referencedataapi.ApiClient;
//import com.visa.developer.sample.referencedataapi.ApiException;
//import com.visa.developer.sample.referencedataapi.Configuration;
//import com.visa.developer.sample.referencedataapi.auth.*;
//import com.visa.developer.sample.referencedataapi.api.ReferencedataapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

ReferencedataapiApi apiInstance = new ReferencedataapiApi();
try {
    RetrieveDataByMerchantGETResponse result = apiInstance.retrieveDataByMerchant();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferencedataapiApi#retrieveDataByMerchant");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RetrieveDataByMerchantGETResponse**](RetrieveDataByMerchantGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveDataByMerchantAddress"></a>
# **retrieveDataByMerchantAddress**
> RetrieveDataByMerchantAddressGETResponse retrieveDataByMerchantAddress(merchantIds)

Retrieve Data by Merchant Address

Get merchant address data

### Example
```java
// Import classes:
//import com.visa.developer.sample.referencedataapi.ApiClient;
//import com.visa.developer.sample.referencedataapi.ApiException;
//import com.visa.developer.sample.referencedataapi.Configuration;
//import com.visa.developer.sample.referencedataapi.auth.*;
//import com.visa.developer.sample.referencedataapi.api.ReferencedataapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

ReferencedataapiApi apiInstance = new ReferencedataapiApi();
String merchantIds = "merchantIds_example"; // String | 
try {
    RetrieveDataByMerchantAddressGETResponse result = apiInstance.retrieveDataByMerchantAddress(merchantIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferencedataapiApi#retrieveDataByMerchantAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantIds** | **String**|  | [optional]

### Return type

[**RetrieveDataByMerchantAddressGETResponse**](RetrieveDataByMerchantAddressGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveDataByReference"></a>
# **retrieveDataByReference**
> RetrieveDataByReferenceGETResponse retrieveDataByReference()

Retrieve Data by Reference

Retrieve Data by reference

### Example
```java
// Import classes:
//import com.visa.developer.sample.referencedataapi.ApiClient;
//import com.visa.developer.sample.referencedataapi.ApiException;
//import com.visa.developer.sample.referencedataapi.Configuration;
//import com.visa.developer.sample.referencedataapi.auth.*;
//import com.visa.developer.sample.referencedataapi.api.ReferencedataapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

ReferencedataapiApi apiInstance = new ReferencedataapiApi();
try {
    RetrieveDataByReferenceGETResponse result = apiInstance.retrieveDataByReference();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferencedataapiApi#retrieveDataByReference");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RetrieveDataByReferenceGETResponse**](RetrieveDataByReferenceGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

