import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.mvisa.*;
import com.visa.developer.sample.mvisa.api.*;

public class cash_out_push_payments_postPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		MvisaApi api = new MvisaApi(auth);
		String payload = "{"
		+"	\"transactionIdentifier\": \"381228649430015\","
		+"	\"transactionCurrencyCode\": \"USD\","
		+"	\"systemsTraceAuditNumber\": \"567889\","
		+"	\"senderReference\": \"REFNUM123\","
		+"	\"senderName\": \"Mohammed Qasim\","
		+"	\"senderAccountNumber\": \"456789123456\","
		+"	\"retrievalReferenceNumber\": \"412123412878\","
		+"	\"recipientPrimaryAccountNumber\": \"4123640062698797\","
		+"	\"merchantCategoryCode\": \"6012\","
		+"	\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"	\"cardAcceptor\": {"
		+"		\"name\": \"mVisa cashout\","
		+"		\"idCode\": \"CA-IDCode-77765\","
		+"		\"address\": {"
		+"			\"country\": \"IND\","
		+"			\"city\": \"mVisa cashout\""
		+"		}"
		+"	},"
		+"	\"businessApplicationId\": \"CO\","
		+"	\"amount\": \"124.05\","
		+"	\"acquiringBin\": \"400171\","
		+"	\"acquirerCountryCode\": \"643\""
		+"}";
		String response = api.cashOutPushPaymentsPost(payload);
		System.out.print(response);
		return 0;
	}
}