package com.ohgiraffers.section06.finalKeyWord;

public class FinalFieldTest {

    /*수업목표. final 키워드에 대해 이해할 수 있다*/

    /*필기.
    *  final
    *  : final 은 종단의 의미를 가지는 키워드이다
    *  final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간 다르지만, 결국 변경 불가의 의미이다
    *  1. 지역변수 : 초기화 이후에 값 변경 불가
    *  2. 매개변수 : 호출 시 전달한 인자 변경 불가
    *  3. 전역변수 : 인스턴스 생성후 초기화 이후 값 변경 불가
    *  4. 클래스(static) 변수 : 프로그램 시작후 값 변경 불가
    *  5. non-static 메소드 : 메소드 재작성(overriding) 불가
    *  6. static 메소드 : 메소드 재작성(overriding) 불가
    *  7. 클래스 : 상속 불가*/

    /*목차 1. non-static field에 final 사용*/
//    private final int nonstaticNum;     //0으로 초기화 이후 변경 불가능 하기 때문에 컴파일러 에러가 발생하게 된다

    /*필기.
    *  final은 변경 불가의 의미를 가진다
    *  따라서 초기 인스턴스가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    *  그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화(값넣기)를 해주어야 한다
    *  그렇지 않으면 컴파일러 에러가 발생*/

    /*해결 방법 2가지*/

    /*목차 1-1. 선언과 동시에 초기화*/
    private final int NON_STATIC_NUM =1;

    /*목차 1-2. 생성자를 이용하여 초기화*/
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName){ this.NON_STATIC_NAME  = nonStaticName;}

    /*목차 2. static field에 final 사용*/

    /*필기.
    *  static에서도 자바에서 지정한 기본값이 초기에 들어가기 때문에
    *  final 키워드 사용시 초기화를 하지 않으면 에러가 발생한다*/
//    private static final int STATIC_NUM;

    /*목차 2-1. 선언과 동시에 초기화*/
    private static final int STATIC_NUM =1;

    /*필기.
    *   생성자를 이용한 초기화는 불가능하다
    *   생성자는 인스턴스가 생성되는 시점에 호출 되기 때문에 그 전에는 초기화가 일어나지 못한다
    *   하지만 static은 프로그램이 start 될때 할당되기 때문에 초기화가 되지 않은 상태로 선언된것과 동일하여
    *   기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러가 발생한다*/

    private static final double STATIC_DOUBLE;

    //생성자로 초기화는 불가능하다
//    public FinalFieldTest(double staticDouble){
//        FinalFieldTest.STATIC_DOUBLE=staticDouble;
//    }

    /*필기. 하지만 초기화블럭으로는 초기화 할수 있다*/
    static {
        STATIC_DOUBLE=0.5;
    }









}
