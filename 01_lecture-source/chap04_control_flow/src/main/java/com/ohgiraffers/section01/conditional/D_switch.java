package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        /*수업목표. switch문 단독 사용에 대한 흐름을 이해하고 적용할수 있다*/

        /*필기.
        *  [switch 문 표현식]
        *  switch(비교할 변수) {
        *         case 비교값1 : 비교값1 과 일치하는 경우 실행할 구문; break;
        *         case 비교값2 : 비교값2 과 일치하는 경우 실행할 구문; break;
        *         default : case에 모두 해당하지 안허는 경우 실행할 구문; break;
        *          }
        *         */

        /*필기.
        *  여러개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
        *  if-else-if와 유사하다.
        *  따라서 일부 호환이 가능하다
        *  하지만 switch문으로 비교가능한 값은 정수, 문자, 문자열의 형태이다
        *  실수와 논리값은 비교할 수 없다
        *  또한 정확하게 일치하는 경우만 비교할 수 있으며, 대소비교를 할수 없다는게
        *  차이점이다
        * */

        /*필기.
        *  정수 두 개와 연산 기호 문자를 입력 받아서
        *  두 숫자의 연산 결과를 출력해보는 간단한 계산기를 만들어보자*/

        Scanner scr = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = scr.nextInt();

        System.out.print("두 번째 정수를 입력해주세요 : ");
        int second = scr.nextInt();

        System.out.print("연산 기호(+ - * / % )를 입력해주세요 : ");
        char cal = scr.next().charAt(0);

        /*연산의 결과를 저장할 변수 생성*/
        int result=0;

        /*입력한 연산 기호 문자에 따라 연산의 결과가 달라짐*/
        switch (cal) {
            case '+' :
                result = first+second;
                break;

            case '-' :
                result = first - second;
                break;

            case '*' :
                result = first * second;
                break;

            case '/' :
                result = first/second;
                break;

            case '%' :
                result = first%second;
                break;


        }

        System.out.println(first + " "+ cal+ " "+second+ " = " + result);








    }

    public void testSwitchVendingMachine() {

        /*수업목표. switch문 내의 break문 에 대해 흐름을 이해하고 적용할수 있다*/

        /*필기. switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트*/

        /*필기. switch문을 이용한 간단한 자판기 만들어보기*/
        System.out.println("======================HiMedia 자판기===============================");

        System.out.println("사이다 환타 콜라 솔의눈 닥터페퍼");
        System.out.println("==================================================================");
        System.out.print("음료를 선택해주세요 : ");
        Scanner scr = new Scanner(System.in);
        String drink = scr.nextLine();

        /*원하는 음료에 맞는 가격을 저장할 변수*/
        int price = 0;

        switch (drink) {
            case "사이다" :
                System.out.println("선택하신 음료는 사이다");
                price = 1500;
                break;

            case "환타" :
                System.out.println("선택하신 음료는 환타");
                price = 2000;
                break;

            case "콜라" :
                System.out.println("선택하신 음료는 콜라");
                price = 2300;
                break;

            case "솔의눈" :
                System.out.println("선택하신 음료는 솔의눈");
                price = 1600;
                break;

            case "닥터페퍼" :
                System.out.println("선택하신 음료는 닥터페퍼");
                price=2100;
                break;

        }
        System.out.println(price+"원 입니다");





    }
}
