package com.ohgiraffers.section03.copy;

public class Application2 {

    public static void main(String[] args) {
        /* 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */

        /* 얕은 복사의 활용
        * 얕은 복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경우와
        * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
        * */

        String[] name = {"홍길동", "유관순", "이순신"};

        System.out.println("name.hashCode() : " + name.hashCode()); // 1283928880

        /* 1. 인자와 매개변수로 활용 */

        print(name);

        /* 2. 리턴값으로 활용 */
        String[] animals = getAnimals();

        System.out.println("animals.hashcode : " + animals.hashCode());  // 1989780873

        print(animals); //1989780873

        //얕은 복사는 주소값, 그리고 값이 같다. 동일한 배열을 사용하고 싶을 때 사용한다.





    }

    public static void print(String[] sarr){    //String으로 메소드 생성 String배열값을 받을 것이기 때문

        System.out.println("sarr.hashCod() = " + sarr.hashCode());
        for(int i =0 ; i<sarr.length ; i++){
            System.out.print(sarr[i] + " ");

        }
        System.out.println();


    }
    public static String[] getAnimals(){  //매개변수 없이 리턴값만  // static이기 때문에 바로 호출 가능

        String[] animals = new String[] {"뱀", "판다", "다람쥐"};

        System.out.println("새로 만든 animals 주소값 : " + animals.hashCode());

        print(animals); //1989780873



        return animals;  //get
    }


}
