package com.ohgiraffers.section04.dto;

import com.ohgiraffers.section04.constructor.User;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 생성자(constructor)를 이용한 초기화와 설정자(setter)를 이용한 초기화의 장단점을 이해할 수 있다*/

        /*필기.
        *  1.생성자를 이용한 초기화
        *   장점 : setter 메소드를 여러번 호출해서 사용하지 않고 , 단 한번의 호출로 인스턴스 생성 및 초기화
        *   단점 : 필드를 초기화 할 매개변수의 갯수를 경우의 수 별로 모두 만들어야 한다 (2개를 초기화 3개를 초기화 ..... 각각 모두 만들어줘야하는 번거로움이 존재)
        *         호출시 인자가 많아지는 경우 어떠한 값이 어떤 필드를 의미하는지 한 눈에 알아보기 힘들다
        *  2. 설정자를 이용한 초기화
        *   장점 : 필드를 초기화 하는 각각의 값들이 어떤 필드를 초기화하는지 명확하게 볼 수 있다
        *   단점 : 하나의 인스턴스를 생성할 때 한 번의 호출로 끝나지 않는다*/

        UserDTO user1 = new UserDTO("ohgiraffers","ohgiraffers","ohgiraffers",new java.util.Date());
        System.out.println(user1.getInfo());

        UserDTO user2 = new UserDTO();

        user2.setId("ohgiraffers");
        user2.setPwd("ohgiraffers");
        user2.setName("ohgiraffers");
        user2.setEnrollDate(new java.util.Date());
        // IntelliJ가 똑똑하기 때문에 생성자를 통해서도 집어 넣는 값이 무엇인지 어느정도 파악이 가능하지만 만약 앞에 저런 표시가 없었다면
        //id, pwd, name이 어느 위치인지 알 방도가 없다 하지만 설정자의 경우 이름 자체가 set~이기 때문에 집어 넣는 값이 어떤 데이터인지 쉽게 알아 볼수 있다

        System.out.println(user2.getInfo());



    }
}
