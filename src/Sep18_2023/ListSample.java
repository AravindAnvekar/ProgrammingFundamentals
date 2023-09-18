package Sep18_2023;

import java.util.*;

public class ListSample {

	public static void main(String[] args) {
//		int[] anArray = new int[] { 1, 2, 3, 4 };
		int[] anArray = new int[5];
		anArray[0] = 1;
		anArray[0] = 2;
		anArray[0] = 3;
		anArray[0] = 4;		
		
		for (int count = 0; count < 4; count++) {
			System.out.println("Element at index " + count + ": " + anArray[count]);
		}

		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		for (String fruit : list)
			System.out.println(fruit);
	}
}
