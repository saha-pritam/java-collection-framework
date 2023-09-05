package HashedSet;

import java.util.HashSet;

public class HashedSet1 {
	public static void main(String args[]) {
		HashSet hashSet1 = new HashSet();//Default constructor and heterogeneous hashed set
		hashSet1.add(10);
		hashSet1.add("pritam"); 
		hashSet1.add(null); 
		hashSet1.add(10); 
		hashSet1.add(20); 
		hashSet1.add(30); 
		System.out.println("hashSet1 = "+hashSet1);
		
		HashSet hashSet2 = new HashSet(5);//Constructor with capacity for hash set and heterogeneous hashed set
		hashSet2.add(10);
		hashSet2.add(20);
		hashSet2.add(30);
		hashSet2.add(40);
		hashSet2.add(50);
		hashSet2.add(60);
		System.out.println("hashSet2 = "+hashSet2);
		
		HashSet hashSet3 = new HashSet(10,0.9f);//Constructor with capacity and load factor for hash set and heterogeneous hashed set
		hashSet3.add(100);
		hashSet3.add(200);
		hashSet3.add(300);
		hashSet3.add(400);
		System.out.println("hashSet3 = "+hashSet3);
		
		HashSet hashSet4 = new HashSet(hashSet1);//Constructor with collection for hash set and heterogeneous hashed set
		System.out.println("hashSet4 = "+hashSet4);
	}
}
