package com.ohgiraffers.section02.assignment;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 대입연산자와 산술 복합 대입 연산자를 이해하고 활용할수 있다*/
        /*필기.
        *  대입연산자와 산술 복합 대입 연산자
        *  '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
        *  '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
        *  '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
        *  '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
        *  '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
        *  '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
        * */

        int num = 12;

        num = num +3;
        System.out.println("num = " + num);

        num += 3;                         // num = num +3; 과 같은 의미
        System.out.println("num = " + num);

        num -=5;                          // num = num-5; 와 같은 의미
        System.out.println("num = " + num);

        num *=10;                        // num = num*10; 과 같은 의미
        System.out.println("num = " + num);

        num /=2;                        // num = num/2
        System.out.println("num = " + num);

        num %= 4;                      // num = num%4
        System.out.println("num = " + num);

        num =- 5;
        System.out.println("num = " + num);
        /* 주의사항*/
        /*필기.
        *  산술 복합 대입 연산자의 작성 순서에 주의해야한다
        *  복합 산술 대입 연산자가 아닌 '-5'값을 대입한것일 뿐이다*/









    }
}
