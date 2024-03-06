package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement( ) {

        /*수업목표. break문 사용에 대한 흐름을 이해하고 적용할수 있다*/

        /*필기.
        *  break문은 반목문 내에서만 사용할수 있다
        *  해당 반복문을 빠져나올 때 사용하며, 반목문의 조건문 판단 결과와 상관없이
        *  반목문을 빠져 나올때 사용한다
        *  일반적으로 if(조건식) {break;}처럼 사용된다
        *  단, switch문은 반목문이 아니지만 예외적으로 사용한다*/

        /*필기. break문을 이용하여 무한루프를 사용한 1~100까지 합계 구하기*/

        int sum = 0;

        int i =1;
        while (true){

            sum +=i;

            /*필기. 반목문 조건과 별개로 반목문을 빠져나오기 위한 조건을 다시 작성*/
            if (i==100) {

                /*필기. i 가 100인 조건을 만족하는 경우 반복문을 빠져 나옴*/
                break;
            }

            i++;
        }

        System.out.println("1부터 100까지의 합 " + sum);

    }

    public void testSimpleBreakStatement02 () {

        /*필기. break는 모든 반복문을 종료하는 것이 아닌
         *       자신에게 인접한 반복문을 종료시킨다*/

        /*필기.
         *  구구단 2~9단 까지 출력
         *  각 단의 수가 5보다 큰 경우는 출력을 생략한다*/

        for (int i = 2; i < 10; i++) {

            for (int j = 1; j < 10; j++) {


                if (j > 5) {
                    break;
                }
                System.out.println(i + " * " + j + " = " + i * j);

            }
            System.out.println();


        }

    }

}
