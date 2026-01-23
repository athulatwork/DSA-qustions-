package com.dsa;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,7,5,4,9,6,3,1};
      int index=  Arrays.binarySearch(arr,5);
        System.out.print(index);
    }
}
