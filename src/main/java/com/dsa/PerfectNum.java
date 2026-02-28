package com.dsa;

public class PerfectNum {
    public static void main(String[] args) {
        int x= 25;
        int root = (int )Math.sqrt(x);
       if ( root * root == x)System.out.println(x +" IS a perfect Num");
       else System.out.println(x+ " Is not perfect Number");
    }
}
