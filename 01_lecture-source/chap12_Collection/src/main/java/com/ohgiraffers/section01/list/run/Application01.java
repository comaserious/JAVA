package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 컬렉션 프레임워크에 대해 이해 할 수 있다*/

        /*필기.
        *  컬렉션 프레임워크(Collection Framework)
        *  자바에서 컬렉션 프레임워크는 여러개의 다양한 데이터를 쉽고 효과적으로 처리할 수 있도록
        *  표준화된 방법을 제공하는 클래스들의 집합을 의미한다
        *  즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리
        *  선지자들이 구현해 두었다*/

        /*필기.
        *  Collection Framework 는 크게 3가지 인터페이스 중 한가지를 상속 받아 구현해 두었다
        *   1. List 인터페이스
        *   2. Set 인터페이스
        *   3. Map 인터페이스*/

        /*필기.
        *   List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에 정의하고 있다
        *  하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다*/

        /*필기.
        *  각 인터페이스별 특징
        *  1. List 인터페이스
        *   - 순서있는 데이터의 집합으로 데이터의 중복 저장을 허용한다
        *   - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다
        *  2. Set 인터페이스
        *   - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다
        *   - HashSet, TreeSet 등이 있다
        *  3. Map 인터페이스
        *   - 키와 값 한 쌍으로 이루어지는 데이터 집합이다
        *   - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고, 중복된 key를 허용하지 않는다
        *   - hashMap, TreeMap, HashTable, Properties 등이 있다*/

        /*필기.
        *  ArrayList 가장 많이 사용되는 컬렉션의 클래스이다
        *  JDK 1.2버전부터 제공
        *  내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다*/

        /*필기.
        *  ArrayList는 배열의 단점을 보완하기 위해서 만들어졌다
        *  배열의 단점 : 크기 변경 불가, 요소의 추가 수정 삭제 정렬 등이 복잡함
        *  따라서 ArrayList는 배열의 단점을 극복하고자
        *  크기 변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가 수정 삭제 정렬 기능을
        *  미리 메소드로 구현하여 제공하고 있다*/

        ArrayList alist = new ArrayList();

        /*필기.
        *  다형성을 적용하여 상위 레퍼런스로 ArrayList 객체를 만들 수 있다
        *  List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
        *  레퍼런스 타입은 List 로 해두는게 더 유연한 코드를 작성하는 것이다*/
        List list = new ArrayList<>();

        alist.add("apple");
        alist.add(123);     //autoBoxing (값 -> 객체/ int -> Integer)
        alist.add(45.6);
        alist.add(new Date());
        // Object 하위클래스는 모두 인자로 받을 수 있다. 즉, 모든 클래슬타입의 인자를 받을 수 있다는 것이다
        // 따라서 123 와 같은 값은 autoBoxing 에 의해 인스턴스하여 들어간 것으로 볼 수 있다

        System.out.println("alist = " + alist);   //toString 메소드가 오버라이딩 되어 있음을 을 알수 있다
        // 집어 넣은 순서대로 출력된것을 보아 순서대로 저장된다는 것을 알 수 있다

        /*필기. arrayList 의 크기 size() 로 확인할 수 있다
        *      단, size() 는 배열의 길이가 아닌 저장된 요소의 갯수를 반환한다*/

        System.out.println("alist 의 size : " + alist.size());

        for(int i = 0 ; i < alist.size(); i++){
            System.out.println("alist.get("+i+")의 값 = " +alist.get(i) );
        }

        /*필기. 데이터의 중복 판단*/
        alist.add("apple");
        System.out.println("alist = " + alist);
        // date 뒤쪽에 다시 apple 값이 출력된것으로 중복 저장된다는 것을 확인할 수 있다

        /*필기. 원하는 인덱스 위치에 값을 추가할 수 있다
        *      새로운 값이 들어가는 인덱스 위치에 값을 넣고 이후 인덱스는 하나씩 뒤로 밀리게 된다*/

        alist.add(1,"banana");
        System.out.println("alist = " + alist);    // 앞서 배운 StringBuilder 의 insert() 와 같은 매커니즘
        alist.remove(2);
        System.out.println("alist = " + alist);   // 해당 인덱스의 요소를 없애고 남은 요소를 앞으로 당겨 저장한다

        alist.set(1,true);
        System.out.println("alist = " + alist);

        List<String> stringList = new ArrayList<>();
        // 모든 컬렉션은 제네릭 타입이기 때문에 타입을 제한할 수 있다
//        StringList.add(123);   지정한 타입 이외의 인스턴스는 저장하지 못한다

        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("StringList = " + stringList);

        Collections.sort(stringList);               // 사전식 오름차순
        System.out.println("stringList = " + stringList);

       stringList = new LinkedList<>(stringList);

       /*필기.
       *  Iterator란?
       *  Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성 할 수 있다
       *  인덱스로 관리되지 않는 컬렉션인경우 반복문을 통해서 요소에 하나씩 접근하지 못할때 주로 사용한다
       *  인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다
       *  hasNext() : 다음 요소를 가지고 있으면 true, 더이상 요소가 없으면 false를 반환
       *  next() : 다음 요소(값)을 반환*/

        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();
        //현재 stringList는 List 타입이다 하지만 descendingIterator() 메소드는 LinkedList 타입에만 존재하는 메소드임으로 List 타입에서 LinkedList클래스 타입으로 형변환
        //그후 descendingIterator() 는 Iterator 타입을 반환 하기 때문에 dIter타입은 Iterator 이고 제네릭은 받는 값이 String 타입이기 때문에 <String>을 집어 넣은 것이다
        //Iterator는 hasNext() 와 next() 메소드를 이용해서 List안에 있는 요소를 하나씩 접근할수 있다

        /*필기. 역순으로 정렬된 결과를 저장하기 위해 새로운 ArrayList를 만들어서 저장*/
        List<String> descList = new ArrayList<>();

        while(dIter.hasNext()){
            descList.add(dIter.next());
        }

        System.out.println("descList = " + descList);



    }
}
