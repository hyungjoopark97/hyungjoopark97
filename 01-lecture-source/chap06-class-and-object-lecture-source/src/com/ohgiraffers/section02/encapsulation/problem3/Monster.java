package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    String kinds;
    int hp;

    public void setinfo(String info){
        this.kinds = info;  //이를 통해 name값을 받을 수 있다. name에다가 info를 넣어줄 것임.

    }

    public void setHp(int hp){

        if(hp > 0){

            this.hp = hp;
        }else{

            this.hp = 0;

        }



    }
    public String getInfo(){

        return "몬스터의 이름은 " + this.kinds + "이고 체력은 " + this.hp + "입니다";

    }

}


/*    String name;
    int hp;

    public void setinfo(String info){
        this.name = info;  //이를 통해 name값을 받을 수 있다. name에다가 info를 넣어줄 것임.

    }

    public void setHp(int hp){

        if(hp > 0){

            this.hp = hp;
        }else{

            this.hp = 0;

        }



    }
    public String getInfo(){

    return "몬스터의 이름은 " + this.name + "이고 체력은 " + this.hp + "입니다";*/
