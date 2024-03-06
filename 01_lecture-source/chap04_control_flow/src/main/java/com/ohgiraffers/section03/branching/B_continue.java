package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement () {

        /*수업목표. continue문 사용에 대한 흐름을 이해하고 적용할수 있다*/

        /*필기.
        *  continue문은 반목문 내에서 사용한다
        *  해당 반목문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다
        *  일반적으로 if (조건식) {continue;} 처럼 사용된다
        *  보통 반목문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용됨*/

        /*필기. 1부터 100 사이의 4배수이면서, 5의 배수인 값 출력*/


        for (int i = 1 ; i<=100; i++) {

            if (i%4==0 && i%5==00){

                /*필기. i값이 4와 5의 공배수인 경우 i값 출력*/
                System.out.println(i);
            }
            else {

                /*필기. 공배수가 아닌 경우 증감식으로 넘어감*/
                continue;
            }
        }



    }

    public void testSimplecontinueStatement02 () {

        /*필기. continue문은 모든 반복문을 건너 뛰는 것이 아닌, 자신에게 인접한 반복문 실행만 건너 뛴다*/

        /*필기.
        *  구구단 2~9단 까지 출력
        *  각 단의 수가 짝수인 경우 출력을 생략한다*/

        for(int i = 2 ; i<10;i++) {

            for(int j =1 ; j <10; j++){

                if (j%2 == 0) {

                    continue;       // continue는 해당 조건을 만족하는 경우 뛰어 넘어가고 다음 수를 사용하게 된다
//                    break;       //반면에 break의 경우 조건을 만족하는 경우 바로 끝내버린다, 여기서 break와 continue의 차이를 이해하자
                }

                    System.out.println(i+" * "+j + " = "+i*j );


            }
            System.out.println();

        }


    }
}
