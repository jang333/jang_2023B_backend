package day01; //현재파일의 패키지(폴더) 위치

public class Step1 { //클래스 선언
    //public class : 클래스 선언 [자바는 무조건 클래스 단위]
        // - *모든코드는 클래스 안에서만 작성해야 한다.
    //클래스명 : Step1
        //*숫자시작x, 공백x, 첫글자 대문자!!
    //{ } : 클래스 블록/지역/정의 하는 곳
    public static void main(String[] args) {

        //main : main() 메소드
        //{ } : 메소드 블록/지역/정의 하는 곳
        //* 실행하면 main() 메소드 블록이 실행됩니다. [ 플로그램의 진입점 ]
            // - 실행[선언/정의 말고]은 무조건 main() 안에서 시작한다.
            // - main() 안에 main 스레드[코드를 읽는 흐름] 포함
        System.out.println("안녕자바"); // - 콘솔에 출력하는 코드 [ JS : console.log]

        //한줄 주석
        /* 여러줄 주석 */

        // 실행문 : 1.변수선언 2.변수대입 3.메소드호출
            //코드마다 ; 끝마침!! [ 생략시 오류 : java ";" expected ]
    }//main end
}//class end
