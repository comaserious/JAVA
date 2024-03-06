package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. java.util.Random 클래스를 활용하여 사용자 지정 범위의 난수를 발생시킬 수 있다*/

        /*필기.
        *  java.util.Random 클래스
        *  nextInt() 메소드를 이용한 난수 발생
        *  nextInt(int bound) : 0부터 매개변수로 전달 받은 정수범위까지의 난수를 발생시켜 정수 형태로 변환*/

        Random random = new Random();

        /*필기.
        *  원하는 범위의 난수를 구하는 공식
        *  random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값*/

        int randomNumber = random.nextInt(10);  // 0 부터 시작해서 10개의 정수 구간을 만들어준다고 생각하면 좋다

        System.out.println("0 부터 9 까지의 난수 : "+ randomNumber);





    }
}
