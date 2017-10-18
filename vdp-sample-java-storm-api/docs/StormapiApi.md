# StormapiApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelclaim**](StormapiApi.md#cancelclaim) | **POST** /visadirect/storm/v1/cancelclaim | Cancel Claim
[**claimdetails**](StormapiApi.md#claimdetails) | **POST** /visadirect/storm/v1/claimdetails | Claim Details
[**claimsummary**](StormapiApi.md#claimsummary) | **POST** /visadirect/storm/v1/claimsummary | Claim Summary
[**initiatefundtransfer**](StormapiApi.md#initiatefundtransfer) | **POST** /visadirect/storm/v1/initiatefundtransfer | Initiate Fund Transfer
[**redeemclaim**](StormapiApi.md#redeemclaim) | **POST** /visadirect/storm/v1/redeemclaim | Redeem Claim


<a name="cancelclaim"></a>
# **cancelclaim**
> CancelclaimPOSTResponse cancelclaim(cancelclaimPOSTPayload)

Cancel Claim

Cancel Claim

### Example
```java
// Import classes:
//import com.visa.developer.sample.stormapi.ApiClient;
//import com.visa.developer.sample.stormapi.ApiException;
//import com.visa.developer.sample.stormapi.Configuration;
//import com.visa.developer.sample.stormapi.auth.*;
//import com.visa.developer.sample.stormapi.api.StormapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

StormapiApi apiInstance = new StormapiApi();
CancelclaimPOSTPayload cancelclaimPOSTPayload = new CancelclaimPOSTPayload(); // CancelclaimPOSTPayload | Resource body for Cancel Claim
try {
    CancelclaimPOSTResponse result = apiInstance.cancelclaim(cancelclaimPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StormapiApi#cancelclaim");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancelclaimPOSTPayload** | [**CancelclaimPOSTPayload**](CancelclaimPOSTPayload.md)| Resource body for Cancel Claim |

### Return type

[**CancelclaimPOSTResponse**](CancelclaimPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="claimdetails"></a>
# **claimdetails**
> ClaimdetailsPOSTResponse claimdetails(claimdetailsPOSTPayload)

Claim Details

Claim Details

### Example
```java
// Import classes:
//import com.visa.developer.sample.stormapi.ApiClient;
//import com.visa.developer.sample.stormapi.ApiException;
//import com.visa.developer.sample.stormapi.Configuration;
//import com.visa.developer.sample.stormapi.auth.*;
//import com.visa.developer.sample.stormapi.api.StormapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

StormapiApi apiInstance = new StormapiApi();
ClaimdetailsPOSTPayload claimdetailsPOSTPayload = new ClaimdetailsPOSTPayload(); // ClaimdetailsPOSTPayload | Resource body for Claim Details
try {
    ClaimdetailsPOSTResponse result = apiInstance.claimdetails(claimdetailsPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StormapiApi#claimdetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **claimdetailsPOSTPayload** | [**ClaimdetailsPOSTPayload**](ClaimdetailsPOSTPayload.md)| Resource body for Claim Details |

### Return type

[**ClaimdetailsPOSTResponse**](ClaimdetailsPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="claimsummary"></a>
# **claimsummary**
> ClaimsummaryPOSTResponse claimsummary(claimsummaryPOSTPayload)

Claim Summary

Claim Summary

### Example
```java
// Import classes:
//import com.visa.developer.sample.stormapi.ApiClient;
//import com.visa.developer.sample.stormapi.ApiException;
//import com.visa.developer.sample.stormapi.Configuration;
//import com.visa.developer.sample.stormapi.auth.*;
//import com.visa.developer.sample.stormapi.api.StormapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

StormapiApi apiInstance = new StormapiApi();
ClaimsummaryPOSTPayload claimsummaryPOSTPayload = new ClaimsummaryPOSTPayload(); // ClaimsummaryPOSTPayload | Resource body for Claim Summary
try {
    ClaimsummaryPOSTResponse result = apiInstance.claimsummary(claimsummaryPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StormapiApi#claimsummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **claimsummaryPOSTPayload** | [**ClaimsummaryPOSTPayload**](ClaimsummaryPOSTPayload.md)| Resource body for Claim Summary |

### Return type

[**ClaimsummaryPOSTResponse**](ClaimsummaryPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="initiatefundtransfer"></a>
# **initiatefundtransfer**
> InitiatefundtransferPOSTResponse initiatefundtransfer(initiatefundtransferPOSTPayload)

Initiate Fund Transfer

Initiate Fund Transfer

### Example
```java
// Import classes:
//import com.visa.developer.sample.stormapi.ApiClient;
//import com.visa.developer.sample.stormapi.ApiException;
//import com.visa.developer.sample.stormapi.Configuration;
//import com.visa.developer.sample.stormapi.auth.*;
//import com.visa.developer.sample.stormapi.api.StormapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

StormapiApi apiInstance = new StormapiApi();
InitiatefundtransferPOSTPayload initiatefundtransferPOSTPayload = new InitiatefundtransferPOSTPayload(); // InitiatefundtransferPOSTPayload | Resource body for Initiate Fund Transfer
try {
    InitiatefundtransferPOSTResponse result = apiInstance.initiatefundtransfer(initiatefundtransferPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StormapiApi#initiatefundtransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **initiatefundtransferPOSTPayload** | [**InitiatefundtransferPOSTPayload**](InitiatefundtransferPOSTPayload.md)| Resource body for Initiate Fund Transfer |

### Return type

[**InitiatefundtransferPOSTResponse**](InitiatefundtransferPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="redeemclaim"></a>
# **redeemclaim**
> RedeemclaimPOSTResponse redeemclaim(redeemclaimPOSTPayload)

Redeem Claim

Redeem Claim

### Example
```java
// Import classes:
//import com.visa.developer.sample.stormapi.ApiClient;
//import com.visa.developer.sample.stormapi.ApiException;
//import com.visa.developer.sample.stormapi.Configuration;
//import com.visa.developer.sample.stormapi.auth.*;
//import com.visa.developer.sample.stormapi.api.StormapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

StormapiApi apiInstance = new StormapiApi();
RedeemclaimPOSTPayload redeemclaimPOSTPayload = new RedeemclaimPOSTPayload(); // RedeemclaimPOSTPayload | Resource body for Redeem Claim
try {
    RedeemclaimPOSTResponse result = apiInstance.redeemclaim(redeemclaimPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StormapiApi#redeemclaim");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redeemclaimPOSTPayload** | [**RedeemclaimPOSTPayload**](RedeemclaimPOSTPayload.md)| Resource body for Redeem Claim |

### Return type

[**RedeemclaimPOSTResponse**](RedeemclaimPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

