package com.ohgiraffers.section03.stringbuilder;

public class Application02 {

    public static void main(String[] args) {


        /*수업목표. StringBuilder 의 자주 사용되는 메소드를 알 수 있다*/

        //결과적으로 StringBuilder는 String과 다르게 원본에 영향을 미친다
        /*필기.
         *  delete() : 시작인덱스와 종료인덱스를 이용해서 문자열에서 원하는 부분의 문자열 제거
         *  deleteCharAT() : 문자열 인덱스를 이용해서 문자 하나를 제거한다
         *  둘다 원본에 영향을 미친다*/

        StringBuilder sb = new StringBuilder("javaoracle");
        System.out.println("sb = " + sb);

        System.out.println("delete() : "+sb.delete(2,5));
        System.out.println("sb = " + sb);    //원본에도 영향을 미친다

        /*필기.
         *  insert() : 인자로 전달 된 값을 문자열로 변환후 지정한 인덱스에 추가
         *  */

        System.out.println("insert() : " + sb.insert(1,"vaor"));
        System.out.println("sb = " + sb);

        /*필기.
         *  reverse() : 문자열 인덱스 순번을 역순으로 재배열 한다*/
        StringBuilder str = new StringBuilder("java");
        System.out.println("reverse() : "+str.reverse());
        System.out.println("str = " + str);


    }
}
