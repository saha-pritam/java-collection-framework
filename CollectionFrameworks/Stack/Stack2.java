package Stack;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); //Creating a homogeneous stack
		System.out.println("Is stack empty :- "+stack.empty()); //Empty method from stack class
		
		stack.push(10); //Push method from stack class
		stack.push(20); //Push method from stack class
		stack.push(30); //Push method from stack class
		stack.push(40); //Push method from stack class
		
		System.out.println("Stack = "+stack);
		System.out.println("Last inserted element :- "+stack.peek()); //Peek method from stack class
		System.out.println("Is stack empty :- "+stack.empty()); //Empty method from stack class
		
		System.out.println("Offset of null is "+stack.search(null)); //Search method from stack class
		System.out.println("Offset of audi is "+stack.search("audi")); //Search method from stack class
		System.out.println("Deleted element :- "+stack.pop()); //Pop method from stack class
		System.out.println("Stack = "+stack);
	}

}
