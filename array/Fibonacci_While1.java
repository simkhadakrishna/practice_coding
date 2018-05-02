package array;

import java.util.Scanner;

public class Fibonacci_While1 {

	public static void main(String[] args) {
		int count, num1 = 0, num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		count = sc.nextInt();
		
		System.out.println("Fibonacci series of " +count+ " number is:");
		int i = 1;
		
		while(i<=count) {
			System.out.print(num1 + " ");
			int k = num1 + num2;
			num1 = num2;
			num2 = k;
			i++;
			
			
		}
	}

}
