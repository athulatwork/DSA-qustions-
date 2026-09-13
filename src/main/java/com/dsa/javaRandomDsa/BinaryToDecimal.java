package com.dsa;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary= 11001;
        int pow =0;
        int decimal =0;
        while (binary >0 ){
            int lastDigit = binary %10;
            decimal += lastDigit * Math.pow(2,pow );
            pow++ ;
            binary /= 10;

        }

        System.out.println(decimal);
    }
}
