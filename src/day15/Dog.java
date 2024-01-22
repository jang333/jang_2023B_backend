package day15;
//부모클래스를 다형성(타입변환) 목적으로 많이 사용되서 --> 추상클래스 등장
public class Dog extends Animal{
    //만인 상위클래스가 추상클래스이면 부모클래스의 추상메소드를 재정의/오버라이딩 필수
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void breathe() {
        super.breathe();
    }
}
