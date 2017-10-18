import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.fundstransfer.*;
import com.visa.developer.sample.fundstransfer.api.*;

public class multipullfundsPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		FundstransferApi api = new FundstransferApi(auth);
		String payload = "{"
		+"	\"request\": ["
		+"		{"
		+"			\"systemsTraceAuditNumber\": \"101011\","
		+"			\"senderPrimaryAccountNumber\": \"4895140000066666\","
		+"			\"senderCurrencyCode\": \"USD\","
		+"			\"senderCardExpiryDate\": \"2020-12\","
		+"			\"retrievalReferenceNumber\": \"401010101011\","
		+"			\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"			\"cavv\": \"0700020718799100000002980179911000000000\","
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
		+"			\"systemsTraceAuditNumber\": \"101011\","
		+"			\"senderPrimaryAccountNumber\": \"4895140000066666\","
		+"			\"senderCurrencyCode\": \"USD\","
		+"			\"senderCardExpiryDate\": \"2020-12\","
		+"			\"retrievalReferenceNumber\": \"401010101011\","
		+"			\"localTransactionDateTime\": \"2016-01-06T21:32:52\","
		+"			\"cavv\": \"0700020718799100000002980179911000000000\","
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
		+"	\"acquirerCountryCode\": \"608\""
		+"}";
		String xClientTransactionId = "21042016";
		String response = api.multipullfunds(xClientTransactionId, payload);
		System.out.print(response);
		return 0;
	}
}