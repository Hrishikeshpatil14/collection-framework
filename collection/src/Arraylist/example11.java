package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class example11 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hrishi");
		list.add("Ravi");
		list.add("Raj");
		list.add("Pravin");
		list.add("Rahul");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
