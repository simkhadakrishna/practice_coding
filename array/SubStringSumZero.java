//find the subArray whose sum is zero
package array;

import java.util.Arrays;

public class SubStringSumZero {

	public static void main(String[] args) {
		int[] arr = { -5, 4, -1, -3, 0 };

		int i;
		int sum = 0;
		
		int[] newArray = Arrays.copyOfRange(arr, 1, 4);
		System.out.println(Arrays.toString(newArray));

		// find the sum of the subArray
		
		for (i = 0; i < newArray.length; i++) {
			sum = sum + newArray[i];
		}
		System.out.println("Total sum of the subArray = " + sum);

	}

}
