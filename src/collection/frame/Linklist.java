package collection.frame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linklist {

	public static void main(String[] args) {
	
		List<Integer> arrayList=new ArrayList<Integer>();
		List<Integer> linkList=new LinkedList<Integer>();
		doTimings("ArrayList",arrayList);
		doTimings("LinkedList",linkList);
	}
	/* Array List is Beneficial for adding any element at the end of the list or near end of the list
	 * When it comes to add element at anywhere of the list Linkedlist is more efficient than Arraylist.Its much faster.
	 * Linklist is indexed as [1]->[2]->[3] also [1]<-[2]<-[3] so each element has index of its previous and next element
	 */
	
	public static void doTimings(String type,List<Integer>list)
	{
		
		long start= System.currentTimeMillis();
		
		for(int i=0;i<1E5;i++)
		{
			list.add(0,i);
		}
		long end= System.currentTimeMillis();
		
		System.out.println("Time taken:  "+(end-start)+" ms for "+type);
	}

}
