package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /*수업목표. static 메소드를 호출할수 있다*/

        /*필기.
        *  static 메소드 호출
        *  */
        /*필기.
           static 메소드 호출하는 방법
           클래스명. 메소드명 (); <-이런방식으로 호출한다.
        * */


//        Application08.sumTwoNumbers(10,20);

        System.out.println("10 과 20의 합 : " + Application08.sumTwoNumbers(10,20));

        /*필기. 동일한 클래스내에 작성된 static 메소드는 클래스명이 생략가능하다*/

        System.out.println("동일한 클래스 상 클래스명 생략 가능 " + sumTwoNumbers(10,20));




    }/**<pre>
     메소드에 static을 집어 넣게 된다면 추가적인 호출의 단계가 필요없기도 하고
     다른 메소드와는 다르게 컴파일러가 순차적으로 받아들이기전에 프로그램이 시작과 동시에 미리 메모리공간을 차지하고 인식하고 있다고 생각?하면 될까?
     그렇기에 메모리 효율을 위해서 static은 주의해서 써야할듯
     </pre>*/

    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }





}
