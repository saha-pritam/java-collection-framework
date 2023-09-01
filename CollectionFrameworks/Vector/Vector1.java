package Vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector vector1 = new Vector(); //Basic Vector constructor and also heterogeneous
		vector1.add(10); //Add method from Collection interface
		vector1.add(20); //Add method from Collection interface
		vector1.add(30); //Add method from Collection interface
		vector1.add('z'); //Add method from Collection interface
		vector1.add(10); //Add method from Collection interface
		vector1.add(100); //Add method from Collection interface
		vector1.add(1,"Pritam"); //Add method from List interface 
		System.out.println("vector1 capacity = "+vector1.capacity());
		System.out.println("vector1 = "+vector1);
		System.out.println("Old value :- "+vector1.set(1, "Basudev")); //Set Method from List interface
		System.out.println("vector1 = "+vector1);
		System.out.println("At index 0 value is :- "+vector1.get(0)); //Get Method from List interface
		System.out.println("Index of 10 :- "+vector1.indexOf(10)); //Index Of Method from List interface
		System.out.println("Last Index of 10 :- "+vector1.lastIndexOf(10)); //Last Index Of Method from List interface
		System.out.println("Contains 10 :- "+vector1.contains(20)); //Contains method from Collection interface
		vector1.remove("Basudev"); //Remove method from Collection interface
		System.out.println("After removing basudev vector1 = "+vector1);
		vector1.remove(1); //Remove method from List interface
		System.out.println("After removing element at index 1 vector1 = "+vector1);
		System.out.println("Size of vector1 = "+vector1.size());//Size method from Collection interface
		System.out.println("Is vector1 empty = "+vector1.isEmpty());//Is Empty method from Collection interface
		vector1.clear();//Clear method from Collection interface
		System.out.println("vector1 = "+vector1);
		
		Vector vector2 = new Vector(6);//Vector constructor with size and also heterogeneous
		System.out.println("vector2 capacity = "+vector1.capacity());
		vector2.add(1);
		vector2.add(2);
		vector2.add(1);
		vector2.add(3);
		vector2.add(4);
		System.out.println("vector2 = "+vector2);
		
		Vector vector3 = new Vector(vector2);//Vector constructor with collection and also heterogeneous
		vector3.add(1000);
		vector3.add(2000);
		System.out.println("vector3 = "+vector3);
		System.out.println("Does vector3 contain all "+vector2+" = "+vector3.containsAll(vector2)); //Contains all method from Collection interface
		vector3.retainAll(vector2); //Retail all method from Collection interface
		System.out.println("vector3 = "+vector3);
		vector3.removeAll(vector2); //Remove all method from Collection interface
		System.out.println("vector3 = "+vector3);
		vector3.addAll(vector2); //add all method from Collection interface
		System.out.println("vector3 = "+vector3);
		vector3.addAll(1,vector2);//Remove all method from List interface
		System.out.println("vector3 = "+vector3);
		
		Vector vector4 = new Vector(5,2); //Vector constructor with size and increment capacity and also heterogeneous
		System.out.println("vector4 capacity = "+vector4.capacity());
		vector4.add('a');
		vector4.add('b');
		vector4.add('c');
		vector4.add('d');
		vector4.add('e');
		vector4.add('f');
		System.out.println("vector4 capacity = "+vector4.capacity());
	}
}
