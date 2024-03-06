package com.ohgiraffers.section04;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 오버풀로우에 대해 이해할 수 있다.*/
        /*필기.
        *     자료형 별 값의 최대범위를 벗어나는 경우
        *     발생한 carry를 버림처리 하고 sign bit를 반전시켜 최솟값으로 순환시킴
        *     sign bit 자리를 침범하게 되면 강제로 (+-)를 반전시킨다*/

        /*목차. 1. 오버플로우*/
        byte num1 =127;

        System.out.println(num1);   //127 : byte의 최대 저장 범위

        num1++;             // +1 증가

        System.out.println("num1 overflow : "+ num1);  //-128 : byte의 최소 저장 범위

        /*목차. 2. 언더플로우*/
        /*필기. 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다*/
        byte num2 = -128;

        System.out.println("num2 : " + num2);

        num2--;

        System.out.println("num2 underflow : " + num2);

        int firstNum = 1000000;    //1,000,000
        int secondNum = 700000;    //700,000

        int multi = firstNum * secondNum;
        System.out.println("firstNum * secondNum : " + multi);

        /*목차. 3. 해결방법*/
        /*필기. 오버플로우를 예측하고 더 큰 자료형은 결과값을 받아서 처리한다*/

        long longMulti = firstNum * secondNum;  //700,000M

        System.out.println("longMulti : "+ longMulti);
        /*필기. firstNum*secondNum 값은 int 범위 내에서 계산이 끝난 값이다 따라서
        *  마이너스 값을 long 범위 내에 넣은 것이기 때문에 long 으로 변수명을 집어 넣어도
        *  값은 여전히 마이너스 값이 나오게 된다*/

        long result = (long) firstNum * secondNum;
        System.out.println("result : " + result);






















    }
}
