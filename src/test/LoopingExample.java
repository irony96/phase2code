package test;

public class LoopingExample {
	
	public static void main(String[] args) {
		int num1=10;
		//while loop
		while(num1>1) {
			num1=num1-1;
			System.out.println(num1);
		}
		
		//for loop for even number from 1 to 50
		for (int num=2; num<=50 ; num+=2)
		{
			System.out.println(num);
		}
		
		//for each 
		int sum=0;
		int[] array = {10,20,30,40,50};
		for(int arr:array) {
			System.out.println(arr);
			sum += arr;
		}
		System.out.println(sum);
		
		//there is a string called str, total number of words in the string
		String str = "Automation testing using selenium and Java";
		
		
		// soultion1
		int count=1;
		for(int i=0;i<str.length();i++) {			
			if(str.charAt(i)==' ') {
				count++;
			}
		}		
		System.out.println("Total num of words are " + count);		 
		
		//solution2		
		System.out.println("Total num of words are " + str.split(" ").length);		
	}

}
