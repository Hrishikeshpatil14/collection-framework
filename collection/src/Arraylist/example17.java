package Arraylist;

import java.util.ArrayList;

public class example17 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hrishi");
		list.add("Ravi");
		list.add("Raj");
		list.add("Pravin");
		list.add("Rahul");
		System.out.println(list);
		
		list.removeAll(list);
		System.out.println(list);
	}

}
