package com.ohgiraffers.section04.scanner;

import java.util.Scanner;  //필기. 자동으로 Scanner의 import 선언문이 작성된다

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. java.util.Scanner 를 이용한 다양한 자료형 값 받아보기*/

        /*목차. 1. Scanner 객체 생성*/
        //Application app = new Application ();

        /*목차. 1-1. 원래는 이렇게 Scanner 객체를 만들어야 한다*/
//        java.util.Scanner scr = new java.util.Scanner (System.in) ;

        /*목차. 1-2. 다른 패키지에 있는 클래스 사용 시 패키지명을 생략하기 위해서 import를 사용*/

        Scanner scr = new Scanner (System.in);

        /*목차.  2. 자료형별 값 입력받기*/
        /*필기. nextLine(): 입력받은 값을 문자열로 반환해줌*/

        System.out.print("이름을 입력해주세요 : ");
        String name = scr.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        /*목차 2-1. 정수형 값 입력 받기*/
        /*필기. nextInt() : 입력받은 값을 정수로 반환해줌*/

        System.out.print("정수를 입력해주세요 : ");
        int num = scr.nextInt();
        System.out.println("입력하신 정수는 "+ num + "입니다");

        /*필기. nextLong() : 입력 받은 값을 long 형으로 반환한다*/
        System.out.print("금액을 입력해주세요 : ");
        long lnum = scr.nextLong();
        System.out.println("입력하신 금액은 "+lnum + "입니다");

        /*필기. nextFloat() : 입력 받은 값을 float 형으로 반환한다*/
        System.out.print("키를 입력해주세요 : ");
        float height = scr.nextFloat();
        System.out.println("당신의 키는 "+height+"입니다");

        /*필기. nextDouble() : 입력 받은 값을 double 형으로 반환한다*/
        System.out.print("당신의 점수를 입력해주세요 : ");
        double point = scr.nextDouble();
        System.out.println("당신의 점수는 : "+point + "점 입니다");

        /*필기. nextBoolean : 입력 받은 값을 boolean 형으로 반환한다*/
        System.out.print("참과 거짓중 한가지를 true or false로 입력해주세요");
        boolean logic = scr.nextBoolean();
        System.out.println("당신이 입력한 논리값인 "+logic+"입니다");

        /*목차. 2-5. 문자형 값 입력받기*/
        scr.nextLine();
        System.out.print("아무 문자나 입력해주세요 : ");
        char ch = scr.nextLine().charAt(3);                    //index 숫자체계 : 0부터 시작하는 정수
        System.out.println("입력하신 문자는 "+ ch+ "입니다");












    }





}
