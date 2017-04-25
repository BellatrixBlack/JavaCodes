package collection.frame;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		//Declaration 
		// *Can't use the primitive type like: int
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		numbers.add(200);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers.get(2));
		
		System.out.println("\n Iteration 1:");
		
		for(int i=0;i<numbers.size();i++){
			
			System.out.println(numbers.get(i));
		}
		
		//removes from first index *slower way*
		numbers.remove(0);
		
		//removes from last 
		numbers.remove(numbers.size()-1);
		
		System.out.println("\n Iteration 2:");
		
		for(Integer value:numbers)
		{
			System.out.println(value);
		}
		 
		// *List Interface
		List<String> name=new ArrayList<String>();

	}

}
