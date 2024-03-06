package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    /*목차 1. extends 키워드를 이용하여 Car 클래스 상속*/

    public RacingCar() {

        System.out.println("레이싱카 기본생성자 호출됨 ....");
    }
    /*목차 2. run() 오버라이드*/
    @Override
    public void run(){
        System.out.println("레이싱카 전속력으로 질주를 시작합니다!!!!!!!!!!!");
    }
    /*목차 3. soundHorn(), stop() 오버라이드*/
    @Override
    public void soundHorn(){
        System.out.println("레이싱카는 경적따윈 없다 밀어버린다");
    }
    @Override
    public void stop(){
        System.out.println("레이싱카가 멈춥니다");
    }

    /*필기.
    *  RacingCar 클래스는 상속만 받았을 뿐이지 거의 새로운 클래스를 만든거나 다름 없다(모든 메소드를 전부 재정의 했기 때문에)
    *  불필요하게 상속을 하는 경우 오히려 유지보수성에 악영향을 미친다
    * */



}
