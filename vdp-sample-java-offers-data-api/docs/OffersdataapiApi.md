# OffersdataapiApi

All URIs are relative to *https://sandbox.api.visa.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllOffers**](OffersdataapiApi.md#retrieveAllOffers) | **GET** /vmorc/offers/v1/all | Retrieve All Offers
[**retrieveOffersByContentId**](OffersdataapiApi.md#retrieveOffersByContentId) | **GET** /vmorc/offers/v1/bycontentid | Retrieve Offers by a Content Id
[**retrieveOffersByFilter**](OffersdataapiApi.md#retrieveOffersByFilter) | **GET** /vmorc/offers/v1/byfilter | List of Offers By Filter
[**retrieveOffersByOfferId**](OffersdataapiApi.md#retrieveOffersByOfferId) | **GET** /vmorc/offers/v1/byofferid | Retrieve Offers By Offer Id


<a name="retrieveAllOffers"></a>
# **retrieveAllOffers**
> RetrieveAllOffersGETResponse retrieveAllOffers()

Retrieve All Offers

Request for all offers

### Example
```java
// Import classes:
//import com.visa.developer.sample.offersdataapi.ApiClient;
//import com.visa.developer.sample.offersdataapi.ApiException;
//import com.visa.developer.sample.offersdataapi.Configuration;
//import com.visa.developer.sample.offersdataapi.auth.*;
//import com.visa.developer.sample.offersdataapi.api.OffersdataapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

OffersdataapiApi apiInstance = new OffersdataapiApi();
try {
    RetrieveAllOffersGETResponse result = apiInstance.retrieveAllOffers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersdataapiApi#retrieveAllOffers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RetrieveAllOffersGETResponse**](RetrieveAllOffersGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveOffersByContentId"></a>
# **retrieveOffersByContentId**
> RetrieveOffersByContentIdGETResponse retrieveOffersByContentId(contentid)

Retrieve Offers by a Content Id

Request for offers by content id

### Example
```java
// Import classes:
//import com.visa.developer.sample.offersdataapi.ApiClient;
//import com.visa.developer.sample.offersdataapi.ApiException;
//import com.visa.developer.sample.offersdataapi.Configuration;
//import com.visa.developer.sample.offersdataapi.auth.*;
//import com.visa.developer.sample.offersdataapi.api.OffersdataapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

OffersdataapiApi apiInstance = new OffersdataapiApi();
String contentid = "contentid_example"; // String | 
try {
    RetrieveOffersByContentIdGETResponse result = apiInstance.retrieveOffersByContentId(contentid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersdataapiApi#retrieveOffersByContentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentid** | **String**|  | [optional]

### Return type

[**RetrieveOffersByContentIdGETResponse**](RetrieveOffersByContentIdGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveOffersByFilter"></a>
# **retrieveOffersByFilter**
> RetrieveOffersByFilterGETResponse retrieveOffersByFilter()

List of Offers By Filter

Request for offers by filter

### Example
```java
// Import classes:
//import com.visa.developer.sample.offersdataapi.ApiClient;
//import com.visa.developer.sample.offersdataapi.ApiException;
//import com.visa.developer.sample.offersdataapi.Configuration;
//import com.visa.developer.sample.offersdataapi.auth.*;
//import com.visa.developer.sample.offersdataapi.api.OffersdataapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

OffersdataapiApi apiInstance = new OffersdataapiApi();
try {
    RetrieveOffersByFilterGETResponse result = apiInstance.retrieveOffersByFilter();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersdataapiApi#retrieveOffersByFilter");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RetrieveOffersByFilterGETResponse**](RetrieveOffersByFilterGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveOffersByOfferId"></a>
# **retrieveOffersByOfferId**
> RetrieveOffersByOfferIdGETResponse retrieveOffersByOfferId(offerid)

Retrieve Offers By Offer Id

Request for offers by an offer id

### Example
```java
// Import classes:
//import com.visa.developer.sample.offersdataapi.ApiClient;
//import com.visa.developer.sample.offersdataapi.ApiException;
//import com.visa.developer.sample.offersdataapi.Configuration;
//import com.visa.developer.sample.offersdataapi.auth.*;
//import com.visa.developer.sample.offersdataapi.api.OffersdataapiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: mutualAuth
HttpBasicAuth mutualAuth = (HttpBasicAuth) defaultClient.getAuthentication("mutualAuth");
mutualAuth.setUsername("YOUR USERNAME");
mutualAuth.setPassword("YOUR PASSWORD");

OffersdataapiApi apiInstance = new OffersdataapiApi();
String offerid = "offerid_example"; // String | 
try {
    RetrieveOffersByOfferIdGETResponse result = apiInstance.retrieveOffersByOfferId(offerid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersdataapiApi#retrieveOffersByOfferId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerid** | **String**|  | [optional]

### Return type

[**RetrieveOffersByOfferIdGETResponse**](RetrieveOffersByOfferIdGETResponse.md)

### Authorization

[mutualAuth](../README.md#mutualAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

