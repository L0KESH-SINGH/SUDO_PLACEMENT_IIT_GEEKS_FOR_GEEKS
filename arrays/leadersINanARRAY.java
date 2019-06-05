import java.util.* ;

/**
 * leadersINanARRAY
 */
public class leadersINanARRAY {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in) ;
        int TC = s.nextInt() ;
        ArrayList<Integer> arrlist = new ArrayList<>() ;
        //int k= 0 ;

        for(int i=0 ; i< TC ; i++)
        {
            int size = s.nextInt() ;
            int arr[] = new int[size] ;
            for(int j=0 ; j <size ; j++)
            {
                arr[j] = s.nextInt() ;
            }
            int max = -10 ;
            for(int x=size-1 ; x>=0 ; x--)
            {
                if(arr[x]>max)
                {
                    arrlist.add(arr[x]) ;
                    max = arr[x] ;
                }
            }
           for(int b=arrlist.size()-1 ; b>=0 ; b--)
           {
        	   System.out.print(arrlist.get(b)+" ");
           }
           arrlist.clear();
           System.out.println();
        }     

    }
}