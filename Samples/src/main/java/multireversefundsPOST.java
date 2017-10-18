import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.fundstransfer.*;
import com.visa.developer.sample.fundstransfer.api.*;

public class multireversefundsPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		FundstransferApi api = new FundstransferApi(auth);
		String payload = "{"
		+"	\"request\": ["
		+"		{"
		+"			\"transactionIdentifier\": \"101010101010\","
		+"			\"systemsTraceAuditNumber\": \"101011\","
		+"			\"senderPrimaryAccountNumber\": \"4485810000000131\","
		+"			\"senderCurrencyCode\": \"USD\","
		+"			\"senderCardExpiryDate\": \"2020-12\","
		+"			\"retrievalReferenceNumber\": \"401010101011\","
		+"			\"originalDataElements\": {"
		+"				\"transmissionDateTime\": \"2021-10-26T21:32:52\","
		+"				\"systemsTraceAuditNumber\": \"228112\","
		+"				\"approvalCode\": \"1ABCDE\","
		+"				\"acquiringBin\": \"408999\""
		+"			},"
		+"			\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
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
		+"			\"transactionIdentifier\": \"101010101010\","
		+"			\"systemsTraceAuditNumber\": \"101011\","
		+"			\"senderPrimaryAccountNumber\": \"4485810000000131\","
		+"			\"senderCurrencyCode\": \"USD\","
		+"			\"senderCardExpiryDate\": \"2020-12\","
		+"			\"retrievalReferenceNumber\": \"401010101011\","
		+"			\"originalDataElements\": {"
		+"				\"transmissionDateTime\": \"2021-10-26T21:32:52\","
		+"				\"systemsTraceAuditNumber\": \"228112\","
		+"				\"approvalCode\": \"1ABCDE\","
		+"				\"acquiringBin\": \"408999\""
		+"			},"
		+"			\"localTransactionDateTime\": \"2016-01-06T21:32:52\","
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
		+"	\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"	\"acquiringBin\": \"408999\","
		+"	\"acquirerCountryCode\": \"840\""
		+"}";
		String xClientTransactionId = "21042016";
		String response = api.multireversefunds(xClientTransactionId, payload);
		System.out.print(response);
		return 0;
	}
}