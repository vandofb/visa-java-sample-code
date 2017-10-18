import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.offersdataapi.*;
import com.visa.developer.sample.offersdataapi.api.*;

public class retrieve_offers_by_offer_idGET {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		OffersdataapiApi api = new OffersdataapiApi(auth);
		String offerid = "21042016";
		String response = api.retrieveOffersByOfferId(offerid);
		System.out.print(response);
		return 0;
	}
}