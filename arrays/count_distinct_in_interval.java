import java.util.* ;
public class count_distinct_in_interval {
  
	//wrong approach	
	
	public static void countDistinct(int A[], int k, int n)
	{
	    for(int i=0 ; i<n ; i = i+k)
	    {
	    	int t = i ;
	    	int count = 0 ;
	    	while(t<i+k)
	    	{
	    		int flag = 1 ;
	    		for(int j=t+1 ; j<i+k-1 ; j++)
	    		{
	    			if(A[t]==A[j])
	    			{
	    				flag = 0 ;
	    				break ;
	    			}
	    			
	    		}
	    		if(flag==1)
	    			count++ ;
	    		
	    		t++;
	    	}
	    	System.out.print(count+" ");
	    }
	}
		
	
	public static void main(String[] args) {
		
		int A[] = {1,2,1,3,4,2,3} ;
		int n = 7 ;
		int k = 4 ;
		countDistinct(A, k, n);

	}

}
