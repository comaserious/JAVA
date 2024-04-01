package com.ohgiraffers.section01.thread;

public class Plane implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<1000;i++){
            System.out.println("비행기를 타고가요");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
