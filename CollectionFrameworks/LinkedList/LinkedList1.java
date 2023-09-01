package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList linkedList1 = new LinkedList(); //Basic LinkedList constructor and also heterogeneous
		linkedList1.add(10); //Add method from Collection interface
		linkedList1.add(20); //Add method from Collection interface
		linkedList1.add(30); //Add method from Collection interface
		linkedList1.add('z'); //Add method from Collection interface
		linkedList1.add(10); //Add method from Collection interface
		linkedList1.add(100); //Add method from Collection interface
		linkedList1.add(1,"Pritam"); //Add method from List interface 
		System.out.println("linkedList1 = "+linkedList1);
		System.out.println("Old value :- "+linkedList1.set(1, "Basudev")); //Set Method from List interface
		System.out.println("linkedList1 = "+linkedList1);
		System.out.println("At index 0 value is :- "+linkedList1.get(0)); //Get Method from List interface
		System.out.println("Index of 10 :- "+linkedList1.indexOf(10)); //Index Of Method from List interface
		System.out.println("Last Index of 10 :- "+linkedList1.lastIndexOf(10)); //Last Index Of Method from List interface
		System.out.println("Contains 10 :- "+linkedList1.contains(20)); //Contains method from Collection interface
		linkedList1.remove("Basudev"); //Remove method from Collection interface
		System.out.println("After removing basudev linkedList1 = "+linkedList1);
		linkedList1.remove(1); //Remove method from List interface
		System.out.println("After removing element at index 1 linkedList1 = "+linkedList1);
		System.out.println("Size of linkedList1 = "+linkedList1.size());//Size method from Collection interface
		System.out.println("Is linkedList1 empty = "+linkedList1.isEmpty());//Is Empty method from Collection interface
		linkedList1.clear();//Clear method from Collection interface
		System.out.println("linkedList1 = "+linkedList1);
		
		LinkedList linkedList2 = new LinkedList();
		linkedList2.add(1);
		linkedList2.add(2);
		linkedList2.add(1);
		linkedList2.add(3);
		linkedList2.add(4);
		System.out.println("linkedList2 = "+linkedList2);
		
		LinkedList linkedList3 = new LinkedList(linkedList2);//LinkedList constructor with collection and also heterogeneous
		linkedList3.add(1000);
		linkedList3.add(2000);
		System.out.println("linkedList3 = "+linkedList3);
		System.out.println("Does linkedList3 contain all "+linkedList2+" = "+linkedList3.containsAll(linkedList2)); //Contains all method from Collection interface
		linkedList3.retainAll(linkedList2); //Retail all method from Collection interface
		System.out.println("linkedList3 = "+linkedList3);
		linkedList3.removeAll(linkedList2); //Remove all method from Collection interface
		System.out.println("linkedList3 = "+linkedList3);
		linkedList3.addAll(linkedList2); //add all method from Collection interface
		System.out.println("linkedList3 = "+linkedList3);
		linkedList3.addAll(1,linkedList2);//Remove all method from List interface
		System.out.println("linkedList3 = "+linkedList3);
	}
}
