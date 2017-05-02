package collection.frame;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		/*****Set is an Interface****/
		//HashSet doesn't follow order
		Set<String> set=new HashSet<String>();
		
		//LinkedHashSet follows order on which they are inserted into a set
		Set<String> set1=new LinkedHashSet<String>();
		
		//TreeSet follows natural [alphabatical] order
		Set<String> set2=new TreeSet<String>();
		
		if(set.isEmpty())
		{
			System.out.println("Set is Empty at the beginging");
		}
		
		set.add("lion");
		set.add("direwolf");
		set.add("dragon");
		set.add("stag");
		set.add("rose");
		set.add("kraken");
		set.add("trout");
		set.add("snake");
		
		set1.add("lion");
		set1.add("direwolf");
		set1.add("dragon");
		set1.add("stag");
		set1.add("rose");
		set1.add("kraken");
		set1.add("trout");
		set1.add("snake");
		
		set2.add("lion");
		set2.add("direwolf");
		set2.add("dragon");
		set2.add("stag");
		set2.add("rose");
		set2.add("kraken");
		set2.add("trout");
		set2.add("snake");
		
		
		
		if(set.isEmpty())
		{
			System.out.println("Set is Empty after adding");
		}
		
		//Adding duplicate doesn't have any effect on set elements
		set.add("dragon");
		
		System.out.println("HashSet : "+ set);
		System.out.println("LinkedHashSet : "+ set1);
		System.out.println("TreeSet : "+ set2);
		
		// Iteration from set
		
		for(String value:set)
		{
			System.out.println(value);
		}
		
		//set3 contains values which doesn't exist in set
		Set<String> set3=new HashSet<String>();
		
		set3.add("lion");
		set3.add("direwolf");
		set3.add("dragon");
		set3.add("stag");
		set3.add("twintowers");
		set3.add("flayedman");
		set3.add("bear");
		set3.add("sunspear");
		
		////////Intersection/////
		//***Shows the common values between two sets
		Set<String> intersection=new HashSet<String>(set);
		
		intersection.retainAll(set3);
		
		System.out.println("Intersection: "+ intersection);
		
          ////////Difference/////
		//***Shows the  values that are uncommon between the two sets***//
		Set<String> difference=new HashSet<String>(set);
		
		difference.removeAll(set3);
		
		System.out.println("Difference: " + difference);

	}

}
