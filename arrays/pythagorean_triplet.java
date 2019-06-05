import java.util.* ;
public class pythagorean_triplet {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		HashSet<Integer> h = new HashSet<>() ;
		
		int test = s.nextInt() ;
		
		for(int p=0 ; p<test ; p++) {
		int n= s.nextInt() ;
		
		int A[] = new int[n] ;
		for(int i=0 ; i<n ; i++)
		{
			A[i] = s.nextInt() ;
		}
		
		Arrays.sort(A);
		for(int i=0 ; i<n ; i++)
		{
			if(!(h.contains(A[i])))
			{
				h.add(A[i]*A[i]) ;
			}
		}
		for(int i=0 ; i<n-1 ; i++)
		{
			for(int j=i+1 ; j<n ; j++)
			{
				if(h.contains((A[i]*A[i])+(A[j]*A[j])))
				{
					System.out.println("Yes" + " ");
					return ;
				}
			}
		}
		System.out.print("No" + " ");
		}
	}

}
