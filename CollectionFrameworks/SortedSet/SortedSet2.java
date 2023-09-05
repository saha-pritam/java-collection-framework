package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet2 {

	public static void main(String[] args) {
		SortedSet sortedSet1 = new TreeSet();
		sortedSet1.add(100);
		sortedSet1.add("Pritam");
		//This code will give CCE since the sorted set will not be able to compare integer with string
	}

}
