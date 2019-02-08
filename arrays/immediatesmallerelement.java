import java.util.*;
/**
 * immediate_smaller_element
 */
public class immediatesmallerelement {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int TC = s.nextInt() ;
        for(int i=0 ; i<TC ; i++)
        {
            int size = s.nextInt();
            int arr[] = new int[size] ;
            for(int j=0 ; j<size ; j++)
            {
                arr[j] = s.nextInt() ;
                if(j!=0)
                {
                    if(arr[i]<arr[i-1])
                    {
                        System.out.print(arr[i]);
                    }
                    else
                    {
                        System.out.print(-1);
                    }
                }
            }
            System.out.println();
        }
    }
}