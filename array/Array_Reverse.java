package array;

public class Array_Reverse {

	public static void main(String[] args) {

		String str = "welcome nepal";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			System.out.print(ch + "  ");
		}

		System.out.println("\n reverse order------------");

		for (int j = str.length() - 1; j >= 0; j--) {
			char ch = str.charAt(j);

			System.out.print(ch + "  ");

		}

	}

}
