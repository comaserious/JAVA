package com.ohgiraffers.section01.polymorphism;

public class 호랑이 extends 동물{

    public 호랑이 () {

        // super() 가 자동으로 숨겨져 있다
    }

    @Override
    public void 먹기() {
        System.out.println("호랑이가 고기를 먹고 있다");
    }
    @Override
    public void 달리기() {
        System.out.println("호랑이는 뛰지 않는다");
    }
    @Override
    public void 울기 () {
        System.out.println("어흥");
    }
    public void 물어뜯기() {
        System.out.println("우와아아아ㅏㅇ");
    }

}
