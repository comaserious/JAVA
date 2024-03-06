package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 입출력 스트림에 대해 이해하고 파일을 대상으로 하는 FileInputStream 을 사용할 수 있다*/

        /*필기.
        *  입출력 스트림 개요
        *  프로그래밍 시 많은 종류의 데이터들을 다루어야 한다
        *  하지만 데이터는 프로그램 내부에 있을 수 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수 도 있다
        *  또한 프로그램에서 생성한 데이터를 외부로 출력할 수 도 있다*/

        /*필기.
        *  외부데이터란, 프로그램 외부에 존재하는 모든 데이터를 의마한다
        *  외부데이터는 하드디스크 상의 파일이 될 수 도 있고, 네트워크상에 존재하는 자원이 될 수 도 있다
        *  외부데이터를 대상으로 작업할 때 가장 먼저 해야 할일은 자바프로그램과 외부 데이터를 연결하는 것이다
        *  프로그램과 외부 데이터가 연결 된 길을 스트림(stream)이라고 한다.
        *  스트림은 단방향 이기 때문에
        *  데이터를 읽어 오기 위한 길은 입력 스트림
        *  데이터를 출력하기 위한 길은 출력 스트림*/

        /*필기.
        *  그중 InputStream과 Reader는 데이터를 읽어 오는 입력 스트림이고,
        *  OutputStream 과 Writer는 데이터를 내보내는 출력 스트림이다*/

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

//            /*필기. read() : 파일에 기록된 값을 순차적으로 읽어오고 더이상
//            *               읽어올 데이터가 없는 경우 -1 을 반환 */
//
            int value ;
            while ((value=fin.read()) != -1){

                System.out.println(value);
                System.out.println((char) value);

            }

            /*필기.
            *  한글은 한글자에 3byte 이기 때문에 1byte 씩 값을 읽어오면서 글자가 깨진다*/

            // File 클래스의 length() 로 파일의 길이를 알 수 있다
            System.out.println("파일의 길이 : "+new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            if(fin != null){
                try {
                    /*필기.
                    *  자원 반납을 해야 하는 이유
                    *  1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에 의해
                    *     메모리 누수(leak)가 발생하게 된다
                    *  2. close() 메소드는 자원을 반납하여 flush() 를 해주기 때문에 (flush()란 남아있는 자원을 전부 밀어내버린다 파일안에 데이터를 전부 꺼낸다)
                    *     close() 만 제대로 해줘도 된다
                    *     close() 메소드는 반드시 마지막에 호출해주어야 한다 (안그러면 flush() 효과 때문에 데이터가 전부다 사라지기 때문에)*/
                    fin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
