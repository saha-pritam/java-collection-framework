package HashedSet;

import java.util.HashSet;

public class HashedSet2 {
	public static void main(String args[]) {
		HashSet<Integer> hashSet1 = new HashSet<Integer>();//Default constructor and homogeneous hashed set
		hashSet1.add(10);
		hashSet1.add(40); 
		hashSet1.add(null); 
		hashSet1.add(10); 
		hashSet1.add(20); 
		hashSet1.add(30); 
		System.out.println("hashSet1 = "+hashSet1);
		
		HashSet<Integer> hashSet2 = new HashSet<Integer>(5);//Constructor with capacity for hash set and homogeneous hashed set
		hashSet2.add(101);
		hashSet2.add(201);
		hashSet2.add(301);
		hashSet2.add(401);
		hashSet2.add(501);
		hashSet2.add(601);
		System.out.println("hashSet2 = "+hashSet2);
		
		HashSet<Integer> hashSet3 = new HashSet<Integer>(10,0.9f);//Constructor with capacity and load factor for hash set and homogeneous hashed set
		hashSet3.add(1000);
		hashSet3.add(2000);
		hashSet3.add(3000);
		hashSet3.add(4000);
		System.out.println("hashSet3 = "+hashSet3);
		
		HashSet<Integer> hashSet4 = new HashSet<Integer>(hashSet1);//Constructor with collection for hash set and homogeneous hashed set
		System.out.println("hashSet4 = "+hashSet4);
	}
}
