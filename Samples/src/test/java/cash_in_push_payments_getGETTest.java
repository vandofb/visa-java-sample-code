import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.mvisa.ApiException;
import org.junit.Test;

public class cash_in_push_payments_getGETTest {
	@Test
	public void cash_in_push_payments_getGET15() throws IOException, ApiException {
		cash_in_push_payments_getGET a = new cash_in_push_payments_getGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}