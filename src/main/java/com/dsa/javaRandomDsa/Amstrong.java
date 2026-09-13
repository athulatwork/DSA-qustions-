    package com.dsa;

    import java.util.Scanner;

    public class Amstrong {
    public static void main(String[] args) {
       int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
       int temp = n;
       int sum=0;
       int digits =0 ;


       while(temp>0){
           digits++;
          temp /=10;
       }
       temp = n;
       while (temp > 0 ){
           int digit = temp %10;
           sum += Math.pow (digit, digits);
           temp /= 10;
       }
       System.out.println(digits);
       if(sum == n )
       System.out.print("it is amstrong "+sum);
       else System.out.println("not amstrong");
    }
}
