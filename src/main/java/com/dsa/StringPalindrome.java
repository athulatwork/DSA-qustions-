package com.dsa;

public class StringPalindrome {
    public static void main(String[] args) {
       String name ="Malayalam".toLowerCase();

     String reve="";
     for(int i=name.length()-1; i>=0;i--){
       reve += name.charAt(i) ;
     }

      System.out.println(reve);
      if (name.equals(reve)){
          System.out.println(name +" "+reve + " are palindrome ");

      }else System.out.println("not palindrome ");
    }
}
