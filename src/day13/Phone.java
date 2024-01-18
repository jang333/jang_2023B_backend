package day13;

public class Phone {
    //멤버
    //1.(접근제한자public/private)(정적static/인스턴스)(final)필드
    public String model;
    public String color;

    //2.(접근제한자public/private)생성자

    //3.(접근제한자public/private)(정적static/인스턴스)(final)메소드
        //1.매개변수:x, 반환값:x
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
        //2.매개변수:String, 반환값:x
    public void sendVoice(String messege){
        System.out.println("자기: "+messege);
    }
        //3.매개변수:String, 반환값:x
    public void receiveVoice(String messege){
        System.out.println("상대방: "+messege);
    }
        //4.매개변수:x, 반환값:x
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }

}
