import java.util.Scanner;

public class find_the_fine {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		int test = s.nextInt() ;
		
		for(int p=0 ; p<test ; p++) {
			
		int n= s.nextInt() ;
		int m = s.nextInt() ;
		
		int A[] = new int[n] ;
		int B[] = new int[n] ;
		
		for(int j=0 ; j<n ; j++)
		{
			A[j]= s.nextInt() ;
		}
		for(int j=0 ; j<n ; j++)
		{
			B[j]= s.nextInt() ;
		}
		
		String temp ;
		if(m%2==0)
		{
			temp = "even" ;
		}
		else
			temp = "odd" ;
		
		int fine =0 ;
		for(int i=0 ; i<n ; i++)
		{
			if((!(A[i]%2==0) && (temp == "even")) || ((A[i]%2==0) && temp=="odd"))
			{
				fine += B[i] ;
			}
		}
		
		System.out.println(fine);
		
		}
	}

}
