package day05;

import java.util.Scanner;

public class Step4 {//c s
    public static void main(String[] args) {//m s

        Scanner scanner = new Scanner(System.in);
        //5.int형 데이터를 여러개 저장할 수 있는 배열 선언
        int[] 학생수배열 = new int[0];


        //1.무한루프
        while (true){
            //2.출력
            System.out.println("---------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------------");

            //3.입력
            System.out.print("선택>");
            String no = scanner.nextLine();
            //4.경우의수
            if(no.equals("1")){
                System.out.print("학생수>");
                String 학생수 = scanner.nextLine();
                //while 밖에서 입력받은 수 만큼 배열선언 => 다른 if(){}에서 사용하기 위해
                학생수배열 = new int[Integer.parseInt(학생수)];
            }
            else if(no.equals("2")){
                for(int i = 0 ; i<학생수배열.length;i++){
                    System.out.printf("scores[%d]>",i);
                    학생수배열[i] = Integer.parseInt(scanner.nextLine());
                }
            }
            else if(no.equals("3")){
                for (int i =0 ; i<학생수배열.length;i++){
                    System.out.printf("scores[%d]: %d\n ",i,학생수배열[i]);
                }
            }
            else if(no.equals("4")){

                int max = 0; //임의로 최저점수 대입하고 시작
                int sum = 0;

                for(int i =0 ; i<학생수배열.length;i++){
                    //만약에 i번째 인덱스의 값이 max보다 크면 대입
                    if(학생수배열[i]>=max){max=학생수배열[i];}

                    //평균에서 사용할 누적 합계
                    sum+=학생수배열[i];
                }
                System.out.println("최고 점수 : "+max);
                double avg =sum/학생수배열.length;
                System.out.printf("평균 점수 = %.1f \n",avg);

            }
            else if(no.equals("5")){
                System.out.print("프로그램종료");
                break;
            }
        }

    }//m e
}//c e
