package day21;

public class Car {


    private Tire tire1 = new Tire();
    //익명자식객체 : private Tire tire2 = new Tire(){//재정의};
        //상속일때만 가능
        // 자식클래스가 없음 -> 설계도 없음 -> 재사용 불가능 => 단일 자식 객체에 사용

    //1. 필드에 익명 자식객체 대입
    private Tire tire2 = new Tire(){
        @Override
        public void roll() {
            System.out.println("금호타이어가 굴러 갑니다.");
        }
    };

    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    public void run2(){
        //2. 지역변수에 익명자식객체 대입
        Tire tire = new Tire(){

            @Override
            public void roll() {
                System.out.println("한국타이어가 굴러 갑니다");
            }
        };
    }

    //3. 매개변수에 익명자식객체 대입
    public void run3(Tire tire){
        tire.roll();
    }

}//class end
