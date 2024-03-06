package com.ohgiraffers.section05.logical;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 논리연산자에 대해 이해하고 활용할수 있다*/
        /*필기.
        *  논리 연산자
        *  논리값(true or false)를 취급하는 연산자이다
        *   */

        /*필기.
        *  논리 연산자의 종류
        *   1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽이다
        *                      두 개의 논리식을 판단하여 참과 거짓을 판단한다
        *      1-1. && (논리 AND) 연산자 : 두 개의 논리식 모두 참일 경우 참을 반환 , 둘중 하나라도 거짓이면 거짓을 반환
        *      1-2. || (논리 OR) 연산자 : 두 개의 논리식 중 하나라도 참일 경우 참을 반환, 둘다 거짓이면 거짓을 반환
        *   2. 논리 부정 연산자
        *      2-1. ! (논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다*/


        /*목차. 1. 논리 연산자 결과값 확인*/
        System.out.println("true 와 true의 논리 and 연산 : " + (true && true));
        System.out.println("true 와 false의 논리 and 연산 : " + (true && false));
        System.out.println("false 와 true의 논리 and 연산 : " + (false && true));
        System.out.println("false 와 false의 논리 and 연산 : " + (false && false));

        System.out.println("====================================================================================");
        System.out.println("true 와 true의 논리 or 연산 : " + (true || true));
        System.out.println("true 와 false의 논리 or 연산 : " + (true || false));
        System.out.println("false 와 true의 논리 or 연산 : " + (false || true));
        System.out.println("false 와 false의 논리 or 연산 : " + (false || false));

        System.out.println("======================================================================================");
        System.out.println("true의 논리 not 연산자 : " +(!true));
        System.out.println("false의 논리 not 연산자 : " +(!false));

    }
}
