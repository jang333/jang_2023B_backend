package day21;

public class Account {
    //1. 필드
    private long balance;

    //2. 생성자
    public Account(){}

    //3. 메소드
    public long getBalance(){
        return balance;
    }

    //4.메소드
    public void deposit(int money){
        balance+=money;
    }

    //5. 메소드
    public void withdraw(int money)throws InsufficientException{
        if(balance<money){//만약에 예금액보다 출금액이 더 크면

            //우리가 만든 예외 클래스로 예외 발생 시킴
                //throws new 정의예외클래스("메세지")
            throw new InsufficientException("잔고부족");
                //1. try{}catch(){}
                //2. throws

        }
        balance-=money;
    }


}
