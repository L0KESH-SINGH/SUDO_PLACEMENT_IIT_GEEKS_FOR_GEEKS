import java.util.*;

/**
 * rotateanarray
 */
public class rotateanarray {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in) ;
        int TC = s.nextInt() ;

        for(int i=0 ; i<TC ; i++)
        {
            int size = s.nextInt() ;
            int arr[] = new int[size] ;
            for(int j=0 ; j<size ; j++)
            {
                arr[j] = s.nextInt() ;
            }
            int R = s.nextInt() ;
            for(int x=R ; x<size ; x++)
            {
                System.out.print(arr[x]+" ");
            }
            for(int p=0 ; p<R ; p++)
            {
                System.out.print(arr[p]+" ");
            }
            System.out.println();
        }
        
    }
}