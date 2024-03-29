package day14;

public class Step3 {

    public static void main(String[] args) {

        //1. 객체생성
        Car myCar = new Car();
        //myCar.tire=null;
        //2.객체의 필드 값 수정 => 타이어 장착
        myCar.tire = new Tire();
            //myCar.tire = Tire 객체참조;
        myCar.run();
        //---------필드 다형성 : 필드가 가지고 있는 객체참조의 타입을 변경---------//
        myCar.tire = new HankookTire();
            //myCar.tire = HankookTire 객체참조;
        myCar.run();
        //
        myCar.tire = new KumhoTire();
        myCar.run();

        myCar.tire=null;


    }
}
