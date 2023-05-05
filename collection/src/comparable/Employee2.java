package comparable;

public class Employee2 implements Comparable<Employee2>{
	int empid;
	String name;
	double salary;
	
	public Employee2(int empid,String name,double salary)
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
	public int compareTo(Employee2 o) {
		return this.name.compareTo(o.name)*-1;
		
	} 
	
	
}