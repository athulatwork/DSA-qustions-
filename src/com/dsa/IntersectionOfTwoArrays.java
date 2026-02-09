package com.dsa;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1= {1,5,6,8,0,7};
        int[] arr2 = {7,5,3,11,6};
        for (int i = 0 ; i< arr1.length;i++){
            for(int j = 0 ;j < arr2.length; j++ ){
                if(arr1[i] == arr2[j]){

                    System.out.println("Intersection element is "+arr1[i]);
                }
            }
        }
    }
}
