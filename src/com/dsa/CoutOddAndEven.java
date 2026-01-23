package com.dsa;

public class CoutOddAndEven {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 9, 6, 5, 4, 8,43, 4, 3};
        int odd = 0;
        int even = 0;
        for (int x : arr) {
            if(x%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Total Odd " + odd);
        System.out.println("Total even "+ even);
    }
}
