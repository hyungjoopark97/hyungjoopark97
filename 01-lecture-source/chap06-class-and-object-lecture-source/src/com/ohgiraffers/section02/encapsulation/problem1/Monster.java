package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    /*1. 필드로 이름과 체력을 저장할 공간을 선언*/

    // String name;
    // int hp;

    /*-------------------------------------------------- */

    /*2. setHP를 이용해서 필드에 간접 접근하기. */
    /* hp에 음수가 저장되는 것을 방지하고자 hp가 양수인 경우에만 입력한 hp로 변경하고
     0보다 작은 경우 0으로 변경할 수 있도록 작성해보자.'
     메소드를 이용하면 된다. */

    String name; //필드변수(전역변수)
    int hp; //sethp에 있는 int hp를 돌려받은 것임.

    public void setHp(int hp){ //매개변수

        if(hp > 0){
            System.out.println("양수값이 입력되어 몬스터 체력을 입력한 값으로 변경합니다");

            /* this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 래퍼런스 변수이다.
            지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선으로 접근하기 때문에
            전역변수에 접근하기 위해서는 this.를 명시해야 한다.
            */
            this.hp = hp; //메소드 안에 설정해준 변수 지역변수

        }else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터 체력을 0으로 변경합니다");
            this.hp = 0;


            //지역변수와 전역변수의 이름이 동일한 경우, this를 명시해줘야 한다.
            //내가 생성한 인스턴스에 넣어주세요

        }



    }


}
