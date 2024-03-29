package com.ohgiraffers.section03.dto;

public class MemberDTO {

    /*필기.
    *  주로 화면(UI) 혹은 데이터베이스 테이블을 기준으로 만든다
    *  회원 번호, 회원명, 나이 , 성별, 키 ,몸무게,회원탈퇴여부(활성화 여부)를 관리할 것이다*/
    private int idCode;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isMember;

    /*필기.
    *  설정자(setter)/ 접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다
    *  설정자(setter) 작성 규칙
    *  : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고,
    *    호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다
    *  [표현식]
    *  public void set필드명 (매개변수)  {
    *               필드 = 매개변수;    }
    *  [작성예시]
    *  public void setName(String name){
    *        this.name = name; }
    *  접근자(getter) 적성 규칙
    *  : 필드의 값을 반환받을 목적의 메소드 집합을 의미한다
    *    각 접근자는 하나의 필드에만 접근하도록 한다
    *    필드에 접근해서 기록된 값을 return;을 이용하여 반환하며, 이 때 반환 타입은 값의 자료형과 일치
    *  [표현식]
    *  public 반환형 get필드명() {
    *        return 반환값; }
    *  [작성 예시]
    *  public String getName() {
    *        return this.name;}*/

    /*필기. 설정자(setter) 메소드*/
    public void setIdCode(int idCode){this.idCode = idCode;}

    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setGender(char gender){this.gender=gender;}
    public void setHeight(double height){this.height=height;}
    public void setWeight(double weight){this.weight=weight;}
    public void setIsMember(boolean isMember){this.isMember=isMember;}

    /*필기. 접근자(getter) 메소드*/
    public int getIdCode()  {return this.idCode;}

    public String getName(){return this.name;}
    public int getAge() {return this.age;}
    public char getGender() {return this.gender;}
    public double getHeight(){return this.height;}
    public  double getWeight( ){return this.weight;}

    /*필기. boolean 의 접근자는 get으로 시작하지 않고 is로 시작하는 것이 일반적으로 관례이다*/
    public boolean isMember (){return this.isMember;}


}
