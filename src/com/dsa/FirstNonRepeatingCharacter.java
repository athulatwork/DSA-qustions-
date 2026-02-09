package com.dsa;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        
    
    String word ="hhaiiiamdeveloper";
    int [] freq = new int[256];

    for(int i = 0 ; i< word.length(); i ++){
        freq[word.charAt(i)]++;
    }
    for(int i =0 ; i< freq.length;i++ ){

        if(freq[word.charAt(i)] == 1){
            System.out.println("First non repeating character ="+ word.charAt(i) );
            break;
        }
    }
}
}
