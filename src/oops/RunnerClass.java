package oops;

public class RunnerClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.Name="Ramya";
		emp1.Empid=100;
		emp1.setSalary(50000);
		
		Employee emp2 = new Employee();
		emp2.Name="Ashima";
		emp2.Empid=101;
		emp2.setSalary(75000);
		
		Employee emp3 = new Employee("Rohini", 102, 80000);
		emp1.display();
		emp2.display();
		emp3.display();
		
		ICICIBank obj1 = new ICICIBank();
		obj1.AccountNumber = 12345;
		obj1.BankId = 100;
		
		HDFCBank obj2 = new HDFCBank();
		obj2.Account = 67890;
		obj2.BankId = 101;
	}

}
