package com.dsa;

public class PrimeOrNot {
    public static void main(String[] args) {
     int x =98;
     boolean flag = false;
     for (int i =2; i <= x/2;i++){
         if (x% i == 0 )
             flag = false;
         else flag= true ;

     }
        System.out.print("IS prime "+flag);
    }

}
