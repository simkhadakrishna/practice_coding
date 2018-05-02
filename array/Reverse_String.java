package array;

public class Reverse_String {

	public static void main(String[] args) {
		//declare and initialize a string
		String str = " welcome to beginners book";
		String reversed = reverseString(str);
		
		System.out.println(reversed);

	}

	private static String reverseString(String str) {
		
		if(str.isEmpty())
			return str;
		//calling function recursively
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
