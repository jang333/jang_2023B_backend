package day07;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Phone[] phoneBook = new Phone[100];
        System.out.println(phoneBook[0]);
        Phone m1 = new Phone();

        while (true) {
            System.out.println("============= 전화번호부 =============");
            System.out.printf("%2s %5s %11s\n", "순번", "이름", "전화번호");
            /**/
            for(int i = 0 ; i < phoneBook.length; i++){
                if(phoneBook[i]==null){break;}
                    System.out.printf("%2s \t %5s \t %11s\n", i+1, phoneBook[i].name, phoneBook[i].num);
            }
            System.out.println("1.전화번호등록  2.전화번호삭제  3.전화번호출력");
            System.out.print("선택>");
            int no = scanner.nextInt();

            if(no==1){//if1 s
                //이름과 전화번호 입력받기
                System.out.print("이름 : ");
                String name1=scanner.next();
                System.out.print("전화번호 : ");
                String num1 =scanner.next();

                for(int i=0 ; i < phoneBook.length;i++){
                    if (phoneBook[i] == null) {
                        Phone t = new Phone();
                        t.name = name1;
                        t.num = num1;
                        phoneBook[i] = t;
                        System.out.println(phoneBook[0].name);
                        break;
                    }
                    //System.out.println(전화번호부.split("/")[0].split(",")[0]);
                }


            }//if1 e
            else if(no==2){
                System.out.print("삭제할 순번 : ");
                int dNo = scanner.nextInt();

                Phone 복제 = null;
                for(int i = 0 ; i<phoneBook.length; i++){

                    if(i!=dNo-1) {
                        //System.out.println(i);
                        //System.out.println(전화번호부.split("/")[i]);
                        //복제 += phoneBook[i].name;
                    }

                    //phoneBook[] = 복제;


            }//if2 e



            }
        }
    }
}
