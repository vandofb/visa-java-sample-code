import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class multipullfundstransactionsGETTest {
	@Test
	public void multipullfundstransactionsGET4() throws IOException, ApiException {
		multipullfundstransactionsGET a = new multipullfundstransactionsGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}