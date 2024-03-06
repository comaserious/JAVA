package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. multi-catch 블럭으로 동일한 레벨의 다른 타입 예외를 하나의 catch 블럭으로 처리 할수 있다*/

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000,3000);
        }
        catch (PriceNegativeException | MoneyNegativeException e) {

            System.out.println(e.getClass()+"발생");
            System.out.println(e.getMessage());

        }

        catch (NotEnoughMoneyException e) {

            /*필기.
            *  예외 클래스명, 예외 발생 위치, 예외 메시지등을 빨간 글씨로 로그 형태로 출력해주는 기능*/
            e.printStackTrace();


        }


    }
}
