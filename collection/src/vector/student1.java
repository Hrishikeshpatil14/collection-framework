package vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class student1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Details");
		student s1 = new student();
		s1.setRollNo(sc.nextInt());
		s1.setName(sc.next());
		s1.setPercentage(sc.nextFloat());
		
		student s2 = new student();
		s2.setRollNo(sc.nextInt());
		s2.setName(sc.next());
		s2.setPercentage(sc.nextFloat());
		
		student s3 = new student();
		s3.setRollNo(sc.nextInt());
		s3.setName(sc.next());
		s3.setPercentage(sc.nextFloat());
		
		student s4 = new student();
		s4.setRollNo(sc.nextInt());
		s4.setName(sc.next());
		s4.setPercentage(sc.nextFloat());
		
		student s5 = new student();
		s5.setRollNo(sc.nextInt());
		s5.setName(sc.next());
		s5.setPercentage(sc.nextFloat());
		
		ArrayList<student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<student>itr=list.iterator();
		
		while(itr.hasNext())
		{
			student s=itr.next();
			System.out.print("Roll NO : "+s.getRollNo()+"\t");
			System.out.print("Name Of Student: "+s.getName()+"\t");
			System.out.print("Percentage : "+s.getPercentage()+"\n");
			
			if(s.getPercentage()<50)
			{
				itr.remove();
			}		
	}
		System.out.println("New List---------------------------------------------------------");
	
	Iterator<student>itr2=list.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println("New List \n");
			student s=itr2.next();
			System.out.print("Roll NO : "+s.getRollNo()+"\t");
			System.out.print("Name Of Student: "+s.getName()+"\t");
			System.out.print("Percentage : "+s.getPercentage()+"\n");	
	}
	}
}
