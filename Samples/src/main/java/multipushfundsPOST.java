import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.fundstransfer.*;
import com.visa.developer.sample.fundstransfer.api.*;

public class multipushfundsPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		FundstransferApi api = new FundstransferApi(auth);
		String payload = "{"
		+"	\"request\": ["
		+"		{"
		+"			\"transactionIdentifier\": \"234234234234234\","
		+"			\"transactionCurrencyCode\": \"USD\","
		+"			\"systemsTraceAuditNumber\": \"101011\","
		+"			\"sourceOfFundsCode\": \"01\","
		+"			\"senderStateCode\": \"CA\","
		+"			\"senderReference\": \"\","
		+"			\"senderName\": \"Mr Name\","
		+"			\"senderCountryCode\": \"USA\","
		+"			\"senderCity\": \"My City\","
		+"			\"senderAddress\": \"My Address\","
		+"			\"senderAccountNumber\": \"4005520000011126\","
		+"			\"retrievalReferenceNumber\": \"401010101011\","
		+"			\"recipientPrimaryAccountNumber\": \"4957030420210454\","
		+"			\"recipientName\": \"Akhila\","
		+"			\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"			\"feeProgramIndicator\": \"123\","
		+"			\"cardAcceptor\": {"
		+"				\"terminalId\": \"1234\","
		+"				\"name\": \"Mr Smith\","
		+"				\"idCode\": \"5678\","
		+"				\"address\": {"
		+"					\"zipCode\": \"94454\","
		+"					\"state\": \"CA\","
		+"					\"county\": \"00\","
		+"					\"country\": \"USA\""
		+"				}"
		+"			},"
		+"			\"amount\": \"100.00\""
		+"		},"
		+"		{"
		+"			\"transactionIdentifier\": \"234234234234234\","
		+"			\"transactionCurrencyCode\": \"USD\","
		+"			\"systemsTraceAuditNumber\": \"101012\","
		+"			\"sourceOfFundsCode\": \"01\","
		+"			\"senderStateCode\": \"CA\","
		+"			\"senderReference\": \"\","
		+"			\"senderName\": \"Mr Name\","
		+"			\"senderCountryCode\": \"USA\","
		+"			\"senderCity\": \"My City\","
		+"			\"senderAddress\": \"My Address\","
		+"			\"senderAccountNumber\": \"4840920103511221\","
		+"			\"retrievalReferenceNumber\": \"401010101012\","
		+"			\"recipientPrimaryAccountNumber\": \"4957030420210454\","
		+"			\"recipientName\": \"Akhila\","
		+"			\"localTransactionDateTime\": \"2016-01-06T21:32:52\","
		+"			\"feeProgramIndicator\": \"123\","
		+"			\"cardAcceptor\": {"
		+"				\"terminalId\": \"1234\","
		+"				\"name\": \"Mr Smith\","
		+"				\"idCode\": \"5678\","
		+"				\"address\": {"
		+"					\"zipCode\": \"94454\","
		+"					\"state\": \"CA\","
		+"					\"county\": \"00\","
		+"					\"country\": \"USA\""
		+"				}"
		+"			},"
		+"			\"amount\": \"100.00\""
		+"		}"
		+"	],"
		+"	\"merchantCategoryCode\": \"6012\","
		+"	\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"	\"businessApplicationId\": \"AA\","
		+"	\"acquiringBin\": \"408999\","
		+"	\"acquirerCountryCode\": \"840\""
		+"}";
		String xClientTransactionId = "21042016";
		String response = api.multipushfunds(xClientTransactionId, payload);
		System.out.print(response);
		return 0;
	}
}