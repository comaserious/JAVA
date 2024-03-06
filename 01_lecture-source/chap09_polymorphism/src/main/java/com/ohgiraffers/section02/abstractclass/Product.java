package com.ohgiraffers.section02.abstractclass;

public abstract class Product { // 클래스선언부에 abstract키워드를 명시해주어야 한다 그래야 추상메소드에서 컴파일 에러가 발생하지 않는다

    // 추상클래스는 필드를 가질 수 있다
    private int nonStaticField;
    private static int staticField;

    //추상클래스는 생성자를 가질 수 있다
    //하지만 직접적으로 인스턴스를 생성할 수는 없다
    public Product() {}

    //추상클래스는 일반적인 메소드도 가질 수있다
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStatic 메소드 호출....");
    }
    public static void staticMethod() {
        System.out.println("Product 클래스의 static 메소드 호출....");
    }

    /*필기. 추가적으로 미완성 메소드(추상메소드)또한 만들 수 있다*/

    public abstract void abstMethod(); //구현부 {}를 붙이지 않는다



}
