# vdp-sample-java-refund-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.


This is a sample implementation of RefundapiApi only for reference purpose.

## Getting Started

### Create an App
First  create an app on [Visa Developer - App Dashboard](https://developer.visa.com/portal/#console)

An application within Visa Developer contains a set of APIs that you can access with one set of credentials.

### Generate Authentication Keys
Visa Developer uses simple and effective authentication and authorization methods.
Based on the APIs you select, use one of the following two standard and supported authentication methods for calling the APIs:

- Two-Way SSL (Mutual Authentication)
- API Key - Shared Secret (x-pay-token)

For more details check: [Visa Developer - Authentication](https://developer.visa.com/guides/vdpguide#two_way_ssl)


Set the relevant mutualAuth authentication keys and execute the API call:


```java
import com.visa.developer.sample.refundapi.*;
import com.visa.developer.sample.refundapi.api.*;
import com.visa.developer.sample.refundapi.auth.HttpBasicAuth;
import com.visa.developer.sample.refundapi.auth.ApiKeyAuth;

import java.util.*;
import java.io.IOException;


public class RefundapiApi {

    public static void main(String[] args) throws IOException, ApiException {
    
        //Configure HTTP basic authorization: mutualAuth
        HttpBasicAuth authInstance =   new HttpBasicAuth();
        authInstance.setPassword("{SET PASSWORD}");
        authInstance.setUsername("{SET USERNAME}");
        authInstance.setKEYSTORE_PATH("{SET PATH TO KEYSTORE}");
        authInstance.setKEYSTORE_PASSWORD("{SET KEYSTORE PASSWORD}");
        authInstance.setPRIVATE_KEY_PASSWORD("{SET PRIVATE KEY PASSWORD}");
    

        ApiClient apiClient = new ApiClient(authInstance);
        RefundapiApi api = new RefundapiApi(apiClient);
        api.merchandiseReturnGet_Example();
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.api.visa.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*RefundapiApi* | [**merchandiseReturnGet**](docs/RefundapiApi.md#merchandiseReturnGet) | **GET** /visadirect/mvisa/v1/mr/{statusIdentifier} | Merchandise Return GET
*RefundapiApi* | [**merchandiseReturnPost**](docs/RefundapiApi.md#merchandiseReturnPost) | **POST** /visadirect/mvisa/v1/mr | MerchandiseReturn POST
*RefundapiApi* | [**merchandiseReturnReversalGet**](docs/RefundapiApi.md#merchandiseReturnReversalGet) | **GET** /visadirect/mvisa/v1/mrr/{statusIdentifier} | Merchandise Return Reversal GET
*RefundapiApi* | [**merchandiseReturnReversalPost**](docs/RefundapiApi.md#merchandiseReturnReversalPost) | **POST** /visadirect/mvisa/v1/mrr | Merchandise Return Reversal POST


## Documentation for Authorization

Authentication schemes defined for the API:
### mutualAuth

- **Type**: HTTP basic authentication

For more details check: [Visa Developer - Authentication](https://developer.visa.com/guides/vdpguide#two_way_ssl)

