# FundstransferApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**multipullfunds**](FundstransferApi.md#multipullfunds) | **POST** /visadirect/fundstransfer/v1/multipullfundstransactions | POST /visadirect/fundstransfer/v1/multipullfundstransactions
[**multipullfundstransactions**](FundstransferApi.md#multipullfundstransactions) | **GET** /visadirect/fundstransfer/v1/multipullfundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/multipullfundstransactions/{statusIdentifier}
[**multipushfunds**](FundstransferApi.md#multipushfunds) | **POST** /visadirect/fundstransfer/v1/multipushfundstransactions | POST /visadirect/fundstransfer/v1/multipushfundstransactions
[**multipushfundstransactions**](FundstransferApi.md#multipushfundstransactions) | **GET** /visadirect/fundstransfer/v1/multipushfundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/multipushfundstransactions/{statusIdentifier}
[**multireversefunds**](FundstransferApi.md#multireversefunds) | **POST** /visadirect/fundstransfer/v1/multireversefundstransactions | POST /visadirect/fundstransfer/v1/multireversefundstransactions
[**multireversefundstransactions**](FundstransferApi.md#multireversefundstransactions) | **GET** /visadirect/fundstransfer/v1/multireversefundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/multireversefundstransactions/{statusIdentifier}
[**pullfunds**](FundstransferApi.md#pullfunds) | **POST** /visadirect/fundstransfer/v1/pullfundstransactions | POST /visadirect/fundstransfer/v1/pullfundstransactions
[**pullfundstransactions**](FundstransferApi.md#pullfundstransactions) | **GET** /visadirect/fundstransfer/v1/pullfundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/pullfundstransactions/{statusIdentifier}
[**pushfunds**](FundstransferApi.md#pushfunds) | **POST** /visadirect/fundstransfer/v1/pushfundstransactions | POST /visadirect/fundstransfer/v1/pushfundstransactions
[**pushfundstransactions**](FundstransferApi.md#pushfundstransactions) | **GET** /visadirect/fundstransfer/v1/pushfundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/pushfundstransactions/{statusIdentifier}
[**reversefunds**](FundstransferApi.md#reversefunds) | **POST** /visadirect/fundstransfer/v1/reversefundstransactions | POST /visadirect/fundstransfer/v1/reversefundstransactions
[**reversefundstransactions**](FundstransferApi.md#reversefundstransactions) | **GET** /visadirect/fundstransfer/v1/reversefundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/reversefundstransactions/{statusIdentifier}


<a name="multipullfunds"></a>
# **multipullfunds**
> MultipullfundsPOSTResponse multipullfunds(xClientTransactionId, multipullfundsPOSTPayload)

POST /visadirect/fundstransfer/v1/multipullfundstransactions

The MultiPullFundsTransactions resource debits (pulls) funds from multiple sender’s Visa accounts (in preparation for pushing funds to one or many recipient’s accounts) by initiating an extension of the Account Funding Transaction (AFT) financial message.&lt;br&gt;The MultiPullFundsTransactions resource can be used to submit large API requests with multiple transactions to gain operational efficiencies.

### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String xClientTransactionId = "xClientTransactionId_example"; // String | 
MultipullfundsPOSTPayload multipullfundsPOSTPayload = new MultipullfundsPOSTPayload(); // MultipullfundsPOSTPayload | Resource body for POST /visadirect/fundstransfer/v1/multipullfundstransactions
try {
    MultipullfundsPOSTResponse result = apiInstance.multipullfunds(xClientTransactionId, multipullfundsPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#multipullfunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xClientTransactionId** | **String**|  |
 **multipullfundsPOSTPayload** | [**MultipullfundsPOSTPayload**](MultipullfundsPOSTPayload.md)| Resource body for POST /visadirect/fundstransfer/v1/multipullfundstransactions |

### Return type

[**MultipullfundsPOSTResponse**](MultipullfundsPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="multipullfundstransactions"></a>
# **multipullfundstransactions**
> MultipullfundstransactionsGETResponse multipullfundstransactions(statusIdentifier)

GET /visadirect/fundstransfer/v1/multipullfundstransactions/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    MultipullfundstransactionsGETResponse result = apiInstance.multipullfundstransactions(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#multipullfundstransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**MultipullfundstransactionsGETResponse**](MultipullfundstransactionsGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="multipushfunds"></a>
# **multipushfunds**
> MultipushfundsPOSTResponse multipushfunds(xClientTransactionId, multipushfundsPOSTPayload)

POST /visadirect/fundstransfer/v1/multipushfundstransactions

The MultiPushFundsTransactions resource credits (pushes) funds to multiple recipient&#39;s Visa accounts  by initiating an extension of the Original Credit Transaction (OCT) financial message. &lt;br&gt;&lt;br&gt;The MultiPushFundsTransactions resource can be used to submit large API requests with multiple transactions to gain operational efficiencies.

### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String xClientTransactionId = "xClientTransactionId_example"; // String | 
MultipushfundsPOSTPayload multipushfundsPOSTPayload = new MultipushfundsPOSTPayload(); // MultipushfundsPOSTPayload | Resource body for POST /visadirect/fundstransfer/v1/multipushfundstransactions
try {
    MultipushfundsPOSTResponse result = apiInstance.multipushfunds(xClientTransactionId, multipushfundsPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#multipushfunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xClientTransactionId** | **String**|  |
 **multipushfundsPOSTPayload** | [**MultipushfundsPOSTPayload**](MultipushfundsPOSTPayload.md)| Resource body for POST /visadirect/fundstransfer/v1/multipushfundstransactions |

### Return type

[**MultipushfundsPOSTResponse**](MultipushfundsPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="multipushfundstransactions"></a>
# **multipushfundstransactions**
> MultipushfundstransactionsGETResponse multipushfundstransactions(statusIdentifier)

GET /visadirect/fundstransfer/v1/multipushfundstransactions/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    MultipushfundstransactionsGETResponse result = apiInstance.multipushfundstransactions(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#multipushfundstransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**MultipushfundstransactionsGETResponse**](MultipushfundstransactionsGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="multireversefunds"></a>
# **multireversefunds**
> MultireversefundsPOSTResponse multireversefunds(xClientTransactionId, multireversefundsPOSTPayload)

POST /visadirect/fundstransfer/v1/multireversefundstransactions

The MultiReverseFundsTransactions resource credits (pushes back) funds to multiple sender’s Visa accounts  by initiating an extension of the  Account Funding Transaction Reversal (AFTR) financial message

### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String xClientTransactionId = "xClientTransactionId_example"; // String | 
MultireversefundsPOSTPayload multireversefundsPOSTPayload = new MultireversefundsPOSTPayload(); // MultireversefundsPOSTPayload | Resource body for POST /visadirect/fundstransfer/v1/multireversefundstransactions
try {
    MultireversefundsPOSTResponse result = apiInstance.multireversefunds(xClientTransactionId, multireversefundsPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#multireversefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xClientTransactionId** | **String**|  |
 **multireversefundsPOSTPayload** | [**MultireversefundsPOSTPayload**](MultireversefundsPOSTPayload.md)| Resource body for POST /visadirect/fundstransfer/v1/multireversefundstransactions |

### Return type

[**MultireversefundsPOSTResponse**](MultireversefundsPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="multireversefundstransactions"></a>
# **multireversefundstransactions**
> MultireversefundstransactionsGETResponse multireversefundstransactions(statusIdentifier)

GET /visadirect/fundstransfer/v1/multireversefundstransactions/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    MultireversefundstransactionsGETResponse result = apiInstance.multireversefundstransactions(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#multireversefundstransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**MultireversefundstransactionsGETResponse**](MultireversefundstransactionsGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pullfunds"></a>
# **pullfunds**
> PullfundsPOSTResponse pullfunds(pullfundsPOSTPayload)

POST /visadirect/fundstransfer/v1/pullfundstransactions

The PullFundsTransactions Resource debits (pulls) funds from a sender’s Visa account (in preparation for pushing funds to a recipient’s account) by initiating a financial message called an Account Funding Transaction (AFT)

### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
PullfundsPOSTPayload pullfundsPOSTPayload = new PullfundsPOSTPayload(); // PullfundsPOSTPayload | Resource body for POST /visadirect/fundstransfer/v1/pullfundstransactions
try {
    PullfundsPOSTResponse result = apiInstance.pullfunds(pullfundsPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#pullfunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullfundsPOSTPayload** | [**PullfundsPOSTPayload**](PullfundsPOSTPayload.md)| Resource body for POST /visadirect/fundstransfer/v1/pullfundstransactions |

### Return type

[**PullfundsPOSTResponse**](PullfundsPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pullfundstransactions"></a>
# **pullfundstransactions**
> PullfundstransactionsGETResponse pullfundstransactions(statusIdentifier)

GET /visadirect/fundstransfer/v1/pullfundstransactions/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    PullfundstransactionsGETResponse result = apiInstance.pullfundstransactions(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#pullfundstransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**PullfundstransactionsGETResponse**](PullfundstransactionsGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pushfunds"></a>
# **pushfunds**
> PushfundsPOSTResponse pushfunds(xClientTransactionId, pushfundsPOSTPayload)

POST /visadirect/fundstransfer/v1/pushfundstransactions

The PushFundsTransactions resource credits (pushes) funds to a recipient&#39;s Visa account  by initiating a financial message called an Original Credit Transaction (OCT).

### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String xClientTransactionId = "xClientTransactionId_example"; // String | 
PushfundsPOSTPayload pushfundsPOSTPayload = new PushfundsPOSTPayload(); // PushfundsPOSTPayload | Resource body for POST /visadirect/fundstransfer/v1/pushfundstransactions
try {
    PushfundsPOSTResponse result = apiInstance.pushfunds(xClientTransactionId, pushfundsPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#pushfunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xClientTransactionId** | **String**|  |
 **pushfundsPOSTPayload** | [**PushfundsPOSTPayload**](PushfundsPOSTPayload.md)| Resource body for POST /visadirect/fundstransfer/v1/pushfundstransactions |

### Return type

[**PushfundsPOSTResponse**](PushfundsPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pushfundstransactions"></a>
# **pushfundstransactions**
> PushfundstransactionsGETResponse pushfundstransactions(statusIdentifier)

GET /visadirect/fundstransfer/v1/pushfundstransactions/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    PushfundstransactionsGETResponse result = apiInstance.pushfundstransactions(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#pushfundstransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**PushfundstransactionsGETResponse**](PushfundstransactionsGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reversefunds"></a>
# **reversefunds**
> ReversefundsPOSTResponse reversefunds(reversefundsPOSTPayload)

POST /visadirect/fundstransfer/v1/reversefundstransactions

The ReverseFundsTransactions resource credits (pushes back) funds to the sender’s Visa account  by initiating a financial message called an Account Funding Transaction Reversal (AFTR).

### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
ReversefundsPOSTPayload reversefundsPOSTPayload = new ReversefundsPOSTPayload(); // ReversefundsPOSTPayload | Resource body for POST /visadirect/fundstransfer/v1/reversefundstransactions
try {
    ReversefundsPOSTResponse result = apiInstance.reversefunds(reversefundsPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#reversefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reversefundsPOSTPayload** | [**ReversefundsPOSTPayload**](ReversefundsPOSTPayload.md)| Resource body for POST /visadirect/fundstransfer/v1/reversefundstransactions |

### Return type

[**ReversefundsPOSTResponse**](ReversefundsPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reversefundstransactions"></a>
# **reversefundstransactions**
> ReversefundstransactionsGETResponse reversefundstransactions(statusIdentifier)

GET /visadirect/fundstransfer/v1/reversefundstransactions/{statusIdentifier}



### Example
```java
// Import classes:
//import com.visa.developer.sample.fundstransfer.ApiClient;
//import com.visa.developer.sample.fundstransfer.ApiException;
//import com.visa.developer.sample.fundstransfer.Configuration;
//import com.visa.developer.sample.fundstransfer.auth.*;
//import com.visa.developer.sample.fundstransfer.api.FundstransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

FundstransferApi apiInstance = new FundstransferApi();
String statusIdentifier = "statusIdentifier_example"; // String | 
try {
    ReversefundstransactionsGETResponse result = apiInstance.reversefundstransactions(statusIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundstransferApi#reversefundstransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusIdentifier** | **String**|  |

### Return type

[**ReversefundstransactionsGETResponse**](ReversefundstransactionsGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

