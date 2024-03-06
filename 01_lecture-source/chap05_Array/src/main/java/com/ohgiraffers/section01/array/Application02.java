package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        int[] iarr = new int[5];
        char[] carr = new char[10];

        System.out.println("iarr = " + iarr);
        System.out.println("carr = " + carr);

        //123456789abcdef  16진수

        /*필기.
        *  hascode() : 주소값을 10진수로 변환하여 객체의 고유한 정수값을 반환
        *              동일한 객체인지 비교할 때 사용*/

        System.out.println("iarr = "+ iarr.hashCode());
        System.out.println("carr = "+ carr.hashCode());

        // 스캐너를 통해 입력받은 정수로 배열 길이를 지정하여 배열 할당 연습

        Scanner scr = new Scanner(System.in);
        System.out.print("새로 할당할 배열의 길이를 입력히세요 : ");
        int size = scr.nextInt();

        int[] iarr2 = new int[size];
        System.out.println("iarr2 의 hascode : "+iarr2.hashCode());
        System.out.println("iarr2 의 길이 : "+iarr2.length);

        /*필기. 하지만 한 번 지정한 배열의 크기는 변경하지 못한다*/
        iarr2 = new int[20];
        System.out.println("iarr2 의 hascode : "+iarr2.hashCode());
        System.out.println("iarr2 의 길이 : "+iarr2.length);

        // 동일한 주소가 나오지 않는것을 보면 배열의 칸수가 바뀌면서 원래 있던 상자의 칸수가 많아지는 것이 아닌 새로운 상자를 할당 받아 지정한 칸수를 넣은것이다



    }
}
