package collection.frame;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

//***** There can't be two public classes in one java file****//
 class Person
{
	 public int id;
	 public String name;
	 
	 public Person(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	
	 public String toString()
	 {
		 return "(ID is: " + id + " and "+ "Name is :" + name +")";
	 }

	 //***** for avoiding the duplication of data****//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	 
}

public class CustomizedObjects {

	public static void main(String[] args) {
		
		Person p= new Person(0,"Anik");
		Person p1= new Person(2,"Disha");
		Person p2= new Person(1,"Tasnuva");
		Person p3= new Person(2,"Disha");
		//****Sets and Maps don't repeat duplicate value*********//
		LinkedHashMap<Person,Integer>map=new LinkedHashMap<Person,Integer>();
		
		map.put(p, 3);
		map.put(p1, 2);
		map.put(p2,1);
		map.put(p3, 3);
		
		for(Person key: map.keySet())
		{
			System.out.println(key +" : "+map.get(key));
		}
		
		Set<Person> set1=new LinkedHashSet<Person>();
		
		set1.add(p);
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		
		System.out.println(set1);
	}

}
