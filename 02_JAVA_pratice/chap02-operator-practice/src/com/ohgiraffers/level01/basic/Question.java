package com.ohgiraffers.level01.basic;

public class Question {

    public static void main(String[] args) {

        /* 예제 문제를 기재해주세요 */

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/

        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */

        System.out.println("==========Application 01 =========");

      Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65


		System.out.println(y >= 5 || x < 0 && x > 2); // OR값이므로 y가 5보다 크거나 같기 때문에 자연스럽게 True값이 나온다
		System.out.println(y += 10 - x++); // y += 10의 값은 15, x++는 계산식이 끝난 후 적용되기 때문에 15-2=13이다
		System.out.println(x+=2); // x의 값이 전 계산에서 3으로 바뀌었기 때문에 x=3이므로 +2를 하면 5가 된다.
		System.out.println( !('A' <= c && c <='Z') ); // 'A'는 65,'Z'의 값은 90이므로 'A' <= c는 참, c <='Z'또한 참이기에 'A' <= c && c <='Z' 역시 참이지만 앞에 !가 붙었기 때문에 논리값은 false이다.
		System.out.println('C'-c);  // 67-65=2
		System.out.println('5'-'0'); //
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/





    }

}