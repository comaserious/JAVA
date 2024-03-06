package com.ohgiraffers.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /*필기.
    *  생성자의 작성 위치
    *  문법상으로 클래스 내부에 작성하면 되지만,
    *  통상적으로 필드 선언부와 메소드 선언부 사이에 적는 것이 관례이다*/

    /*필기.
    *  생성자의 사용 목적
    *  1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다
    *  2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며
    *     인스턴스를 생성할 목적으로 주로 사용된다
    *  3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미
    *     따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 있다(초기값 전달 강제)*/

    /*필기.
    *  생성자 작성시 주의할 점
    *   1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다.(대/소문자까지)
    *   2. 생성자 메소드는 반환형(void, int, String, 등등)을 작성하지 않는다(작성하는 경우 생성자가 아닌 일반 메소드로 인식한다*/

    /*필기.
    *  생성자의 종류
    *   1. 기본 생성자(매개변수 없는 생성자)
    *   2. 매개변수 있는 생성자
    *   기본 생성자는 자바 compiler가 자동으로 추가해주는 구문이지만, 명시적으로 작성할 수 있다
    *   매개변수가 있는 생성자가 한 개라도 존재하는 경우에는 기본생성자를 자동으로 추가해주지 않기 때문에
    *   기본 생성자가 필요한 경우에는 반드시 명시적으로 작성해주어야한다 */

    /*목차. 1. 기본 생성자(default constructor)*/

    // public User()가 자동으로 copiler가 넣어준다는 의미다 없어도 이 구문이 있기 때문에 필드값이 초기화 되는 것이다
    //또한 User user = new User(); 이 오른쪽항이 결국 메소드처럼 호출하는 것이었다 즉 메소드의 (argument)처럼 단지 전달인자가 없는 호출이었던것이다
    public User() {
        System.out.println("User 클래스의 기본 생성자 호출함....");
    }

    /*목차 2. 매개변수 있는 생성자*/
    /*필기. id, pwd, name의 초기화를 담당할 생성자*/
    public User(String id, String pwd,String name){

        /*필기. 매개 변수 있는 생성자의 주 목적은 인스턴스 생성 시점에 매개변수로 전달 받은 값을 이용해서 필드를 초기화하는 목적이다*/

        this.id = id;
        this.pwd =pwd;
        this.name=name;
        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함....");
    }

    /*목차 3. 모든 필드를 초기화 하는 생성자*/

    public User(String id, String pwd, String name, java.util.Date enrollDate){

        /*목차. 3-1. 각 필드에 접근하여 초기화 */
//        this.id= id;
//        this.pwd=pwd;
//        this.name=name;
//        this.enrollDate = enrollDate;

        /*목차. 3-2. 사전에 작성되어 있는 다른 생성자 함수를 이용하여 초기화<-- 잘 안쓰임*/

        /*필기.
        *  this() 사용하기
        *  this() 는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출 하는 문구이다.
        *  괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다. (메소드와 동일)  <=메소드의 시그니쳐와 동일 다만 생성자를 호출하는 것이기 때문에 해당생성자 안에 있는 출력문도 가지고오는 것이다
        *  this()는 가장 첫 줄에 선언해야 하며, 그렇지 않는 경우 compile error가 발생한다*/
        this(id,pwd,name);     // 미리 작성한 세 개의 필드를 초기화 하는 생성자로 매개변수로 받은 값을 전달
        this.enrollDate= enrollDate;


        //User 클래스의 id, pwd, name을 초기화하는 생성자 호출함.... 가 한번더 출력된다 즉 복사한 생성자의 필드뿐만 아니라 안에 있는 출력문까지 복사했다는 것을 알수 있다 즉, 생성자 자체를 복사하는 것이다
        System.out.println("User 클래스의 모든 필드를 초기화 하는 생성자 호출함......");
    }

    public String getInfo() {

        return "User [id = "+this.id +", pwd = "+this.pwd +", name = "+this.name +", enrollDate = "+this.enrollDate+"]";
    }

}
