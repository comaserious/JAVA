package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. Stack에 대해 이해하고 사용할 수있다*/

        /*필기.
        *  stack 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        *  후입선출(LIFO) 방식의 자료 구조이다*/

        Stack<Integer> integerStack = new Stack<>();

        /*필기. 값을 넣을때는 push() 메소드를 이용한다. add()도 가능하다.(하지만 다른 컬렉션이 사용하는 것이니 push() 를 쓰자)*/

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);

        System.out.println("integerStack = " + integerStack);

        /*필기. stack 에서 요소를 찾을 때 search() 를 이용할 수 있다
        *      인덱스가 아닌 위에서부터의 순번을 의미한다
        *      또한 가장 상단의 위치가 0 이 아닌 1부터 시작한다(먼저 들어온것이 밑에서부터 쌓이는 방식이다)*/

        System.out.println(integerStack.search(5));

        /*필기.
        *  peek() : 해당 스택의 가장 마지막에 있는(최상단) 요소 반환
        *  pop() : 해당 스택의 가장 마지막에 있는 (최상단) 요소 반환후 제거*/

        System.out.println("peek() : "+integerStack.peek());
        System.out.println("integerStack = " + integerStack);

        System.out.println("pop() : "+integerStack.pop());
        System.out.println("integerStack = " + integerStack);

        System.out.println("pop() : "+integerStack.pop());
        System.out.println("pop() : "+integerStack.pop());
        System.out.println("pop() : "+integerStack.pop());
        System.out.println("pop() : "+integerStack.pop());
        System.out.println("pop() : "+integerStack.pop());
//        System.out.println("pop() : "+integerStack.pop());     EmptyStackExceprion


        System.out.println("integerStack = " + integerStack);



    }
}
