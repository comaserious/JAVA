package com.ohgiraffers.section02.string;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. String 클래스의 자주 사용하는 메소드에 대해 알 수 있다*/

        /*필기.
         *  charAt(): 해당문자열의 특정 인덱스에 해당하는 문자를 반환한다*/

        String str1 = "apple";

        for(int i =0 ; i<str1.length();i++){
            System.out.println("charAt("+i+") = "+str1.charAt(i));
        }

        /*필기.
           compareTo() : 인자로 문자열을 전달하여, 같으면 0을 반환, 전달된 문자열이 작으면 음수
                         크면 양수를 반환한다*/

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("comapareTo() : "+(str2.compareTo(str3)));
        System.out.println("comapareTo() : "+(str2.compareTo(str4)));
        System.out.println("comapareTo() : "+(str4.compareTo(str2)));

        /*필기. compareToIgnoreCase() : 대소문자 구분하지 않고 비교*/
        System.out.println("compareToIgnoreCase() : "+(str2.compareToIgnoreCase(str4)));
        System.out.println("compareToIgnoreCase() : "+(str2.compareToIgnoreCase(str4)));

        /*필기. concat() : 문자열 합쳐주기, 원본 문자열에는 영향을 주지 않는다*/
        System.out.println("concat() : "+str2.concat(str5));

        System.out.println(str2);

        /*필기. trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다*/
        String trimstr = "            java               "; //공백문자가 들어있다

        System.out.println("trimstr : #"+trimstr+"#");
        System.out.println("trimstr : #"+trimstr.trim()+"#");

        /*필기. toLowerCase() : 모든 문자를 소문자로 변환 -> 반대 toUpper*/
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : "+ caseStr.toLowerCase());

        /*필기. length() : 문자열의 길이를 정수형으로 반환*/
        System.out.println("length() : "+caseStr.length());

        /*필기. replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경하여 반환 , 원본에는 영향을 주지 않는다*/
        String javaOracle = "javaoracle";
        System.out.println("replace() : "+javaOracle.replace("java","python"));

        /*필기. isEmpty() : 문자열의 길이가 0 이면 true 아니면 false*/
        System.out.println("isEmpty() : "+"".isEmpty());
        System.out.println("isEmpty() : "+"absa".isEmpty());
    }
}
