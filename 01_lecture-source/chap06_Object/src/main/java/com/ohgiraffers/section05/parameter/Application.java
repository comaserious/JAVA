package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 메소드의 파라미터에 대해 이해하고 적용할 수 있다*/

        /*필기.
        *  매개변수(parameter)로 사용 가능한 자료형
        *  1. 기본 자료형(int,String,char,boolean,double 등등)
        *  2. 기본 자료형 배열(int[] , String[], char[], boolean[] , double[] 등등)
        *  3. 클래스자료형
        *  4. 클래스자료형 배열
        *  5. 가변 인자 */

        ParameterTest para1 =new ParameterTest();

        /*목차 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 확인*/

        int num =12;
        para1.testParameterPrimaryType(num);
        System.out.println();

        /*목차 2. 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인*/

        int[] origin = new int[] {1,2,3,4,5};

        System.out.println("인자로 전달하는 값 : "+origin);
        para1.testParameterPrimaryTypeArray(origin);

        System.out.print("변경후 원본 배열의 값 출력 : ");
        for(int i = 0 ; i<origin.length; i++){
            System.out.print(origin[i]+" ");
        }
        System.out.println();

        /*목차 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출*/

        RectAngle square = new RectAngle(12.4,33.2);

        System.out.println("인자로 전달하는 값 : "+square);

        para1.testParameterClassType(square);

        //메소드 호출 후 갑 변경확인
        System.out.println("변경후 사각형의 넓이와 둘레=======================================");
        square.calArea();
        square.calRound();

        /*목차 4. 클래스 자료형 배열은 뒤에서 다룰 예정이다*/

        /*목차 5. 가변인자*/
        /*인자로 전달하는 값의 갯수가 정해져 있지 않을때 가변배열을 이용할수 있다*/

//        para1.testVariableLengthArrayParameter();    //인자가 아무것도 없는 경우 에러 발생
        para1.testVariableLengthArrayParameter("홍길동");   //가변인자는 전달하지 않아도 된다 (한개일수도 없는것도 상정해둔 변수이다)
        para1.testVariableLengthArrayParameter("이순신","볼링");    //1개도 가능
        para1.testVariableLengthArrayParameter("신사임당", "볼링","축구","배드민턴");  // 여러개도 가능
        para1.testVariableLengthArrayParameter("아무개", new String[] {"축구", "볼링","배드민턴","잡기"}); //배열도 입력 가능


    }
}
