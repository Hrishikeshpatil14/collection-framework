package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class example18 {

	public static void main(String[] args) {
		LinkedList<String>list1= new LinkedList<String>();
		list1.add("Pune");
		list1.add("Mumbai");
		list1.add("Karad");
		list1.add("Nagpur");
		list1.add("Satara");
	    
		LinkedList<String> list = new LinkedList<String>();
		 list=(LinkedList<String>) list1.clone();
		 System.out.println(list);
		
		
	}

}
