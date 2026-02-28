package com.dsa;

public class CountVowels {
    public static void main(String[] args) {
        String name ="Mango";
        int count =0;
        for (int i=0; i<name.length();i++){

            char ch =name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }
   System.out.println("No of vowels "+count);
    }
}
