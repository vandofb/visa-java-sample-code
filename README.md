# Visa Developer Platform - Java Sample Code

This repository hosts the Java sample code for the [Visa Developer Platform](https://developer.visa.com/).

If you are new to the Visa Developer Platform, please take a look at our [Getting Started Guide](https://developer.visa.com/vdpguide#get-started-overview) which walks you through the steps to make a basic helloworld API call.

Once you are comfortable with the same and have also explored the documentation to know about the various APIs that Visa exposes, you can then use the Java sample code on this site as a starting point in your journey towards building your application.

Sample code is available for the following capabilities:

* [Visa Direct](https://developer.visa.com/capabilities/visa_direct)
* [Visa Merchant Offers Resource Center](https://developer.visa.com/capabilities/vmorc)
* [Merchant Search](https://developer.visa.com/capabilities/merchant_search)

## Getting Started

The instructions will guide you make the first call to VDP from your local machine for development and testing purposes.

### Prerequisites

* Java JDK: ([Version 1.8.0 or above](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html))
* Build Tools: Maven ([Version 3.0.5 or above](https://maven.apache.org/download.cgi))

### Setup & Installation

* Configure the credentials required

Edit the file /Samples/src/main/resources/auth_config.xml to set the fields shown below. Refer the [Getting Started Guide](https://developer.visa.com/vdpguide#get-started-overview) to get the credentials.

```
<username></username>
<password></password>
<keystore_path></keystore_path>
<keystore_password></keystore_password>
<private_key_password></private_key_password>
```
* You can also follow the below steps for quickly getting the credentials:
  * Login to https://developer.visa.com
  * Navigate to https://developer.visa.com/portal/#console
  * Click on create new project
  * Enter the project name and select the following products:
    * Visa Direct
    * Visa Merchant Offers Resource Center
    * Merchant Search
  * Click on create project
  * A pop-up will appear, click continue
  * Click on Download/Copy Certificate Private Key to download the key (From here on referred as **privateKey.pem**)
  * After the download is complete, confirm that the keys are downloaded and continue
  * Once redirected to the application page, do the following:
    * Under User ID and Password section, Note down the User ID (**USERNAME**)
    * Under User ID and Password section, Note down the Password (**PASSWORD**)
    * Under Certificates section, download the certification with the same name as that of the application (From here on referred as cert.pem)
    * Under Certificates section, download the Visa Development Platform Certificate (From here on referred as VDPCA-SBX.pem)
  * Move to your download folder (**KEYSTORE_PATH**) and perform the following actions to generate the jks file:
    * openssl pkcs12 -export -in cert.pem -inkey "privateKey.pem" -certfile cert.pem -out key.p12
    * Note the password asked in above step (**PRIVATE_KEY_PASSWORD**)
    * keytool -importkeystore -srckeystore key.p12 -srcstoretype PKCS12 -destkeystore key.jks
    * When asked for source key store password, enter PRIVATE_KEY_PASSWORD.
    * Enter the destination key store password and note it. (**KEYSTORE_PASSWORD**)
    * keytool -import -alias ejbca -keystore key.jks -file VDPCA-SBX.pem -storepass ``<KEYSTORE_PASSWORD>``


* Run the below command to install and resolve all dependencies
```
mvn clean install
```
 
## Running the tests
```
mvn test -pl Samples
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

**1.0**

For the versions available, see the [releases on this repository](https://github.com/visa/java-sample-code/releases). 

## Authors

**Visa Developer Platform**

See also the list of [contributors](https://github.com/visa/java-sample-code/graphs/contributors) who participated in this project.


## Acknowledgments

* The following repository only serves the need of calling VDP API's from Java as sample code.
