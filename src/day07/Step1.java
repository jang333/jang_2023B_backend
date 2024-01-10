package day07;

public class Step1 {//c s
    public static void main(String[] args) {//m s

        //p.202

        //p.210
        //클래스를 이용한 객체 생성
        //1.인스턴스화 키워드 new
            //1.힙영역에 설계도에 따른 메모리 할당
            //2.할당된 메모리의 주소 리턴
        //new

        //2.인스턴스화 할 생성자/클래스명()
        //new Student();

        //3.변수 생성(생성된 객체의 주소를 담기 위해)
            //1.타입(담을 객체 주소의 클래스와 동일) 2.변수명(첫글자를 소문자로 카멜)
        //Student s1;

        //4.객체 주소를 변수에 담기
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다."+s1);

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다."+s2);

    }//m e
}//c e
/*
    객체 지향 프로그램
        -객체들을 먼저 만들고, 이 객체들을 하나씩 조립해서 완성된 프로그램을 만드는 기법
        -객체 : 물리적으로 존재, 개념 중에서 다른 것과 식별 가능한것
        -객체 구성
            -필드/속성 : 객체의 상태
            -메소드/함수/동작 : 객체의 행위
                    사람                         자동차
                    이름,나이 => 필드             색깔,속도 => 필드
                    웃다,먹다 => 메소드           달린다,멈춘다 => 메소드

        -객체의 상호작용
            -객체들 사이의 상호작용 수단은 메소드이다.

                    사람                      키오스크
                    돈 => 필드                 제품가격 => 필드
                               ----제품/돈--->
                    주문선택 => 메소드          주문행위 => 메소드

                              <---주문결과----
            -함수
                    함수호출 : 함수명()
                    상태전달 : 매개변수                     함수명(매개변수)
                    결과리턴 : 호출한 곳으로 돌려주는 값       (return 값)
        -객체 간의 관계
            -혼자서도 가능
            1.집합관계 : 여러개의 객첻ㄹ로 구성된 객체
            2.사용관계 : 객체가 다른 객체를 읽거나 변경하거나 메소드 호출
            3.상속관계 : 객체가 다른 객체에게 (필드랑 메소드) 물려주는 관계

        -객체 지향 프로그래밍의 특징
            1.캡슐화 : 객체내(필드와 메소드)를 외부 객체로부터 접근제한(접근제한자 키워드)
            2.상속 : 객체가 다른 객체에게 물려주는 행위 (상위/부모/슈퍼 객체->하위/자식/서브 객체)
                    -1. 코드의 재사용성을 높인다.
                    -2. 유지보수 최소화
            3.다향성 : 사용방법(행위)은 동일하지만 실행 결과는 다양하게 나오는 성질
                    자동차(객체)
                            -무료 타이어 객체(펑크) ------------> 한국타이어 10만원
                             전진(실행결과)                      한국타이어객체 -> 전진 : 무료타이어 보다 부드러움(실행결과)
                                                 ------------> 금호타이어 20만원
                                                                금호타이어객체 -> 전진 : 많이 부드러움(실행결과)
        -객체와 클래스
            -클래스 : (객체의 설계도)객체를 생성할려면 설계도에 해당하는 클래스
            -인스턴스 : (힙이 생성된 객체)클래스로부터 생성된 객체
            -인스턴스화 : (new)클래스로부터 객체를 만드는 과정

        -클래스 선언
            접근제한자 클래스명
            public
            1.접근제한자 : 해당 클래스에 접근할 수 있는 권한 키워드 public
            2.클래스명 : 첫문자가 대문자인 카멜표기법

        -객체 생성
            클래스명 변수명 = new 생성자/클래스명(매개변수);

        -클래스 용도
            1.라이브러리 클래스 : 일반적인 설계도 목적
            2.실행 클래스 : main()함수를 가지는 프로그램 진입점

        -클래스 구성멤버
            1.필드 : 객체에 데이터를 저장하는 공간, *단 변수와 비슷하지만 다르다.
            2.생성자 : 객체를 생성할때 객체의 초기화 역할을 담당
            3.메소드 : 객체가 수행할 동작

        -


 */