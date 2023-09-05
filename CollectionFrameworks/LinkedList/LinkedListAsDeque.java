package LinkedList;

import java.util.LinkedList;

public class LinkedListAsDeque {

	public static void main(String[] args) {
		LinkedList<Integer> deque = new LinkedList<Integer>();
		System.out.println("Is deque empty :- "+deque.isEmpty()); //Is Empty method from Collection interface
		deque.offerFirst(10); //Offer First method from linked list class
		deque.offerFirst(20); //Offer First method from linked list class
		deque.offerFirst(30); //Offer First method from linked list class
		deque.offerLast(40); //Offer Last method from linked list class
		deque.offerLast(50); //Offer Last method from linked list class
		deque.offerLast(60); //Offer Last method from linked list class
		System.out.println("Queue = "+deque);
		System.out.println("Last element inserted from first in deque :- "+deque.peekFirst()); //Peek First method from linked list class
		System.out.println("Last element inserted from last in deque :- "+deque.peekLast()); //Peek Last method from linked list class
		System.out.println("Deleted element from first :- "+deque.pollFirst()); //Poll method from linked list class
		System.out.println("Deleted element from last :- "+deque.pollLast()); //Poll method from linked list class
		System.out.println("Queue = "+deque);
	}
}
