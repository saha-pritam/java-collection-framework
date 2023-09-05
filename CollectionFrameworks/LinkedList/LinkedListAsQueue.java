package LinkedList;

import java.util.LinkedList;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		System.out.println("Is queue empty :- "+queue.isEmpty()); //Is Empty method from Collection interface
		queue.offer(10); //Offer method from linked list class
		queue.offer(20); //Offer method from linked list class
		queue.offer(30); //Offer method from linked list class
		System.out.println("Queue = "+queue);
		System.out.println("Last element inserted in queue :- "+queue.peekLast()); //Peek Last method from linked list class
		System.out.println("Deleted element :- "+queue.poll()); //Poll method from linked list class
		System.out.println("Deleted element :- "+queue.poll()); //Poll method from linked list class
		System.out.println("Queue = "+queue);
	}
}
