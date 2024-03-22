package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {

        /* 사용자 지정 범위의 난수를 발생시킬 수 있다. */
        /* 난수의 활용
        * Math.random()을 이용해 발생한 난수는 0부터 1 전까지의 실수 범위의 난수값을 반환한다
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우도 존재한다.
        * */

        /* 원하는 범위의 난수를 구하는 공식
        * (int)(Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 */

        /*1. 0~9까지의 난수 발생 */
        int random1 = (int)(Math.random() * 10 );    //난수는 실수범위의 값을 보여주기에 정수값만을 출력하기 위하여 int로 변환해준다.
        System.out.println("0부터 9사이의 난수 : " + random1);

        /* 2. 1부터 10까지의 난수 발생 */
        int random2 = (int)(Math.random() * 10 ) + 1;  // 프로그램은 모든 숫자의 시작, 기본값이 0이기 때문에 1을 더해주는 것이다.
        System.out.println("1부터 10사이의 난수 : " + random2);


        /* 3. 10 ~ 15 까지의 난수 발생 */
        int random3 = (int)(Math.random() * 6 ) + 10;
        System.out.println("10부터 15사이의 난수 :" +random3);






    }
}
