package com.ohgiraffers.section01.thread;

public class Car extends Thread{

    @Override
    public void run() {

        for(int i = 0 ; i<1000 ;i++){
            System.out.println("차가 움직이고 있습니다!!!");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
