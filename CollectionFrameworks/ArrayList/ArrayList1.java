package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList arrayList1 = new ArrayList(); //Basic ArrayList constructor and also heterogeneous
		arrayList1.add(10); //Add method from Collection interface
		arrayList1.add(20); //Add method from Collection interface
		arrayList1.add(30); //Add method from Collection interface
		arrayList1.add('z'); //Add method from Collection interface
		arrayList1.add(10); //Add method from Collection interface
		arrayList1.add(100); //Add method from Collection interface
		arrayList1.add(1,"Pritam"); //Add method from List interface 
		System.out.println("arrayList1 = "+arrayList1);
		System.out.println("Old value :- "+arrayList1.set(1, "Basudev")); //Set Method from List interface
		System.out.println("arrayList1 = "+arrayList1);
		System.out.println("At index 0 value is :- "+arrayList1.get(0)); //Get Method from List interface
		System.out.println("Index of 10 :- "+arrayList1.indexOf(10)); //Index Of Method from List interface
		System.out.println("Last Index of 10 :- "+arrayList1.lastIndexOf(10)); //Last Index Of Method from List interface
		System.out.println("Contains 10 :- "+arrayList1.contains(20)); //Contains method from Collection interface
		arrayList1.remove("Basudev"); //Remove method from Collection interface
		System.out.println("After removing basudev arrayList1 = "+arrayList1);
		arrayList1.remove(1); //Remove method from List interface
		System.out.println("After removing element at index 1 arrayList1 = "+arrayList1);
		System.out.println("Size of arrayList1 = "+arrayList1.size());//Size method from Collection interface
		System.out.println("Is arrayList1 empty = "+arrayList1.isEmpty());//Is Empty method from Collection interface
		arrayList1.clear();//Clear method from Collection interface
		System.out.println("arrayList1 = "+arrayList1);
		
		ArrayList arrayList2 = new ArrayList(5);//ArrayList constructor with size and also heterogeneous
		arrayList2.add(1);
		arrayList2.add(2);
		arrayList2.add(1);
		arrayList2.add(3);
		arrayList2.add(4);
		System.out.println("arrayList2 = "+arrayList2);
		
		ArrayList arrayList3 = new ArrayList(arrayList2);//ArrayList constructor with collection and also heterogeneous
		arrayList3.add(1000);
		arrayList3.add(2000);
		System.out.println("arrayList3 = "+arrayList3);
		System.out.println("Does arrayList3 contain all "+arrayList2+" = "+arrayList3.containsAll(arrayList2)); //Contains all method from Collection interface
		arrayList3.retainAll(arrayList2); //Retail all method from Collection interface
		System.out.println("arrayList3 = "+arrayList3);
		arrayList3.removeAll(arrayList2); //Remove all method from Collection interface
		System.out.println("arrayList3 = "+arrayList3);
		arrayList3.addAll(arrayList2); //add all method from Collection interface
		System.out.println("arrayList3 = "+arrayList3);
		arrayList3.addAll(1,arrayList2);//Remove all method from List interface
		System.out.println("arrayList3 = "+arrayList3);
	}
}
