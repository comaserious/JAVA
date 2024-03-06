package com.ohgiraffers.section02.encapsulation.problem3;

public class Application01 {

    public static void main(String[] args) {

        Monster monster1 = new Monster();
        Monster monster2 = new Monster();
        Monster monster3 = new Monster();

        monster1.setName("드라큘라");
        monster1.setHp(200);

        monster2.setName("헐크");
        monster2.setHp(300);

        monster3.setName("프랑켄슈타인");
        monster3.setHp(-120);

//        System.out.println("monster1 의 이름 : "+monster1.name);
//        System.out.println("monster1 의  hp : "+monster1.hp);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());

        monster3.kinds = "두치";
        monster3.hp = -100;

        System.out.println("monster3 의 이름 : "+monster3.kinds);
        System.out.println("monster3 의 hp : "+monster3.hp);


    }
}
