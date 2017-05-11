package collection.frame;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class Queues {

	public static void main(String[] args) {
		
		Queue<Integer> numbers= new ArrayBlockingQueue<Integer>(3);
		
		// For adding items in queue
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
	
		for(Integer num:numbers)
		{
			System.out.println("Numbers values: "+num);
		}
		
		try
		{
			numbers.add(40);
		}
		catch(IllegalStateException e)
		{
			System.out.println("Tried to add more than the limit");
		}
		
		// For removing items from queue
		numbers.remove();
		
		for(Integer num:numbers)
		{
			System.out.println(num);
		}
		
		
		Queue<Integer> numbers1= new ArrayBlockingQueue<Integer>(2);
		System.out.println("Numbers1 values peek: "+ numbers1.peek());
		//offers is like add but it deosn't throw any exception like add when the the number of elements added are out of bound
		numbers1.offer(50);
		numbers1.offer(60);
		//numbers1.offer(70);
		
		for(Integer num1:numbers1)
		{
			System.out.println("Numbers1 values: "+ num1);
		}
		//polls is like remove but it throws a null unlike remove when the the number of elements added are out of bound
		//System.out.println("Numbers1 values poll: "+ numbers1.poll());
		//System.out.println("Numbers1 values poll: "+ numbers1.poll());
		//System.out.println("Numbers1 values poll: "+ numbers1.poll());
		
		//peek retrieves the head of the queue returns null if the queue is empty
		System.out.println("Numbers1 values peek: "+ numbers1.peek());
		//System.out.println("Numbers1 values peek: "+ numbers1.peek());
		//System.out.println("Numbers1 values peek: "+ numbers1.peek());
		
		
	
	}

}
