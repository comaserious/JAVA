package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine() {

        /*수업목표. 중첩된 for문의 흐름을 이해하고 적용할수 있다(1)*/

        /*필기. for문 안에서 for문을 이용할 수 있다*/

        for (int i = 2 ; i<=9; i++) {

                System.out.print(i+"단 결과 : ");
            for (int j =1 ; j <=9 ; j++) {
                System.out.print(" "+i*j);
            }

            System.out.println();

        }
    }

    public void printUpgradeGugudan() {

        for(int i = 2; i <10 ; i++) {

            printGugudanOf(i);

            System.out.println();

        }

    }

    public void printGugudanOf (int i) {

        for (int j =1 ; j<10 ; j++) {

            System.out.println(i+"*"+j+"="+(i*j));
        }
    }

    public void printStarInputRowTimes ( ){

        /*필기.
        *  키보드로 정수를 하나 입력 받아 해당 정수 만큼 한행에 '*'를 5개씩 출력하시오*/

        Scanner scr = new Scanner(System.in);

        System.out.print("몇 행 ? : ");
        int row = scr.nextInt();

        for (int i =1 ; i <=row; i++) {

//            System.out.println("*****");               //그냥 다섯개를 붙여도 되지만 하나씩 붙이는 연습을 해보자
//            System.out.println();

            for (int j = 1 ; j <6; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pritnStarInputRowTimes02 () {

        Scanner scr = new Scanner(System.in);
        System.out.print("몇 행 ? : ");
        int row = scr.nextInt();

        for (int i=1 ; i <=row ; i++) {
            for (int j =1 ; j <=i; j++){

                System.out.print("*");
            }
            System.out.println();


        }
    }

}
