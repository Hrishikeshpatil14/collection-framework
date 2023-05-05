package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class example24 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		System.out.println(list);
		
		LinkedList<String>list1= new LinkedList<String>();
		list1.add("Pune");
		list1.add("Mumbai");
		list1.add("Karad");
		list1.add("Nagpur");
		list1.add("Satara");
		
		System.out.println(list.equals(list1));

}
}