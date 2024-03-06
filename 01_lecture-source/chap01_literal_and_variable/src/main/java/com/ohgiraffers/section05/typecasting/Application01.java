package com.ohgiraffers.section05.typecasting;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 자동 형변환 규칙에 대해 이해할 수 있다*/

        /*필기.
        *  데이터 형변환
        *  데이터 형변환이 필요한 이유
        *   -자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        *   -즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.*/


        /*필기.
        *  형변환의 종류와 규칙
        *    1.자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        *     1-1. 작은 자료형에서 큰 자료형으로는 자동형변환이 된다
        *     1-2. 정수는 실수로 자동 형변환이 된다
        *     1-3. 문자형은 int형으로 자동형변환이 된다
        *     1-4. 논리형은 형변환 규칙에서 제외된다
        * */

        /*목차. 1. 자동형변환 규칙 테스트*/
        /*목차. 1-1. 작은 자료형에서 큰 자료형으로는 자동형변환이 된다*/
        /*필기. 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에 자동으로 처리해준다*/

        /*목차. 1-1-1. 정수끼리의 자동형변환*/

        byte bnum =1;          //1byte
        short snum = bnum;     //2byte
        int inum = snum;       //4byte
        long lnum = inum;      //8byte

        int num1 = 10;
        long num2 = 20;

//        int result1 = num1 + num2;     //자동으로 큰 쪽 자료형인 long으로 변경후 계산하기때문에 int형 변수에 값을 담을수 없다
        long result1 = num1 + num2;      // int + long 은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int->long 변환을 자동으로 수행한다.

        int result2 = num1 + (int)num2;    //강제 형변환이라고 한다

        System.out.println("result1 = " + result1);

        /*목차. 1-1-2. 실수*/
        float fnum = 4.0f;          //4byte
        double dnum = fnum;         //8byte

        double result3 = fnum + dnum;
        System.out.println("result3 = " + result3);
        
        /*목차. 1-2. 정수는 실수로 자동 형변환이 된다*/
        /*필기.
        *   정수를 실수로 변경할때 소수점 자리수가 없어도 실수형태로 표현이 가능하다. 이때 데이터 손실이 없기 때문에 자동으로 진행된다.*/
        
        long eight= 8;
        float four = eight;

        System.out.println("four = " + four);

        /*목차. 1-3. 문장형은 int형으로 자동형변환이 된다*/
        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber = " + charNumber);
        System.out.println(ch1);

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);

        /*목차. 1-4. 논리형은 형변환 규칙에서 제외*/
        /*필기. 어느 자료형이든 boolean을 형변환에서 담을 수 없다.*/
        boolean isTure = true;
//        byte b = isTure;
//        float f = isTure;
//        char c = isTure;
//        String s = isTure;



    }
}
