package com.ohgiraffers.section01.method;

public class Application04 {

    public static void main(String[] args) {

        /*수업목표. 여러 개의 전달 인자를 이용한 메소드를 호출할수 있다*/
        /*필기.
        *  여러 개의 전달인자를 이용한 메소드 호출 테스트*/

        Application04 app4 = new Application04();
        app4.testMethod("이호준", 33, '남');


    }
    public void testMethod(String name, int age, final char gender ) {

        System.out.println("나의 이름은 " + name + "이고, 나이는 " + age + " 세 이며 , 성별은 " + gender + " 입니다.");

        /*필기.
        *   매개변수도 일종의 지역변수로 분류된다
        *   매개변수 역시 final 키워드를 사용할수 있다
        *   지역변수에 final 키워드를 붙여 상수를 만드는 것과 동일하다*/


    }




}
