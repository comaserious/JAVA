package com.ohgiraffers.section03.dto;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 데이터를 추상화하는 기법을 이해하고 이를 사용하여 프로그래밍*/

        /*필기.
        *  캡슐화의 원칙에는 일부 어긋나긴 하지만 다른 목적을 가진 클래스와 객체를 추상화하는 기법이 있다
        *  (캡슐화는 다른 말로 은닉이라고 한다 하지만 세터와 게터를 이용하게 되면 필드의 이름을 파악할수 있다
        *  따라서 이는 필드를 은닉하려는 캡슐화의 어느정도 위배한다고 할수 있다 하지만 실무에서 너무나도 많이
        *  사용하는 방식이기 때문에 어느정도 위배를 재고해주는 것이다)
        *  행위 위주(메소드) 가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transer Object : DTO)의 경우이다
        *  이러한 객체를 설계할 때는 행위가 아닌 데이터가 위주이며, 캡슐화의 원칙을 준수하여 모든 필드를 private으로
        *  직접 접근을 막고, 각 필드값을 변경하거나, 반환하는 메소드를
        *  세트로 미리 준비해둔다
        *  "너가 어떤것을 쓸줄 모르니 다 준비해봤어"라는 종합선물세트의 느낌이다
        *  private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성
        *  주로 계층간 데이터를 주고 받을 목적으로 사용한다*/

        MemberDTO member = new MemberDTO();

        member.setIdCode(1);
        member.setName("name01");
        member.setAge(20);
        member.setGender('M');
        member.setHeight(167.8);
        member.setWeight(66.33);
        member.setIsMember(true);

        System.out.println("id코드 : "+member.getIdCode());
        System.out.println("회원의 이름 : "+member.getName());
        System.out.println("회원의 나이 : "+member.getAge());
        System.out.println("회원의 성별 : "+member.getGender());
        System.out.println("회원의 키 : "+ member.getHeight());
        System.out.println("회원의 무게 : "+ member.getWeight());
        System.out.println("여전히 회원인가 : "+member.isMember());

        /*필기.
        *  데이터를 주로 다루는 객체의 경우 행위를 추상화하지 않고
        *  미리 모든 필드에 접근 가능성을 염두해두고 작성해두는 관례로 인해 현재도 많이 사용하고 있다
        * */





    }

}
