package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class example8 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(67);
		list.add(27);
		list.add(89);
		list.add(45);
		list.add(77);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		

	}

}
