import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int F1=0;
		int F2=1;
		int F;
		for(int i=1; i<=n; i++){
			F=F1+F2;
			F1=F2;
			F2=F;
		}		
		System.out.println(F1);
	}

}
