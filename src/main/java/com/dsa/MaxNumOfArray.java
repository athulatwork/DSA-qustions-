package com.dsa;

public class MaxNumOfArray {
    public static void main(String [] args ) {
        int [] arr ={2,5,8,9,3,4,10,4};
        int max= arr[0];
        for(int x : arr){
            if(x> max){
                max =x;
            }
        }
        System.out.println(max);
    }
}