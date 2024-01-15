package 팀과제.팀과제2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberInfo[] memberInfos = new MemberInfo[100];

        Scanner scanner = new Scanner(System.in);

        int no = 0;
        while (true){
            System.out.println("------------------------");
            System.out.println("1.회원가입 | 2.로그인");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();

            if(ch==1) {

                no++;

                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();
                System.out.print("전화번호 : ");
                String num = scanner.next();
                System.out.print("생일 : ");
                String birth = scanner.next();

                MemberInfo memberInfo = new MemberInfo(no, name, id, pw, num, birth);

                System.out.println(memberInfo);

            }
            else if(ch==2){
                System.out.print("아이디 : ");
                String inId = scanner.next();
                System.out.print("비밀번호 : ");
                String inPw = scanner.next();

                for(int i=0; i<memberInfos.length; i++){
                    if(memberInfos[i]==null)break;
                    memberInfos[i].id.equals(inId);
                    memberInfos[i].pw.equals(inPw);

                }//ch2 for e

                System.out.println("----------------------");
                System.out.println("1.구독신청 | 2.사용현황 | 3.종료");
                System.out.println("선택 > ");
                int ch2 = scanner.nextInt();

                if(ch2 ==1){}
                else if(ch2==2){}
                else if(ch2==3){
                    System.out.println("종료되었습니다.");
                    break;
                }

            }//ch2 if e

        }//w e
    }//m e
}//c e
