package day09;

public class Step1 {//c s

    public static void main(String[] args) {//m s

        //p.231
            //JS 코드를 읽어주는 역할 : HTML(JS) <-- 브라우저(프로그램[스레드])
            //JAVA 코드를 읽어주는 역할 : MAIN함수() <-- MAIN스레드

            //!!! 필드/메소드를 사용하기 위해서는 꼭!! 객체가 필요하다
            //Calculator.powerOn();

        //1. 객체 생성
        Calculator myCalc =  new Calculator();
            // ; : 처리 요청
        //2. 객체내 멤버(필드/메소드) 호출
        myCalc.powerOn();
        
        //3. 메소드 호출하고 매개변수 전달
            //-메개변수 타입과 개수에 맞게 제공한다.
        myCalc.plus(5,6);
        //myCalc.plus(오,육); //타입이 불일치
            //- 리턴값이 있는 경우에는 변수에 저장
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 = " + result1);
        
        //4.
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);
        
        

    }//m e
}//c e


