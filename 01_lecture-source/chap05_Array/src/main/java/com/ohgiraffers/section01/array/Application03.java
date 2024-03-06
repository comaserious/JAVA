package com.ohgiraffers.section01.array;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 배열을 사용하는 예시를 이해하고 적용해보자*/

        /*필기. 랜덤한 카드를 한장 뽑아서 출력해보자*/

        String[] shape = {"spade", "clover", "heart", "diamond"};
        String[] carNumbers = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "jack", "queen", "king", "10"};

        int randomShapeIndex =(int)(Math.random()*shape.length);
        int randomNumberIndex = (int)(Math.random()*carNumbers.length);

        System.out.println("당신이 뽑은 카드는 : " +shape[randomShapeIndex]+" "+carNumbers[randomNumberIndex]+" 카드입니다");

    }
}
