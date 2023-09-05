package Stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack stack = new Stack(); //Creating a heterogeneous stack
		System.out.println("Is stack empty :- "+stack.empty()); //Empty method from stack class
		
		stack.push(10); //Push method from stack class
		stack.push("Pritam"); //Push method from stack class
		stack.push(null); //Push method from stack class
		stack.push('a'); //Push method from stack class
		
		System.out.println("Stack = "+stack);
		System.out.println("Last inserted element :- "+stack.peek()); //Peek method from stack class
		System.out.println("Is stack empty :- "+stack.empty()); //Empty method from stack class
		
		System.out.println("Offset of null is "+stack.search(null)); //Search method from stack class
		System.out.println("Offset of audi is "+stack.search("audi")); //Search method from stack class
		System.out.println("Deleted element :- "+stack.pop()); //Pop method from stack class
		System.out.println("Stack = "+stack);
	}

}
