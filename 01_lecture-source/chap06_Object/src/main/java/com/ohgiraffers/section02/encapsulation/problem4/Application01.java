package com.ohgiraffers.section02.encapsulation.problem4;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 접근제한자에 대해 이해하고 직접 필드에 접근하지 못하게 강제화 할 수 있다*/

        /*목차. 1. private 필드에 직접 접근하여 compile error 발생*/

        Monster monster1 = new Monster();
        Monster monster2 = new Monster();
        Monster monster3 = new Monster();

//        monster1.name="드라큘라";     //Monster class의 name의 경우 private 접근만 허용하기 때문에 Application01 클래스상에서는 다른 클래스이기때문에 monster.name1에 접근을 할수가 없다

        /*필기.
        *  선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        *  public 으로 접근을 허용한 메소드만 이용을 할 수 있게 했다
        *  이것이 캡슐화(encapsulation)이라고 한다*/

        monster1.setName("드라큘라");
        monster1.setHp(-120);
        System.out.println(monster1.getInfo());

        monster2.setName("헐크");
        monster2.setHp(300);

        monster3.setName("프랑켄슈타인");
        monster3.setHp(111);

        long lnum1 =20L;
        long lnum2 = 19L;

    }
}
