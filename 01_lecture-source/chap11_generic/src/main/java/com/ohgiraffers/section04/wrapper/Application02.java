package com.ohgiraffers.section04.wrapper;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. 문자열 파싱(parsing) 에 대해 이해할 수 있다*/

        /*필기. parsing : 문자열(String) 값을 기본자료형 값으로 변경하는 것을 parsing 이라고 한다*/

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("12");
        int i = Integer.parseInt("3");

        boolean bl = Boolean.parseBoolean("true");

        /* Character 는 parsing 기능을 제공하지 않는다*/
        char ch = "abc".charAt(0);



    }
}
