package JJParser;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJSonParser {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Person p = new Person("Rajesh", "male", 25, 30);
		JavaToJsonParser parser = new JavaToJsonParser();
		parser.marshalling(p);
		System.out.println("Pass");
	}
}
