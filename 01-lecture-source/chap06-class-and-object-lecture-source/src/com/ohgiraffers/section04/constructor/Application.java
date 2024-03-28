package com.ohgiraffers.section04.constructor;

public class Application {

    public static void main(String[] args) {
        /* 수업목표 - 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. 호출 시 뒤에 붙는 new ~~~가 사실은 생성자였다. */

        /* 생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출한다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default Constructor)라고 하며
        * 기본생성자는 compiler에서 자동으로 추가되기 때문에 지금껏 명시적으로 작성하지 않고 사용할 수 있었던 것이다.
        * 인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무것도 작성하지 않은 것이다.
        *
        * */

        /* 기본생성자를 호출하여 인스턴스 생성 후 필드값을 출력한다.
        * */

        User user1 = new User();
        System.out.println(user1.getinformation()); //값이 다 비어있음을 알 수 있다.

        /*매개 변수를 전달 받는 생성자를 호출해 인스턴스 생성 후 필드값 출력*/
        User user2 = new User("user01", "pass01", "박형주");
        System.out.println(user2.getinformation());
        //세터와 게터가 없음에도 바로 변수를 전달 받아서 출력한다.








    }
}
