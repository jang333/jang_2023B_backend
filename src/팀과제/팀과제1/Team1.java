package 팀과제.팀과제1;

import java.util.Scanner;

public class Team1 {//class s

    public static void main(String[] args) {//main s

        Scanner scanner = new Scanner(System.in);

        String 좌석1 = "";      String 좌석2= "";       String 좌석3="";
        String 좌석1시 = "";      String 좌석2시 = "";      String 좌석3시 = "";
        String 좌석1분 = "";      String 좌석2분 = "";      String 좌석3분 = "";
        boolean run = true;
        int total = 0;

        while (run){//w s
            System.out.println("-----------------------------------");
            System.out.println("좌석1 = ["+좌석1+"] | 좌석2 = ["+좌석2+"] | 좌석3 = ["+좌석3+"]");
            System.out.println("-----------------------------------");

            System.out.println("입실 혹은 퇴실 혹은 계산을 입력해주세요");
            String io = scanner.next();

            if(io.equals("입실")) {

                System.out.print("좌석을 선택해 주세요 : ");
                String num = scanner.next();

                if (num.equals("1")) {//if 좌석1 s

                    if (좌석1.equals("")) {
                        System.out.print("전화번호를 입력해주세요");
                        String ph1 = scanner.next();

                        System.out.print("입실 시를 입력해주세요");
                        String t1 = scanner.next();

                        System.out.print("입실 분을 입력해주세요");
                        String m1 = scanner.next();

                        좌석1 += ph1;
                        좌석1시 += t1;
                        좌석1분 += m1;
                    } else {
                        System.out.println("입실불가");
                    }
                }//if 좌석1 e
                else if (num.equals("2")) {//if 좌석2 s
                    if (좌석2.equals("")) {
                        System.out.print("전화번호를 입력해주세요");
                        String ph2 = scanner.next();

                        System.out.print("입실 시를 입력해주세요");
                        String t2 = scanner.next();

                        System.out.print("입실 분을 입력해주세요");
                        String m2 = scanner.next();

                        좌석2 += ph2;
                        좌석2시 += t2;
                        좌석2분 += m2;
                    } else {
                        System.out.println("입실불가");
                    }
                }//if 좌석2 e
                else if (num.equals("3")) {//if 좌석3 s
                    if (좌석3.equals("")) {
                        System.out.print("전화번호를 입력해주세요");
                        String ph3 = scanner.next();

                        System.out.print("입실 시를 입력해주세요");
                        String t3 = scanner.next();

                        System.out.print("입실 분을 입력해주세요");
                        String m3 = scanner.next();

                        좌석3 += ph3;
                        좌석3시 += t3;
                        좌석3분 += m3;
                    } else {
                        System.out.println("입실불가");
                    }
                }//if 좌석3 e
            } else if (io.equals("퇴실")) {//if 퇴실 s
                System.out.print("좌석을 선택해 주세요 : ");
                String num = scanner.next();
                if (num.equals("1")) {//if 좌석1 s

                    if (좌석1.equals("")) {//if 좌석1 s
                        System.out.println("입실이 없습니다.");
                    } else {
                        System.out.print("퇴실 시를 입력해주세요");
                        int oT1 = scanner.nextInt();

                        System.out.print("퇴실 분을 입력해주세요");
                        int oM1 = scanner.nextInt();

                        int iT1 = Integer.parseInt(좌석1시);
                        int iM1 = Integer.parseInt(좌석1분);

                        int 총이용시간 = ((oT1-iT1)*60)+(oM1-iM1);


                        System.out.println("총이용시간은 "+총이용시간+"분 입니다.");

                        total+=총이용시간;

                        좌석1="";
                        좌석1시="";
                        좌석1분="";
                    }//if 좌석1 e
                }
                else if (num.equals("2")) {//if 좌석2 s

                    if (좌석2.equals("")) {//if 좌석1 s
                        System.out.println("입실이 없습니다.");
                    } else {
                        System.out.print("퇴실 시를 입력해주세요");
                        int oT2 = scanner.nextInt();

                        System.out.print("퇴실 분을 입력해주세요");
                        int oM2 = scanner.nextInt();

                        int iT2 = Integer.parseInt(좌석2시);
                        int iM2 = Integer.parseInt(좌석2분);

                        int 총이용시간 = ((oT2-iT2)*60)+(oM2-iM2);

                        System.out.println("총이용시간은 "+총이용시간+"분 입니다.");

                        total+=총이용시간;
                        좌석2="";
                        좌석2시="";
                        좌석2분="";
                    }//if 좌석2 e
                }
                else if (num.equals("3")) {//if 좌석3 s

                    if (좌석3.equals("")) {//if 좌석1 s
                        System.out.println("입실이 없습니다.");
                    } else {
                        System.out.print("퇴실 시를 입력해주세요");
                        int oT3 = scanner.nextInt();

                        System.out.print("퇴실 분을 입력해주세요");
                        int oM3 = scanner.nextInt();

                        int iT3 = Integer.parseInt(좌석3시);
                        int iM3 = Integer.parseInt(좌석3분);

                        int 총이용시간 = ((oT3-iT3)*60)+(oM3-iM3);

                        System.out.println("총이용시간은 "+총이용시간+"분 입니다.");

                        total+=총이용시간;
                        좌석3="";
                        좌석3시="";
                        좌석3분="";
                    }
                }//if 좌석3 e
            }//if 퇴실 s
            else if (io.equals("계산")) {
                System.out.println("총 이용시간은 "+total);
                break;
            }

        }//w e

    }//main e
}//class e
/*
3. 도서관 좌석 프로그램 ( 1~3 좌석 3개 )
   [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
      1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
         String 좌석1 = "";      String 좌석2= "";       String 좌석3="";
         String 좌석1시 = "";      String 좌석2시 = "";      String 좌석3시 = "";
         String 좌석1분 = "";      String 좌석2분 = "";      String 좌석3분 = "";

      2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 좌석 상황을 반복적으로 출력합니다.

      3. 입실: 사용자로부터 좌석 선택과 전화번호 를 입력받습니다.
         - 단 해당 층에 차량이 있을경우 '입실불가' 없으면 '입실완료' 출력 합니다.

      4. 퇴실 : 사용자로부터 좌석 과 현재시간(시/분)을 입력받습니다.
         - 단 해당 층에 차량이 있을경우 '퇴실완료[ 좌석을 이용한 시간(분) : 000분 ] ' 없으면 '입실이 없습니다' 출력 합니다.

      5. 계산 : 총 사용시간을 계산합니다.


 */