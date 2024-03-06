package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void simpleTestIfelseIfStatement() {

        /*수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/

        /*필기.
        *  [if-else-if문 표현 방식]
        *  if(조건식1) {
        *             조건식 1이 true일 때 실행할 명령문;
        *             }
        *             else if (조건식2) {
        *                              조건식1이 false이고 조건식2가 true일때 실행할 명령문;
        *                               }
        *                               else {
        *                                     위의 조건 2가지가 모두 거짓인 경우 실행할 명령문;
        *                                     }
        *  */

        /*필기.
        *  if-else-if문은 조건식1의 결과값이 true이면 if {}안에 있는 코드를 실행
        *  조건식1이 false 이면 조건식 2를 확인하여 true이면 else if {}안에 있는 코드를 실행한다
        *  조건식1과 조건식2의 결과 값이 모두 false이면 else {}안에 있는 코드 실행*/

        //여러개의 조건을 제시하여 그중 한가지를 반드시 실행시키고 싶은 경우 사용한다

        System.out.println("산속에 나무를 하던 나무꾼이 연못에 도끼를 빠뜨렸다.......");
        System.out.println("나무꾼이 어쩔 줄 몰라하던 그때 .........");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다");

        Scanner scr = new Scanner(System.in);

        System.out.print("어느 도끼가 너의 도끼이느냐 ? (1.금도끼 2.은도끼 3.쇠도끼) : ");
        int answer = scr.nextInt();
        if (answer==1){
            System.out.println("이런 거짓부렁 썩 돌아가라");
        }
        else if (answer==2){
            System.out.println("애매하게 욕심 많은것 돌아가라");
        }
        else if(answer ==3){

            System.out.println("정직한 청년 전부다 다 가져가라");
        }
        else{
            System.out.println("멍청한 놈이군");
        }

        System.out.println("그렇게 산신령은 돌아갔다");






    }
}
