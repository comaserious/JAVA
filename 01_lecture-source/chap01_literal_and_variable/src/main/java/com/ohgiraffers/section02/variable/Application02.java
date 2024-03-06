package com.ohgiraffers.section02.variable;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. 변수를 선언하고 값을 할당하여 사용할수 있다.*/
        /*필기.
        *  변수를 사용하는 방법
        *   1. 변수를 준비한다 (선언)
        *   2. 변수에 값을 대입한다 (값 대입 및 초기화)
        *   3. 변수를 사용한다*/

        /*목차 . 1. 변수를 준비한다 (선언)*/
        /*목차 1-1. 변수를 선언하는 방법*/
        /*필기. 자료형 변수명;
        *        예) int sum;*/

        /*필기.
        *  자료형이란?
        *   다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler 와 약속한 키워드 이다
        *     예) 앞에서 사용한 int 자료형은 정수를 4byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다
        *         이러한 자료형은 기본자료형 (Primary type)과 참조자료형(Reference type) 으로 나누어진다
        *         그중 기본 자료형 8가지부터 살펴보자*/

        /*목차. 1-1-1. 숫자를 취급하는 자료형*/
        /* 필기. 정수를 취급하는 자료형은 4가지가 있다.*/

        byte bnum;    // 1byte
        short snum;   // 2byte
        int inum;     // 4byte
        long lnum;    // 8byte

        /*필기. 실수를 취급하는 자료형은 2가지 있다*/

        float fnum;   // 4byte
        double dnum;  // 8byte

        /*목차. 1-1-2.문자를 취급하는 자료형*/
        /*필기. 문자를 취급하는 자료형은 한가지 있다*/

        char ch;  // 2byte
        char ch2;


        /*목차. 1-1-3. 논리값을 취급하는 자료형 */
        /*필기. 논리값을 취급하는 자료형은 한가지 있다.*/

        boolean isTrue;   // 1byte

        /*필기. 8가지를 기본자료형 (Priamy type)이라고 한다*/

        /*목차. 1-1-4. 문자열을 취급하는 자료형*/

        String str; // 4byte(엄밀히 이야기 하면 주소값은 4byte 정수형이다.)

        /*목차. 2. 변수에 값을 대입한다.(값 대입 및 초기화)*/
        /*목차. 2-1. 정수를 취급하는 자료형에 값 대입*/

        bnum=1;
        snum=2;
        inum=4;
        lnum=8L;       // 아무 문제 없는 것 같지만 사실 뒤에 대문자 L을 붙여야하나. 그 이유는 뒤에 형변환에서 다루게 될 것이다.


        /*목차. 2-2. 실수를 취급하는 자료형에 값 대입*/

        fnum = 4.0f;  // 실수 형태의 값에 f를 붙인다
        dnum = 8.0;

        /*목차. 2-3. 문자를 취급하는 자료형에 값 대입*/

        ch = 'a';
        System.out.println(ch);

        ch = 97;    // 'a' 는 97은 숫자였지? 그래서 숫자로도 저장할 수 있다.
        System.out.println(ch);

        /*목차. 2-4 논리를 취급하는 자료형에 값 대입*/

        isTrue = true;
        System.out.println(isTrue);

        isTrue = false;     // true 혹은 false 중 한가지의 값만 사용 가능하다
        System.out.println(isTrue);

        // 필기. 값을 새롭게 대입하면 초기화하여 값이 달라진다


        /*목차. 2-5. 문자열을 취급하는 자료형 값대입*/

        str = "안녕하세요";

        System.out.println(str);

        /*필기. 자료형 변수형 = A;
        *         이 식을 해석을 하자면
        *          A 값을 변수형에 초기화하겠다는 의미이다
        *          따라서 좌변의 값을 우변에 집어 넣는다고 생각하면 이해가 빠를것*/





    }
}
