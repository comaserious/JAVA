package com.ohgiraffers.section01.polymorphism;

public class 토끼 extends 동물{

    public 토끼() {
        //super(); 가 숨겨져있다
    }

    @Override
    public void 먹기(){
        System.out.println("풀을 먹습니다");
    }

    @Override
    public void 달리기() {
        System.out.println("깡총깡총 뜁니다");
    }

    @Override
    public void 울기() {
        System.out.println("토끼는 울지 않습니다");
    }
    public void 점프() {
        System.out.println("토끼가 하늘높이 뛴다");
    }

}
