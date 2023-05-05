package linkedlist;

import java.util.LinkedList;

public class example11 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		
		for( int i=0;i<list.size();i++)
		{
			System.out.println("element at index "+i+" :"+list.get(i));
		}
	}

}
