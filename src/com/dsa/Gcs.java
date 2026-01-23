package com.dsa;

public class Gcs {
    public static void main(String[] args) {
        int num1 =81;
        int num2 = 18;

        int gca = 1;
        for (int i  = 1; i<= num1 && i <= num2;i++){

            if(num1  % i == 0 && num2 % i == 0){
                gca = i;
            }
        }
        System.out.println(gca);
    }
}
