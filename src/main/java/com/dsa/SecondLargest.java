package com.dsa;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int []arr = {3,5,3,1,9,4,6,8,7};
      int largest =0;
      int second = 0 ;
      for (int i = 0 ; i < arr.length ; i++){
          if (arr[i] > largest){
              second = largest;
              largest = arr[i];
          }
          else if(arr[i]< largest && arr[i]> second){
              second  = arr[i];
          }
      }
      System.out.println("Second Largest is "+ second);
    }
}
