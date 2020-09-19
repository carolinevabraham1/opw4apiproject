package JXParser;

import javax.xml.bind.JAXBException;

public class TestXMlJavaParser {

	public static void main(String[] args) throws JAXBException {
		
		Xml_To_Java_Parser parser = new Xml_To_Java_Parser();
		parser.unmarshalling("Employee.xml");
		
	}

}
