package collection;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
	// find out occurrence of each word in the string using hashmap
	
			String str1 = "clean world green world happy world";			
			// clean 1
			// green 1
			// happy 1
			// world 3
			
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			
			String[] splitStringBySpace = str1.split(" ");
			
			for(String word: splitStringBySpace) {
				Integer occurance = map.get(word);
				if (occurance == null)
					map.put(word, 1);
				else
				    map.put(word, occurance + 1);
			}
			System.out.println(map);			
	}

}
