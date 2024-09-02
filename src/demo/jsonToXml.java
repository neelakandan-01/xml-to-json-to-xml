package demo;

import org.json.JSONObject;
import org.json.XML;

public class jsonToXml {
	public static void main(String[] args) {
		String jsonobj=""" 
				{
				"name":"neelakandan",
				"age":"22",
				}
				""";
		
		JSONObject json=new JSONObject(jsonobj);
		String xml=XML.toString(json);
		System.out.println("json to xml format...");
		System.out.println(xml);
		
	}
}
