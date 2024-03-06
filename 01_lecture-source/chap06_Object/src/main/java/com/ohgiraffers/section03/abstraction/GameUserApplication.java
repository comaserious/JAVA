package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class GameUserApplication {

    public static void main(String[] args) {

        Game game = new Game();
        Scanner scr = new Scanner (System.in);
        while (true){
            System.out.print("1. 카드를 뽑을 까요? 2. 그만둘까요?");
            int order = scr.nextInt();
            if(order ==1){
            game.getCardShape();
            game.whatGame();}

            else {
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }


    }
}
