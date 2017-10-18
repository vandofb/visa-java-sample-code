import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.mvisa.*;
import com.visa.developer.sample.mvisa.api.*;

public class cash_out_payments_getGET {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		MvisaApi api = new MvisaApi(auth);
		String statusIdentifier = "21042016";
		String response = api.cashOutPaymentsGet(statusIdentifier);
		System.out.print(response);
		return 0;
	}
}