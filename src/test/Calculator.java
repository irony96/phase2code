package test;

public class Calculator {
	int a;
	int b;
	static int c;
	
	public static void main(String[] args) {
		calculator(2,2,"add");
		calculator(4,2,"subtract");
		calculator(5,2,"multiply");
		calculator(8,2,"divide");
		calculator(5,2,"xyz");
	}

	private static void calculator(int a, int b, String operation) {
		switch (operation)
		{
		case "add" :
				sum(a,b);
				break;
		case "subtract" :
				difference(a,b);
				break;
		case "multiply" :
				multiply(a,b);
				break;
		case "divide" :
				divide(a,b);
				break;
		default:
			    modulus(a,b);
			    break;
	}
  }
	
	private static void sum(int a, int b) {
		c = a+b;
		System.out.println("adding - "+a+"+"+b+"="+c);
	}
	
	private static void difference(int a, int b) {
		c = a-b;
		System.out.println("subtracting - "+a+"-"+b+"="+c);
	}
	
	private static void multiply(int a, int b) {
		c = a*b;
		System.out.println("Multiplying - "+a+"*"+b+"="+c);
	}
	
	private static void divide(int a, int b) {
		c = a/b;	
		System.out.println("Dividing - "+a+"/"+b+"="+c);
	}
	
	private static void modulus(int a, int b) {
		c=a%b;
		System.out.println("Modulus - "+a+"%"+b+"="+c);
	}	
	
}
