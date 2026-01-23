package com.dsa;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s="silent";
        String y = "listen";
        char[]  a= s.toCharArray();
        char[] b= y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
       System.out.println( Arrays.equals(a,b));
    }
}
