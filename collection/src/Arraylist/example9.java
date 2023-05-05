package Arraylist;

import java.util.ArrayList;

public class example9 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		
		System.out.println(list);
		
		ArrayList<String>list2 = new ArrayList<String>();
		list.add("Sky blue");
		list.add("Green");
		
		list.addAll(list2);
		System.out.println(list);

	}

}
