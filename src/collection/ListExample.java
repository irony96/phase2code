package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		String[] names = {"abc","def","hij"};
		
		ArrayList<String> list1 = new ArrayList<String>(); 	
		
		list1.add("Akshay");
		list1.add("Priya");
		list1.add("Pankaj");
		
		list1.remove(0);

		
		Collections.sort(list1);
		
		for (int i=0; i< list1.size();i++ )
		{
			if(list1.get(i).equals("Deepa"))
				System.out.println("index of Deepa is "+i);
		}
	}

}
