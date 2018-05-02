package array;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int count = 7, num1 = 0, num2 = 1, k;
		System.out.println("Fibonacci series of " + count + " numbers");

		for (int i = 0; i <= count; ++i) {

			System.out.print(num1 + " ");

			k = num1 + num2;
			num1 = num2;
			num2 = k;
		}

	}

}
