package array;

public class String_Split_Method {

	public static void main(String[] args) {
		
		String str = "How are you today.";
		
		String part[] = str.split(" ");
		
		for(int i=0; i<part.length; i++) {
			System.out.println("--------->" + part[i]);
		}

	}

}
