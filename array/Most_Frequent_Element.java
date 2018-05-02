package array;

public class Most_Frequent_Element {

	public static void main(String[] args) {
		int[] arr = { 1, 30, 2, 2, 5, 2, 5, 2 };
		int element = 0;
		int count = 0;

		for (int j = 0; j < arr.length; j++) {
			int tempElement = arr[j];
			int tempCount = 0;
			for (int p = 0; p < arr.length; p++)
				if (arr[p] == tempElement)
					tempCount++;
			// if(tempCount>count) {
			element = tempElement;
			count = tempCount;
			// }
		}
		System.out.println("number" +element + ": repeats " + count +" times");
	}

}
