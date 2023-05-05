package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class example15 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Hrishi");
		list2.add("Ravi");
		list2.add("Raj");
		list2.add("Pravin");
		list2.add("Rahul");
		
		list.addAll(list2);
		System.out.println(list);

}
}
