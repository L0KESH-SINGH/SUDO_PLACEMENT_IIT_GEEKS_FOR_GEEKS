import java.util.* ;
public class SUBARRAY_with_given_sum {

	public static void subarray(int A[] , int sum) 
	{
		int size = A.length ;
		int i = 0 ;
		while(i<size)
		{
			int curr = 0 ;
			for(int j=i ; j<size ; j++)
			{
				curr += A[j] ;
				if(curr == sum)
				{
					System.out.println((i+1) + " " + (j+1) +" ");
					return ;
				}
				if(curr>sum)
				{
					break ;
				}
			}
			i++ ;
		}
		System.out.println(-1);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		int T = s.nextInt() ;
		
		for(int i=0 ; i<T ; i++)
		{
			int n = s.nextInt() ;
			int sum = s.nextInt() ;
			int A[] = new int[n] ;
			for(int j=0 ; j<n ; j++)
			{
				A[j] = s.nextInt() ;
			}
			
			subarray(A, sum);
		}
		
		
	}

}
