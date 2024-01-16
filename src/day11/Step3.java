package day11;

public class Step3 {
    public static void main(String[] args) {

        //외부로부터 생성자를 private 했기 때문에 생성 불가능
        //Singleton singleton = new Singleton();

        //1.싱글톤 호출
        Singleton obj1 = Singleton.getInstance();
        //2.싱글톤 호출
        Singleton obj2 = Singleton.getInstance();

        //3. 두변수가 가지는 참조값은 같다
        System.out.println(obj1==obj2); //true

    }
}
