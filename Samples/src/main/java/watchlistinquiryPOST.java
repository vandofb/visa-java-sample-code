import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.ws.*;
import com.visa.developer.sample.ws.api.*;

public class watchlistinquiryPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		WsApi api = new WsApi(auth);
		String payload = "{"
		+"	\"referenceNumber\": \"330000550000\","
		+"	\"name\": \"Mohammed Qasim\","
		+"	\"address\": {"
		+"		\"city\": \"San Francisco\","
		+"		\"cardIssuerCountryCode\": \"USA\""
		+"	},"
		+"	\"acquiringBin\": \"408999\","
		+"	\"acquirerCountryCode\": \"840\""
		+"}";
		String response = api.watchlistinquiry(payload);
		System.out.print(response);
		return 0;
	}
}