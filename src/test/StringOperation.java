package test;

public class StringOperation {
	
	public static void main(String[] args) {
		String str1 = "Clean india green india";
		//find out total number characters are in the str1
		System.out.println("total number characters are : "+str1.length());		
		//find out first character in the str1
		System.out.println("first character is : "+str1.charAt(0));
		//find out last character in the str1
		System.out.println("last character is : "+str1.charAt(str1.length()-1));
		//uppercase
		System.out.println("UpperCase : "+str1.toUpperCase());
		//lowercase
		System.out.println("LowerCase : "+str1.toLowerCase());		
	}

}
