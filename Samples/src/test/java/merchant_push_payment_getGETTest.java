import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.mvisa.ApiException;
import org.junit.Test;

public class merchant_push_payment_getGETTest {
	@Test
	public void merchant_push_payment_getGET19() throws IOException, ApiException {
		merchant_push_payment_getGET a = new merchant_push_payment_getGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}