import java.util.Scanner;

public class Type_of_an_ARRAY {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		int T = s.nextInt() ;
		for(int j=0 ; j<T ; j++) {
			
		int n = s.nextInt() ;
		int A[] = new int[n] ;
		
		for(int c = 0 ; c<n ; c++)
		{
			A[c] = s.nextInt() ;
		}
		
		int X =0 , Y= 0 ;
		int max = A[n-1];
		for(int i=0 ; i<n-1 ; i++)
		{
			if(A[i]>max)
			{
				max = A[i] ;
			}
			if((A[i]-A[i+1])>0)
			{
				X++ ; //Y-- ;
			}
			else
			{
				//X-- ; 
				Y++ ;
			}
		}
		
		if(X==n-1)
			System.out.println(max + " " + "2");
		else if(Y==n-1)
			System.out.println(max + " " + "1");
		else if(Y==n-2)
			System.out.println(max + " " + "4");
		else if(X==n-2)
			System.out.println(max + " " + "3");
		
		
	}
	}

}
