import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.fundstransfer.*;
import com.visa.developer.sample.fundstransfer.api.*;

public class pullfundsPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		FundstransferApi api = new FundstransferApi(auth);
		String payload = "{"
		+"	\"systemsTraceAuditNumber\": \"451001\","
		+"	\"surcharge\": \"11.99\","
		+"	\"senderPrimaryAccountNumber\": \"4895142232120006\","
		+"	\"senderCurrencyCode\": \"USD\","
		+"	\"senderCardExpiryDate\": \"2015-10\","
		+"	\"retrievalReferenceNumber\": \"330000550000\","
		+"	\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"	\"foreignExchangeFeeTransaction\": \"11.99\","
		+"	\"cavv\": \"0700100038238906000013405823891061668252\","
		+"	\"cardAcceptor\": {"
		+"		\"terminalId\": \"ABCD1234\","
		+"		\"name\": \"Visa Inc. USA-Foster City\","
		+"		\"idCode\": \"ABCD1234ABCD123\","
		+"		\"address\": {"
		+"			\"zipCode\": \"94404\","
		+"			\"state\": \"CA\","
		+"			\"county\": \"San Mateo\","
		+"			\"country\": \"USA\""
		+"		}"
		+"	},"
		+"	\"businessApplicationId\": \"AA\","
		+"	\"amount\": \"124.02\","
		+"	\"acquiringBin\": \"408999\","
		+"	\"acquirerCountryCode\": \"840\""
		+"}";
		String response = api.pullfunds(payload);
		System.out.print(response);
		return 0;
	}
}