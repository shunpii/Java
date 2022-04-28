package Copy;

import java.util.Set;
import java.util.HashSet;

public class SampleJava114 {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		
		for (String val : set) {
			System.out.println(val);
		}
	}

}
