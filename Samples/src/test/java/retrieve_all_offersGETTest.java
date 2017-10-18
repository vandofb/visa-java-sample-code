import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.offersdataapi.ApiException;
import org.junit.Test;

public class retrieve_all_offersGETTest {
	@Test
	public void retrieve_all_offersGET4() throws IOException, ApiException {
		retrieve_all_offersGET a = new retrieve_all_offersGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}