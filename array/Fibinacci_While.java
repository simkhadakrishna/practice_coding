package array;

public class Fibinacci_While {

	public static void main(String[] args) {
		int count = 10, num1 = 0, num2 = 1;
		int i=1;
		while(i<=count) {
			System.out.print(num1 + " ");
			int k = num1 + num2;
			num1 = num2;
			num2 = k;
			i++;
		}

	}

}
