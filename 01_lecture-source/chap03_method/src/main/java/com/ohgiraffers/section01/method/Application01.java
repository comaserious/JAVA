package com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 메소드의 호출 흐름에 대해 이해할수 있다*/

        /*필기.
        *  메소드란 ?
        *  메소드(Method) 는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라 할수 있다*/

        System.out.println("main () 메소드 시작됨......");

        /*목차. 1. 작성한 메소드를 호출하는 부분을 작성한다*/

        /*필기.
        *  메소드 호출 방법
        *   클래스명 사용할이름 = new 클래스명();
        *   사용할이름.메소드명();
        * */

        Application01 app1 = new Application01();

        app1.methodA();

//        app1.methodB();


        System.out.println("main () 메소드 종료됨 .....");


    }

    public void methodA() {

        System.out.println("methodA () 등장~");

        methodB();

        System.out.println("methodA () 퇴장~");




    }

    public void methodB() {

        System.out.println("methodB () 나옴");

//        methodA(); // 순환에 빠져버린다

        System.out.println("methodB () 죽음");




    }




}
