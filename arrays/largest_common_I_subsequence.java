import java.util.*;

public class largest_common_I_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)	;
		
		int T = s.nextInt() ;
		for(int p = 0 ; p<T ; p++)
		{
		int n = s.nextInt() ;
		
		int A[] = new int[n] ;
		
		for(int a=0 ; a<n ; a++)
		{
			A[a] = s.nextInt() ;
		}
		int m = s.nextInt() ;
		int B[] = new int[m] ;
		for(int a=0 ; a<m ; a++)
		{
			B[a] = s.nextInt() ;
		}
		
		int count = 0 ; int temp = 0 ; int max = 0 ;
		for(int i=0 ; i<A.length ; i++)
		{
			for(int j=temp ; j<B.length ; j++)
			{
				if(A[i]==B[j] && A[i]>max)
				{
					if(A[i]>max)
					{
						max = A[i] ;
					}
					count++ ;
					temp = j+1 ;
					break ;
				}
			}
		}
		System.out.println(count) ;
		}

	}

}
