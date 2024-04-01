package com.ohgiraffers.section01.thread;

public class Tank extends Thread{

    @Override
    public void run() {

        for(int i = 0 ;i<1000;i++){
            System.out.println("탱크로 밀어벌일꺼야");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
