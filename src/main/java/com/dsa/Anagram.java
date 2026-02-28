package com.dsa;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "silent";
        String y = "listen";
        char[] a = s.toCharArray();
        char[] b = y.toCharArray();
       


        // Sort array b
        /*for (int i = 0; i < b.length; i++) {
            for (int j = 1; j < b.length; j++) {
                if (b[j] < b[j - 1]) {
                    char temp = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = temp;
                }
            }
        }*/
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }


        // Sort array b
        for (int i = 0; i < b.length-1; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (b[j] > b[j + 1]) {
                    char temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
       

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a, b));
    }}
