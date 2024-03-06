package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. FileOutputStream 을 이해하고 사용할 수 있다*/

        /*필기.
         *  FileOutputStream
         *  프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다
         *  바이트 단위로 데이터를 처리한다*/

        FileOutputStream file = null;
        try {
            file = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");

            file.write(97);

            /*10은 개행문자라는걸 알 수 있다*/
            byte[] barr = new byte[]{98, 99, 100, 101, 102, 103, 10, 104};

            file.write(barr);

            /*1번 인덱스부터 3의 길이만큼의 파일에 내보내기(해당 예제로 cde를 내보내게 된다)*/
            file.write(barr, 1, 3);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
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
