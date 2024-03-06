package com.ohgiraffers.section01.polymorphism;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 다형성을 적용해서 매개변수로 활용할 수 있다*/

        /*목차 1. 하단에 먹이주기() 메소드 만들기*/

        /*목차 2. 먹이주기() 메소드 호출*/
        Application03 a = new Application03();
        동물 a1 = new 토끼();
        동물 a2 = new 호랑이();

        a.먹이주기(a1);
        a.먹이주기(a2);

        토끼 r1 = new 토끼();
        호랑이 t1 = new 호랑이();

        a.먹이주기(r1);      //묵시적 up-casting
        a.먹이주기(t1);      //묵시적 up-casting

        a.먹이주기(new 토끼());
        a.먹이주기(new 호랑이());

    }

    /*필기. 다형성을 적용하지 않았다면, 토끼에게 먹이를 주는 메소드, 호랑이이게게 먹이를 주는 메소드를 두개다 만들어야한다
    *      즉, 생산성이 좋아졌다고 보면 된다*/
    public void 먹이주기(동물 animal) {

       animal.먹기();
    }

//    public void 먹이주기(토끼 rabbit){                       이짓을 하지 않아도 된다
//        rabbit.먹기();
//    }
//    public void 먹이주기(호랑이 tiger){
//        tiger.먹기();
//    }
}
