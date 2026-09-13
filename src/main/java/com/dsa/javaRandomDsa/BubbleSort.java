package com.dsa;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {


        int[] arr = {2, 9, 8, 7, 6, 3, 4, 5, 11, 10};
        for(int j = 0 ; j < arr.length; j++){
        for (int i =0 ; i<arr.length -1 ;i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
    
            }
        }
        }
    System.out.println(Arrays.toString(arr));
    }
}