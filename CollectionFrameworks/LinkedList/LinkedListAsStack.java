package LinkedList;

import java.util.LinkedList;

public class LinkedListAsStack {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		System.out.println("Is stack empty :- "+stack.isEmpty()); //Is Empty method from Collection interface
		stack.push(10); //Push method from linked list class
		stack.push(20); //Push method from linked list class
		stack.push(30); //Push method from linked list class
		System.out.println("Stack = "+stack);
		System.out.println("Last element inserted in stack :- "+stack.peek()); //Peek method from linked list class
		System.out.println("Deleted element :- "+stack.pop()); //Pop method from linked list class
		System.out.println("Deleted element :- "+stack.pop()); //Pop method from linked list class
		System.out.println("Stack = "+stack);
	}
}
