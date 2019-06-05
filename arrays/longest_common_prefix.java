import java.util.Arrays;
import java.util.Scanner;

public class longest_common_prefix {
	
	public static int sum(int n , int sum)
	{
         if( n==0 )
         {
        	 return 0 ;
         }
         int temp = sum % 10 ;
         
         int myans = sum(n/10 , sum ) ;
         
         temp += myans ;
         if(temp<10)
         {
        	 sum = temp ;
         }
         return sum ;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		int n[] = {9,9,9} ;
		System.out.println(sum(27 , 0));
		
		
//		int T = s.nextInt() ;
//		
//		for(int p = 0 ; p<T ; p++)
//		{
//		int n = s.nextInt() ;
//		
//		String str[] = new String[n] ;
//		
//		for(int x = 0 ; x<n ; x++)
//		{
//			str[x] = s.next() ;
//		}
//		
//		if(n <=1)
//		{
//			for(int x = 0 ; x<n ; x++)
//			{
//				System.out.println(str[x]);
//			}
//			return ;
//		}
//		
//		//int count = 0 ;
//		String ans = "" ;
//		
//		
//		for(int i=0 ; i<str.length-1 ; i++)
//		{
//			String tempans = "" ;
//			//int temp = 0 ;
//			for(int j = 0 ; j<str[i].length() && j<str[i+1].length(); j++)
//			{
//				if( str[i].charAt(j) == str[i+1].charAt(j) )
//				{
//					//count ++ ;
//					tempans += str[i].charAt(j) ;
//					//temp ++ ;
//				}
//				else
//				{
//					break ;
//				}
//			}
//			//System.out.println(ans.length());
//			if(i==0)
//				ans = tempans ;
//			else if(tempans.length()<ans.length())
//				ans = tempans ;
//		}
//		if(ans.length() == 0)
//			System.out.println(-1);
//		else
//			System.out.println(ans);
//		
//		
//		}
	}

}
