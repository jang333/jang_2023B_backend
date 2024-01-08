package 팀과제.팀과제1;

import java.util.Scanner;

public class Team1_2 {//c s
    public static void main(String[] args) {//m s

        Scanner scanner = new Scanner(System.in);

        String[] 좌석배열 = new String[3];
        String[] 시배열 = new String[3];
        String[] 분배열 = new String[3];
        int sum =0;

        while (true){//w s


                // 현재 좌석 상태 출력
                System.out.println("\n------------------- 현재 좌석을 표시합니다. -------------------");
            for(int i=0 ; i < 좌석배열.length;i++) {
                System.out.printf("%13s\t %12s시\t %12s분\n", "좌석"+좌석배열[i], 시배열[i] , 분배열[i] );
            }
            System.out.println("------------------------------------------------------------");


            // 입실/퇴실/계산 선택
            System.out.print("입실/퇴실/계산 중에 선택해 주세요. : ");
            String ch = scanner.next();

            if(ch.equals("입실")){
                System.out.print("좌석 번호를 입력해주세요 1~3 : ");
                int no = scanner.nextInt();
                //좌석, 시 , 분 각각 입력받기
                System.out.print("입실 시 : "); String 시 = scanner.next();
                System.out.print("입실 분 : "); String 분 = scanner.next();


                //배열에 저장하기
                좌석배열[no-1] = String.valueOf(no);
                시배열[no-1] = 시;
                분배열[no-1] = 분;

            }

            else if(ch.equals("퇴실")){
                System.out.print("좌석 번호를 입력해주세요 1~3 : ");
                int no = scanner.nextInt();
                //좌석, 시 , 분 각각 입력받기
                System.out.print("퇴실 시 : "); int 시 = scanner.nextInt();
                System.out.print("퇴실 분 : "); int 분 = scanner.nextInt();

                int 입실시 = Integer.parseInt(시배열[no-1]);
                int 입실분 = Integer.parseInt(분배열[no-1]);

                int 총이용시간 = (시-입실시)*60+(분-입실분);

                System.out.println("총이용시간은 " +총이용시간 +"분 입니다.");

                좌석배열[no-1] = null;
                시배열[no-1] = null;
                분배열[no-1] = null;

                sum += 총이용시간;

            }
            else if(ch.equals("계산")){
                System.out.println("전체이용시간 : "+sum+"분");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }


        }//w e
    }//m e

}//c e
