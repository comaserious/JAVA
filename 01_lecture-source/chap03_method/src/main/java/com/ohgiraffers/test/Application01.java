package com.ohgiraffers.test;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 메소드의 호출 흐름을 연습해보자*/

        System.out.println("main 프로그램이 시작됩니다 ........");

        Application01  app1 = new Application01 ();

        app1.testMethod01();




        System.out.println("main 프로그램이 모든 작없을 종료 후  없어집니다 ......");





    }
    public void testMethod01 () {

        System.out.println("안녕 나는 testMethod01 이야 불렀니 ? ");

        testMethod02();

        System.out.println("나는 내 용무를 마쳤으니 돌아가볼께");


    }
    public void testMethod02 () {

        System.out.println("하이 나는 testMethod02 ");

        System.out.println(testMethod03());   //값 자체를 출력문에 넣어 출력을 한 상태이다

        String hi = testMethod03();  //값을 String type이라는 박스에 선언 및 초기화를 한것이다

        System.out.println(hi);


        System.out.println("그만 testMethod02는 간다");
    }

    public String testMethod03 () {


        return "hello world";


    }










}
