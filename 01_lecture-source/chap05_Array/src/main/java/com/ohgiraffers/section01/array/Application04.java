package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {

        /*수업목표. 배열을 사용하는 예시를 이해하고 적용해보자 (2)*/

        /*필기.5명의 자바 점수를 정수로 입력 받아 합계와 평균을 실수로 구하는 프로그램*/

        int[] score = new int[5];
        Scanner scr = new Scanner(System.in);
        double sum =0;


        for(int i = 0 ; i<score.length; i++    ){

            System.out.print((i+1)+"번째 점수를 입력하세요 : ");

            score[i]=scr.nextInt();
            sum +=score[i];
        }
        double avr=sum/score.length;

        System.out.println("sum = " + sum);
        System.out.println("avr = " + avr);



    }
}
