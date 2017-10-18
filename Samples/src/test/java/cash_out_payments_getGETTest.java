import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.mvisa.ApiException;
import org.junit.Test;

public class cash_out_payments_getGETTest {
	@Test
	public void cash_out_payments_getGET17() throws IOException, ApiException {
		cash_out_payments_getGET a = new cash_out_payments_getGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}