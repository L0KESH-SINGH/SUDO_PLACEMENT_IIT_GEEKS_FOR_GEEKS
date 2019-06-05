import java.util.*;

public class chocolate_distribution {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		int cases = s.nextInt() ;
		for(int d=0 ; d<cases ; d++) {
		int n = s.nextInt() ;
		int packet[] = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			packet[i] = s.nextInt() ;
		}
		int m = s.nextInt() ;
		
		Arrays.sort(packet);
		
		int x=0 , y = m-1 , min = Integer.MAX_VALUE ;
		while(y<n)
		{
			int difference = packet[y]-packet[x] ;
			if(difference<min)
			{
				min = difference ;
			}
			x++;
			y++;
		}
		
		
		System.out.println(min); 
		}

	}

}
