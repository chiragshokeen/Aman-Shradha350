 //https://leetcode.com/problems/contains-duplicate/
 import java.util.*;
 class ContainsDuplicate {

    public static void main( String[] args ){

            Scanner scn = new Scanner(System.in );
        
               int n = scn.nextInt() ;
               int[] arr = new int[n];
               for( int i = 0 ; i < n ; i++ ){
                arr[i] = scn.nextInt() ;

               }
        
               Set<Integer> set = new HashSet<>() ;
               for( int ele : arr ){
                   if( set.contains(ele) ) {
                    System.out.println("true"); 
                    return ;
                }
                   set.add(ele) ;
               }
               System.out.println("false");
        
        }
        
            


    
}
