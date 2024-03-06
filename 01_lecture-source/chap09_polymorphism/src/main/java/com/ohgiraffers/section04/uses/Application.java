package com.ohgiraffers.section04.uses;

public class Application {

    public static void main(String[] args) {

        Car car = new FireCar();
        car.go();
        car.stop();
        ((FireCar)car).horn();

        Soundable car1 =new FireCar();
        car1.horn();



    }
}
