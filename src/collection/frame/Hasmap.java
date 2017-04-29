package collection.frame;

import java.util.HashMap;
import java.util.Map;

public class Hasmap {

	public static void main(String[] args) {
	
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		
		map.put(3, "Three");
		map.put(5, "Five");
		map.put(2, "Two");
		map.put(9, "Nine");
		map.put(10, "Ten");
		
		//If a new key is given in the map with 2 different values the current one will override the previous one
		// Returns null if the key is not in the map
		// HashMap is not totally sorted it may give a sorted result of values for 99th times but at 100 time it maybe different
		String text= map.get(2);
		
		 
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			int key=entry.getKey();
			String value=entry.getValue();
			
			System.out.println(key +":" +value);
			
			
		}

	}

}
