package Day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step1 {
    public static void main(String[] args) {
        try {//만약에 해당 클래스를 못찾았을때 대처.
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){ //예외 클래스 정보를 매개변수를 받는다.
            System.out.println("[시스템오류] : JDBC 드라이버 클래스를 찾지 못했습니다."+e);
        }

        try{ //만약에 연동한 DB서버의 정보가 잘못되거나 DB서버쪽에 문제가 발생했을때 대처
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",    //1. DB서버 주소
                    "root",                                     //2. DB서버 계정명
                    "1234"                                      //3. DB서버 비밀번호
            );
            System.out.println("[시스템정보] : DB서버와 연동을 성공했습니다.");
        }catch (SQLException e){
            System.out.println("[시스템오류] : MYSQL서버와 연동을 실패했습니다."+e);
        }



        //1. Class.forName() : 현재 프로젝트 내 클래스 찾고 메모리로 로딩한다.
        //Class.forName("com.mysql.cj.jdbc.Driver");
            //1. MYSQL 회사의 driver 클래스 찾기 : com 폴더내 mysql 폴더내 cj 폴더내 jdbc 폴더내 Driver 존재
            //2. 해당 폴더 내 driver 클래스를 찾는 과정에서 오류가 발생할수도 있다.
                //- ClassNotFoundException : 클래스를 찾지 못했다는 뜻

        //2.Connection : DB 연동 인터페이스
            //인터페이스 타입으로 변수 선언
        //Connection connection;

            //인터페이스는 스스로 객체를 만들수 없다 [추상]
            // 구현체(구현객체 - 구현클래스(implements)로 생성된 객체)
            // DriverManager.getConnection("DB서버주소/DB명","계정명","비밀번호");연동해서 연동된 구현체 반환
//        Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/test5",
//                "root",
//                "1234"
//        );





    }//m e
}// c e
/*

    예외/오류 처리 : 1.일반예외 2.실행예외
        - 예외/오류가 발생했을때 대처 하기 위해.
        1. 일반예외 : 컴파일시 예외 체크 = 컴파일시 예외/오류 발생
            - 자바 외부(키보드,DB,파일처리)와 통신하는 클래스들
            - 1. Scanner클래스
            - 2. DAO(Data Access Object) : 주로 DB 연동/조작 객체
        2. 실행예외 : 실행중에 예외 체크 = 실행중에 예외/오류 발생
            - 미리 대처하기 힘듦 - 미리 예외/오류를 알고 있는 상태만 대처 가능 - 경험을 통한 대처
            - NullPointerException

    예외/오류 처리
        - 만약에 예외가 발생할것 같은 코드에 처리
        - 문법
            try{ } catch(예외클래스명 변수){ }

 */
