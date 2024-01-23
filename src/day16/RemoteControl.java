package day16;

    //추상클래스와 인터페이스를 사용하는 이유 : *다형성

public interface RemoteControl {//tv와 오디오 조작하는 리모컨

    //인터페이스는 인스턴스필드와 정적필드를 가질 수 없다.

    //상수필드 : public static final
    int MAX_VOLUME=10;
    public static final int MIN_VOLUME=0; // public static final 생략가능

    //추상메소드 : 서로 다른 객체들간의 공통적인 메소드를 추출한 것
        // 1.선언부만 작성하고 구현부는 작성하지 않는다.
        // 2.
            // 추상클래스의 public 추상메소드는 abstract 필수 작성
            // 인터페이스의 public 추상메소드는 abstract 생략 가능
        // tv와 오디오의 공통적인 메소드 추출(=전원버튼)

    //구현클래스 : 추상메소드를 구현한 클래스
        // 구현클래스가 꼭 필요한 이유
        // - 추상클래스와 인터페이스는 스스로 객체를 생성할 수 없다.

    public void turnOn();
    public abstract void turnOff(); //public abstract  생략가능
    void setVolume(int volume);

}
