package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class example13 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hrishi");
		list.add("Ravi");
		list.add("Raj");
		list.add("Pravin");
		list.add("Rahul");
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("Hrishi");
		list2.add("Ravi");
		list2.add("Raj");
		list2.add("Pavan");
		list2.add("Pravin");
		
		System.out.println(list.equals(list2));

	}

}
