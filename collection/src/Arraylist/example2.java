package Arraylist;

import java.util.ArrayList;

public class example2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hrishi");
		list.add("Ravi");
		list.add("Raj");
		list.add("Pravin");
		list.add("Rahul");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
