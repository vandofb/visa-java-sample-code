import java.util.*;
import java.io.IOException;
import com.visa.developer.sample.fundstransfer.*;
import com.visa.developer.sample.fundstransfer.api.*;

public class reversefundsPOST {

	public static int main(String[] args) throws IOException, ApiException {
		HashMap<String,String> auth = new Auth().getAuthCreds();
		FundstransferApi api = new FundstransferApi(auth);
		String payload = "{"
		+"	\"transactionIdentifier\": \"381228649430011\","
		+"	\"systemsTraceAuditNumber\": \"451050\","
		+"	\"senderPrimaryAccountNumber\": \"4895100000055127\","
		+"	\"senderCurrencyCode\": \"USD\","
		+"	\"senderCardExpiryDate\": \"2015-10\","
		+"	\"retrievalReferenceNumber\": \"330000550000\","
		+"	\"pointOfServiceData\": {"
		+"		\"posConditionCode\": \"00\","
		+"		\"panEntryMode\": \"90\","
		+"		\"motoECIIndicator\": \"0\""
		+"	},"
		+"	\"pointOfServiceCapability\": {"
		+"		\"posTerminalType\": \"4\","
		+"		\"posTerminalEntryCapability\": \"2\""
		+"	},"
		+"	\"originalDataElements\": {"
		+"		\"transmissionDateTime\": \"2021-10-26T21:32:52\","
		+"		\"systemsTraceAuditNumber\": \"897825\","
		+"		\"approvalCode\": \"20304B\","
		+"		\"acquiringBin\": \"408999\""
		+"	},"
		+"	\"localTransactionDateTime\": \"2017-10-13T08:18:50\","
		+"	\"cardAcceptor\": {"
		+"		\"terminalId\": \"365539\","
		+"		\"name\": \"Visa Inc. USA-Foster City\","
		+"		\"idCode\": \"VMT200911026070\","
		+"		\"address\": {"
		+"			\"zipCode\": \"94404\","
		+"			\"state\": \"CA\","
		+"			\"county\": \"San Mateo\","
		+"			\"country\": \"USA\""
		+"		}"
		+"	},"
		+"	\"amount\": \"24.01\","
		+"	\"acquiringBin\": \"408999\","
		+"	\"acquirerCountryCode\": \"608\""
		+"}";
		String response = api.reversefunds(payload);
		System.out.print(response);
		return 0;
	}
}