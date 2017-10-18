import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.referencedataapi.ApiException;
import org.junit.Test;

public class retrieve_data_by_merchant_addressGETTest {
	@Test
	public void retrieve_data_by_merchant_addressGET5() throws IOException, ApiException {
		retrieve_data_by_merchant_addressGET a = new retrieve_data_by_merchant_addressGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}