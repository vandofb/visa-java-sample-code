import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.reportsapi.*;
import com.visa.developer.sample.reportsapi.api.*;

public class reporting_apiGET {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		ReportsapiApi api = new ReportsapiApi(auth);
		String fromDate = "21042016";
		String toDate = "21042016";
		String response = api.reportingApi(fromDate, toDate);
		System.out.print(response);
		return 0;
	}
}