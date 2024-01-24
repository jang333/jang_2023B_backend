package 과제.과제7;

import 과제.과제7.MemberDto;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(true) {


            System.out.println("\n\n--------- 회원 시스템 ---------");
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
            int ch = sc.nextInt();

            if( ch == 1 ) {

                //1.입력받기
                System.out.print("아이디 : ");		String id = sc.next();
                System.out.print("비밀번호 : ");	String pw = sc.next();
                System.out.print("이름 : ");		String name = sc.next();
                System.out.print("전화번호 : ");	String phone = sc.next();
                System.out.print("나이 : ");		int age = sc.nextInt();

                //2. 객체화
                MemberDto memberDto = new MemberDto(id,pw,name,phone,age);

                //3. 컨트롤결과값가져오기
                boolean result = Controller.getInstance().sighup(memberDto);

                //4. 회원가입조건문
                if (result){
                    System.out.println("회원가입완료");
                }else {
                    System.out.println("회원가입실패");
                }

            }
            else if( ch == 2 ) {

                MemberDto memberDto = new MemberDto();

                //1. 입력받기
                System.out.print("아이디 : ");	String id = sc.next();
                System.out.print("비밀번호 : ");	String pw = sc.next();

                boolean result = Controller.getInstance().login(memberDto);

                if(result){
                    System.out.println("로그인성공!");
                }else {
                    System.out.println("로그인실패!");
                }




            }
            else if( ch == 3 ) {//3.아이디찾기

                //1. 입력받기
                System.out.print("이름 : ");		String name = sc.next();
                System.out.print("전화번호 : ");	String phone = sc.next();



            }
            else if( ch == 4 ) {//4.비밀번호찾기

                //1. 입력받기
                System.out.print("아이디 : ");		String id = sc.next();
                System.out.print("전화번호 : ");	String phone = sc.next();



            }


        }// w e
    }// m e
}// c e
