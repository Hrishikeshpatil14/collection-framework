package Arraylist;

import java.util.ArrayList;

public class example5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		
		System.out.println(list);
		
		list.set(3, "NaviBlue");
		System.out.println(list);
	}

}
