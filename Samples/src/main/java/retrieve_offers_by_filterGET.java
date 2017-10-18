import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.offersdataapi.*;
import com.visa.developer.sample.offersdataapi.api.*;

public class retrieve_offers_by_filterGET {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		OffersdataapiApi api = new OffersdataapiApi(auth);
		String response = api.retrieveOffersByFilter();
		System.out.print(response);
		return 0;
	}
}