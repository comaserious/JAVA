package com.ohgiraffers.section02.copy;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할수 있다*/

        /*필기.
        *   배열의 복사에는 크게 두가지 종류가 있다
        *   1. 얕은 복사 (shallow copy) : stack에 주소값만 복사(reference 변수에 담겨있는 주소만 복사)
        *   2. 깊은 복사 (deep copy) : heap 의 배열에 저장된 값을 복사 (실제 값을 복사)*/

        /*필기.
        *   얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다
        *   따라서 두 개의 reference 변수는 동일한 배열의 주소값을 가지고 있다
        *   하나의 reference변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하면
        *   다른 reference변수로 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있다*/

        //원본 배열 생성
        int[] originArr = {1,2,3,4,5,6,7};

        //originArr에 저장된 배열의 주소를 copyArr에도 저장해보자

        int[] copyArr = originArr;    //shallow copy

        System.out.println("origin : " + originArr.hashCode());
        System.out.println("copy : " + copyArr.hashCode());

        for(int i = 0 ; i<originArr.length; i++) {

            System.out.println(originArr[i]);



        }

        System.out.println();

        for(int i = 0 ; i<copyArr.length; i++) {

            System.out.println(copyArr[i]);

        }

        System.out.println("=================================================================================");

        copyArr[0] = 99;

        for(int i = 0 ; i<originArr.length; i++){

            System.out.println(originArr[i]);

        }
        System.out.println();

        for (int i = 0 ; i<copyArr.length;i++){

            System.out.println(copyArr[i]);
        }


    }






}
