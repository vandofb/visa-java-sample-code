# vdp-sample-java-funds-transfer

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.


This is a sample implementation of FundstransferApi only for reference purpose.

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
import com.visa.developer.sample.fundstransfer.*;
import com.visa.developer.sample.fundstransfer.api.*;
import com.visa.developer.sample.fundstransfer.auth.HttpBasicAuth;
import com.visa.developer.sample.fundstransfer.auth.ApiKeyAuth;

import java.util.*;
import java.io.IOException;


public class FundstransferApi {

    public static void main(String[] args) throws IOException, ApiException {
    
        //Configure HTTP basic authorization: mutualAuth
        HttpBasicAuth authInstance =   new HttpBasicAuth();
        authInstance.setPassword("{SET PASSWORD}");
        authInstance.setUsername("{SET USERNAME}");
        authInstance.setKEYSTORE_PATH("{SET PATH TO KEYSTORE}");
        authInstance.setKEYSTORE_PASSWORD("{SET KEYSTORE PASSWORD}");
        authInstance.setPRIVATE_KEY_PASSWORD("{SET PRIVATE KEY PASSWORD}");
    

        ApiClient apiClient = new ApiClient(authInstance);
        FundstransferApi api = new FundstransferApi(apiClient);
        api.multipullfunds_Example();
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.api.visa.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FundstransferApi* | [**multipullfunds**](docs/FundstransferApi.md#multipullfunds) | **POST** /visadirect/fundstransfer/v1/multipullfundstransactions | POST /visadirect/fundstransfer/v1/multipullfundstransactions
*FundstransferApi* | [**multipullfundstransactions**](docs/FundstransferApi.md#multipullfundstransactions) | **GET** /visadirect/fundstransfer/v1/multipullfundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/multipullfundstransactions/{statusIdentifier}
*FundstransferApi* | [**multipushfunds**](docs/FundstransferApi.md#multipushfunds) | **POST** /visadirect/fundstransfer/v1/multipushfundstransactions | POST /visadirect/fundstransfer/v1/multipushfundstransactions
*FundstransferApi* | [**multipushfundstransactions**](docs/FundstransferApi.md#multipushfundstransactions) | **GET** /visadirect/fundstransfer/v1/multipushfundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/multipushfundstransactions/{statusIdentifier}
*FundstransferApi* | [**multireversefunds**](docs/FundstransferApi.md#multireversefunds) | **POST** /visadirect/fundstransfer/v1/multireversefundstransactions | POST /visadirect/fundstransfer/v1/multireversefundstransactions
*FundstransferApi* | [**multireversefundstransactions**](docs/FundstransferApi.md#multireversefundstransactions) | **GET** /visadirect/fundstransfer/v1/multireversefundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/multireversefundstransactions/{statusIdentifier}
*FundstransferApi* | [**pullfunds**](docs/FundstransferApi.md#pullfunds) | **POST** /visadirect/fundstransfer/v1/pullfundstransactions | POST /visadirect/fundstransfer/v1/pullfundstransactions
*FundstransferApi* | [**pullfundstransactions**](docs/FundstransferApi.md#pullfundstransactions) | **GET** /visadirect/fundstransfer/v1/pullfundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/pullfundstransactions/{statusIdentifier}
*FundstransferApi* | [**pushfunds**](docs/FundstransferApi.md#pushfunds) | **POST** /visadirect/fundstransfer/v1/pushfundstransactions | POST /visadirect/fundstransfer/v1/pushfundstransactions
*FundstransferApi* | [**pushfundstransactions**](docs/FundstransferApi.md#pushfundstransactions) | **GET** /visadirect/fundstransfer/v1/pushfundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/pushfundstransactions/{statusIdentifier}
*FundstransferApi* | [**reversefunds**](docs/FundstransferApi.md#reversefunds) | **POST** /visadirect/fundstransfer/v1/reversefundstransactions | POST /visadirect/fundstransfer/v1/reversefundstransactions
*FundstransferApi* | [**reversefundstransactions**](docs/FundstransferApi.md#reversefundstransactions) | **GET** /visadirect/fundstransfer/v1/reversefundstransactions/{statusIdentifier} | GET /visadirect/fundstransfer/v1/reversefundstransactions/{statusIdentifier}


## Documentation for Authorization

Authentication schemes defined for the API:
### mutualAuth

- **Type**: HTTP basic authentication

For more details check: [Visa Developer - Authentication](https://developer.visa.com/guides/vdpguide#two_way_ssl)

