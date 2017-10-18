import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.merchantsearch.*;
import com.visa.developer.sample.merchantsearch.api.*;

public class merchant_searchPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		MerchantsearchApi api = new MerchantsearchApi(auth);
		String payload = "{"
		+"	\"header\": {"
		+"		\"messageDateTime\": \"2016-05-02T02:33:55.903\","
		+"		\"startIndex\": \"0\","
		+"		\"requestMessageId\": \"Request_001\""
		+"	},"
		+"	\"searchOptions\": {"
		+"		\"proximity\": ["
		+"			\"merchantName\""
		+"		],"
		+"		\"matchScore\": \"true\","
		+"		\"matchIndicators\": \"true\","
		+"		\"maxRecords\": \"5\","
		+"		\"wildCard\": ["
		+"			\"merchantName\""
		+"		]"
		+"	},"
		+"	\"responseAttrList\": ["
		+"		\"GNSTANDARD\""
		+"	],"
		+"	\"searchAttrList\": {"
		+"		\"merchantCountryCode\": \"840\","
		+"		\"merchantPostalCode\": \"48858\","
		+"		\"merchantState\": \"MI\","
		+"		\"merchantCity\": \"Mount Pleasant\","
		+"		\"merchantName\": \"cmu edctn materials cntr\""
		+"	}"
		+"}";
		String response = api.merchantSearch(payload);
		System.out.print(response);
		return 0;
	}
}