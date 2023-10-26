import java.util.Scanner;
public class reverseString {
	public static boolean reversestring(String str) {
		int n=str.length();
		String str1="";
		for(int i=n-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		return str.equals(str1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean a=reversestring(str);
		System.out.println(a);
	}
}
