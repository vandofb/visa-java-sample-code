import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class pushfundsPOSTTest {
	@Test
	public void pushfundsPOST5() throws IOException, ApiException {
		pushfundsPOST a = new pushfundsPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}