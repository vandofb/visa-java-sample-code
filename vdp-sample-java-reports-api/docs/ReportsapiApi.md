# ReportsapiApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportingApi**](ReportsapiApi.md#reportingApi) | **GET** /visadirect/reports/v1/transactiondata | TransactionData


<a name="reportingApi"></a>
# **reportingApi**
> ReportingApiGETResponse reportingApi(fromDate, toDate)

TransactionData

Transaction Data

### Example
```java
// Import classes:
//import com.visa.developer.sample.reportsapi.ApiClient;
//import com.visa.developer.sample.reportsapi.ApiException;
//import com.visa.developer.sample.reportsapi.Configuration;
//import com.visa.developer.sample.reportsapi.auth.*;
//import com.visa.developer.sample.reportsapi.api.ReportsapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

ReportsapiApi apiInstance = new ReportsapiApi();
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
try {
    ReportingApiGETResponse result = apiInstance.reportingApi(fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsapiApi#reportingApi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]

### Return type

[**ReportingApiGETResponse**](ReportingApiGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

