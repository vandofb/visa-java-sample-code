import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.offersdataapi.ApiException;
import org.junit.Test;

public class retrieve_offers_by_filterGETTest {
	@Test
	public void retrieve_offers_by_filterGET3() throws IOException, ApiException {
		retrieve_offers_by_filterGET a = new retrieve_offers_by_filterGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}