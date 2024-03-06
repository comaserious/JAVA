package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {

        /*수업목표. while문 단독 사용에 대한 흐름을 이해하고 적용할수 있다*/

        /*필기.
        *  [while문 표현식]
        *  초기식;
        *  while(조건식) {
        *           조건을 만족하는 경우 사용할 구문(반복할 구문);
        *           증감식;
        *   }*/

        /*필기. 1부터 10까지 1씩 증가시키면서 (10번) i 값을 출력하는 기본 반복문*/

        int i =1;
        while (i<=10) {
            System.out.println(i);
            i++;

        }

    }

    public void testWhileExample01() {

        /*수업목표. while문의 흐름을 이해하고 적용할수 있다(1)*/

        /*필기. 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기*/

        Scanner scr = new Scanner(System.in);
        System.out.print("문자열을 적으시오 : ");
        String str = scr.nextLine();

        /*필기.
        *  charAt() : 문자열에서 index에 해당하는 문자를 char 형으로 반환하는 기능
        *  lenghth() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환한다*/


        System.out.println("============================for문==============================");

        for (int i = 0; i<str.length() ;i++ ){

            char ch = str.charAt(i);

            System.out.println(i+" : "+ch);

        }


        System.out.println("============================while문=============================");
        int i = 0;
        while (i<str.length()) {
            System.out.println(str.charAt(i));
            i++;

        }


    }

    public void testWhileExample02 () {

        /*필기. 중첩 while문을 이용한 구구단 출력하기 2~9단*/

        int i = 2;
        while (i<10) {
            int j = 1;
                    while (j<10) {
                        System.out.println(i+" * "+j+" = "+i*j);j++;
                    }
            System.out.println();
                    i++;


        }



    }

}
