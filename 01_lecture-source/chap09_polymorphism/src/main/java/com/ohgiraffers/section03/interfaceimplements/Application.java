package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 인터페이스(interface) 에 대해 이해 할수 있다*/

        /*필기.
        *  인터페이스(interface)
        *  인터페이스는 자바의 클래스와 유사한 형태이지만,
        *  추상메소드와 상수필드만 가질 수 있는 클래스의 변형체를 말한다*/

        /*필기.
        *  인터페이스 사용 목적
        *  1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용한다.(표준화)
        *  2. java의 단일 상속의 단점을 극복할 수 있다 (다중상속을 가능하게 한다)*/

        /*필기. 인스턴스를 생성하지 못하고, 생성자 자체가 존재하지 않는다*/
//        InterProduct inter = new InterProduct();

        /*필기. 레퍼런스타입으로만 사용이 가능하다*/
        InterProduct inter = new Product();

        /*필기. 인터페이스의 추상화메소드 오버라이딩한 메소드로 동적바인딩에 의해 호출*/
        inter.nonStaticMethod();
        inter.absMethod();
        InterProduct.staticMethod();
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(inter.MAX_NUM);
        System.out.println(inter.MIN_NUM);
        InterProduct in1 = new Product();
        //inteface inter = new implentation02

    }
}
