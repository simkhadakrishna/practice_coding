package array;

public class Pallindrom {

	public static void main(String[] args) {
		int n = 124746, r, s=0;
		int t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=s*10+r;
			
		}
		//System.out.println(s);
		System.out.println(s);
		if(t==s) {
			System.out.println(t+ " is a pallindrom");
		}
		else {
			System.out.println(t+ " is not a pallindrom");
		}

	}

}
