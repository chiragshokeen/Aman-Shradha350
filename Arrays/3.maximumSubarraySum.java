//https://leetcode.com/problems/maximum-subarray/

import java.util.*;
class maximumSubarraySum {


    public static void main( String[] args ){

                Scanner scn = new Scanner(System.in );

                int n = scn.nextInt() ;
                int[] arr = new int[n];
                for(int i = 0 ;  i < n ; i++){
                    arr[i] = scn.nextInt() ;
                }
        
               int ans = helper( arr );
               
            System.out.println(ans);
        
            }
        
            
             public static int helper( int[] arr ){
        
                int n = arr.length;
                int rsum = 0 ; 
                int gmax = -(int)1e9 ;


                for( int i = 0 ; i < n ; i++ ){
                    rsum+=arr[i];
                    gmax = Math.max( gmax , rsum );
                    if( rsum < 0 ){
                        rsum = 0 ; 
                    }  

                }
              return gmax; 
        
             }
        
    
}
