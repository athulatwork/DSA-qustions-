package com.dsa;

class FibinoSeries {
    public static void main(String[] args) {
        int x= 10;
        int a=0;
        int b=1;
        for(int i=0  ;i< x;i++){
            System.out.println(a+"  ");
            int c = a+b;
            a=b ;
            b=c ;
        }

    }
}
