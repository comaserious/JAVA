package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 객체배열에 대해 이해할 수 있다*/

        /*필기.
        *  객체배열은 레퍼런스 변수에 대한 배열이다
        *  생성한 인스턴스도 배열을 이용해서 관리하면
        *  동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다
        *  또한 반환값(return) 1 개의 값만 반환할 수 있기 때문에
        *  동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체 배열을 이용할 수 있다*/

        Car c1 = new Car("페라리",350);
        Car c2 = new Car("람보르기니",250);
        Car c3 = new Car("롤스로이스", 350);
        Car c4 = new Car("부가티",400);
        Car c5 = new Car("모닝",150);

        c1.driveMaxSpeed();
        c2.driveMaxSpeed();
        c3.driveMaxSpeed();
        c4.driveMaxSpeed();
        c5.driveMaxSpeed();

        // 매우 귀찮다 모든 레퍼런스변수에 해당하는 인스턴스를 할당해주어야한다
        System.out.println("==================================================================================");

        Car[] carArray = new Car[5];
        carArray[0] = new Car("페라리",350);
        carArray[1] = new Car("람보르기니",250);
        carArray[2] = new Car("롤스로이스",350);
        carArray[3] = new Car("부가티",400);
        carArray[4] = new Car("모닝",150);


        for(int i = 0; i<carArray.length;i++){
            carArray[i].driveMaxSpeed();
        }

        /*필기. 객체의 배열도 할당과 동시에 초기화 할수 있다*/

        Car[] carArray2 = {new Car("페라리",300), new Car("람보르기니",250), new Car("롤스로이스",350),new Car("부가티",400)
                , new Car("모닝", 150)};

        //향상된 for문도 사용가능하다
        for (Car c : carArray2){
            c.driveMaxSpeed();
        }






    }



}
