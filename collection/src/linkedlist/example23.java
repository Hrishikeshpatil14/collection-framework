package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class example23 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		System.out.println(list);
		
		List<String> list1= new ArrayList<String>();
		for(String str:list1)
		{
			System.out.println(str);
		}
	}

}
