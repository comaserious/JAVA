package com.ohgiraffers.section02.string;

import java.util.StringTokenizer;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 문자열 분리에 대해 이해하고 적용할 수 있다*/

        /*필기.
         *  문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다
         *  split() : 공백 문자열도 포함
         *  StringTokenizer : 공백문자열 무시*/

        //사번/이름/주소/부서
        String emp1 = "100/홍길동/서울/영업부";   //모든값 존재
        String emp2 = "200/유관순//총무부";      //주소가 없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");

        for(int i = 0 ; i< empArr1.length;i++){
            System.out.println("empArr1["+i+"]"+empArr1[i]);
        }
        System.out.println("===================");
        for(int i = 0 ; i< empArr2.length;i++){
            System.out.println("empArr2["+i+"]"+empArr2[i]);
        }

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");

        //hasMore : 다음값이 있는지 확인
        while(st1.hasMoreTokens()){
            //token(구분자) 를 기준으로 출력
            System.out.println("st1 : "+st1.nextToken() );
        }
        while(st2.hasMoreTokens()){
            System.out.println("st2 : "+st2.nextToken() );
        }
    }
}
