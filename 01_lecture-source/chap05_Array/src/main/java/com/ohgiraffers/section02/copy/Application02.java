package com.ohgiraffers.section02.copy;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다*/

        /*필기.
        *  얕은 복사의 활용
        *  얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        *  리턴값으로 동일한 배열을 리턴 해주고 싶은 경우 사용한다*/

        String[] names = {"조평훈" , "이순신" , "홍길동"};

        System.out.println("names 의 hascode : "+ names.hashCode());

        /*목차. 1. 인자와 매개변수로 활용*/
        print(names);

        /*목차. 2. 리턴값 활용*/

        String[] animal = getAnimals();

        print(animal);


    }

    public static void print (String[] sarr) {

        /*필기. 전달 받은 배열의 hashCode() 출력*/
        System.out.println("sarr의 hascode() : "+sarr.hashCode());

        /*필기. 전달 받은 배열의 값 출력*/
        for (int i = 0 ; i<sarr.length; i++){

            System.out.println(sarr[i]);
        }
        System.out.println();

    }

    public static String[] getAnimals () {

        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};

        System.out.println("animals의 hascode : " +animals.hashCode());

        return animals;

    }


}
