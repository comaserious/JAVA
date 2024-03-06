package com.ohgiraffers.section02.looping;

public class Fibonacci {

    public void fibonacciMethod (int index) {

        int x1=1;
        int x2=1;
        int x3 =0;


    for (int i = 1 ; i <=(index-2) ; i++) {

        x3=x1+x2;

        System.out.println((i+2)+"번째 항의 값은 "+x3+"입니다");

        x1=x2; x2=x3;







    }

    }
}
