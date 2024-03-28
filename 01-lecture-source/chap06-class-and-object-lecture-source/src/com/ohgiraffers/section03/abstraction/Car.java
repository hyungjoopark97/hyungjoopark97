package com.ohgiraffers.section03.abstraction;

public class Car {

    //이 클래스 내부에서만 사용할 필드의 경우 private으로 선언해준다.

    private boolean isOn; //초기에는 시동이 꺼진 false 상태이다.
    private int speed;

   // 아래 카레이서의 행동은 main에서 사용할 것이기에 public으로 선언해준다.

    /*  시동이 걸려있는 상태인 경우 할일이 없고 시동이 걸려있지 않은 경우 시동을 건다.  */
    public void startUp(){

        if(isOn){ //true일 때 시동이 켜졌음을 의미한다.
            System.out.println("이미 시동이 걸려 있습니다.");

        }else{

            this.isOn = true; // 만약 시동이 꺼져있다면 true로 바꿔서 시동을 킨다.
            System.out.println("시동을 걸었습니다. 이제 출발할 춘비가 완료되었습니다.");

        }


    }

    public void go (){
        if(isOn){ //true일 때 시동이 켜졌음을 의미한다.
            System.out.println("차가 앞으로 움직입니다");
            this.speed += 10;  //움직일때마다 10을 더해준다.
            System.out.println("현재 차의 시속은" + this.speed + "km/h 입니다.");

        }else{

            System.out.println("차에 시동이 걸려 있지 않았습니다. 시동을 걸어주세요.");

        }


    }


    public void stop(){
        if(isOn){ //true일 때 시동이 켜졌음을 의미한다.
            if(this.speed>0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");

            }else{

                System.out.println("차는 이미 멈춰있는 상태입니다.");

            }

        }else{

            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 걸어주세요.");

        }


    }

    public void turnOff(){
        if(isOn){//true일 때 시동이 켜졌음을 의미한다.
            if(speed > 0 ){
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 우선 차를 멈춰주세요. ");

            }else{
                this.isOn = false; //시동을 꺼주는 것이다.
                System.out.println("시동을 끕니다. 다시 운행하시력면 시동을 켜주세요.");
            }

        }else{

            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동의 상태를 확인해주세요.");

        }

    }




}
