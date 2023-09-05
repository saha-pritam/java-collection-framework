package LinkedHashedSet;

import java.util.LinkedHashSet;

public class LinkedHashedSet1 {
	public static void main(String args[]) {
		LinkedHashSet linkedHashSet1 = new LinkedHashSet();//Default constructor and heterogeneous linked hashed set
		linkedHashSet1.add(10);
		linkedHashSet1.add("pritam"); 
		linkedHashSet1.add(null); 
		linkedHashSet1.add(10); 
		linkedHashSet1.add(20); 
		linkedHashSet1.add(30); 
		System.out.println("linkedHashSet1 = "+linkedHashSet1);
		
		LinkedHashSet linkedHashSet2 = new LinkedHashSet(5);//Constructor with capacity for linked hashed set and heterogeneous linked hashed set
		linkedHashSet2.add(10);
		linkedHashSet2.add(20);
		linkedHashSet2.add(30);
		linkedHashSet2.add(40);
		linkedHashSet2.add(50);
		linkedHashSet2.add(60);
		System.out.println("linkedHashSet2 = "+linkedHashSet2);
		
		LinkedHashSet linkedHashSet3 = new LinkedHashSet(10,0.9f);//Constructor with capacity and load factor for linked hashed set and heterogeneous linked hashed set
		linkedHashSet3.add(100);
		linkedHashSet3.add(200);
		linkedHashSet3.add(300);
		linkedHashSet3.add(400);
		System.out.println("linkedHashSet3 = "+linkedHashSet3);
		
		LinkedHashSet linkedHashSet4 = new LinkedHashSet(linkedHashSet1);//Constructor with collection for linked hashed set and heterogeneous linked hashed set
		System.out.println("linkedHashSet4 = "+linkedHashSet4);
	}
}
