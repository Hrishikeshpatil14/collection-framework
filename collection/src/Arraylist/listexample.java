package Arraylist;

import java.util.ArrayList;

public class listexample {

	public static void main(String[] args) {
		ArrayList<Float> list = new ArrayList<Float>();
		list.add(78.34f);
		list.add(88.99f);
		list.add(98.77f);
		list.add(67.56f);
		
		System.out.println(list);
		
		list.ensureCapacity(7);
		System.out.println(list);
		System.out.println("---------------------------------------------------------------------");
		
		list.add(89.09f);
		System.out.println(list);
		System.out.println("------------------------------------------------------");
		
		list.hashCode();
		System.out.println(list);
		System.out.println("-------------------------------------------------------");
		
		list.iterator();
		System.out.println(list);
		System.out.println("---------------------------------------------------------");
		
		
		list.remove(3);
		System.out.println(list);
		System.out.println("-----------------------------------------------");
		
	

	}

}
