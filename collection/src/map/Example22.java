package map;

import java.util.ArrayList;
import java.util.List;

public class Example22 {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(21);
		l.add(30);
		l.add(53);
		
		//l.forEach( (i)-> System.out.println("hi"));//for each loop
		l.forEach(System.out::println);//method refrance
			
		
		
	}
}
