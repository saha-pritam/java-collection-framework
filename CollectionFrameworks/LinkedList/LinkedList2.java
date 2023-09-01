package LinkedList;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>(); //Creating homogeneous linked list with basic constructor
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
//		linkedList.add("Pritam"); //This is error since this linked list is homogeneous
		System.out.println(linkedList);
	}

}
