import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.mvisa.ApiException;
import org.junit.Test;

public class cash_out_push_payments_postPOSTTest {
	@Test
	public void cash_out_push_payments_postPOST16() throws IOException, ApiException {
		cash_out_push_payments_postPOST a = new cash_out_push_payments_postPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}