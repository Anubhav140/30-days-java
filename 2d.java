
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int[][] matrix = new int[M][N];
            int Q = scanner.nextInt();
            scanner.nextLine();

            String[] queries = new String[Q];
            for (int i = 0; i < Q; i++) {
                queries[i] = scanner.nextLine();
            }

            int[] result = Solution.query(matrix, M, N, queries);

            for (int count : result) {
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
public static int[] query(int[][] mat, int m, int n, String[] q) {
		// Write your code here.
		int ansl=0;
		for(int i = 0 ; i < q.length ; i++)
		{
			if(q[i].charAt(0)=='2')
			{
				ansl++;
			}
		}

		int ans[] = new int [ansl];
		int ai = 0;
		
		for(int i = 0 ; i < q.length ; i++)
		{
			if( q[i].charAt(0) =='1')
			{
				if(q[i].charAt(1) =='R')
				{
					int index = q[i].charAt(2)-'0';
					for(int j = 0 ; j < n ; j++)
					{
						if(mat[index][j] == 0)
						{
							mat[index][j] = 1;
						}
						else
						{
							mat[index][j] = 0;
						}
					}
				}
				else
				{
					int index = q[i].charAt(2)-'0';
					for(int j = 0 ; j < m ; j++)
					{
						if(mat[j][index] == 0)
						{
							mat[j][index] = 1;
						}
						else
						{
							mat[j][index] = 0;
						}
					}
				}
			}
			else
			{
				if(q[i].charAt(1) == 'R')
				{
					int index = q[i].charAt(2)-'0';
					int count = 0;
					for(int j = 0 ; j < n ; j++)
					{
						if(mat[index][j] ==0)
						{
							count++;
						}
					}
					ans[ai] =count;
					ai++;
				}
				else
				{
					int index = q[i].charAt(2)-'0';
					int count = 0;
					for(int j = 0 ; j < m ; j++)
					{
						if(mat[j][index] ==0)
						{
							count++;
						}
					}
					ans[ai] =count;
					ai++;
				}
			}
		}
		return ans;	
	}
