package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class example10 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println("List after shiffel"+list);

	}

}
