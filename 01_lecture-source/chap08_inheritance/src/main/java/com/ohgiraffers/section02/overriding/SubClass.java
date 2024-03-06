package com.ohgiraffers.section02.overriding;

public class SubClass extends SuperClass{

    /*목차 1. 메소드의 이름 변경*/
//    @Override
//    public void method2(int num){}

    /*목차 2. 메소드의 리턴타입 변경하면 에러 발생*/
//    @Override
//    public int method(int num){return 2;}

    /*목차 3. 매개변수 갯수, 타입, 순서 변경되면 에러 발생*/
//    @Override
//    public void method(String name){}

    /*목차 4. 메소드의 이름, 리턴타입, 매개변수의 갯수,타입,순서 일치의 경우 성립*/
    @Override
    public void method(int num){}

    /*목차 5. private 메소드는 오버라이딩 불가*/
//    @Override
//    private void privateMethod(){}

    /*목차 6. final 키워드 메소드 오버라이딩 불가*/
//    @Override
//    public final void finalMethod(){}

    /*목차 7. 부모메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능*/
//    @Override
//    void protectedMethod(){}      더 좁은 범위로는 불가능

//    @Override
//    protected void protectedMethod(){}     같은 범위는 가능

    @Override
    public void protectedMethod(){}        // 확장된 접근제한자의 경우 가능하다 (더 넓은 가능)




}
