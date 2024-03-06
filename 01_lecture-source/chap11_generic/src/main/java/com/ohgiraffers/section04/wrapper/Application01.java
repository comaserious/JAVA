package com.ohgiraffers.section04.wrapper;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. Wraaper 클래스에 대해 이해할 수 있다*/

        /*필기.
         *  기본 자료형 데이터를 인스턴스화 해야하는 경우들이 발생한다
         *  이 때 8가지 자료형의 데이터를 인스턴스화 할 수 있도록 하는 클래스를
         *  Wrapper 클래스라고 한다 */

        /*필기.
         *  기본타입         래퍼클래스
         *  byte             Byte
         *  short            Short
         *  int              Integer
         *  long             Long
         *  float            Float
         *  double           Double
         *  char             Character
         *  boolean          Boolean*/

        /*필기.
         *  박싱(Boxing) 언박싱(UnBoxing)
         *  기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 Boxing이라고 하며,
         *  래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 UnBoxing 이라고 한다*/

        int inum = 20;

        Integer boxingNumber1 = new Integer(inum);     //인스턴스화(박싱)

        int unBoxingNumber1 = boxingNumber1.intValue(); //언박싱(intValue()) 을 이용

        Integer boxingNumber2 = inum;               // 오토박싱 알아서 인스턴스 만들고 집어 넣어준다

        int unBoxingNumber2 = boxingNumber2;              //알아서 언박싱후 기본변수에 집어 넣어준다 (오터 언박싱)

        int inum1 = 20;

        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);      //박싱
        Integer integerNum3 = 20;                         // 오토박싱
        Integer integerNum4 = 20;                         // 오토박싱


        //기본타입이랑 래퍼클래스 타입은 == 연산으로 비교 가능하다
        System.out.println("int 와 Integer 비교 : "+(inum1 == integerNum1));

        //생성자를 이용해 생성한 인스턴스의 경우 == 로 비교 불가능 하다 (박싱)
        //단 오토박싱을 이용해서 생성한 값은 == 로 비교 가능하다

        System.out.println("Integer 와 Integer 비교 : " + (integerNum1==integerNum2));
        System.out.println("Integer 와 Integer 비교 : " + (integerNum1==integerNum3));
        System.out.println("Integer 와 Integer 비교 : " + (integerNum3==integerNum4));

        /*필기. 래퍼클래스 타입의 인스턴스를 비교할때는 equals()를 사용해야한다*/
        System.out.println("equals() : "+(integerNum1.equals(integerNum2)));
        System.out.println("equals() : "+(integerNum1.equals(integerNum3)));
        System.out.println("equals() : "+(integerNum3.equals(integerNum4)));

        /*필기. valueOf() 를 이용해서 인스턴스를 생성하는 것을 권장한다
         *      valueOf() 는 동일한 값이 동일한 인스턴스임을 보장한다*/

        System.out.println("valueOf() : "+(Integer.valueOf(123) == Integer.valueOf(123)));







    }
}
