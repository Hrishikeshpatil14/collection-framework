package map;

import java.util.LinkedHashMap;

public class Demo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String>lhs=new LinkedHashMap<>();
		lhs.put(5, "A");
		lhs.put(1, "B");
		lhs.put(8, "C");
		lhs.put(6, "D");
		
		System.out.println(lhs);
	}

}
