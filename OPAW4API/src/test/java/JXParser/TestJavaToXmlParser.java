package JXParser;

import javax.xml.bind.JAXBException;

public class TestJavaToXmlParser {

	public static void main(String[] args) throws JAXBException {
		
		Employee eobj = new Employee("Mahendra", "male", 30, 20);
		
		Java_To_Xml_Parser parser = new Java_To_Xml_Parser();
		
		parser.marshalling(eobj);
	}

}
