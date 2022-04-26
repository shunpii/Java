package Copy;

import java.util.HashMap;
import java.util.Map;

public class SampleJava113 {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "100");
		map.put("B", "80");
		map.put("C", "60");
		map.put("D", "40");
		map.put("E", "20");
		
		System.out.println(map.get("C"));
	}

}
