package NavigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1 {

	public static void main(String[] args) {
		NavigableSet<Integer> navigableSet = new TreeSet<Integer>();
		navigableSet.add(100);
		navigableSet.add(10);
		navigableSet.add(90);
		navigableSet.add(20);
		navigableSet.add(80);
		navigableSet.add(30);
		navigableSet.add(70);
		navigableSet.add(40);
		navigableSet.add(60);
		navigableSet.add(50);
		
		System.out.println("First value in set :- "+navigableSet.pollFirst());//poll First method from Navigable Set Interface
		System.out.println("Last value in set :- "+navigableSet.pollLast());//poll Last method from Navigable Set Interface
		System.out.println("Lower value to 50 is "+navigableSet.lower(50));//lower method from Navigable Set Interface
		System.out.println("Lower value to 55 is "+navigableSet.lower(55));//lower method from Navigable Set Interface
		System.out.println("Floor value to 50 is "+navigableSet.floor(50));//floor method from Navigable Set Interface
		System.out.println("Floor value to 55 is "+navigableSet.floor(55));//floor method from Navigable Set Interface
		System.out.println("Higher value to 50 is "+navigableSet.higher(50));//higher method from Navigable Set Interface
		System.out.println("Higher value to 55 is "+navigableSet.higher(55));//higher method from Navigable Set Interface
		System.out.println("Ceiling value to 50 is "+navigableSet.ceiling(50));//ceiling method from Navigable Set Interface
		System.out.println("Ceiling value to 55 is "+navigableSet.ceiling(55));//ceiling method from Navigable Set Interface
	}

}
