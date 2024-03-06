package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;
    private static int count1;

    public void nonStaticMethod()   {
        this.count++;
        System.out.println("nonStaticMethod 호출됨...");
    }

    public static void staticMethod() {
//        this.count++;            인스턴스를 생성하지 않고 사용하는 메소드 이기 때문에 this에는 주소가 들어갈 수 없다
                                    //뿐만 아니라 스태틱은 프로그램 시작시 이미 인식 하기때문에 인스턴스변수는 인식 할 수 없다
                                    //왜냐하면 프로그램 시작시 아직 인스턴스가 없기 때문이다
        System.out.println("staticMethod 호출됨...");
    }


}
