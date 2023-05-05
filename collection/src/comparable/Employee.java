package comparable;

public class Employee implements Comparable<Employee>{
	int empid;
	String name;
	double salary;
	
	public Employee(int empid,String name,double salary)
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
    public static void main(String[] args) {
		
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.salary<o.salary)
			return -1;
		else if(this.salary>o.salary)
			return 1;
		else
			return 0;
	}
	
	
}
