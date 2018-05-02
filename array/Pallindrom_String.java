package array;

public class Pallindrom_String {

	public static void main(String[] args) {
		String original = "mom";
		String reverse = "";

		// char[] ch = original.toCharArray();

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);

		}
		if (reverse.equals(original))
			System.out.println(original + " is a pallindrom");

		else
			System.out.println(original + " is not a pallindrom.");

	}

}
