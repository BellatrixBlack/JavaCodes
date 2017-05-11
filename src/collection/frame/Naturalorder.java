package collection.frame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class King implements Comparable<King>
{
	//question
	public String name;
	
	public King(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "Name : " + name;
	}
	
	//question

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		King other = (King) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(King k) {
	       
		return name.compareTo(k.name);
	}

}
public class Naturalorder {

	public static void main(String[] args) {
        
		List<King> list= new ArrayList<King>();
		SortedSet<King>set= new TreeSet<King>();
	
		addElement(list);
		addElement(set);
		
		//You can't add element to a TreeSet if the elements are not declared in natural order.It will throw an error
		Collections.sort(list);
	
		
		showElement(list);
		System.out.println("\n");
		showElement(set);
		

	}
	// Collection interface is used so that values can be added in both set and list at the same time.
	public static void addElement(Collection<King>col)
	{
		col.add(new King("Henry"));
		col.add(new King("Charles"));
		col.add(new King("George"));
		col.add(new King("Aurther"));
		col.add(new King("Leopold"));
	}
	
	public static void showElement(Collection<King>col)
	{
		for(King k:col)
		{
			System.out.println(k);
		}
	}

}
