package Arraylist;

import java.util.ArrayList;

public class example22 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		
		for(String name:list)
		{
			System.out.println(name);
		}
	}

}
