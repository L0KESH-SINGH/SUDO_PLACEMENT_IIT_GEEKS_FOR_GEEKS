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
            }
            for(int x=0 ; x<size-1 ; x++)
            {
                if(arr[x+1]<arr[x])
                {
                    System.out.println(arr[x+1]);
                }
                else
                {
                    System.out.println(-1);
                }
            }
            System.out.println(-1);
        }
    }
}