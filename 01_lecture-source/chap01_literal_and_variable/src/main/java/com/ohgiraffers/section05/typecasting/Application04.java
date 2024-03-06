package com.ohgiraffers.section05.typecasting;

public class Application04 {

    public static void main(String[] args) {

        /*수업목표. 형변환 시 주의할 점을 이해하고 사용할수 있다.*/
        /*필기.
        *  형변환 사용시 주의 할 점
        *  데이터 손실에 유의해서 사용해야한다!!!!!!!!!!!!!!!*/

        /*목차. 1. 의도하지 않은 데이터 손실*/

        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum = " + inum);
        System.out.println("bnum = " + bnum);

        /*목차. 의도한 데이터 손실*/

        double height = 175.5;
        int floorHeight = (int)height;
        System.out.println("height = " + height);
        System.out.println("floorHeight = " + floorHeight);  //소수점 절삭에 사용




    }
}
