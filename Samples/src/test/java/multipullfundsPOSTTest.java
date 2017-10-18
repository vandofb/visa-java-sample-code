import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class multipullfundsPOSTTest {
	@Test
	public void multipullfundsPOST3() throws IOException, ApiException {
		multipullfundsPOST a = new multipullfundsPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}