package day08;

import java.util.Scanner;

public class Step4 {//c s
    public static void main(String[] args) {//m s

        Scanner scanner = new Scanner(System.in);

        //1. Phone객체 100개를 저장할 수 있는 Phone배열 선언
            //등록전 : null x 100
        Phone[] phoneBook = new Phone[100];

        while (true){

            for(int i = 0 ; i< phoneBook.length;i++){
                if(phoneBook[i]!=null){
                    System.out.printf("%3d \t %5s \t %12s \n",
                            (i+1),phoneBook[i].name,phoneBook[i].number);
                }
            }

            System.out.print("1.등록 2.삭제 선택> ");
            int ch = scanner.nextInt();
            if(ch==1){
                //1.입력받기
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("번호 : ");
                String number = scanner.next();
                //2. 객체 생성[생성자 선택]

                //필드/메소드 는 객체가 없으면 사용 불가능. [클래스는 설계도]
                    //1.기본생성자 사용시
                //Phone newPhone = new Phone();
                //newPhone.name = name;
                //newPhone.num = number;

                    //2.정의생성자 사용시
                Phone newPhone = new Phone(name,number);

                //3.phoneBook배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for(int i =0 ; i<phoneBook.length;i++){
                    if(phoneBook[i]==null){
                        phoneBook[i]=newPhone;
                        break; //!!! : 빈공간을 찾아서 대입은 했으면 반복종료.
                    }
                }

            }
            if(ch==2){
                System.out.println("삭제할 순번 : ");
                int dNo = scanner.nextInt();
                phoneBook[dNo-1] = null;

                for(int i = dNo-1 ; i < phoneBook.length;i++){
                    if(phoneBook.length-1 == i){break;}
                    phoneBook[i]=phoneBook[i+1];

                }

            }

        }//w e

    }//m e
}//c e
/*

    메모리 구성
        이름과 전화번호를 여러개 저장
        - 예] "유재석","010-3333-3333","강호동","010-4444-4444

        1.변수


 */

//1.기본생성자 사용시
/*
                //1.입력받기
                System.out.println("이름 : ");
                String name = scanner.next();
                System.out.println("번호 : ");
                String num = scanner.next();

                //2.객체 생성
                    //필드/메소드 는 객체가 없으면 사용 불가능. [클래스는 설계도]
                    //1.기본생성자 사용시
                Phone newPhone = new Phone();

                newPhone.name = name;
                newPhone.num = number;

                //3.phoneBook배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for(int i =0 ; i<phoneBook.length;i++){
                    if(phoneBook[i]==null){
                        phoneBook[i]=newPhone;
                        break; //!!! : 빈공간을 찾아서 대입은 했으면 반복종료.
                    }
                }
 */