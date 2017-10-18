import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class pullfundstransactionsGETTest {
	@Test
	public void pullfundstransactionsGET2() throws IOException, ApiException {
		pullfundstransactionsGET a = new pullfundstransactionsGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}