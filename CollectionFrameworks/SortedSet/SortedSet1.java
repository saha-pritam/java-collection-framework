package SortedSet;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		SortedSet sortedSet1 = new TreeSet(); //Default Constructor with DNSO
//		sortedSet1.add(null); //This is error since java 1.7 earlier tree set allowed null as long as there is nothing else in the sorted set
		sortedSet1.add(100);
		sortedSet1.add(10);
		sortedSet1.add(90);
		sortedSet1.add(20);
		sortedSet1.add(80);
		sortedSet1.add(30);
		sortedSet1.add(70);
		sortedSet1.add(40);
		sortedSet1.add(60);
		sortedSet1.add(50);
		System.out.println("Sorted set 1 = "+sortedSet1);
		
		SortedSet sortedSet2 = new TreeSet(sortedSet1); //Constructor with sorted set
		System.out.println("Sorted set 2 = "+sortedSet2);
		
		SortedSet sortedSet3 = new TreeSet((o1,o2)-> ((Integer)o1<(Integer)o2)? 1:-1); //Constructor with comparator
		sortedSet3.add(100);
		sortedSet3.add(10);
		sortedSet3.add(90);
		sortedSet3.add(20);
		sortedSet3.add(80);
		sortedSet3.add(30);
		sortedSet3.add(70);
		sortedSet3.add(40);
		sortedSet3.add(60);
		sortedSet3.add(50);
		System.out.println("Sorted set 3 = "+sortedSet3);
		
		List list = List.of(10,1,9,2,8,3,7,4,6,5); 
		SortedSet sortedSet4 = new TreeSet(list); //Constructor with collection
		System.out.println("Sorted set 4 = "+sortedSet4);
		
		System.out.println("First of sortedSet4 is "+sortedSet4.first()); //First method of sorted set
		System.out.println("Last of sortedSet4 is "+sortedSet4.last()); //Last method of sorted set
		System.out.println("Head set of sortedSet4 with param 6 is "+sortedSet4.headSet(6)); //Head set method of sorted set
		System.out.println("Tail set of sortedSet4 with param 6 is "+sortedSet4.tailSet(6)); //Tail set method of sorted set
		System.out.println("Sub set of sortedSet4 with param 2 and 7 is "+sortedSet4.subSet(2,7));//Sub set method of sorted set

	}

}
