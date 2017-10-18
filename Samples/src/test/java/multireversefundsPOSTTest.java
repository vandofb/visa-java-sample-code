import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class multireversefundsPOSTTest {
	@Test
	public void multireversefundsPOST11() throws IOException, ApiException {
		multireversefundsPOST a = new multireversefundsPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}