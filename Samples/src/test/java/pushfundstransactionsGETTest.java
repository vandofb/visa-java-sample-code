import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class pushfundstransactionsGETTest {
	@Test
	public void pushfundstransactionsGET6() throws IOException, ApiException {
		pushfundstransactionsGET a = new pushfundstransactionsGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}