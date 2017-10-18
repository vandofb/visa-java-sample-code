import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.mvisa.*;
import com.visa.developer.sample.mvisa.api.*;

public class cash_in_push_paymentsPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		MvisaApi api = new MvisaApi(auth);
		String payload = "{"
		+"	\"transactionIdentifier\": \"381228649430015\","
		+"	\"transactionCurrencyCode\": \"USD\","
		+"	\"systemsTraceAuditNumber\": \"313042\","
		+"	\"senderReference\": \"1234\","
		+"	\"senderName\": \"Mohammed Qasim\","
		+"	\"senderAccountNumber\": \"4541237895236\","
		+"	\"retrievalReferenceNumber\": \"430000367618\","
		+"	\"recipientPrimaryAccountNumber\": \"4123640062698797\","
		+"	\"merchantCategoryCode\": \"4829\","
		+"	\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"	\"cardAcceptor\": {"
		+"		\"name\": \"Card Accpector ABC\","
		+"		\"idCode\": \"ID-Code123\","
		+"		\"address\": {"
		+"			\"country\": \"IND\","
		+"			\"city\": \"Bangalore\""
		+"		}"
		+"	},"
		+"	\"businessApplicationId\": \"CI\","
		+"	\"amount\": \"124.05\","
		+"	\"acquiringBin\": \"400171\","
		+"	\"acquirerCountryCode\": \"643\""
		+"}";
		String response = api.cashInPushPayments(payload);
		System.out.print(response);
		return 0;
	}
}