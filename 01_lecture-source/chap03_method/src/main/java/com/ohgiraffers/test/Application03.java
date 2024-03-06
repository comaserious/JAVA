package com.ohgiraffers.test;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 매개변수와 리턴값을 복합적으로 활용해보자*/

        Calculator01 calc = new Calculator01 ();

        int sub =calc.minusTwoNumbers(30,40);
        int sum = calc.plusTwoNumbers(30,40);

        System.out.println("sum = " + sum);
        System.out.println("sub = " + sub);





    }
}
