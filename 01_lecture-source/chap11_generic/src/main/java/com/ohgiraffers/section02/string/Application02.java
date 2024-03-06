package com.ohgiraffers.section02.string;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식 확인*/

        /*필기.
         *  문자열 객체를 만드는 방법
         *  ""리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리 한다 (singleton)
         *  new String("문자열") : 매번 새로운 인스턴스 생성*/

        String str1 = "java";
        String str2 = "java";

        System.out.println("str1 == str2 : "+(str1 == str2));   // 즉 java가 들어 있는 동일한 인스턴스를 가리키고 있다

        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str3 : "+ (str1==str3));  // new 연산자로 새로운 주소를 할당 받았기 때문에

        /*필기.
         *  하지만 4개의 문자열 모두 동일한 hashCode 를 가진다
         *  동일한 문자열은 동일한 hashCode를 가지도록 재정의 되어있다*/

        System.out.println("str1의 해시코드 : "+str1.hashCode());
        System.out.println("str2의 해시코드 : "+str2.hashCode());
        System.out.println("str3의 해시코드 : "+str3.hashCode());
        System.out.println("str4의 해시코드 : "+str4.hashCode());

        /*필기.
         *  equals : String 클래스의 equals() 메소드는 인스턴스 비교가 아닌 문자열값을 비교
         *           동일한 값을 가지는 경우 true , 다른값을 가지는 경우 false를 반환하도록
         *           equals() 메소드를 재정의 해두었다
         *           따라서 문자열 인스턴스 생성 방식과 상관없이 동일한 문자열인지 비교하기 위해
         *           == 대신 equals() 메소드를 사용해야한다*/


        System.out.println("str3과 str4의 equals : " + str3.equals(str4));
    }
}
