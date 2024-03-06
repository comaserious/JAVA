package com.ohgiraffers.section01.array;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 배열에 대해 이해하고 배열의 사용목적을 이해할 수 있다*/

        /*필기.
        *  배열이란?
        *  동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다
        *  배열은 heap 영역에 new 연산자를 이용하여 할당한다*/

        /*필기. 배열의 사용 이유
        *        만약 배열을 사용하지 않는다면 변수를 여러개 사용해야 한다
        *        1. 연속된 메모리 공간으로 관리 할 수 없다
        *        2. 반복문을 이용한 연속처리가 불가능하다*/

        /*목차. 배열의 선언 및 할당*/

        int[] arr = new int[5];

        System.out.println("arr = " + arr);

        /*필기. 하나의 이름으로 관리되는 연속된 메모리 공간이고, 공간마다 찾아갈수 있는 번호(인덱스)를 이용하여 접근한다*/
        arr[0] = 10;    //첫번째 공간에 10을 집어넣은 것이다
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /*필기.
        *  배열의 사용 방법
        *  1. 배열의 선언
        *  2. 배열의 할당
        *  3. 배열의 인덱스 공간에 값 대입*/

        /*목차. 1. 배열의 선언*/

        /*필기.
        *   자료형 [] 변수명;
        *   자료형 변수명[];
        *   이런 식으로 선언할수 있다*/

        /*필기. 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다*/
        int[] num;
        char[] cnum;
        int num1[];     //이런식으로 배열을 선언할수도 있지만 잘 안쓴다

        num = new int[3];  //heap이라는 메모리상에 3칸짜리 박스의 주소를 저장하는 것

        /*필기. 선언한 레퍼런스변수에 배열을 할당하여 대입할수 있다
        *      new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다
        *      발생한 주소를 레퍼런스 변수 (참조형 변수)에 저장하고 이것을 참조하여
        *      사용하기 때문에 참조자료형(reference type)이라고 한다*/

        /*필기. 배열을 할당할 시에는 반드시 배열의 크기를 지정해주어야 한다*/
        int[] iarr;
//        iarr = new int[] ;  //크기를 지정 해주어야 한다

        iarr = new int[5];

        /*필기. 선언과 할당을 동시에 할수 있다*/
        int[] iarr2 = new int[5];


        int age1 = 1;
        int age2 = 2;
        int age3 = 3;
        int age4 = 4;
        int age5 = 5;

        int[] age;
        age = new int[5];

        age[0]=10;
//        age[1]=20;
//        age[2]=30;
//        age[3]=40;
//        age[4]=50;

        System.out.println("age[0] : "+age[0]);
        System.out.println("age[1] : "+age[1]);   //정수의 디폴트값은 0이다
        System.out.println("age[2] : "+age[2]);   //정수의 디폴트값은 0이다
        System.out.println("age[3] : "+age[3]);   //정수의 디폴트값은 0이다
        System.out.println("age[4] : "+age[4]);   //정수의 디폴트값은 0이다

        /*필기.
        *  값의 형태별 기본값
        *  정수 : 0
        *  실수 : 0.0
        *  논리 : false
        *  문자 : \u0000
        *  참조 : null*/

        /*필기.
        *  자바에서 지정한 기본값 외의 값으로 초기화 하고 싶으면 블럭 {} 을 이용한다
        *  블럭 {} 을 사용하는 경우에는 new 를 사용하지 않아도 되며, 값의
        *  갯수 만큼 자동으로 크기가 설정된다*/

        int[] iarr3 = new int[5];

        iarr3[0]=10;
        iarr3[1]=20;
        iarr3[2]=30;
        iarr3[3]=40;
        iarr3[4]=50;

        int[] iarr4 = {10, 20, 30, 40, 50};   //자동으로 길이도 설정되고 값도 초기화 된다

        System.out.println("iarr4 의 길이 : "+iarr4.length);

        int[] iarr5 = new int[] {10, 20, 30, 40, 50};   //사용은 가능하지만 비효율적이다

        System.out.println("iarr5 의 길이 : "+iarr5.length);

        for (int i = 0 ; i<iarr5.length;i++){

            System.out.println("iarr5["+i+"]"+" = "+iarr5[i]);
        }

        //문자열 배열을 만들어 보자
        String[] sarr = {"apple", "banana", "grape", "orange"};

        for (int i =0 ; i<sarr.length;i++) {
            System.out.println("sarr["+i+"]"+" = "+sarr[i]);
        }





    }
}
