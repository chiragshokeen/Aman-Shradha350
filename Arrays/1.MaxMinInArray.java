//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
import java.util.*;
class MaxMinInArray{

    static class Pair{
        int min ;
        int max ; 

        Pair(int min , int max){
            this.min = min ; 
            this.max = max ; 
        }

        public Pair() {
        }
        
    }


    /**
     * @param args
     */


     public static void main( String[] args ){

        Scanner scn = new Scanner(System.in );

        int n = scn.nextInt();
        int[] arr = new int[n]; 
        for( int i = 0 ; i < n ; i++ ){
            arr[i] = scn.nextInt();
        }

       // Pair ans = helper( arr );
       Pair ans = helper2( arr , 0 , arr.length -1  );
        System.out.println( ans.min +" " + ans.max );


    }

    //normal method - 2(n-2) + 2 comparisons
    // public static Pair helper( int[] arr ){

    //     int n = arr.length;
    //     Pair minmax = new Pair((int)1e9, -(int)1e9) ;

    //     if( arr.length == 1 ){
    //         return new Pair( arr[0] , arr[0] );
    //     }

    //     if( arr.length == 2 ){
            
    //         if( arr[0] > arr[1] ){
    //             minmax.max = arr[0];
    //             minmax.min = arr[1];
    //         }else{
    //             minmax.min = arr[1];
    //             minmax.max = arr[0];
    //         }

            
    //     }

    //     for (int i = 2; i < n; i++) {
    //         if (arr[i] > minmax.max) {
    //             minmax.max = arr[i];
    //         } else if (arr[i] < minmax.min) {
    //             minmax.min = arr[i];
    //         }
    //     }
 
    //     return minmax;


        
        
      

    // }

    // tournament method
    public static Pair helper2(int[] arr , int low , int high){
        
        Pair minmax = new Pair();
        Pair mml = new Pair(); //minmaxleft
        Pair mmr = new Pair(); //minmaxright
        int mid;
 
       
        if (low == high) { //base case 1
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }
 
        
        if (high == low + 1) { //base case 2
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            }
            else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
 
        /* If there are more than 2 elements */
        mid = (low + high) / 2;
        mml = helper2(arr, low, mid);
        mmr = helper2(arr, mid + 1, high);
 
        /* compare minimums of two parts*/
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        }
        else {
            minmax.min = mmr.min;
        }
 
        /* compare maximums of two parts*/
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        }
        else {
            minmax.max = mmr.max;
        }
 
        return minmax;


    }



    
}
