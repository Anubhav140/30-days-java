import java.util.Scanner;

public class reversearr {
	public static int[] reversearr(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int arr1[]=reversearr(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]);
		}
	}

}
