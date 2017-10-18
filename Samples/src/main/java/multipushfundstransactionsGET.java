import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.fundstransfer.*;
import com.visa.developer.sample.fundstransfer.api.*;

public class multipushfundstransactionsGET {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		FundstransferApi api = new FundstransferApi(auth);
		String statusIdentifier = "21042016";
		String response = api.multipushfundstransactions(statusIdentifier);
		System.out.print(response);
		return 0;
	}
}