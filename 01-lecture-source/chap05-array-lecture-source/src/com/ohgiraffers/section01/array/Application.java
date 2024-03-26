package com.ohgiraffers.section01.array;

public class Application {

    public static void main(String[] args) {


        /* 수업목표. 배열에 대해 이해하고 배열의 사용목적을 이해할 수 있다.*/

        /* 배열이란?
         * 동일한 자로형의 묶음(현속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
         * 배열은 heap 영역에 new연산자를 이용하여 할당한다.
         *
         * */

        /* 배열 사용이유
         * 만약 배열을 사용하지 않는다면 변수를 여러개 사용해야한다.
         *  1. 연속된 메모리 공간으로 관리할 수 없다 (모든 변수의 이름을 사용자가 관리해야한다.)
         *  2. 반복문을 이용한 연속 처리가 불가능하다.
         *  */

        int num = 10;
        int num1 = 20;
        int num2 = 30;
        int num3 = 40;
        int num4 = 50;
        int num5 = 60;

        int sum = 0;

        sum += num;
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;

        System.out.println("sum = " + sum);

        //이제부터 배열

        /*방*/        /*값*/
        int[] arr = new int[5];   //  배열의 선언 및 할당

        /* 하나의 이름으로 관리되는 연속된 메모리 공간이고, 공간마다 찾아갈 수 있는 번호(인덱스)를 이용해 접근한다. */
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /* 값을 대입할 때도 반복문으로 사용할 수 있다. */

        for (int i = 0, value = 0; i < arr.length; i++) {
            /*i 가 0부터 10*/
            arr[i] = value += 10; /*값이 규칙적이라면 위의 배열을 반복문으로도 선언해줄 수 있다. */


        }

        /* 배열의 값을 누적해서 담을 변수 선언 */

        int sum2 = 0;

        sum2 += arr[0];
        sum2 += arr[1];
        sum2 += arr[2];
        sum2 += arr[3];
        sum2 += arr[4];

        System.out.println(sum2);

        int sum3 = 0;

        for (int i = 0; i < arr.length; i++) {  //길이만큼 돌린다
            sum3 += arr[i];


        }

        System.out.println("sum3" + sum3);


    }


}
