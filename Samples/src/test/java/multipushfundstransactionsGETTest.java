import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class multipushfundstransactionsGETTest {
	@Test
	public void multipushfundstransactionsGET8() throws IOException, ApiException {
		multipushfundstransactionsGET a = new multipushfundstransactionsGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}