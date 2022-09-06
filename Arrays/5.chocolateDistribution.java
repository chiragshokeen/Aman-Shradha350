// https://www.geeksforgeeks.org/chocolate-distribution-problem/

import java.util.* ;
class chocolateDistribution {

    public static void main( String[] args ){

                Scanner scn = new Scanner(System.in );
                int n = scn.nextInt();
                int[] arr = new int[n];
                for( int i = 0 ; i < n ; i++ ){
                    arr[i] = scn.nextInt();
                }
                int m = scn.nextInt() ;
                Arrays.sort(arr);
                int i = 0 ; 
                int j = i + m-1;
                int min = (int)1e9;
                while( j < n ){

                    min = Math.min( min , arr[j]-arr[i] );
                    i++;
                    j++;


                }

                System.out.println(min);
               
        
        
            }
        
            
         
        
    
}
