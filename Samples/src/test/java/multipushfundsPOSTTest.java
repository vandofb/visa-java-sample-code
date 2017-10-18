import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.fundstransfer.ApiException;
import org.junit.Test;

public class multipushfundsPOSTTest {
	@Test
	public void multipushfundsPOST7() throws IOException, ApiException {
		multipushfundsPOST a = new multipushfundsPOST();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}