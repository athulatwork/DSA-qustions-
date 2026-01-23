package com.dsa;

public class ReverseString {
    public static void main(String[] args) {
        String name ="Messi";
        String  s = "";
        for (int i= name.length() -1;i>=0;i--){
            s +=name.charAt(i); 
        }
    System.out.println(s);
    }
}
