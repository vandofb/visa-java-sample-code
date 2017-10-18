# vdp-sample-java-mvisa

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.


This is a sample implementation of MvisaApi only for reference purpose.

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
import com.visa.developer.sample.mvisa.*;
import com.visa.developer.sample.mvisa.api.*;
import com.visa.developer.sample.mvisa.auth.HttpBasicAuth;
import com.visa.developer.sample.mvisa.auth.ApiKeyAuth;

import java.util.*;
import java.io.IOException;


public class MvisaApi {

    public static void main(String[] args) throws IOException, ApiException {
    
        //Configure HTTP basic authorization: mutualAuth
        HttpBasicAuth authInstance =   new HttpBasicAuth();
        authInstance.setPassword("{SET PASSWORD}");
        authInstance.setUsername("{SET USERNAME}");
        authInstance.setKEYSTORE_PATH("{SET PATH TO KEYSTORE}");
        authInstance.setKEYSTORE_PASSWORD("{SET KEYSTORE PASSWORD}");
        authInstance.setPRIVATE_KEY_PASSWORD("{SET PRIVATE KEY PASSWORD}");
    

        ApiClient apiClient = new ApiClient(authInstance);
        MvisaApi api = new MvisaApi(apiClient);
        api.cashInPushPayments_Example();
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.api.visa.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MvisaApi* | [**cashInPushPayments**](docs/MvisaApi.md#cashInPushPayments) | **POST** /visadirect/mvisa/v1/cashinpushpayments | CashInPushPayments POST
*MvisaApi* | [**cashInPushPaymentsGet**](docs/MvisaApi.md#cashInPushPaymentsGet) | **GET** /visadirect/mvisa/v1/cashinpushpayments/{statusIdentifier} | GET /visadirect/mvisa/v1/CashInPushPayments/{statusIdentifier}
*MvisaApi* | [**cashOutPaymentsGet**](docs/MvisaApi.md#cashOutPaymentsGet) | **GET** /visadirect/mvisa/v1/cashoutpushpayments/{statusIdentifier} | GET /visadirect/mvisa/v1/CashOutPushPayments/{statusIdentifier}
*MvisaApi* | [**cashOutPushPaymentsPost**](docs/MvisaApi.md#cashOutPushPaymentsPost) | **POST** /visadirect/mvisa/v1/cashoutpushpayments | CashOutPushPayments POST
*MvisaApi* | [**merchantPushPaymentGet**](docs/MvisaApi.md#merchantPushPaymentGet) | **GET** /visadirect/mvisa/v1/merchantpushpayments/{statusIdentifier} | GET /visadirect/mvisa/v1/MerchantPushPayments/{statusIdentifier}
*MvisaApi* | [**merchantPushPaymentsPost**](docs/MvisaApi.md#merchantPushPaymentsPost) | **POST** /visadirect/mvisa/v1/merchantpushpayments | MerchantPushPayments POST


## Documentation for Authorization

Authentication schemes defined for the API:
### mutualAuth

- **Type**: HTTP basic authentication

For more details check: [Visa Developer - Authentication](https://developer.visa.com/guides/vdpguide#two_way_ssl)

