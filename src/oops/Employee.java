package oops;

public class Employee {
	
	String Name;
	int Empid;
	private int salary;
	
	public Employee(String name, int empid, int salary) {
		super();
		Name = name;
		Empid = empid;
		this.salary = salary;
	}
	
	public Employee() {
		System.out.println("Inside default constructor");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name of the employee : "+Name);
		System.out.println("Employee id of the employee : "+Empid);
		System.out.println("Salary of the employee : "+salary);
	}

}
