package map;

import java.util.HashMap;

public class WeakHashMap {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		HashMap<Integer, String>map=new HashMap<>();
		map.put(i1, "ABC");
		map.put(i2, "PQR");
		i2=null;
		System.gc();
		System.out.println(map);
		
		
		java.util.WeakHashMap<Integer, String>wm=new java.util.WeakHashMap<>();
		wm.put(i1, "ABC");
		wm.put(i2, "PQR");
		i2=null;
		System.gc();
		System.out.println(wm);
	}

}
