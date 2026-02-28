package com.dsa;

import java.util.Arrays;

public class StackUsingArr {
    static int[] arr;

    StackUsingArr(int arr) {
        this.arr = new int[arr];
    }

     int top = -1;

    public int[] push(int x) {

        arr[++top] = x;
        return arr ;
    }
    public int pop(){
        int i = arr[top--];
        return i
                ;
    }
}
class Main{
    public static void main(String[] args) {
        StackUsingArr str = new StackUsingArr(3);
        int[] s =str.push(23);
        str.push(32);
        str.push(22);
        int t = str.pop();
        System.out.println(Arrays.toString(s));
        System.out.println(t);

        }

}
