package co.com.ap.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.map.ObjectMapper;
import org.svenson.JSONParser;

import co.com.ap.model.Student;

public class DaoTest {
	
	public static void main(String args[]) throws IOException{
		
		JSONParser parser = new JSONParser();

		String json = "{" + "\"Example\": [" + "{" + "\"foo\": \"a1\","
                + "\"bar\": \"b1\"," + "\"fubar\": \"c1\"" + "}," + "{"
                + "\"foo\": \"a2\"," + "\"bar\": \"b2\"," + "\"fubar\": \"c2\""
                + "}," + "{" + "\"foo\": \"a3\"," + "\"bar\": \"b3\","
                + "\"fubar\": \"c3\"" + "}" + "]" + "}\"";
		
		System.out.println(json);
		
        String cadenaTotal = "";
        String cadena = "";
	  FileReader f = new FileReader("B:/archivo/students.json");
	  BufferedReader b = new BufferedReader(f);
	  while((cadena = b.readLine())!=null) {
		  cadenaTotal = cadenaTotal+cadena;
	  }
        System.out.println(cadenaTotal);
        
        parser.addTypeHint("Student[]", Student.class);
        Map<String, List<Student>> result1 = parser.parse(Map.class, cadenaTotal);
        for (Entry<String, List<Student>> entry : result1.entrySet()) {
            for (int i = 0; i < result1.entrySet().size(); i++) {
            	System.out.println(entry.getValue().get(i));
            	ObjectMapper mapper = new ObjectMapper();
            	String jsonText = entry.getValue().get(i).toString();
            	Student obj = mapper.readValue(jsonText, Student.class);
            	System.out.println(entry.getValue().get(i));

			}
        }
		
//        System.out.println("lol");
//		
//		ObjectMapper mapper = new ObjectMapper();
//
//		//JSON from file to Object
//		Student user = mapper.readValue(new File("B:/archivo/students.json"), Student.class);
//
//		String insert = "";
//		insert = "INSERT INTO Student (_id,name)";
//		insert = insert+" values(";
//		insert = insert+" "+user.get_id()+",";
//		insert = insert+" '"+user.getName()+"'";
//		insert = insert+");";
		
//		System.out.println(insert);
		
	}
	
}
