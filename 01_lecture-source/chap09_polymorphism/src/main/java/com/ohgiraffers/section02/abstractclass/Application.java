package com.ohgiraffers.section02.abstractclass;

public class Application {

    public static void main(String[] args) {


        /*수업목표. 추상클래스와 추상메소드에 대해 이해할 수있다*/

        /*필기. 추상클래스와 추상메소드
        *      추상메소드를 0개 이상 포함하는 클래스를 추상클래스라고 한다
        *      추상클래스는 클래스 선언부에 abstract 키워드를 명시해야 한다
        *      추상클래로는 인스턴스를 생성할 수 없다 <=== 중요 new 연산자 사용 불가능
        *      추상클래스를 사용하려면 추상클래스를 상속받은 하위 클래스를 이용해서
        *      인스턴스를 생성해야 한다(다형성을 적용한다는 의미)
        *      이때 추상클래스는 상위 타입으로 사용될 수 있으며, 다형성을 이용할수 있다*/

        /*필기. 추상클래스에 작성한 추상클래스는 "반드시" 후손이 오버라이딩 해서 작성해야한다
        *      추상클래스에 작성한 메소드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는
        *      메소드는 다형성이 적용되어 동적 바인딩에 의해 다양한 응답을 할 수 있다*/

        /*필기.
        *   추상클래를 상속받아 구현할 때는 extends 키워드를 사용하며
        *   자바에서 extends로 클래스를 상속 받을 시 하나의 부모 클래스만 가질 수 있다
        *   (단일 상속의 개념)*/

        /*필기.
        *  추상메소드란?
        *  메소드의 선언부만 있고 구현부{ }가 없는 메소드를 추상 메소드라고 한다
        *  추상메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야 한다
        *  예) public abstract void method();*/

        // Product 추상클래스는 인스턴스를 생성할 수 없다
//        Product p = new Product();

        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone instanceof Product);
        System.out.println(smartPhone instanceof SmartPhone);

        /*필기. 다형성을 적용해서 추상클래스를 레퍼런스타입으로 활용*/
        Product product = new SmartPhone();

        product.abstMethod();
        //추상클래스 본인이 가지고 있는 메소드 호출
        product.nonStaticMethod();

        //static 메소드는 그냥 사용이 가능하다(인스턴스 생성이 불필요)
        Product.staticMethod();

        /*필기.
        *  추상클래스는 왜 쓰나?
        *  추상클래스의 추상메소드는 오버라이딩에 대한 "강제성"이 부여된다
        *  따라서 여러 클래스들을 그룹화하여
        *  필수 기능!!을 정의하여 강제성을 부여해 개발 시 일관 되게 만들 수 있다*/
    }
}

