package Sep13_14_2023;

public class SampleArray {

	public static void main(String[] args) {
		int[] anArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		System.out.println(anArray.length);
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 9: " + anArray[9]);
		anArray[4] = anArray[4] * 100;
		System.out.println("Element at index 4: " + anArray[4]);
	}
}