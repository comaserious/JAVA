package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /*수업목표. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/

        /*필기.
         *  [for 문 표현식]
         *  for (초기식; 조건식; 증감식) {
         *       조건을 만족하는 경우 수행할 구문 (반복할 구문);
         *           }*/

        /*필기. 1부터 10까지 1씩 증가하면서 (10번) i 값을 출력하는 기본 반복문*/


        for (int i = 1; i <= 10; i++) {

            System.out.println("i = " + i);
        }


    }

    public void testForExample01() {

        /*수업목표. 무엇을 반복하는지 확인하여 반복문으로 개선할 수 있다*/

        /*필기. 5명의 학생이름을 입력받아 이름을 출력하자*/

        Scanner scr = new Scanner(System.in);

//        System.out.print("첫번째 학생의 이름을 작성하세요 : ");
//        String name01 = scr.nextLine();
//        System.out.println("첫번째 학생의 이름은 "+name01+"입니다");
//
//        System.out.print("두번째 학생의 이름을 작성하세요 : ");
//        String name02 = scr.nextLine();
//        System.out.println("두번째 학생의 이름은 "+name02+"입니다");
//
//        System.out.print("세번째 학생의 이름을 작성하세요 : ");
//        String name03 = scr.nextLine();
//        System.out.println("세번째 학생의 이름은 "+name03+"입니다");
//
//        System.out.print("네번째 학생의 이름을 작성하세요 : ");
//        String name04 = scr.nextLine();
//        System.out.println("네번째 학생의 이름은 "+name04+"입니다");
//
//        System.out.print("다섯번째 학생의 이름을 작성하세요 : ");
//        String name05 = scr.nextLine();
//        System.out.println("다섯번째 학생의 이름은 "+name05+"입니다");
//
//        System.out.println("다섯명의 학생이름을 입력받고 출력하는 기능 완료");


        /*필기.
         *   반복해야하는 내용?
         *   1.안내문구 출력
         *   2. 학생의 이름을 입력받아 변수 저장
         *   3. 저장된 이름을 출력*/

        /*필기.
         *  반복의 횟수는 1부터 5까지 1씩 증가하면서 총 5번을 반복한다*/

        for (int i = 1; i <= 5; i++) {

            System.out.print(i + "번째 학생의 이름을 작성하세요 : ");
            String name = scr.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + name + "입니다");
        }


    }

    public void testForExatmple02() {

        /*수업목표. 무엇을 반복하는지 확인하여 반복문으로 개선할수 있다(2)*/

        /*필기.
         *  문장 속에서 규칙 찾기
         *  1~10까지의 합계를 구하시오
         * */

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        int sum1 = 0;

        sum1 += num1;
        sum1 += num2;
        sum1 += num3;
        sum1 += num4;
        sum1 += num5;
        sum1 += num6;
        sum1 += num7;
        sum1 += num8;
        sum1 += num9;
        sum1 += num10;

        System.out.println("sum1 = " + sum1);

        int sum2 = 0;

        for (int i = 1; i <= 10; i++) {

            sum2 += i;
        }
        System.out.println("sum2 = " + sum2);

    }

    public void testForExample03() {

        /*수업목표. 무엇을 반복하는지 확인하여 반복문으로 개선할수 있다 (3)*/

        /*필기.
         *  5~10 사이의 난수를 발생시켜
         *  1부터 발생한 난수까지의 합계를 구해보자*/

        int ran = (int) (Math.random() * 6) + 5;

        /*필기. 뭔가를 더해서 담기 위해 sum 변수를 0으로 초기화*/

        System.out.println("ran = " + ran);
        int sum = 0;

        if (ran == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if (ran == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if (ran == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;

        } else if (ran == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;

        } else if (ran == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;

        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }
        System.out.println("1부터 " + ran + "까지의 합은 " + sum + "이다");

        System.out.println("==========================================================");

        /*필기. 반복문을 통한 개선*/

        int sum1 = 0;

        for (int i = 1; i <= ran; i++) {
            sum1 += i;

        }
        System.out.println("sum1 = " + sum1);

    }

    public void testForExample04() {

        /*필기.
         *   숫자 두 개를 입력 받아 작은 수에서 큰수 까지의 합계를 구하세요
         *   단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결한다*/

        Scanner scr = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요 : ");
        int first = scr.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int second = scr.nextInt();

        int sum = 0;

        if (first > second) {

            for (int i = second; i <= first; i++) {

                sum += i;

            }
            System.out.println(second + "부터 " + first + "까지의 합은 " + sum + "이다");
        } else {

            for (int i = first; i <= second; i++) {

                sum += i;
            }
            System.out.println(first + "부터 " + second + "까지의 합은 " + sum + "이다");
        }

        /*필기. 결국 작은 수 부터 시작해서 큰 수까지의 합계를 구하는 것이기 때문에
         *  first와 second 중 어느것이 큰수인지 확인하면
         *  작은 수 ~큰수 까지의 합을 구하는 로직을 바꿀수 있다*/

        int min = Math.min(first, second);
        int max = Math.max(first, second);
        int sum2 = 0;
        for (int i = min; i <= max; i++) {

            sum2 += i;

        }
        System.out.println("sum2 = " + sum2);

    }

    public void printSimpleGugudan() {

        /*필기.
         *  키보드로 2~9 사이의 구구단을 입력 받아
         *   2~9사이인 경우 해당 단의 구구단을 출력하고,
         *   그렇지 않은경우 "반드시 2~9사이의 양수를 입력해야 합니다" 출력*/

        Scanner scr = new Scanner(System.in);

        System.out.print("몇 단인가요 ? : ");
        int num = scr.nextInt();

        if (num >= 2 && num <= 9) {

            /*필기. 2~9 까지 입력한 경우 구구단 출력*/

//            System.out.println(num + "*" + 1 + "=" + num * 1);
//            System.out.println(num + "*" + 2 + "=" + num * 2);
//            System.out.println(num + "*" + 3 + "=" + num * 3);
//            System.out.println(num + "*" + 4 + "=" + num * 4);
//            System.out.println(num + "*" + 5 + "=" + num * 5);
//            System.out.println(num + "*" + 6 + "=" + num * 6);
//            System.out.println(num + "*" + 7 + "=" + num * 7);
//            System.out.println(num + "*" + 8 + "=" + num * 8);
//            System.out.println(num + "*" + 9 + "=" + num * 9);

            for (int i = 1 ; i <=9 ; i++) {


                System.out.println(num+" 곱하기 "+i+" 는 "+num*i );
            }
        }
        else {
            System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다");
        }


        }











    }


