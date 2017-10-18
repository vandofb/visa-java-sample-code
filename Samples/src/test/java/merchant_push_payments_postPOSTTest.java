import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.mvisa.ApiException;
import org.junit.Test;

public class merchant_push_payments_postPOSTTest {
	@Test
	public void merchant_push_payments_postPOST18() throws IOException, ApiException {
		merchant_push_payments_postPOST a = new merchant_push_payments_postPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}