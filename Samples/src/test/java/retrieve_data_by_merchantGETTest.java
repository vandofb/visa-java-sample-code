import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.referencedataapi.ApiException;
import org.junit.Test;

public class retrieve_data_by_merchantGETTest {
	@Test
	public void retrieve_data_by_merchantGET6() throws IOException, ApiException {
		retrieve_data_by_merchantGET a = new retrieve_data_by_merchantGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}