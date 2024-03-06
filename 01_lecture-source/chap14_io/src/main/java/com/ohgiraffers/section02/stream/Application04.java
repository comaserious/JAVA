package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application04 {

    public static void main(String[] args) {

        /*수업목표. FileWriter 를 이해하고 사용할 수 있다*/

        /*필기.
         *  FileWriter
         *  프로그램의 데이터를 피일로 내보내기 위한 용도의 스트림이다
         *  한 글자 단위로 데이터를 처리한다 (문자)*/

        FileWriter file = null;
        try {
            file = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            file.write(97);
            file.write('A');

            file.write(new char[]{'a', 'p', 'p', 'l', 'e'});
            file.write("하이미디어");


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
