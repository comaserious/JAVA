package com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점(1)*/

        /*필기. 필드에 올바르지 않는 값이 들어가도 통제가 불가능하다*/

        // 1번 몬스터 생성
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp= 200;

        System.out.println("monster1 의 이름 : "+monster1.name);
        System.out.println("monster1 의 체력 : "+ monster1.hp);

        System.out.println();

        // 2번 몬스터 생성
        Monster monster2 = new Monster();
        monster2.name = "헐크";
        monster2.hp=-200;       //체력이 음수라는 건 말이 안되는 값

        System.out.println("monster2 의 이름 : " + monster2.name);
        System.out.println("monster2 의 체력 : "+ monster2.hp);   //직접적으로 필드에 입력했기 때문에 입력한대로 출력하게 된다

        System.out.println();
        //3번 몬스터 생성
        Monster monster3 = new Monster();

        monster3.name = "프랑켄슈타인";
        monster3.setHp(-200);              //필드값에 직접 넣는 것이 아닌 클래스내에 있는 메소드를 거쳐서 필드값에 입력하기 때문에 한번의 검증을 통해 넣을수 있어 오류를 수정할수 있다

        System.out.println("monster3 의 이름 : "+ monster3.name);
        System.out.println("monster3 의 체력 : "+monster3.hp);











    }
}
