package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. Scanner 의 nextLine() 과 next()에 대해 구분하여 사용할수 있다*/

        /*필기.
        *   nextLine() : 공백을 포함한 한줄을 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다(공백문자 포함)
        *   next() : 공백문자나 개행문자(\n) 전까지를 읽어서 문자열로 반환한다(공백문자 포함하지 않음)*/

        /*목차 1. Scanner 객체 생성*/
        Scanner scr = new Scanner(System.in);

        /*목차 2. 문자열 입력*/
        /*목차 2-1. nextLine()*/

        System.out.print("인사말을 입력해주세요 : ");
        String greeting = scr.nextLine();  // hello world
        System.out.println(greeting);

        /*목차. 2-2. next()*/

        System.out.print("인사말을 \n입력해주세요 : ");
        String greeting01 = scr.next();   // hello world
        System.out.println(greeting01);


        System.out.print("난수의 갯수를 입력하세요 : ");
        int num = scr.nextInt();
        System.out.println(Math.random()*num);







    }


}
