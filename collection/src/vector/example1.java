package vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
	
		ArrayList<Integer> list= new ArrayList<>();
		list.add(33);
		list.add(-22);
		list. add(56);
		list.add(-5);
		list.add(-66);
		
		System.out.println(list);
    
		Iterator<Integer>list2=list.iterator();
		while(list2.hasNext())
		{
			if(list2.next() <0)
			{
				list2.remove();
			}
		}
		System.out.println("NEW LIST : "+list);
		 
	}

}
