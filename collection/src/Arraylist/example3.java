package Arraylist;

import java.util.ArrayList;

public class example3 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(45);
		list.add(88);
		list.add(7);
		list.add(34);
		
		System.out.println(list);
		
		list.add(1, 56);
		
		System.out.println(list);
	}

}
