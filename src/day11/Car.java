package day11;

public class Car {//c s
    //클래스멤버
        //1.(public, private, (default) )(정적static/인스턴스, final, 상수)필드
    private int speed;      //private 인스턴스 필드
    private boolean stop;   //private 인스턴스 필드


        //2.(public, private, (default) )생성자

        //3.(public, private, (default) )(정적static/인스턴스)메소드
            //1.외부로부터 필드값을 변환해주는 메소드
    public int getSpeed(){
        return this.speed;
    }
            //2.외부로부터 매개변수값을 필드값에 대입해주는 메소드
    public void setSpeed(int speed){
        //매개변수의 유효성검사를 통한 필드값 변경
        if(speed<0){
            this.speed=0;
            return;
        }else {
            this.speed=speed;
        }
    }

            //3. 외부로부터 필드값을 봔환해주는 메소드
    public boolean isStop(){
        return stop;
    }
            //4.외부로부터 매개변수 값을 유효성검사를 통해 필드값 변경
    public void setStop( boolean stop){
        this.stop=stop;
        if(stop==true){
            this.speed=0;
        }
    }


}//c e
