import java.util.Scanner;
public class factorial {
	public static int factorial(int n) {
		int f=1;
		for(int i=1; i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int r = s.nextInt();
		// int fn=1, fr=1, fnr=1;
		int fn = factorial(n);
		int fr = factorial(r);
		int fnr = factorial(n-r);
		int c = fn/(fr*fnr);
		System.out.print(c);
	}
}
