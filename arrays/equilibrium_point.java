import java.util.* ;
public class equilibrium_point {
	
	public static int equilibrium(int[] A , int i , int j)
	{
		if(j>=i) {
		int mid = (i+j)/2 ;
		int left =0 , right = 0 ;
		for(int a=0 ; a<mid ; a++)
		{
			left += A[a] ;
		}
		for(int a = mid+1 ; a<A.length ; a++)
		{
			right += A[a] ;
		}
		if(left==right)
		{
			return mid + 1 ;
		}
		else if(left>right)
		{
			return equilibrium(A, i, mid-1) ;
		}
		else
		{
			return equilibrium(A, mid+1, j) ;
		}
		}
		return -1 ;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
	
		int T = s.nextInt() ;
		for(int i=0 ; i<T ; i++)
		{
			int n = s.nextInt() ;
			int A[] = new int[n] ;
			for(int j=0 ; j<n ; j++)
			{
				A[j] = s.nextInt() ;
			}
			System.out.println(equilibrium(A, 0, n-1));
		}
		
		
		
	}
}
