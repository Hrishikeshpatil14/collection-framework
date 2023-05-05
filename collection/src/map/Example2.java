package map;

import java.util.Comparator;
import java.util.LinkedList;
class student
{
	String name;
	float percentage;
	public student(String name,float percentage)
	{
		this.name=name;
		this.percentage=percentage;
	}
	public String toString() {
		return name+" "+percentage;
		
	}
}
public class Example2 implements Comparator<student> {

	public static void main(String args[]) {
		student s1= new student("Rahil", 60.89f);
		student s2= new student("Mahesh", 50.89f);
		student s3= new student("Digvijay", 80.67f);
		student s4= new student("Ram", 92.78f);
		
		LinkedList<student>list= new LinkedList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println(list);
		list.sort(null);
		
		
	}

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	}


