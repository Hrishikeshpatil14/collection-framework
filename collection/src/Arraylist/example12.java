package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class example12 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		
		System.out.println(list);
		
		list.subList(0, 2);
		System.out.println(list.subList(0, 2));
	}

}
