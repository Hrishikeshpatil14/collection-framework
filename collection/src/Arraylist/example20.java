package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class example20 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hrishi");
		list.add("Ravi");
		list.add("Raj");
		list.add("Pravin");
		list.add("Rahul");
		
        list.ensureCapacity(6);
        System.out.println(list);
	}

}
