# MvisaApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cashInPushPayments**](MvisaApi.md#cashInPushPayments) | **POST** /visadirect/mvisa/v1/cashinpushpayments | CashInPushPayments POST
[**cashInPushPaymentsGet**](MvisaApi.md#cashInPushPaymentsGet) | **GET** /visadirect/mvisa/v1/cashinpushpayments/{statusIdentifier} | GET /visadirect/mvisa/v1/CashInPushPayments/{statusIdentifier}
[**cashOutPaymentsGet**](MvisaApi.md#cashOutPaymentsGet) | **GET** /visadirect/mvisa/v1/cashoutpushpayments/{statusIdentifier} | GET /visadirect/mvisa/v1/CashOutPushPayments/{statusIdentifier}
[**cashOutPushPaymentsPost**](MvisaApi.md#cashOutPushPaymentsPost) | **POST** /visadirect/mvisa/v1/cashoutpushpayments | CashOutPushPayments POST
[**merchantPushPaymentGet**](MvisaApi.md#merchantPushPaymentGet) | **GET** /visadirect/mvisa/v1/merchantpushpayments/{statusIdentifier} | GET /visadirect/mvisa/v1/MerchantPushPayments/{statusIdentifier}
[**merchantPushPaymentsPost**](MvisaApi.md#merchantPushPaymentsPost) | **POST** /visadirect/mvisa/v1/merchantpushpayments | MerchantPushPayments POST


<a name="cashInPushPayments"></a>
# **cashInPushPayments**
> CashInPushPaymentsPOSTResponse cashInPushPayments(cashInPushPaymentsPOSTPayload)

CashInPushPayments POST



### Example
```java
// Import classes:
//import com.visa.developer.sample.mvisa.ApiClient;
//import com.visa.developer.sample.mvisa.ApiException;
//import com.visa.developer.sample.mvisa.Configuration;
//import com.visa.developer.sample.mvisa.auth.*;
//import com.visa.developer.sample.mvisa.api.MvisaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

MvisaApi apiInstance = new MvisaApi();
CashInPushPaymentsPOSTPayload cashInPushPaymentsPOSTPayload = new CashInPushPaymentsPOSTPayload(); // CashInPushPaymentsPOSTPayload | Resource body for CashInPushPayments POST
try {
    CashInPushPaymentsPOSTResponse result = apiInstance.cashInPushPayments(cashInPushPaymentsPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MvisaApi#cashInPushPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashInPushPaymentsPOSTPayload** | [**CashInPushPaymentsPOSTPayload**](CashInPushPaymentsPOSTPayload.md)| Resource body for CashInPushPayments POST |

### Return type

[**CashInPushPaymentsPOSTResponse**](CashInPushPaymentsPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cashInPushPaymentsGet"></a>
# **cashInPushPaymentsGet**
> CashInPushPaymentsGetGETResponse cashInPushPaymentsGet(statusIdentifier)

GET /visadirect/mvisa/v1/CashInPushPayments/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.mvisa.ApiClient;
//import com.visa.developer.sample.mvisa.ApiException;
//import com.visa.developer.sample.mvisa.Configuration;
//import com.visa.developer.sample.mvisa.auth.*;
//import com.visa.developer.sample.mvisa.api.MvisaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

MvisaApi apiInstance = new MvisaApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    CashInPushPaymentsGetGETResponse result = apiInstance.cashInPushPaymentsGet(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MvisaApi#cashInPushPaymentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**CashInPushPaymentsGetGETResponse**](CashInPushPaymentsGetGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cashOutPaymentsGet"></a>
# **cashOutPaymentsGet**
> CashOutPaymentsGetGETResponse cashOutPaymentsGet(statusIdentifier)

GET /visadirect/mvisa/v1/CashOutPushPayments/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.mvisa.ApiClient;
//import com.visa.developer.sample.mvisa.ApiException;
//import com.visa.developer.sample.mvisa.Configuration;
//import com.visa.developer.sample.mvisa.auth.*;
//import com.visa.developer.sample.mvisa.api.MvisaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

MvisaApi apiInstance = new MvisaApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    CashOutPaymentsGetGETResponse result = apiInstance.cashOutPaymentsGet(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MvisaApi#cashOutPaymentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**CashOutPaymentsGetGETResponse**](CashOutPaymentsGetGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cashOutPushPaymentsPost"></a>
# **cashOutPushPaymentsPost**
> CashOutPushPaymentsPostPOSTResponse cashOutPushPaymentsPost(cashOutPushPaymentsPostPOSTPayload)

CashOutPushPayments POST



### Example
```java
// Import classes:
//import com.visa.developer.sample.mvisa.ApiClient;
//import com.visa.developer.sample.mvisa.ApiException;
//import com.visa.developer.sample.mvisa.Configuration;
//import com.visa.developer.sample.mvisa.auth.*;
//import com.visa.developer.sample.mvisa.api.MvisaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

MvisaApi apiInstance = new MvisaApi();
CashOutPushPaymentsPostPOSTPayload cashOutPushPaymentsPostPOSTPayload = new CashOutPushPaymentsPostPOSTPayload(); // CashOutPushPaymentsPostPOSTPayload | Resource body for CashOutPushPayments POST
try {
    CashOutPushPaymentsPostPOSTResponse result = apiInstance.cashOutPushPaymentsPost(cashOutPushPaymentsPostPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MvisaApi#cashOutPushPaymentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashOutPushPaymentsPostPOSTPayload** | [**CashOutPushPaymentsPostPOSTPayload**](CashOutPushPaymentsPostPOSTPayload.md)| Resource body for CashOutPushPayments POST |

### Return type

[**CashOutPushPaymentsPostPOSTResponse**](CashOutPushPaymentsPostPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="merchantPushPaymentGet"></a>
# **merchantPushPaymentGet**
> MerchantPushPaymentGetGETResponse merchantPushPaymentGet(statusIdentifier)

GET /visadirect/mvisa/v1/MerchantPushPayments/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.mvisa.ApiClient;
//import com.visa.developer.sample.mvisa.ApiException;
//import com.visa.developer.sample.mvisa.Configuration;
//import com.visa.developer.sample.mvisa.auth.*;
//import com.visa.developer.sample.mvisa.api.MvisaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

MvisaApi apiInstance = new MvisaApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    MerchantPushPaymentGetGETResponse result = apiInstance.merchantPushPaymentGet(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MvisaApi#merchantPushPaymentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**MerchantPushPaymentGetGETResponse**](MerchantPushPaymentGetGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="merchantPushPaymentsPost"></a>
# **merchantPushPaymentsPost**
> MerchantPushPaymentsPostPOSTResponse merchantPushPaymentsPost(merchantPushPaymentsPostPOSTPayload)

MerchantPushPayments POST

MerchantPushPayments is used for payment to a merchant for goods or services purchased, either face-to-face or remote.  This API is invoked in the following sequence:&lt;br&gt;&lt;br&gt;1.The consumer connects the account through the mobile device, provides payment instructions and authenticates themselves. The merchant information is captured by the consumer’s mobile from the merchant information display which can be through key entry, QR code, NFC or other means. The payment instructions include mVisa merchant ID (which is used to identify the merchant PAN), the amount to be paid and optionally a payment reference such as an invoice or bill number.&lt;br&gt;&lt;br&gt;2. Upon receiving the payment instructions, the consumer’s issuer invokes MerchantPushPayments POST operation to push payment instructions to the merchant’s account.&lt;br&gt;&lt;br&gt;3. The merchant acquirer processes the Visa message, creates a record of merchant payment and reverts back with a response message containing the MerchantPushPayments Response Attributes.&lt;br&gt;&lt;br&gt;4. On completion, both the consumer and the merchant receive confirmation or denial notification. &lt;br&gt;&lt;br&gt;Note: If the POST call times out, the resource will return a statusIdentifier which can be used in the MerchantPushPayments Transactions GET operation as the {statusIdentifier} in the URL.&lt;br&gt;&lt;br&gt;HEADER : X-Client-Transaction-ID&lt;br&gt;Optional&lt;br&gt;A unique value for a transaction (unique at the level of the individual service invoker and can be recycled every 24 hours). This identifies the transaction uniquely and can help reference the results of the original transaction.

### Example
```java
// Import classes:
//import com.visa.developer.sample.mvisa.ApiClient;
//import com.visa.developer.sample.mvisa.ApiException;
//import com.visa.developer.sample.mvisa.Configuration;
//import com.visa.developer.sample.mvisa.auth.*;
//import com.visa.developer.sample.mvisa.api.MvisaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

MvisaApi apiInstance = new MvisaApi();
MerchantPushPaymentsPostPOSTPayload merchantPushPaymentsPostPOSTPayload = new MerchantPushPaymentsPostPOSTPayload(); // MerchantPushPaymentsPostPOSTPayload | Resource body for MerchantPushPayments POST
try {
    MerchantPushPaymentsPostPOSTResponse result = apiInstance.merchantPushPaymentsPost(merchantPushPaymentsPostPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MvisaApi#merchantPushPaymentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantPushPaymentsPostPOSTPayload** | [**MerchantPushPaymentsPostPOSTPayload**](MerchantPushPaymentsPostPOSTPayload.md)| Resource body for MerchantPushPayments POST |

### Return type

[**MerchantPushPaymentsPostPOSTResponse**](MerchantPushPaymentsPostPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

