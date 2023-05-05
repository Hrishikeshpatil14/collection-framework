package Arraylist;

import java.util.ArrayList;

public class example19 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		
		list.trimToSize();
		
		System.out.println(list);
	}

}
