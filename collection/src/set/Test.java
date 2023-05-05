package set;

import java.util.TreeSet;

public class Test implements Rbi {

	static int b=20;

	@Override
	public void m1() {
		System.out.println("Interfaces");
	}
	public static void main(String[] args) {
		Rbi bank=new Test();
		bank.m1();
		System.out.println(a);
		System.out.println(b);
		
	}

}
