package com.dsa;

public class FindFrequency {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,2,3,4,5,6,7,7,6};
        int[] freq = new int[arr.length ];
        for (int i = 0 ; i< arr.length;i++){
            freq[arr[i]]++;

        }
        for(int i = 0 ; i< freq.length; i++){
            if(freq[i]>0 ){
                System.out.println(i +" -> "+ freq[i]);
            }
        }
    }
}
