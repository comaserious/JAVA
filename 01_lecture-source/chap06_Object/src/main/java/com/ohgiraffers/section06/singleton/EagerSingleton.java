package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    /*필기. 클래스가 초기화 되는 시점에서 인스턴스를 생성한다*/
    private static EagerSingleton eager = new EagerSingleton();

    /*필기. 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스 생성을 제한한다*/
    private EagerSingleton() {}

    /*필기. public 메소드로 인스턴스를 반환해준다*/
    public static EagerSingleton getInstance() {
        return eager;

        /*생성자가 private이기 때문에 Application에서 생성자에 접근할수가 없다
        * 따라서 getInstance라는 public의 접근자를 통해 eager 인스턴스에 접근 하도록 만든것인데
        * 해당 메소드의 반환자는 static을 사용해야한다 그이유로는 두가지가 있다
        * 1. eager 인스턴스의 주소를 공유해서 사용하기 위해서
        *    -static이라 함은 공유의 의미도 있다고 배웠다 클래스가 로드될때 생성된 인스턴스의 주소를 같이 사용하기 위해서 static을 쓴다
        * 2. static이 아니면 Application에서 해당 클래스에 접근할 방도가 없다
        *   -생각을 해보자 만약 static이 아니면 Application에서 이 클래스로 접근할 방도가 없다(생성자를 private해놨기 때문에)
        *    따라서 static 을 해야지 EagerSingleton.getInstance(); 로 eager의 주소를 반환 받을수 있게된다 */
    }
}
