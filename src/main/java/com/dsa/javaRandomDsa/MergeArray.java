package com.dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {10,9,32,5,7,31,4};
        int[] arr2={11,9,13,9,8,6,8};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr =new int[arr1.length + arr2.length];
        for(int i =0 ; i<= arr.length -1 ;i++){
            if(i<arr1.length){
                arr[i] = arr1[i];
            }
            else {
                arr[i] = arr2[i - arr1.length];
            }

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       System.out.println( arr.length);
    }
}
