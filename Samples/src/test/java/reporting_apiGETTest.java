import static org.junit.Assert.assertEquals;
import java.io.*;
import com.visa.developer.sample.reportsapi.ApiException;
import org.junit.Test;

public class reporting_apiGETTest {
	@Test
	public void reporting_apiGET20() throws IOException, ApiException {
		reporting_apiGET a = new reporting_apiGET();
		String[] args = null;
		int b = a.main(args);
		assertEquals(0, b);
	}
}