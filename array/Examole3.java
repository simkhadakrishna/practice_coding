//Check whether the first and last element of the array is same.

package array;

public class Examole3 {
	static int[] arr = { 1, 2, 3, 2, 1 };

	public static boolean numCheck() {
		return (arr[1]==2 && arr[arr.length - 2]==2);
		
	}

	public static void main(String[] args) {
		//Examole3 ex = new Examole3();
		System.out.println(numCheck());

	}

}
