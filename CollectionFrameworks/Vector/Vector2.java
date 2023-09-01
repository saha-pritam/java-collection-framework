package Vector;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>(); //Creating homogeneous vector with basic constructor
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
//		vector.add("Pritam"); //This is error since this vector is homogeneous
		System.out.println(vector);
	}

}
