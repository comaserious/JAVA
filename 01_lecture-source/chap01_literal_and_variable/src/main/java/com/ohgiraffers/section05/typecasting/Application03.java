package com.ohgiraffers.section05.typecasting;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 자동 형변환과 강제 형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다 */

        /*필기.
        *  자동형변환과 강제형변환을 이용한 다른 자료형끼리의 연산
        *  다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환후 연산처리가 된다*/

        int inum=10;
        long lnum=100L;

//        int isum = inum + lnum;
        int isum = (int)(inum + lnum);

        /*목차. 1. long 형태의 값을 int형으로 강제 형변환*/
        int isum2 = inum + (int)lnum;



    }
}
