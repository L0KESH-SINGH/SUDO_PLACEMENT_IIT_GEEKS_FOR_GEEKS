import java.util.*;

public class specialsumofarray {

	public static int sumH(int n , int s)
	{
         if( n==0 )
         {
        	 return 0 ;
         }
         int temp = n % 10 ;
         
         int myans = sumH(n/10 , s ) ;
         
         temp += myans ;
         if(temp<10)
         {
        	 s = temp ;
         }
         
         
         ///
         return s ;
	}
	
	public static int sum(int arr[])
	{
         //Write code here 
		int sum = 0 ;
		for(int i=0 ; i<arr.length ; i++)
		{
			sum += arr[i] ;
		}
		return sumH(sum, 0) ;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		int n[] = {1,7,8,5,9} ;
		System.out.println(sum(n));
		
	}

}
