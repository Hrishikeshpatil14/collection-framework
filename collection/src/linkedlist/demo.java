package linkedlist;


import java.util.LinkedList;

public class demo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		
		System.out.println(list);
		
		list.add(2, "Detabse");
		System.out.println(list);
		
		// Get First Method
		System.out.println(list.getFirst());
		// Get Last Method
		System.out.println(list.getLast());
		//Peek First Method
		System.out.println(list.peekFirst());
		//Peek Last MEthod
		System.out.println(list.peekLast());
		// Is Empty Method
		System.out.println(list.isEmpty());
		// Romve First Method
		System.out.println(list.removeFirst());
		//Remove Last Method
		System.out.println(list.removeLast());
		// Size Method
		System.out.println(list.size());
		
		
		
		

}
}