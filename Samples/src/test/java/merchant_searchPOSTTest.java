import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.merchantsearch.ApiException;
import org.junit.Test;

public class merchant_searchPOSTTest {
	@Test
	public void merchant_searchPOST1() throws IOException, ApiException {
		merchant_searchPOST a = new merchant_searchPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}