package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {
        /* 수업목표 배열을 사용하는 예시를 이해하고 적용할 수 있다. */
        /* 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 보자. */


        int[] javaScore = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i< javaScore.length ; i++){

            System.out.println((i+1) + "번째 학생의 자바점수를 입력하시오"); // 우리에게 익숙한 것은 1번째부터 세는 것이기에 기본 0에 1을 더한다
            javaScore[i] = sc.nextInt();


        }

        double sum = 0.0;  //초기화해주기
        double avg = 0.0;  //초기화해주기

        for (int i = 0; i<javaScore.length ; i++ ){

            sum+= javaScore[i];

        }

        avg= sum / javaScore.length;

        System.out.println("sum" + sum);
        System.out.println("avg" + avg);

    }



}
