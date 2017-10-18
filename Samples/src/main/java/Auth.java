import java.io.IOException;
import java.util.*;
import java.io.File;
import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Auth {
    public HashMap<String, String> getAuthCreds() throws IOException {
        HashMap<String, String> authInstance = new HashMap<String, String>();
        try {
            ClassLoader classLoader = this.getClass().getClassLoader();
            File authFile = new File(classLoader.getResource("auth_config.xml").getFile());
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(authFile);
            doc.getDocumentElement().normalize();
            authInstance.put("username", doc.getElementsByTagName("username").item(0).getTextContent());
            authInstance.put("password", doc.getElementsByTagName("password").item(0).getTextContent());
            authInstance.put("keystore_path", doc.getElementsByTagName("keystore_path").item(0).getTextContent());
            authInstance.put("keystore_password", doc.getElementsByTagName("keystore_password").item(0).getTextContent());
            authInstance.put("private_key_password", doc.getElementsByTagName("private_key_password").item(0).getTextContent());
            return authInstance;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            throw new IOException("Failed to load Auth Config File");
        }
    }
}
