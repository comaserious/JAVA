package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. Set 자료구조의 특성을 이해하고 HashMap을 이용할 수 있다*/

        /*필기.
        *  Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        *   1. 요소의 저장순서를 유지하지 않는다
        *   2. 같은 요소의 중복 저장을 혀용하지 않는다
        * */
        /*필기.
        *  HashSet 클래스
        *  Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다*/

        HashSet<String> hset = new HashSet<>();

        hset.add("java");
        hset.add("mysql");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset = " + hset);    //넣는 순서에 관계없이 요소가 저장된다

        hset.add("java");
        System.out.println("hset = " + hset);     //중복된 값은 저장된지 않는다, 저장되지 않고 넘어 간다

        System.out.println("포함하고 있는지 : "+hset.contains("mysql"));

        /*목차 1. toArray() : 배열로 바꿈*/

        Object[] arr = hset.toArray();

        for(Object i : arr){
            System.out.println(i);
        }
        System.out.println("===========================================");

        /*목차 2. iterator() 로 목록을 만들어 연속 처리*/
        Iterator<String> iter = hset.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }







    }
}
