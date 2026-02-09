package com.dsa;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,7,5,4,9,6,3,1};
        int target=3;
        int low =0 ; 
        int high = arr.length - 1;
     Arrays.sort(arr);
      while(low <= high){
       int mid = (low + high )/2;
         if(arr[mid ]== target ){
          System.out.println("Element found at "+ mid );
         }
         else if(mid <= target ){
          low = mid + 1 ;

         }
         else{
          high  = mid + 1 ;
         }
      }
    }
}
