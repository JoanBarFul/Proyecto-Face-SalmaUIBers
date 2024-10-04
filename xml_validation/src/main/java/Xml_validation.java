import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class Xml_validation {

    // Method to validate XML against an XSD schema
    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            // Create a SchemaFactory and set the schema language
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath)); // Load the XSD schema
            
            // Create a Validator from the schema
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath))); // Validate the XML against the schema
            
            return true; // If validation passes
        } catch (SAXException e) {
            System.out.println("XML validation error: " + e.getMessage());
            return false; // If validation fails
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace for any other exceptions
            return false; // If an error occurs
        }
    }
}