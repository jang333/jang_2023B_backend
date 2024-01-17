package 팀과제.팀과제2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberInfo[] memberInfos = new MemberInfo[100];
        Service[] services = new Service[100];

        int no = 0;

        Scanner scanner = new Scanner(System.in);

        Service basic = new Service("베이직", 10000,"5GB",1,2);
        Service standard = new Service("스탠다드",20000,"10GB",1,2);
        Service premium = new Service("프리미엄",30000,"15GB",1,10);
        System.out.println(basic);
        System.out.println(standard);
        System.out.println(premium);

        int logno = 0;

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

                    logno = no;

                }//ch2 for e
                while (true) {
                    System.out.println("-----------------------------");
                    System.out.println("1.구독신청 | 2.사용현황 | 3.종료");
                    System.out.println("선택 > ");
                    int ch2 = scanner.nextInt();

                    if (ch2 == 1) {

                        System.out.println("-------------------------------");
                        System.out.println("1.베이직 | 2.스탠다드 | 3.프리미엄");
                        System.out.println("선택 > ");
                        int ch3 = scanner.nextInt();

                        if (ch3 == 1) {
                            System.out.print("이용할 달 : ");
                            int mon = scanner.nextInt();

                            int price = mon * basic.price;

                            System.out.println("요금제 : " + basic._class);
                            System.out.println("용량 : " + basic.tb);
                            System.out.println("인원수 : " + basic.nOfP);
                            System.out.println("요금 : " + price + "원");

                            Service serviceInfo = new Service(no, basic._class, basic.tb, basic.month, basic.nOfP);


                        } else if (ch3 == 2) {
                            System.out.print("이용할 달 : ");
                            int mon = scanner.nextInt();

                            int price = mon * standard.price;

                            System.out.println("요금제 : " + standard._class);
                            System.out.println("용량 : " + standard.tb);
                            System.out.println("인원수 : " + standard.nOfP);
                            System.out.println("요금 : " + price + "원");

                            Service serviceInfo = new Service(no, standard._class, standard.tb, standard.month, standard.nOfP);

                        } else if (ch3 == 3) {
                            System.out.print("이용할 달 : ");
                            int mon = scanner.nextInt();

                            int price = mon * premium.price;

                            System.out.println("요금제 : " + premium._class);
                            System.out.println("용량 : " + premium.tb);
                            System.out.println("인원수 : " + premium.nOfP);
                            System.out.println("요금 : " + price + "원");

                            Service serviceInfo = new Service(no, premium._class, premium.tb, premium.month, premium.nOfP);
                        }

                    } else if (ch2 == 2) {

                        if(logno==no){
                            System.out.println(services);
                        }

                    } else if (ch2 == 3) {
                        System.out.println("종료되었습니다.");
                        return;
                    }

                }//w2 e

            }//ch2 if e

        }//w e
    }//m e
}//c e
