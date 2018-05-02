/**
 * Given an array of integers, return true if 6 appears as the first or the last element in the arra
 * The array will be length of of 1 or more.
 * 
 */
package array;

public class Example1 {
	int[] arr = { 1, 2, 3, 4, 3, 2, 1 };

	public boolean firstLast() {
		if (arr[0] == 1) {
			return true;
		} else if (arr[arr.length - 1] == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Example1 ex = new Example1();
		System.out.println(ex.firstLast());

	}

}
