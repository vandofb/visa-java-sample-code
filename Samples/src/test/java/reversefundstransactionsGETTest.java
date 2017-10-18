import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class reversefundstransactionsGETTest {
	@Test
	public void reversefundstransactionsGET10() throws IOException, ApiException {
		reversefundstransactionsGET a = new reversefundstransactionsGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}