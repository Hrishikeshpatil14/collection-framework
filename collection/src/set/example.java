package set;

import java.util.Comparator;
import java.util.TreeSet;

class student implements Comparator<student>
{
	int id;
	String name;
	float per;
	
	public student(int id,String name,float per)
	{
		this.id = id;
		this.name=name;
		this.per=per;
		
	}

	@Override
	public int compare(student o1, student o2) {
		if(o1.id<o2.id)
		return -1;
		else if (o1.id>o2.id)
			return 1;
		else
			return 0;
	}
}
class comapirname implements Comparator<student>
{
	public int compare(student o1,String o2)
	{
		return o1.name.compareTo(o2);
}
class compairper implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) {
		if(o1.per<o2.per)
		return 1;
		else if (o1.per>o2.per)
			return -1;
		else
			return 0;
	}
	
}
public class example {

	public static void main(String[] args) {
	
	}

}
@Override
public int compare(student o1, student o2) {
	// TODO Auto-generated method stub
	return 0;
}


}
