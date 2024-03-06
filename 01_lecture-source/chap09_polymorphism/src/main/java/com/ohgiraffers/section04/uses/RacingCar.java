package com.ohgiraffers.section04.uses;

public class RacingCar extends Car implements Soundable{
    @Override
    public void go() {
        System.out.println("레이싱카가 잽싸게 달려갑니다");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 순식간에 멈춥니다");
    }

    @Override
    public void horn() {
        System.out.println("경적따윈 없다 ");
    }
}
