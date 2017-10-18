# AliasapiApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlias**](AliasapiApi.md#createAlias) | **POST** /visadirect/v1/vad/manage/createalias | Create Alias
[**deleteAlias**](AliasapiApi.md#deleteAlias) | **POST** /visadirect/v1/vad/manage/deletealias | Delete Alias
[**getAlias**](AliasapiApi.md#getAlias) | **GET** /visadirect/v1/vad/manage/{guid} | GetAlias
[**resolve**](AliasapiApi.md#resolve) | **POST** /visadirect/v1/vad/resolve | Resolve
[**updateAlias**](AliasapiApi.md#updateAlias) | **POST** /visadirect/v1/vad/manage/updatealias | Update Alias


<a name="createAlias"></a>
# **createAlias**
> CreateAliasPOSTResponse createAlias(createAliasPOSTPayload)

Create Alias

Create an alias in the Alias Directory.

### Example
```java
// Import classes:
//import com.visa.developer.sample.aliasapi.ApiClient;
//import com.visa.developer.sample.aliasapi.ApiException;
//import com.visa.developer.sample.aliasapi.Configuration;
//import com.visa.developer.sample.aliasapi.auth.*;
//import com.visa.developer.sample.aliasapi.api.AliasapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

AliasapiApi apiInstance = new AliasapiApi();
CreateAliasPOSTPayload createAliasPOSTPayload = new CreateAliasPOSTPayload(); // CreateAliasPOSTPayload | Resource body for Create Alias
try {
    CreateAliasPOSTResponse result = apiInstance.createAlias(createAliasPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasapiApi#createAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAliasPOSTPayload** | [**CreateAliasPOSTPayload**](CreateAliasPOSTPayload.md)| Resource body for Create Alias |

### Return type

[**CreateAliasPOSTResponse**](CreateAliasPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAlias"></a>
# **deleteAlias**
> DeleteAliasPOSTResponse deleteAlias(deleteAliasPOSTPayload)

Delete Alias

Delete alias of a recipient from the Alias Directory.

### Example
```java
// Import classes:
//import com.visa.developer.sample.aliasapi.ApiClient;
//import com.visa.developer.sample.aliasapi.ApiException;
//import com.visa.developer.sample.aliasapi.Configuration;
//import com.visa.developer.sample.aliasapi.auth.*;
//import com.visa.developer.sample.aliasapi.api.AliasapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

AliasapiApi apiInstance = new AliasapiApi();
DeleteAliasPOSTPayload deleteAliasPOSTPayload = new DeleteAliasPOSTPayload(); // DeleteAliasPOSTPayload | Resource body for Delete Alias
try {
    DeleteAliasPOSTResponse result = apiInstance.deleteAlias(deleteAliasPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasapiApi#deleteAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteAliasPOSTPayload** | [**DeleteAliasPOSTPayload**](DeleteAliasPOSTPayload.md)| Resource body for Delete Alias |

### Return type

[**DeleteAliasPOSTResponse**](DeleteAliasPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAlias"></a>
# **getAlias**
> GetAliasGETResponse getAlias()

GetAlias

Get alias and recipient&#39;s related data.

### Example
```java
// Import classes:
//import com.visa.developer.sample.aliasapi.ApiClient;
//import com.visa.developer.sample.aliasapi.ApiException;
//import com.visa.developer.sample.aliasapi.Configuration;
//import com.visa.developer.sample.aliasapi.auth.*;
//import com.visa.developer.sample.aliasapi.api.AliasapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

AliasapiApi apiInstance = new AliasapiApi();
try {
    GetAliasGETResponse result = apiInstance.getAlias();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasapiApi#getAlias");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAliasGETResponse**](GetAliasGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="resolve"></a>
# **resolve**
> ResolvePOSTResponse resolve(resolvePOSTPayload)

Resolve

Resolve an alias for recipient&#39;s primary account number (PAN) and related data.

### Example
```java
// Import classes:
//import com.visa.developer.sample.aliasapi.ApiClient;
//import com.visa.developer.sample.aliasapi.ApiException;
//import com.visa.developer.sample.aliasapi.Configuration;
//import com.visa.developer.sample.aliasapi.auth.*;
//import com.visa.developer.sample.aliasapi.api.AliasapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

AliasapiApi apiInstance = new AliasapiApi();
ResolvePOSTPayload resolvePOSTPayload = new ResolvePOSTPayload(); // ResolvePOSTPayload | Resource body for Resolve
try {
    ResolvePOSTResponse result = apiInstance.resolve(resolvePOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasapiApi#resolve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resolvePOSTPayload** | [**ResolvePOSTPayload**](ResolvePOSTPayload.md)| Resource body for Resolve |

### Return type

[**ResolvePOSTResponse**](ResolvePOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateAlias"></a>
# **updateAlias**
> UpdateAliasPOSTResponse updateAlias(updateAliasPOSTPayload)

Update Alias

Update alias and recipient data in the Alias Directory

### Example
```java
// Import classes:
//import com.visa.developer.sample.aliasapi.ApiClient;
//import com.visa.developer.sample.aliasapi.ApiException;
//import com.visa.developer.sample.aliasapi.Configuration;
//import com.visa.developer.sample.aliasapi.auth.*;
//import com.visa.developer.sample.aliasapi.api.AliasapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

AliasapiApi apiInstance = new AliasapiApi();
UpdateAliasPOSTPayload updateAliasPOSTPayload = new UpdateAliasPOSTPayload(); // UpdateAliasPOSTPayload | Resource body for Update Alias
try {
    UpdateAliasPOSTResponse result = apiInstance.updateAlias(updateAliasPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasapiApi#updateAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateAliasPOSTPayload** | [**UpdateAliasPOSTPayload**](UpdateAliasPOSTPayload.md)| Resource body for Update Alias |

### Return type

[**UpdateAliasPOSTResponse**](UpdateAliasPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

