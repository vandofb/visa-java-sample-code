# WsApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**watchlistinquiry**](WsApi.md#watchlistinquiry) | **POST** /visadirect/watchlistscreening/v1/watchlistinquiry | Get Status


<a name="watchlistinquiry"></a>
# **watchlistinquiry**
> WatchlistinquiryPOSTResponse watchlistinquiry(watchlistinquiryPOSTPayload)

Get Status

Provide an OFAC score value used for evaluation on how closely an individual&#39;s name, city, and country input fields match against entries on the OFAC SDN lists. It also provides an OFAC status value which represents how VisaNet would process the individual&#39;s information if used in a cross-border OCT transaction.

### Example
```java
// Import classes:
//import com.visa.developer.sample.ws.ApiClient;
//import com.visa.developer.sample.ws.ApiException;
//import com.visa.developer.sample.ws.Configuration;
//import com.visa.developer.sample.ws.auth.*;
//import com.visa.developer.sample.ws.api.WsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

WsApi apiInstance = new WsApi();
WatchlistinquiryPOSTPayload watchlistinquiryPOSTPayload = new WatchlistinquiryPOSTPayload(); // WatchlistinquiryPOSTPayload | Resource body for Get Status
try {
    WatchlistinquiryPOSTResponse result = apiInstance.watchlistinquiry(watchlistinquiryPOSTPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WsApi#watchlistinquiry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchlistinquiryPOSTPayload** | [**WatchlistinquiryPOSTPayload**](WatchlistinquiryPOSTPayload.md)| Resource body for Get Status |

### Return type

[**WatchlistinquiryPOSTResponse**](WatchlistinquiryPOSTResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

