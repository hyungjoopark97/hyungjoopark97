package com.ohgiraffers.section04.sort;

public class Application2 {
    public static void main(String[] args) {

        /* 순차정렬에 대해 이해하고 활용할 수 있다.
         * 순차 정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
         * 배열의 처음과 끝을 탐색하면서 순차대로 정렬하는 가장 기초적인 정렬 알고리즘이다. */

        int[] iarr = {2, 5, 4, 6, 1, 3};

        /* 인덱스를 한 개 씩 증가시키는 반복문 */
        for (int i = 1 /*1회전을 의미한다*/; i < iarr.length; i++) {  // 0부터 시작하면 비교대상이 없기 때문에 i의 값을 1로 넣어주어서 2번째와 1번째가 비교되는 것으로 시작되어야 한다.
            /* 인덱스가 증가할 때마다 처음부터 해당 인덱스까지 값을 비교하는 반복문 */
            for (int j = 0; j < i; j++) {  //1번째를 의미

                if (iarr[i] < iarr[j]) {  // 만약 뒤의 숫자가 앞의 숫자보다 작다면
                    int temp;            //

                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;


                }


            }


        }

        for (int i : iarr) {

            System.out.print(i + " ");


        }

    }

}