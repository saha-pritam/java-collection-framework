package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); //Creating homogeneous array list with basic constructor
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
//		arrayList.add("Pritam"); //This is error since this array list is homogeneous
		System.out.println(arrayList);
	}

}
