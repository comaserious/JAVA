package com.ohgiraffers.section05.typecasting;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. 강제 형변환 규칙에 대해 이해할수 있다*/
        /*필기.
        *  강제 형변환(명시적 형변환)
        *  바꾸려는 자료형은 케스팅 연산자를 이용하여 형변환한다
        *    (바꿀자료형) 값;*/

        /*필기.
        *  자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다
        *   1. 강제형변환 규칙
        *    1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요하다
        *    1-2. 실수를 정수로 변경시 강제 형변환이 필요하다
        *    1-3. 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        *    1-4. 논리형은 마찬가지로 강제형변환 규칙에서도 제외가 된다*/

        /*목차. 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다*/
        /*목차. 1-1-1. 정수끼리의 강제형변환*/
        long lnum = 9L;
//        int inum = lnum;  // 데이터 손실 가능성을 컴파일러가 알려준다.(에러가 났음)
        int inum = (int)lnum;  //변경하려는 자료형을 명시하여 강제 형변환을 해야함

        /*목차. 1-1-2. 실수 끼리의 강제 형변환*/
        double dnum = 9.0;
        float fnum = (float)dnum;

        /*목차. 1-1-3. 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형변환이 필요하다*/
        char ch = 'a';
        byte bnum = (byte)ch;

        /* 테스트 */
        int num1 = 97;
        int num2 = -97;

        char ch1 = (char)num1;
        System.out.println("ch1 = " + ch1);
        char ch2 = (char)num2;
        System.out.println("ch2 = " + ch2);
        

        










    }
}
