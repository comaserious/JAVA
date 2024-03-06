package com.ohgiraffers.section04.wrapper;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 기본자료형 값을 문자열로 변경할 수 있다*/
        //parsing 과 반대로 기본자료형값을 문자열로 변경하는 경우도 필요하다

        /*필기.
         *  valueOf() : 기본자료형 값을 wrapper 클래스 타입으로 변환시키는 메소드
         *  toString() : 필드값을 문자열로 반환하는 메소드 */

        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(2).toString();
        String l = Long.valueOf(2L).toString();
        String f = Float.valueOf(2.0f).toString();

        /*필기. String 클래스의 valueOf 를 사용할 수있다*/
        String str = String.valueOf(12);

        /*필기. 문자열 합치기를 통해서도 String으로 변환할 수 있다*/
        String str2 = 123+"";

    }
}
