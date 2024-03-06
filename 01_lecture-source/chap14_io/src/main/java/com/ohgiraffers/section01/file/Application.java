package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        /*수업목표. File 클래스의 사용 용법을 이해할 수 있다*/

        /*필기.
        *  파일처리를 수행하는 대표적인 클래스이다
        *  대상 파일에 대한 정보로 인스턴스를 생성하고
        *  파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공하고 있다*/

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess : "+createSuccess);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
        System.out.println("파일의 크기 : "+file.length()+"byte");
        System.out.println("파일의 경로 : "+file.getPath());
        System.out.println("파일의 상위 경로 : "+file.getParent());
        System.out.println("파일의 절대 경로 : "+file.getAbsolutePath());     // 가지고 있는 전체 경로를 보여 준다

        //파일의 삭제 (삭제 성공후 성공 실패 여부를 boolean 타입으로 변환한다
        boolean deleteSuccess = file.delete();
        System.out.println("deleteSuccess = " + deleteSuccess);


    }
}
