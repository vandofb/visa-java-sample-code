import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.ws.ApiException;
import org.junit.Test;

public class watchlistinquiryPOSTTest {
	@Test
	public void watchlistinquiryPOST13() throws IOException, ApiException {
		watchlistinquiryPOST a = new watchlistinquiryPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}