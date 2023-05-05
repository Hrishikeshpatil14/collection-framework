package vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class example2 {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		ArrayList<Integer>list= new ArrayList<>();
		 
		Vector<Integer> num = new Vector<>();
		
		list.add(34);
		list.add(56);
		list.add(89);
		list.add(45);
		list.add(34);
		
		System.out.println(list);
		Enumeration<Integer> enu=num.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}

}
