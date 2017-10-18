import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class reversefundsPOSTTest {
	@Test
	public void reversefundsPOST9() throws IOException, ApiException {
		reversefundsPOST a = new reversefundsPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}