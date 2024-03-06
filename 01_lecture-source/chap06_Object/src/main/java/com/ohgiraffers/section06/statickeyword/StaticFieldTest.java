package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    /*static 필드 , non-static 필드 선언*/

    private int nonStaticCount;
    private static int staticCount;

    /*기본생성자*/
    public StaticFieldTest(){}

    public int getNonStaticCount() {return this.nonStaticCount;}

    public int getStaticCount() {
        /*필기.
        *  static 필드에 접근하기 위해서는 클래스명.필드명 으로 접근한다
        *  this. 으로 접근이 가능은 하지만, this를 사용하지 않는 것이 좋다*/
        // new 연산자를 통해 주소가 this에 저장되지만 static이기 때문에 어차피 이미 주소는 존재한다 따라서 this를 사용하지 않고 클래스명으로 접근한다

        return StaticFieldTest.staticCount;}

    /*두개의 필드값을 1씩 증가시키기 위한 메소드*/
    public void increaseNonStaticCount() {this.nonStaticCount++;}

    public void increaseStaticCount(){StaticFieldTest.staticCount++;}
}
