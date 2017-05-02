package collection.frame;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sortedmap {

	public static void main(String[] args) {
	
		HashMap<Integer,String> Hashmap=new HashMap<Integer,String>();
		LinkedHashMap<Integer,String> linkHashmap=new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
		
	    //***It doesn't necessarily return all the values of keys in orders in every run***//
		System.out.println("\nFor Hashmap:");
		sortMap(Hashmap);
		 //***It returns the value in order they are put into the map***//
		System.out.println("\nFor LinkedHashmap:");
		sortMap(linkHashmap);
		 //***It returns the value in natural order***//
		System.out.println("\nFor Treemap:");
		sortMap(treeMap);
	}
	
	public static void sortMap(Map<Integer,String>map)
	{
		map.put(3, "albatross");
		map.put(5, "bat");
		map.put(9, "cat");
		map.put(7, "dog");
		map.put(1, "elephant");
		map.put(22, "fox");
		map.put(6, "gorilla");
		map.put(59, "human");
		
		for(Integer key:map.keySet())
		{
			String value=map.get(key);
			System.out.println(key +" : "+ value);
		}
	
	}

}
