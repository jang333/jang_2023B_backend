package day06;

import java.util.Scanner;

public class Step6 {//c s
    public static void main(String[] args) {//m s
        Scanner scanner = new Scanner(System.in);

        String 전화번호부 = "";
        String name ="";
        String num = "";

        while (true){
            System.out.println("============= 전화번호부 =============");
            System.out.printf("%2s %5s %11s\n","순번","이름","전화번호");
/**/
            for(int i = 0 ; i<전화번호부.split("/").length; i++){
                if(!전화번호부.equals("")){
                    System.out.printf("%2s \t %5s \t %11s\n", i+1, 전화번호부.split("/")[i].split(",")[0], 전화번호부.split("/")[i].split(",")[1]);
                }
            }
            System.out.println("1.전화번호등록  2.전화번호삭제  3.전화번호출력" );
            System.out.print("선택>");
            int no = scanner.nextInt();



                if(no==1){//if1 s
                    //이름과 전화번호 입력받기
                    System.out.print("이름 : ");
                    name=scanner.next();
                    System.out.print("전화번호 : ");
                    num =scanner.next();

                    전화번호부 += name+","+num+"/";
                    System.out.println(전화번호부);
                    //System.out.println(전화번호부.split("/")[0].split(",")[0]);


                }//if1 e
                else if(no==2){
                    System.out.print("삭제할 순번 : ");
                    int dNo = scanner.nextInt();

                    for(int i = 0 ; i<전화번호부.split("/").length ; i++){
                        if(i==(dNo-1)) {
                            전화번호부 = 전화번호부.split("/")[i] = "";
                        }
                    }


                }//if2 e
                else if(no==3){
                    System.out.println("============= 전화번호부 =============");
                    System.out.printf("%2s %5s %11s\n","순번","이름","전화번호");
                    /**/
                    for(int i = 0 ; i<전화번호부.split("/").length; i++){
                        if(!전화번호부.equals("")){
                            System.out.printf("%2s \t %5s \t %11s\n", i+1, 전화번호부.split("/")[i].split(",")[0], 전화번호부.split("/")[i].split(",")[1]);
                        }
                    }

                }//if3 e
                else{break;}//if e


        }//w e




    }//m e
}//c e

//3. 전화번호부 만들기
        /*
            [1.조건]
                - 하나의 문자열만 이용하여 여러명의 이름과 전호번호를 관리하시오.
                String 전화번호부 = "";

            [2.기능구현]
                1.전화번호 등록
                    - 이름 과 전화번호 를 입력받아 저장.
                2.전화번호 삭제
                    - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
                3.전화번호 출력
                    - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력

            [3.실행화면]
                ============= 전화번호부 =============
                순번     이름      전화번호
                1       김현수     010-3913-2072
                2       유재석     010-1234-1234
                3       강호동     010-7777-7777

                1.전화번호등록 2.전화번호삭제
                선택>
        */