package comparable;

public class Employee4 implements Comparable<Employee4>{
	int empid;
	String name;
	double salary;
	
	public Employee4(int empid,String name,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return this.empid+" "+this.name+" "+this.salary;
	}

	@Override
	public int compareTo(Employee4 o) {
		
		if(this.empid<o.empid)
			return -1;
		else if(this.empid>o.empid)
			return 1;
		else
			return 0;
	} 
	
	
}
