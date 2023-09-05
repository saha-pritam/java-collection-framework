package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet4 {

	public static void main(String[] args) {
		SortedSet sortedSet = new TreeSet((o1,o2)->{
			String s1 = String.valueOf(o1);
			String s2 = String.valueOf(o2);
			return s1.compareTo(s2);
		});
		
		sortedSet.add(10);
		sortedSet.add("Pritam");
		sortedSet.add("Aditya");
		sortedSet.add("700");
		System.out.println(sortedSet);

	}

}
