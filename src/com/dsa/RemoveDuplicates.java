package com.dsa;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5,5, 4, 5, 9, 6, 7,6,};
        List<Integer> arr2 = new ArrayList<>();
       int duplicate = 0;
        for(int i : arr){
           if(arr2.contains(i)){
               duplicate= i;
               System.out.println("Duplicate element is "+ duplicate);
           }
           else arr2.add(i);
        }

    }
}
