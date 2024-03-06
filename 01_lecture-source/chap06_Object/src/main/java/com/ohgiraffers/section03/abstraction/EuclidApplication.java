package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class EuclidApplication {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        EuclidGCD makingGCD = new EuclidGCD();

        System.out.print("첫번째 양의 정수를 입력하세요 : ");
        int first = scr.nextInt();
        System.out.println();
        System.out.print("두번째 양의 정수를 입력하세요 : ");
        int second = scr.nextInt();
        System.out.println();

        System.out.println(first+" 와 "+second+" 의 최대 공약수는 "+makingGCD.gcd(first,second));



    }
}
