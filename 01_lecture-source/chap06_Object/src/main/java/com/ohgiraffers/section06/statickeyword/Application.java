package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /*수업목표. static 키워드에 대해 이해 할수 있다*/

        /*필기.
        *  static
        *   :정적 메모리 영역에(어떠한 행동이 가미 되면 동적 :메소드의 호출등) 프로그램이 start 될때 할당을 하는 키워드이다
        *    인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드,메소드)에 지정할 수 있다
        *    여러 인스턴스가 공유해서 사용할 목적의 공간이다
        *    하지만 static의 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다
        *    명확한 목적이 존재하지 않는 이상 static 키워드는 사용을 자제하는 것이 좋다
        *    의도적으로 static 키워드를 사용하는 대표적인 예시는 singleton 객체를 생성할 때이다*/



        /*목차 1. static 키워드를 필드에서 사용해보자*/
        StaticFieldTest s1 = new StaticFieldTest();

        /*현재 두 필드가 가지고 있는 값 확인*/
        System.out.println("non-static field : " +s1.getNonStaticCount());     //0
        System.out.println("static field : " +s1.getStaticCount());            //0
        System.out.println();
        /*두 필드의 값을 1 씩 증가시킨후 다시 값을 확인*/
        s1.increaseNonStaticCount();
        s1.increaseStaticCount();

        System.out.println("증가후 non-static field : "+s1.getNonStaticCount());    //1
        System.out.println("증가후 static field : "+s1.getStaticCount());           //1
        System.out.println();

        StaticFieldTest s2 = new StaticFieldTest();
        System.out.println("non-static field : " +s2.getNonStaticCount());        //0
        System.out.println("static field : " +s2.getStaticCount());               //1    <=요놈이 특이하다 분명 new연산자로 인스턴스화 시킬때 기본 생성자로 초기화 했는데 static값은 여전히 이어지고 있다

        /*필기.
        *  인스턴스 변수의 경우 s1과 s2 두개의 인스턴스가 서로 값을 공유하지 못하고
        *  인스턴스를 생성할 때마다 기본값인 0으로 초기화가 되었다
        *  하지만 static필드의 경우 클래스변수(static 붙은)가 프로그램을 종료할 때 까지 유지되고 있기 때문에 값을 유지하고 있다
        *  따라서 여러개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다*/


        StaticMethodTest m = new StaticMethodTest();
        m.nonStaticMethod();



        /*주의사항
        *  staic 메소드도 이렇게 호출 할수 있다
        *  하지만 static 메소드는 인스턴스를 생성하지 않고 호출하는 방식으로 사용해야한다
        *  static method는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 만들기 때문에
        *  static 메소드를 호출하는 방식으로 호출해야한다 */

        m.staticMethod();    //사용은 가능하지만 권장하지 않는다


        /*목차 2-2. static 메소드 호출*/
        /*필기. 클래스명.메소드명*/
        StaticMethodTest.staticMethod();
    }



}
