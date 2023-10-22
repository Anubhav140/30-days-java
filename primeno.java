package Function;
import java.util.Scanner;
public class prime {
	public static boolean checkprime( int n) {
		for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(checkprime(n)) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("not prime");
		}
	}
}
