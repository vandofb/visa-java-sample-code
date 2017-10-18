import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.mvisa.*;
import com.visa.developer.sample.mvisa.api.*;

public class merchant_push_payments_postPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		MvisaApi api = new MvisaApi(auth);
		String payload = "{"
		+"	\"transactionIdentifier\": \"381228649430015\","
		+"	\"transactionCurrencyCode\": \"INR\","
		+"	\"systemsTraceAuditNumber\": \"451035\","
		+"	\"senderReference\": \"\","
		+"	\"senderName\": \"Jasper\","
		+"	\"senderAccountNumber\": \"4027290077881587\","
		+"	\"secondaryId\": \"123TEST\","
		+"	\"retrievalReferenceNumber\": \"412770451035\","
		+"	\"recipientPrimaryAccountNumber\": \"4123640062698797\","
		+"	\"recipientName\": \"Jasper\","
		+"	\"purchaseIdentifier\": {"
		+"		\"type\": \"1\","
		+"		\"referenceNumber\": \"REF_123456789123456789123\""
		+"	},"
		+"	\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"	\"feeProgramIndicator\": \"123\","
		+"	\"cardAcceptor\": {"
		+"		\"name\": \"Visa Inc. USA-Foster City\","
		+"		\"idCode\": \"CA-IDCode-77765\","
		+"		\"address\": {"
		+"			\"country\": \"IND\","
		+"			\"city\": \"KOLKATA\""
		+"		}"
		+"	},"
		+"	\"businessApplicationId\": \"MP\","
		+"	\"amount\": \"124.05\","
		+"	\"acquiringBin\": \"408972\","
		+"	\"acquirerCountryCode\": \"356\""
		+"}";
		String response = api.merchantPushPaymentsPost(payload);
		System.out.print(response);
		return 0;
	}
}