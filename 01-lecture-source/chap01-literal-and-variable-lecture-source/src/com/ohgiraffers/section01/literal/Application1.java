package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args){

        /*여러 가지 형태의 값의 형태를 출력할 수 있다. */

        /*1. 숫자 형태의 값*/
        /* 1-1. 정수 형태의 값*/
        System.out.println(1234);
        //123 정수
        /* 1-2 실수 형태의 값*/
        System.out.println(1.123);
        //1.23 소숫점의 값이 포함됨 실수

        /* 2. 문자 형태의 값 출력*/
        System.out.println('a'); // 문자 형태의 값은 홀따옴표(single-quotation)으로 감싸주어야 한다.
        //System.out.println('ab'); // 두 개 이상의 값은 문자로 취급되지 않기 때문에 출력되지 않는다.
        //System.out.println(''); // 아무 문자도 기록되지 않는 경우 에러가 발생한다.
        System.out.println('1'); //숫자값이지만 홀따옴표 감싸져 있는 경우 문자 1로 판단한다.
        System.out.println('남'); //하나의 글자 또한 문자로 판단한다.

        /* 3. 문자열 형태의 값 출력*/
        System.out.println("안녕하세요"); //문자열은 문자 여러개를 나열된 형태를 말하며, 이는 쌍따옴표(double-quotation)으로 감싸주어야한다.
        System.out.println("123"); //정수이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println(""); // 아무것도 없는 빈 쌍따옴표도 문자열로 취급한다. 공백도 문자열로 취급함
        System.out.println("a"); // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다. (문자 a와는 다르다.)

        /* 4. 논리 형태의 값 출력 */
        // 참이냐 거짓이냐 두 가지의 값만 존재한다.
        System.out.println(true); //뱀은 파충류인가요? 참. 이것은 쌍따옴표가 아닌, 논리 연산자라고 하는 논리값이다.
        System.out.println(false); //뱀은 식물인가요? 거짓.

        //true 혹은 false 값을 논리형이라고 한다.





    }
}
