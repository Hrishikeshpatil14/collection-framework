package set;

import java.util.Comparator;
import java.util.TreeSet;

class revarse implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
//		return o2.compareTo(o1);
		if  (o1.length()< o2.length())
			return -1;
			else if(o1.length()>o2.length())
				return 1;
			else
			return	o1.compareTo(o2);
		
		
	}
	
}
public class revarseset {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>(new revarse());
		set.add("ABCD");
		set.add("A");
		set.add("AB");
		set.add("BCD");
		set.add("CD");
		set.add("A");
		
		System.out.println(set);
		
		
	}

}
