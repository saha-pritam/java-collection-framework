package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet3 {

	public static void main(String[] args) {
		SortedSet<Student> sortedSet1 = new TreeSet<Student>();
		
		Student s1 = new Student(1,"Pritam");
		Student s2 = new Student(2,"Aditya");
		Student s3 = new Student(3,"Gunjan");
		Student s4 = new Student(4,"Sagar");
		Student s5 = new Student(5,"Aparajita");

		sortedSet1.add(s1);
		sortedSet1.add(s5);
		sortedSet1.add(s2);
		sortedSet1.add(s4);
		sortedSet1.add(s3);
		
		System.out.println("Sorted Set 1 ="+sortedSet1);
		
		SortedSet<Student> sortedSet2 = new TreeSet<Student>((o1,o2)->o1.getStudentName().compareTo(o2.getStudentName()));
		sortedSet2.add(s1);
		sortedSet2.add(s2);
		sortedSet2.add(s3);
		sortedSet2.add(s4);
		sortedSet2.add(s5);
		System.out.println("Sorted Set 2 ="+sortedSet2);
	}

}
