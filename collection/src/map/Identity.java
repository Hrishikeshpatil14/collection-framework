package map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Identity {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		HashMap<Integer, String>map=new HashMap<>();
		map.put(i1, "ABC");
		map.put(i2, "PQR");
		
		System.out.println(map);
		
		IdentityHashMap<Integer, String>m1=new IdentityHashMap<>();
		i2=i1;
		m1.put(i1, "ABC");
		m1.put(i2, "PQR");
		System.out.println(m1);
		
		
	}

}
