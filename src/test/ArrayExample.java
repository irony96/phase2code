package test;

public class ArrayExample {
	
	public static void main(String[] args) {
		int i;
		int sum = 0;
		int[] array = {10,20,30,40,50};
		
		
		for (i=0; i< array.length ; i++) {
			System.out.println(array[i]);
			sum = sum + array[i];
		}
		System.out.println("sum of all array"+sum);
	}
	


}
