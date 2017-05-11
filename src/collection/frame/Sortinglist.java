package collection.frame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person
{
	 public int id;
	 public String name;
	 
	 public Person(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	 
	 
	
	 public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String toString()
	 {
		 return "(ID is: " + id + " and "+ "Name is :" + name +")";
	 }
}
// Reruns value according to the length of the string
class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		
		int len1=s1.length();
		int len2=s2.length();
		
		if(len1>len2)
		{
			return 1;
		}
		else if(len1<len2)
		{
			return -1;
		}
	
		return 0;
	}
	
}
// returns value according to the ascending order
class AlphabaticalComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		//question
		return s1.compareTo(s2);
	}
	
}

//returns value according to the descending order
class ReverseAlphabaticalComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
}


public class Sortinglist {

	public static void main(String[] args) {
		
		// Sorting strings //
		List<String> continents= new ArrayList<String>();
        
		continents.add("Asia");
		continents.add("Europe");
		continents.add("Africa");
		continents.add("South America");
		continents.add("North America");
		continents.add("Australia");
		continents.add("Antartica");
		                                   //question
		//Collections.sort(continents, new StringLengthComparator());
		//Collections.sort(continents, new AlphabaticalComparator());
		Collections.sort(continents, new ReverseAlphabaticalComparator());
		for(String continent: continents)
		{
			System.out.println(continent);
		}
	
		// Sorting Numbers //
   List<Integer> numbers= new ArrayList<Integer>();
        
		numbers.add(5);
		numbers.add(2);
		numbers.add(67);
		numbers.add(9);
		numbers.add(8);
		numbers.add(78);
		numbers.add(6);
		
		                          //created anonymous inner class
		Collections.sort(numbers, new Comparator<Integer>()
				{

					@Override
					public int compare(Integer num1, Integer num2) {
						return -num1.compareTo(num2);
					}
				}
				);
		
		for(Integer number: numbers)
		{
			System.out.println(number);
		}
		
		// Sorting arbitrary objects //
		
		List<Person> persons= new ArrayList<Person>();
		
		persons.add(new Person(3,"Arthur"));
		persons.add(new Person(5,"Charles"));
		persons.add(new Person(2,"Elizabeth"));
		persons.add(new Person(7,"Victoria"));
		
		Collections.sort(persons, new Comparator<Person>()
				{

					@Override
					public int compare(Person p1, Person p2) {
						if(p1.getId()>p2.getId())
						{
							return 1;
						}
						else if(p1.getId()<p2.getId())
						{
							return -1;
						}
						return 0;
					}
			
				});
		
		System.out.println("\n Sorted according to ID");
		for(Person people: persons)
		{
			System.out.println(people);
		}
		
		
		Collections.sort(persons, new Comparator<Person>()
				{

					@Override
					public int compare(Person p1, Person p2) {
						
						return p1.getName().compareTo(p2.getName());
					}
			
				});
		System.out.println("\n Sorted according to Name");
		for(Person people: persons)
		{
			System.out.println(people);
		}
		
	}
		
	}
	
	
	
	


