package com.dsa;

import java.util.Arrays;

public class RotateArrayKSteps {
    public static void main(String[] args) {
        
    
    int[] arr={1,2,3,4,5};
     int k = 2 ;
    int [] temp = new int[k];
     int pos=0;
    for(int i = 0 ; i< k ; i++){
    temp[i]= arr[i];
    }
    for(int i = k; i< arr.length ;i++){
     arr[pos]= arr[i];
     pos++;
    }
    for(int i=0 ; i<temp.length;i++){
        if(pos< arr.length){
       arr[pos]= temp[i];
       pos++;
    }}
    System.out.println(Arrays.toString(arr));
}
}