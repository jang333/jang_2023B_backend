package day21;

public class Step1 {
    public static void main(String[] args) {

        try {
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
        System.out.println("args = " + args);
        
    }
    public static void findClass() throws ClassNotFoundException{
        //예외발생
            //1. try{}catch(){} : 해당 코드에 직접 예외처리
            //2. throws         : 예외 떠넘기기
        //1.
        try {
            Class.forName("java.lang.String");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        //2. 해당 메소드 선언부 옆에 throws
        Class.forName("java.lang.String");
    }
}
