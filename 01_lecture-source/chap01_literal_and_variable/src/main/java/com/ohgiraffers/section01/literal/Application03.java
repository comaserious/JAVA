package com.ohgiraffers.section01.literal;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 문자열 합치기 결과를 예측하고 사용할 수 있다*/
        /*목차. 1. 두 개의 문자열합 */
        System.out.println("=====================================두개의 문자열 합치기================================");
        System.out.println(9 + 9);                  //18
        System.out.println("9" + 9);                //99
        System.out.println(9 + "9");                //99
        System.out.println("9" + 9);                //99
        System.out.println("9" + "9");              //99

        // 필기. 다시 말하지만 문자열과 합치면 문자열간의 합치기로 인식한다


        /*목차. 2. 세 개의 문자열 합치기*/
        System.out.println("===================== 세 개의 문자열 합치기================================================");
        System.out.println(9 + 9 + "9");          // 일반적인 연산처럼 왼쪽에서 오른쪽으로 순차적으로 연산을 한다 189
        System.out.println(9 + "9" + 9 );         // 9 + "9" 문자열이 되기 때문에 "99" + 9 가 된다
        System.out.println("9" + (9 + 9));          // 일반적인 사칙연산의 순서를 따른다      918
        System.out.println("9" + 9 * 9);             // 981

        System.out.println("=======================10 과 20 의 사칙연산 결과 보기 좋게 출력하기=============================");
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 합 : " + 10 + 20); //괄호를 묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 된다





    }
}
