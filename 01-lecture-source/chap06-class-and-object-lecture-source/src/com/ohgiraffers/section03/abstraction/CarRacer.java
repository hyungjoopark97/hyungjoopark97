package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    //이 클래스 내부에서만 사용할 필드의 경우 private으로 선언해준다.

    private Car car = new Car();

    //아래 카레이서의 행동은 main에서 사용할 것이기에 public으로 선언해준다.

    public void startUp(){car.startUp();} //카레이서가 자동차에 시동을 검. 앞은 카레이서의 스타트업이고 뒤는 car의 스타트업이니 햇갈리지 않도록 한다.

    public void stepAccelator(){car.go();} //카레이서가 악셀을 밟는다. 악셀을 밟으면 자동차가 움직이기 시작한다.

    public void stepBreak(){car.stop();}

    public void turnOff(){car.turnOff();}



    }