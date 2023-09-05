package LinkedHashedSet;

import java.util.LinkedHashSet;

public class LinkedHashedSet2 {
	public static void main(String args[]) {
		LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();//Default constructor and homogeneous linked hashed set
		linkedHashSet1.add(10);
		linkedHashSet1.add(40); 
		linkedHashSet1.add(null); 
		linkedHashSet1.add(10); 
		linkedHashSet1.add(20); 
		linkedHashSet1.add(30); 
		System.out.println("linkedHashSet1 = "+linkedHashSet1);
		
		LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<Integer>(5);//Constructor with capacity for linked hashed set and homogeneous linked hashed set
		linkedHashSet2.add(101);
		linkedHashSet2.add(201);
		linkedHashSet2.add(301);
		linkedHashSet2.add(401);
		linkedHashSet2.add(501);
		linkedHashSet2.add(601);
		System.out.println("linkedHashSet2 = "+linkedHashSet2);
		
		LinkedHashSet<Integer> linkedHashSet3 = new LinkedHashSet<Integer>(10,0.9f);//Constructor with capacity and load factor for linked hashed set and homogeneous linked hashed set
		linkedHashSet3.add(1000);
		linkedHashSet3.add(2000);
		linkedHashSet3.add(3000);
		linkedHashSet3.add(4000);
		System.out.println("linkedHashSet3 = "+linkedHashSet3);
		
		LinkedHashSet<Integer> linkedHashSet4 = new LinkedHashSet<Integer>(linkedHashSet1);//Constructor with collection for linked hashed set and homogeneous linked hashed set
		System.out.println("linkedHashSet4 = "+linkedHashSet4);
	}
}
