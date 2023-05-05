package Arraylist;

import java.util.ArrayList;

public class example6 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);

	}

}
