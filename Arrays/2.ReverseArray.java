import java.util.*;
class ReverseArray{

    public static void main( String[] args ){

        try (Scanner scn = new Scanner(System.in )) {
            int n = scn.nextInt();

               int[] arr = new int[n];
               for( int i = 0 ; i < n ;  i++ ){
                arr[i] = scn.nextInt();
               }

                helper( arr );
               for( int i = 0 ; i < n ; i++ ){
                System.out.print( arr[i]+" " );
               }
        }


    }

    
     public static void helper( int[] arr ){

        int lo = 0 ; 
        int hi = arr.length-1;
        while( lo < hi ){
            int temp = arr[lo];
            arr[lo]  = arr[hi];
            arr[hi] = temp;
            lo++;
            hi-- ; 
        }

        return;  
        
      

     }





}