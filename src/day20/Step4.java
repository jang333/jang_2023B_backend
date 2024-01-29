package day20;

public class Step4 {

    //1. 매개변수 문자의 길이를 알려주는 함수
    public static void printLength(String data){

        //------------- 예외가 발생할 것 같은 코드 -------------//
        try{
            int result = data.length();         //.(도트) : 참조객체에 인스턴스 멤버 호출
            System.out.println("문자수 : "+result);
        }
        //------------- 예외가 발생할 것 같은 코드 -------------//
        //--만약에 try{ } 코드 안에서 예외가 발생하면 catch 실행--/
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.printStackTrace();
        }
        //================================================//
        finally {
            System.out.println("[마무리 실행]");
        }
    }//m e

    public static void main(String[] args) {


        printLength("ThisIsJAVA");
        //1.[실행예외 - 컴파일시 예외 검사 X] NullPointerException
        printLength(null);

        //2.[일반예외 - 컴파일시 예외 검사 O] ClassNotFoundException
        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        //3.다중 catch 가능
        String[] array = {"100","1oo"};

        for(int i = 0 ; i<=array.length ; i++){
            try {
                int value = Integer.parseInt(array[i]); //NumberFormatException : "1oo"는 정수타입으로 변환 불가능
                                                        //ArrayIndexOutOfBoundsException : 2 인덱스는 존재하지 않음
            }catch (NullPointerException | NumberFormatException e){
                System.out.println(i+"숫자로 변활 할 수 없음"+e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(i+"배열 인덱스가 초과됨"+e.getMessage());
            }catch (Exception e){
                System.out.println("상위예외클래스");
            }




        }


    }//m e
}
