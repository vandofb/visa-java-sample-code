import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class multireversefundstransactionsGETTest {
	@Test
	public void multireversefundstransactionsGET12() throws IOException, ApiException {
		multireversefundstransactionsGET a = new multireversefundstransactionsGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}