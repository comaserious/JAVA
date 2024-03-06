package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. LinkedHashSet 에 대해 이해하고 사용할 수 있다*/

        /*필기.
        *  LinkedHashSet 클래스
        *  추가적으로 저장 순서를 유지하는 특징을 가지고 있다*/

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("mysql");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset = " + lhset);    // 넣은 순서대로 저장된것을 확인 할 수 있다

        lhset.add("java");
        System.out.println("lhset = " + lhset);    // 근본적으로  Set 이기 때문에 중복 요소는 저장하지 않고 넘어간다
    }
}
