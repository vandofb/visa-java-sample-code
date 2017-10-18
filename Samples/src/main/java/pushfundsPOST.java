import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.fundstransfer.*;
import com.visa.developer.sample.fundstransfer.api.*;

public class pushfundsPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		FundstransferApi api = new FundstransferApi(auth);
		String payload = "{"
		+"	\"transactionIdentifier\": \"381228649430015\","
		+"	\"transactionCurrencyCode\": \"USD\","
		+"	\"systemsTraceAuditNumber\": \"451018\","
		+"	\"sourceOfFundsCode\": \"05\","
		+"	\"senderStateCode\": \"CA\","
		+"	\"senderReference\": \"\","
		+"	\"senderName\": \"Mohammed Qasim\","
		+"	\"senderCountryCode\": \"124\","
		+"	\"senderCity\": \"Foster City\","
		+"	\"senderAddress\": \"901 Metro Center Blvd\","
		+"	\"senderAccountNumber\": \"4957030420210454\","
		+"	\"retrievalReferenceNumber\": \"412770451018\","
		+"	\"recipientPrimaryAccountNumber\": \"4957030420210462\","
		+"	\"recipientName\": \"rohan\","
		+"	\"pointOfServiceData\": {"
		+"		\"posConditionCode\": \"00\","
		+"		\"panEntryMode\": \"90\","
		+"		\"motoECIIndicator\": \"0\""
		+"	},"
		+"	\"merchantCategoryCode\": \"6012\","
		+"	\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"	\"cardAcceptor\": {"
		+"		\"terminalId\": \"TID-9999\","
		+"		\"name\": \"Visa Inc. USA-Foster City\","
		+"		\"idCode\": \"CA-IDCode-77765\","
		+"		\"address\": {"
		+"			\"zipCode\": \"94404\","
		+"			\"state\": \"CA\","
		+"			\"county\": \"San Mateo\","
		+"			\"country\": \"USA\""
		+"		}"
		+"	},"
		+"	\"businessApplicationId\": \"AA\","
		+"	\"amount\": \"124.05\","
		+"	\"acquiringBin\": \"408999\","
		+"	\"acquirerCountryCode\": \"840\""
		+"}";
		String xClientTransactionId = "21042016";
		String response = api.pushfunds(xClientTransactionId, payload);
		System.out.print(response);
		return 0;
	}
}