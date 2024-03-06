package com.ohgiraffers.test;

public class Application02 {

    public static void main(String[] args) {

        System.out.println("main 메소드 동작 실행함 ......");

        Application02 app2 = new Application02();

        app2.testMethod01(100);

        app2.testMethod02(100);

        System.out.println(app2.testMethod02(100));

        app2.testMethod03("lee ho jun",20,'M');


        System.out.println("main 메소드 동작 종료함 ......");





    }

    public void testMethod01 ( int num) {
        System.out.println(num++);



    }

    public int testMethod02 (int num    ) {

        return ++num;


    }
    public void testMethod03 (String name , int age, char gender) {

        System.out.println("내 이름은 "+ name + " 나이는 "+ age +  " 성별은 "+gender +"입니다");






    }


}
