package day14;

public class Car {

    //타이어 타입 + 하위객체(한국타이어, 금호타이어)
    Tire tire;

    public void run(){
        tire.roll();
    }


}
/*
    1. 한국타이어 타입 + 하위객체
    HankookTire hankookTire;

    2. 금호타이어 타입 + 하위객체
    KumhoTire kumhoTire;

    3. 타이어 타입 + 하위객체(한국타이어, 금호타이어)
    Tire tire;

    4. 객체 + 자바의 모든 객체
    Object object;
 */
