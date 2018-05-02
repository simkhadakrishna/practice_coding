package array;

public class StringToCharArray {

	public static void main(String[] args) {
		String str = new String("welcome to you");
		char[] arr = str.toCharArray();
		System.out.println("content of array:");
		for (char c : arr) {
			System.out.print(c +" ");
		}
		System.out.println(": " +arr[0]);

	}

}
