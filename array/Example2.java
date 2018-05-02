package array;

public class Example2 {
	int[] arr = { 6, 2, 6, 6 };

	public boolean firstLast() {
		if (arr[0] == 6&& arr[arr.length-1]==6) {
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
