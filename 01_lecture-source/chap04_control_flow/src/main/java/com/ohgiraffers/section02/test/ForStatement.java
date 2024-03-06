package com.ohgiraffers.section02.test;

import java.util.Scanner;

public class ForStatement {

    public void countNormal() {

        for (int i =1 ; i<11 ; i++) {

            System.out.println(i);

        }

    }
    public void countReverse() {

        for (int i =10 ; i >0; i--) {

            System.out.println(i);

        }

    }
    public void Gugudan7 () {

        for (int i = 1 ; i <10 ; i++) {

            System.out.println(i+" * "+7+" = "+i*7);

        }

    }
    public void evenNum () {

            System.out.println("1부터 100까지 짝수 : ");

        for (int i = 1 ; i<=100; i=i+2 ){

            System.out.print(i+" ");


        }


    }
    public void factorial () {

        Scanner scr = new Scanner(System.in);
        System.out.print("팩토리얼 할 정수를 입력하세요 : ");
        int num = scr.nextInt();
        int res = 1;

        for (int i =1 ; i <=num ; i++) {

            res *=i;
        }

        System.out.println(num+"의 팩토리얼은 "+res);

    }

    public void clock ()    {

        for (int i = 0 ; i<24;i++){
            for (int j = 0; j<60;j++){
                System.out.println(i+"시 "+j+"분" );
            }
        }
    }

    public void star01 () {

        Scanner scr = new Scanner(System.in);
        System.out.println("몇 행 ? : ");
        int row = scr.nextInt();

        for(int i =1 ; i <=row ; i++){
            for (int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public void star02 () {
        Scanner scr = new Scanner (System.in);
        System.out.print("몇줄인 적어주세요 : ");
        int row = scr.nextInt();

        for (int i =1 ; i <=row ; i++){

            for (int j =1 ; j <=row-i;j++) {
                System.out.print(" ");
            }
            for (int k =1 ; k <= 2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }

    public void star03 () {

        Scanner scr = new Scanner(System.in);
        System.out.print("몇 열인가 ? : ");
        int row = scr.nextInt();

        for (int i = 1 ; i<=row ; i++ ) {

            for ( int j = 1; j<=row-i ; j++) {
                System.out.print(" ");
            }
            for (int k =1 ; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();


        }
    }




}
