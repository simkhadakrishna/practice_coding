package array;

public class Reverse_String1 {

	public static void main(String[] args) {
		Reverse_String1 rs = new Reverse_String1();
		System.out.println(rs.reverse("Hello"));

	}

	private String reverse(String string) {
		if(string.length()==0)
			return string;
		//else
			return reverse(string.substring(1))+string.charAt(0);
	}

}
