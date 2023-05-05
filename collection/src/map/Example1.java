package map;

import java.util.TreeSet;

class set1 implements Comparable<set1>
{
 String name;
 int price;
 
 public set1(String name,int price)
 {
	 this.name=name;
	 this.price=price;
 }
 public String toString()
 {
	 return this.name+" "+this.price;


}
@Override
public int compareTo(set1 o) {
	// TODO Auto-generated method stub
	return 0;
}
 
	
}
public class Example1 {

	public static void main(String[] args) {
		set1 s= new set1("Alto", 300000);
		set1 s1= new set1("Creta", 1300000);
		set1 s2= new set1("Verna", 1500000);
		set1 s3= new set1("Mustang", 7000000);
		
		TreeSet<set1>se= new TreeSet<>();
		se.add(s);
		se.add(s1);
		se.add(s2);
		se.add(s3);
		System.out.println(se);
		
		
		
		
	}

}
