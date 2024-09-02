package demo;

import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {
	private static int PRITY_INDENT_FACTOR=5;
	public static void main(String[] args) {
		
		String xml="<Users><user><name>neelakandan</name><age>22</age></user><user><name>jeya</name><age>22</age></user></Users>";
		
		JSONObject json=XML.toJSONObject(xml);
		String printjson=json.toString(PRITY_INDENT_FACTOR);
		System.out.println(printjson);
	}
}
