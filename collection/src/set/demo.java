package set;

import java.util.TreeSet;

public class demo  implements Comparable<demo>
{
	int id;
	String name;
	float percentage;
	public demo(int id,String name, float percentage)
	
	{
		this.id = id;
		this.name= name;
		this.percentage= percentage;
	}
	public String toString()
	{
		return this.id+" "+this.name+" "+this.percentage;
	}
	
	public static void main(String[] args) {
		demo s= new demo(1, "Raj", 77.99f);
		demo s1 = new demo(2, "Rahul", 88.67f);
		demo s2 = new demo(3, "Pavan", 56.78f);
		demo s3 = new demo(4, "Rohit", 76.78f);
		
		TreeSet<demo> set = new TreeSet<demo>();
		set.add(s);
		set.add(s1);
		set.add(s2);
		set.add(s3);	
		
		System.out.println(set);
	}
	@Override
	public int compareTo(demo o) {
		if(percentage<o.percentage)
			return -1;
		else if(percentage>o.percentage)
			return 1;
		else 
		return 0;
	}

}
