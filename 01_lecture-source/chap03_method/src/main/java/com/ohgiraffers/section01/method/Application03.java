package com.ohgiraffers.section01.method;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 메소드 전달인자와 매개변수에 대해 이해하고 메소드 호출 시 활용할 수 있다*/
        /*필기.
        *  전달인자(Argument) 와 매개변수(parameter)를 이용한 메소드 호출
        *  지금까지 우리가 배운 변수는 지역변수에 해당한다*/

        /*필기.
        *  지역변수는 선언하는 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라 한다.
        *  다른 메소드 간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출시 사용하는 괄호를 이용해서 값을 전달할수 있다
        *  이때 전달하는 값을 전달인자(Argument)라고 부르고,
        *  메소드 선언부 괄호안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다*/


        Application03 app3 = new Application03();

        /*목차. 1. 전달인자로 값 전달 테스트*/

        app3.testMethod (20);
//        app3.testMethod("20");          //testMethod의 parameter 는 int값을 받도록 만들었는데 argument의 type이 String이기 때문에 받아들이지 못하고 있다

        /*목차. 2. 변수에 저장한 값 전달 테스트*/

        /*목차. 2-1. 변수에 저장된 값을 이용하여 값을 전달할수 있다*/
        int age = 40;
        app3.testMethod(age);

        /*목차. 2-2. 자동형변환을 이용하여 값 전달을 할 수 있다.*/

        byte byteAge = 21;

        app3.testMethod(byteAge);

        /*목차. 2-3. 강제형변환을 이용하여 값 전달을 할 수 있다*/

        long longAge = 24L;

        app3.testMethod((int)longAge);


        /*목차. 2-4. 연산결과를 이용해서 값 전달을 할 수 있다*/

        app3.testMethod(age*3);






    }

    public void testMethod (int age) {

        System.out.println("당신의 나이는 : " + age + "세 입니다");

    }


}
