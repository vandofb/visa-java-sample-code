# RefundapiApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**merchandiseReturnGet**](RefundapiApi.md#merchandiseReturnGet) | **GET** /visadirect/mvisa/v1/mr/{statusIdentifier} | Merchandise Return GET
[**merchandiseReturnPost**](RefundapiApi.md#merchandiseReturnPost) | **POST** /visadirect/mvisa/v1/mr | MerchandiseReturn POST
[**merchandiseReturnReversalGet**](RefundapiApi.md#merchandiseReturnReversalGet) | **GET** /visadirect/mvisa/v1/mrr/{statusIdentifier} | Merchandise Return Reversal GET
[**merchandiseReturnReversalPost**](RefundapiApi.md#merchandiseReturnReversalPost) | **POST** /visadirect/mvisa/v1/mrr | Merchandise Return Reversal POST


<a name="merchandiseReturnGet"></a>
# **merchandiseReturnGet**
> MerchandiseReturnGetGETResponse merchandiseReturnGet()

Merchandise Return GET

Read Merchandise Return Transaction

### Example
```java
// Import classes:
//import com.visa.developer.sample.refundapi.ApiClient;
//import com.visa.developer.sample.refundapi.ApiException;
//import com.visa.developer.sample.refundapi.Configuration;
//import com.visa.developer.sample.refundapi.auth.*;
//import com.visa.developer.sample.refundapi.api.RefundapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

RefundapiApi apiInstance = new RefundapiApi();
try {
    MerchandiseReturnGetGETResponse result = apiInstance.merchandiseReturnGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundapiApi#merchandiseReturnGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MerchandiseReturnGetGETResponse**](MerchandiseReturnGetGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="merchandiseReturnPost"></a>
# **merchandiseReturnPost**
> MerchandiseReturnPostPOSTResponse merchandiseReturnPost(merchandiseReturnPostPOSTPayload)

MerchandiseReturn POST

Merchandise Return Transaction is used to refund (full or partial) sale amount back to mVisa consumer.  A merchant may, at its discretion, process a credit into consumer account when a valid transaction was previously processed. This situation can arise when the consumer cancels the purchase, or returns the goods in part or in full, or the merchant agrees to return a part of the payment.

### Example
```java
// Import classes:
//import com.visa.developer.sample.refundapi.ApiClient;
//import com.visa.developer.sample.refundapi.ApiException;
//import com.visa.developer.sample.refundapi.Configuration;
//import com.visa.developer.sample.refundapi.auth.*;
//import com.visa.developer.sample.refundapi.api.RefundapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

RefundapiApi apiInstance = new RefundapiApi();
MerchandiseReturnPostPOSTPayload merchandiseReturnPostPOSTPayload = new MerchandiseReturnPostPOSTPayload(); // MerchandiseReturnPostPOSTPayload | Resource body for MerchandiseReturn POST
try {
    MerchandiseReturnPostPOSTResponse result = apiInstance.merchandiseReturnPost(merchandiseReturnPostPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundapiApi#merchandiseReturnPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchandiseReturnPostPOSTPayload** | [**MerchandiseReturnPostPOSTPayload**](MerchandiseReturnPostPOSTPayload.md)| Resource body for MerchandiseReturn POST |

### Return type

[**MerchandiseReturnPostPOSTResponse**](MerchandiseReturnPostPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="merchandiseReturnReversalGet"></a>
# **merchandiseReturnReversalGet**
> MerchandiseReturnReversalGetGETResponse merchandiseReturnReversalGet()

Merchandise Return Reversal GET

Read Merchandise Return Reversal Transaction

### Example
```java
// Import classes:
//import com.visa.developer.sample.refundapi.ApiClient;
//import com.visa.developer.sample.refundapi.ApiException;
//import com.visa.developer.sample.refundapi.Configuration;
//import com.visa.developer.sample.refundapi.auth.*;
//import com.visa.developer.sample.refundapi.api.RefundapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

RefundapiApi apiInstance = new RefundapiApi();
try {
    MerchandiseReturnReversalGetGETResponse result = apiInstance.merchandiseReturnReversalGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundapiApi#merchandiseReturnReversalGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MerchandiseReturnReversalGetGETResponse**](MerchandiseReturnReversalGetGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="merchandiseReturnReversalPost"></a>
# **merchandiseReturnReversalPost**
> MerchandiseReturnReversalPostPOSTResponse merchandiseReturnReversalPost(merchandiseReturnReversalPostPOSTPayload)

Merchandise Return Reversal POST

Merchandise Return Reversal Transaction is used to reverse the refund amount that sent to the mVisa consumer. 

### Example
```java
// Import classes:
//import com.visa.developer.sample.refundapi.ApiClient;
//import com.visa.developer.sample.refundapi.ApiException;
//import com.visa.developer.sample.refundapi.Configuration;
//import com.visa.developer.sample.refundapi.auth.*;
//import com.visa.developer.sample.refundapi.api.RefundapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

RefundapiApi apiInstance = new RefundapiApi();
MerchandiseReturnReversalPostPOSTPayload merchandiseReturnReversalPostPOSTPayload = new MerchandiseReturnReversalPostPOSTPayload(); // MerchandiseReturnReversalPostPOSTPayload | Resource body for Merchandise Return Reversal POST
try {
    MerchandiseReturnReversalPostPOSTResponse result = apiInstance.merchandiseReturnReversalPost(merchandiseReturnReversalPostPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundapiApi#merchandiseReturnReversalPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchandiseReturnReversalPostPOSTPayload** | [**MerchandiseReturnReversalPostPOSTPayload**](MerchandiseReturnReversalPostPOSTPayload.md)| Resource body for Merchandise Return Reversal POST |

### Return type

[**MerchandiseReturnReversalPostPOSTResponse**](MerchandiseReturnReversalPostPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

