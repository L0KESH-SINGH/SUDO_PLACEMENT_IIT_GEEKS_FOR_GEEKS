import java.util.*;
public class Maximum_of_all_subarrays_of_sizek {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		int T = s.nextInt() ; 
		for(int i=0 ; i<T ; i++)
		{
			int n = s.nextInt() ;
			int k = s.nextInt() ;
			
			int A[] = new int[n] ;
			for(int j=0 ; j<n ; j++)
			{
				A[j] = s.nextInt() ;
			}
			
			for(int j=0 ; j<=n-k ; j++)
			{
				int max = 0 ;
				for(int a=j ; a<j+k ; a++)
				{
					if(A[a]>max)
					{
						max = A[a] ;
					}
				}
				System.out.print(max + " ");
				max=Integer.MIN_VALUE;
			}
			
		}
	}

}
