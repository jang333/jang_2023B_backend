package day05;

import java.util.Scanner;

public class Step3 {//class s
    public static void main(String[] args) {//m s

        //*입력객체
        Scanner scanner = new Scanner(System.in);
        //5-1 저장할 (배열)변수 선언
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호배열 = new int[3];

        //1.무한루프
        while (true){//while s
            //2.출력
            System.out.println("==========방문록============");
            System.out.println("1.방문록작성 2.방문록삭제 3.종료");
            for(int i =0 ; i<내용배열.length;i++){
                System.out.printf("%2d \t %-5s \t %-20s \n",i+1, 작성자배열[i], 내용배열[i]);
            }
            //3.입력
            System.out.print("선택> "); int ch = scanner.nextInt();

            //4.입력에 따른 경우의수 판단
            if(ch==1){
                //6-1 방문록 작성할 위치(인덱스) 입력받는다
                System.out.print("방문록 작성 위치 1~3 : ");
                int no = scanner.nextInt();
                //6-2 입력 : 내용, 작성자, 비밀번호 각각 입력받기
                scanner.nextLine();
                System.out.print("내용 : "); String content= scanner.nextLine();
                System.out.print("작성자 : "); String writer = scanner.next();
                System.out.print("비밀번호 : "); int password = scanner.nextInt();
                //6-3 배열에 각각 대입하기
                내용배열[no-1] = content;
                작성자배열[no-1] = writer;
                비밀번호배열[no-1] = password;
            }
            else if(ch==2){
                //8-1입력 : 삭제할 방문록의 위치(인덱스)
                System.out.print("방문록 삭제 위치 1,2,3 : ");
                int no = scanner.nextInt();

                //8-2입력 : 유효성 검사를 위한 비밀번호 입력
                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();

                //8-3 초기화 : 위치와 비밀번호 일치에 따른 각 (배열)변수를 기본값으로 대입
                    //만약에 인덱스가 없는 번호를 선택했을때
                if(no<1 || no > 내용배열.length){
                    System.out.print("[경고] 알 수 없는 위치입니다.");
                }
                    //만약에 선택한 방문록의 패스워드와 방금입력한 패스워드가 같으면
                if(비밀번호배열[no-1] == password){
                    //배열의 항목/요소의 자리/길이 삭제할수 없으므로 초기값으로 대입
                    내용배열[no-1] = null; 작성자배열[no-1]=null; 비밀번호배열[no-1]=0;
                }else{
                    System.out.println("[경고]패스워드가 다릅니다.");
                }

            }
            else if(ch==3){
                break;
            }
            else{
                System.out.println("[경고] 알수없는 입력입니다.");
            }

        }//while e
    }//m e
}//class e