# LinkedapiApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comboGet**](LinkedapiApi.md#comboGet) | **GET** /visadirect/linked/v1/combo/{statusIdentifier} | Combo Response GET
[**comboPost**](LinkedapiApi.md#comboPost) | **POST** /visadirect/linked/v1/combo | Combo POST


<a name="comboGet"></a>
# **comboGet**
> ComboGetGETResponse comboGet(statusIdentifier)

Combo Response GET

GetComboResponse

### Example
```java
// Import classes:
//import com.visa.developer.sample.linkedapi.ApiClient;
//import com.visa.developer.sample.linkedapi.ApiException;
//import com.visa.developer.sample.linkedapi.Configuration;
//import com.visa.developer.sample.linkedapi.auth.*;
//import com.visa.developer.sample.linkedapi.api.LinkedapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

LinkedapiApi apiInstance = new LinkedapiApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    ComboGetGETResponse result = apiInstance.comboGet(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkedapiApi#comboGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**ComboGetGETResponse**](ComboGetGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comboPost"></a>
# **comboPost**
> ComboPostPOSTResponse comboPost(comboPostPOSTPayload)

Combo POST

 The Combo API is a single API invocation which can pull funds from a sender&#39;s card and  push funds to a recipient&#39;s card. Ifthe push fails, the  API will   revert  funds back to the sender&#39;s funding card.

### Example
```java
// Import classes:
//import com.visa.developer.sample.linkedapi.ApiClient;
//import com.visa.developer.sample.linkedapi.ApiException;
//import com.visa.developer.sample.linkedapi.Configuration;
//import com.visa.developer.sample.linkedapi.auth.*;
//import com.visa.developer.sample.linkedapi.api.LinkedapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

LinkedapiApi apiInstance = new LinkedapiApi();
ComboPostPOSTPayload comboPostPOSTPayload = new ComboPostPOSTPayload(); // ComboPostPOSTPayload | Resource body for Combo POST
try {
    ComboPostPOSTResponse result = apiInstance.comboPost(comboPostPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkedapiApi#comboPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comboPostPOSTPayload** | [**ComboPostPOSTPayload**](ComboPostPOSTPayload.md)| Resource body for Combo POST |

### Return type

[**ComboPostPOSTResponse**](ComboPostPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

