package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;    //시동은 꺼졌다 켜지는것 두가지만 있으니 .....초기에는 false 시동이 꺼진 상태이다
    private int speed;

    /*시동이 걸려있는 상태인 경우 할일이 없고, 시동이 걸려있지 않으면 시동을 건다*/
    public void starUp() {

        if(isOn) {
            System.out.println("이미 시동이 걸려있는 상태입니다");
        }
        else {
            this.isOn = true;
            System.out.println("시동을 걸겠습니다. 이제 출발할 준비가 되었습니다");
        }

    }
    public void go() {

        if(isOn){
            System.out.println("차가 앞으로 움직입니다");
            this.speed +=10;
            System.out.println("현재 차의 시속은 "+this.speed+"km/s 입니다");
        }
        else {
            System.out.println("시동을 먼저 거십시오");
        }
    }
    public void stop() {
        if (isOn) {

            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 자동차가 멈췄습니다");
            } else {
                System.out.println("이미 멈춰있는 상태입니다");
            }
        }
        else{
            System.out.println("차의 시동이 걸려있지 않은 상태입니다. 시동을 먼저 거십시오");
        }
    }
    /*시동이 걸려있는 상태인경우 시동을 끄고 이미 꺼진 상태라면 끌수 없다*/
    public void turnOff() {

        if(isOn){
            if(this.speed>0){
                System.out.println("자동차가 운행중입니다 우선 멈춰주세요");
            }
            else {
                this.isOn=false;
                System.out.println("시동을 껐습니다 운행을 멈춥니다");
            }
        }
        else {
            System.out.println("이미 시동은 꺼져있습니다");
        }



    }

}
