import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.referencedataapi.*;
import com.visa.developer.sample.referencedataapi.api.*;

public class retrieve_data_by_referenceGET {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		ReferencedataapiApi api = new ReferencedataapiApi(auth);
		String response = api.retrieveDataByReference();
		System.out.print(response);
		return 0;
	}
}