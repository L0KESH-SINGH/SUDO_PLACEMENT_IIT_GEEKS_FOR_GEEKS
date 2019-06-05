import java.util.Scanner;

public class absolute_differenceof_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in) ;
		
		int T = s.nextInt() ;
		
		for(int p=0 ; p<T ; p++)
		{
		int n = s.nextInt() ;
		long A[] = new long[n] ;
		long k = s.nextLong() ;
		for(int j = 0 ; j<n ; j++)
		{
			A[j] = s.nextLong() ;
		}
		int count = 0;
		for(int i=0 ; i<A.length ; i++)
		{
			if(A[i]<k && A[i]>9) {
			long temp = A[i] ;
			int flag = 1 ;
			
			while(A[i]!=0 && A[i]>9)
			{
				long x = A[i]%10 ;
				A[i] = A[i]/10 ;
				long y = A[i]%10 ;
				if(!((x-y == 1) || (y-x == 1)))
				{
					flag = 0 ;
					break ;
				}
			}
			if(flag==1)
			{
				System.out.print(temp+" ");
				count++ ;
			}
			}
		}
		if(count == 0)
			System.out.println(-1);
		System.out.println();
		}

	}

}
