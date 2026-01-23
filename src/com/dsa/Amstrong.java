    package com.dsa;

public class Amstrong {
    public static void main(String[] args) {
       int n= 153;
       int temp = n;
       int sum=0;

       int r;

       while(n>0){
           r = n%10;
           n =n/10;
           sum += r*r*r;

       }if(sum == temp )
       System.out.print("it is amstrong "+sum);
       else System.out.println("not amstrong");
    }
}
