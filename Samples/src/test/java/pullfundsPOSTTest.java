import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class pullfundsPOSTTest {
	@Test
	public void pullfundsPOST1() throws IOException, ApiException {
		pullfundsPOST a = new pullfundsPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}