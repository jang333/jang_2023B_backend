package day10;

public class Step4 {//c s
    public static void main(String[] args) {//m s

        //0.인스턴스 필드 호출
            //오류 : 인스턴스 필드 사용시 객체 필요
        //System.out.println(Calculator.pi2);
        //1.정적필드 호출
        System.out.println(Calculator.pi);

        //0.인스턴스 메소드 호출
            //오류 : 인스턴스 메소드 사용시 객체 필요
        //Calculator.plus2(10,5);
        //1. 정적메소드 호출
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);

    }//m e
}//c e
