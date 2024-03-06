package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {


    public void testSimpleIfElseStatement () {

    /*수업목표. if-else문 단독 사용에 대한 흐름을 이해하고 적용할수 있다*/

    /*필기.
    *  [if-else문 표현식]
    *  if(조건식) {
    *         조건식이 true일 경우 실행할 명령문;
    *           }
    *  else {
    *         조건식이 false일 경우 실행할 명령문;
    *        }
    * */

    /*필기.
    *   if 문은 조건식의 결과 값이 참(true)이면 if {} 안에 있는 코드를 실행하고
    *   조건식의 결과값이 거짓(false)이면 else {}안에 있는 코드를 실행한다*/

    /*필기. 정수 한개를 입력받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다"
    *      라고 출력하고 홀수가 아니면 "입력하신 숫자는 짝수입니다"라고 출력하는 프로그램을 작성하시오
    *      단, 조건과 상관없이 프로그램이 종료 될때 "프로그램이 종료됩니다"라고 출력되도록 하자*/

        Scanner scr = new Scanner(System.in);

        System.out.print("숫자 하나를 입력하시오 : ");

        int num = scr.nextInt();

        if (num%2 != 0 ) {
            System.out.println("입력하신 숫자는 홀수 입니다");
        }
        else {
            System.out.println("입력하신 숫자는 짝수 입니다");
        }
        System.out.println("프로그램이 종료됩니다");

    }
    public void testNestIfElseStatement() {

        /*수업목표. 중첩된 if-else 문의 흐름을 이해하고 적용할수 있따*/

        /*필기. 중첩된 if-else문 실행 흐름확인*/

        /*필기.
        *  숫자 하나를 입력 받아 양수이면 "입력하신 숫자는 양수입니다" 출력
        *  음수이면 "입력하신 숫자는 음수입니다" 출력
        *  단, 0이면 "0입니다" 라고 출력하세요*/


        Scanner scr = new Scanner (System.in);
        System.out.print("숫자를 하나 입력하세요 : ");
        int num = scr.nextInt();
        if (num != 0) {

           if (num>0){

               if(num%2==0){
                   System.out.println("입력하신 숫자는 양수이면서 짝수입니다");
               }
               else {

               System.out.println("입력하신 숫자는 양수이면서 홀수입니다");
               }
           }
           else {

               System.out.println("입력하신 숫자는 음수입니다");
           }

        }
        else{

        System.out.println("입력하신 숫자는 0입니다");
        }




    }
}
