import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.referencedataapi.*;
import com.visa.developer.sample.referencedataapi.api.*;

public class retrieve_data_by_merchant_addressGET {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		ReferencedataapiApi api = new ReferencedataapiApi(auth);
		String merchantIds = "21042016";
		String response = api.retrieveDataByMerchantAddress(merchantIds);
		System.out.print(response);
		return 0;
	}
}