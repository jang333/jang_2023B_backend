package day10;

import java.util.Scanner;

public class BankApplication {//실행클래스

    //클래스멤버
    //1.필드
    //여러개의 account 객체를 저장하는 배열
    static Account[] accounts = new Account[100];


    //main() 함수가 아닌 main() 밖에 정적필드로 선언하는 이유 : 여럿 함수에서 사용하려고
    static Scanner scanner = new Scanner(System.in);
    //2.생성자

    //3.메소드

        //2. 계좌생성
    static void 계좌생성(){
        System.out.println("BankApplication.계좌생성");
        // *Account 객체를 만들어서 배열에 저장 목적
        //1.입력받기
        System.out.print("계좌번호 : "); String 계좌번호 = scanner.next();
        System.out.print("계좌주 : "); String 계좌주 = scanner.next();
        System.out.print("초기입금액 : "); int 초기입금액 = scanner.nextInt();

        //2.객체 생성
            //1. 풀생성자
        Account account = new Account(계좌번호, 계좌주, 초기입금액);
            //2. 빈생성자 사용했을때 [권장하지 않음 -> 생성자 또는 메소드를 통한 필드 사용]
        //Account account = new Account();
        //account.계좌번호 = 계좌번호;
        //account.계좌주 = 계좌주;
        //account.입금액 = 초기입금액;

        //3.객체를 배열에 넣는다.
            //정적메소드에서는 인스턴스 필드를 호출할 수 없다.
            //1. 인스턴스 필드를 static 으로 한다.
            //2. 객
        for(int i = 0 ; i<accounts.length ; i++){
            if(accounts[i]==null){
                accounts[i]=account;
                break;
            }
        }

    }
        //3. 계좌목록
    static void 계좌목록(){
        System.out.println("BankApplication.계좌목록");
        //*배열내 반복문을 이용한 모든 계좌객체를 호출
        for(int i = 0 ; i< accounts.length;i++){

            Account account = accounts[i];
            if(account == null)break;
            System.out.printf("%10s \t %5s \t %10d \n", account.계좌번호, account.계좌주,account.입금액);

        }
    }

        //4. 예금
    static void 예금(){
        System.out.println("BankApplication.예금");
        //*입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은 계좌의 예금에 더한다.
        //1.입력받는다.
        System.out.print("예금] 계좌번호 : "); String 계좌번호 = scanner.next();
        System.out.print("예금] 예금액 : "); int 예금액 = scanner.nextInt();
        //2. 계좌목록/배열 에서 입력받은 계좌 찾기
        for(int i = 0 ; i< accounts.length;i++){
            Account account = accounts[i];
            if(account == null)break;
            //만약에 동일한 계좌번호의 객체가 있으면 해당 객체내 입급액을 더한다.
            if(account.계좌번호.equals(계좌번호)){account.입금액 += 예금액; break;}
        }
    }
        //5. 출금
    static void 출금(){
        System.out.println("BankApplication.출금");
        //*입력받은 계좌번호가 계좌목록에 존재하면 입력한 출금액을 찾은 계좌의 예금에서 뺀다.
        //1.입력받는다.
        System.out.print("출금] 계좌번호 : "); String 계좌번호 = scanner.next();
        System.out.print("출금] 출금액 : "); int 출금액 = scanner.nextInt();
        //2. 계좌목록/배열 에서 입력받은 계좌 찾기
        for(int i = 0 ; i< accounts.length;i++){
            Account account = accounts[i];
            if(account == null)break;
            //만약에 동일한 계좌번호의 객체가 있으면 해당 객체내 입급액을 더한다.
            if(account.계좌번호.equals(계좌번호)){account.입금액 -= 출금액; break;}
        }
    }

        //1.실행 시작점
    public static void main(String[] args) {


        while (true){

            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.print("선택 > ");

            int ch = scanner.nextInt();

            if(ch==1){
                계좌생성();
            }
            else if(ch==2){
                계좌목록();
            }
            else if(ch==3){
                예금();
            }
            else if(ch==4){
                출금();
            }
            else if(ch==5){
                System.out.println("프로그램 종료");
                break;
            }

        }
    }

}
