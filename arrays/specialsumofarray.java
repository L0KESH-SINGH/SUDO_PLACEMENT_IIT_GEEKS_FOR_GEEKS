import java.util.*;

public class specialsumofarray {

	public static int sum(int n , int s)
	{
         if( n==0 )
         {
        	 return 0 ;
         }
         int temp = n % 10 ;
         
         int myans = sum(n/10 , s ) ;
         
         temp += myans ;
         if(temp<10)
         {
        	 s = temp ;
         }
         
         
         ///
         return s ;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		int n[] = {9,9,9} ;
		System.out.println(sum(32 , 0));
	}

}
