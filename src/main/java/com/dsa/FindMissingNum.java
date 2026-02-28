package com.dsa;

public class FindMissingNum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7};
        int n = 7;
        int total = n *(n +1 ) /2;
        int sum =0;
        for (int x : arr)
            sum +=x;
        System.out.println(total - sum);
    }
}
