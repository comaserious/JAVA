package com.ohgiraffers.section02.test;

import java.util.Scanner;

public class Error {

    public void error () {

        Scanner scr = new Scanner(System.in);


        for( String str = "" ; !str.equals("exit"); ) {
            System.out.print("문자열을 입력하세요 : ");
            str=scr.nextLine();
            System.out.println(str);

        }
        System.out.println("프로그램 종료");


    }

    public void forInfinite () {
        int sum = 0;

        for (int i = 1; true; i++) {

            sum +=i;

            if (i>=100){
                break;
            }

        }
        System.out.println(sum);



    }
}
