package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. FileReader를 이해하고 사용할 수 있다*/

        /*필기.
         *  FileReader
         *  FileInputStream 과 사용하는 방법이 거의 동일 하다
         *  단, byte 단위가 아닌 character 단위로 읽어들이는 부분이 차이점이다 */

        FileReader file = null;
        try {
            file = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");
//            int value ;
//            while((value =file.read()) != -1){
//                System.out.println((char)value);}


            char[] carr = new char[(int) new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length()];

            file.read(carr);
            for (int i = 0; i < carr.length; i++) {
                System.out.print(carr[i]);
            }


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
