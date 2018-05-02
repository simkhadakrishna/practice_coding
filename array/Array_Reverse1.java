package array;

import java.util.Scanner;

public class Array_Reverse1 {

	public static void main(String[] args) {
		String original;
		String rev = " ";
		
	
		//create the object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		original = sc.nextLine();
		
		System.out.println("Reversed String is: ");
		
		for(int i=original.length()-1; i>=0; i--) {
			rev = rev + original.charAt(i);
			
		}
		System.out.println(rev + " ");

	}

}
