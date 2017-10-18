import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.offersdataapi.ApiException;
import org.junit.Test;

public class retrieve_offers_by_offer_idGETTest {
	@Test
	public void retrieve_offers_by_offer_idGET1() throws IOException, ApiException {
		retrieve_offers_by_offer_idGET a = new retrieve_offers_by_offer_idGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}