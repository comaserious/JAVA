package com.ohgiraffers.section02.test;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class WhileStatement {

    public void countNormal () {

        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }


    }

    public void countReverse () {

        int i = 10;
        while (i>0) {
            System.out.println(i);
            i--;
        }

    }

    public void Gugudan7 () {

        int i = 1;
        while (i<10) {
            System.out.println("7 * " +i+" = " +i*7);
            i++;
        }

    }

    public void evenNum () {

        int i = 0;
        while (true) {

            if (i>100){
                break;
            }
            System.out.println(i);
            i=i+2;
        }


    }
    public void factorial () {

        Scanner scr = new Scanner(System.in);
        System.out.print("팩토리얼 ? : ");
        int num = scr.nextInt();

        int i = 1;
        int res =1;

        while(true) {
            res *=i;
            if (i>=num){
                break;
            }
            i++;
        }
        System.out.println(res);

    }

    public void star01 () {

        Scanner scr= new Scanner(System.in);
        System.out.print("몇 열인가 : ");
        int row = scr.nextInt();
        int i = 1;

        while (i<=row) {
        int j =1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }
    }

    public void star02 () {

        Scanner scr = new Scanner(System.in);
        System.out.print("몇 줄인가 : ");
        int row = scr.nextInt();
        int i =1;
        while (i<=row) {
            int j =1;
            while (j<=row-i){
                System.out.print(" ");
                j++;

            }
            int k =1;
            while (k<=2*i-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

    }

    public void star03 () {

        Scanner scr = new Scanner(System.in);
        System.out.print("몇 줄인가 : ");
        int row = scr.nextInt();

        int i = 1;

        while(i<=row){
            int j = 1;
            while (j<=row-i){
                System.out.print(" ");
                j++;
            }
            int k =1;
            while (k<=i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;

        }



    }



}
