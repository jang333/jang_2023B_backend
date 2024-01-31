package day22;

public class Step1 {
    public static void main(String[] args) {

        //1. 특정 타입의 필드가 아닌 다형성을 이요한 다양한 타입의 필드
        Box box = new Box();
            //2. Object타입 필드에 문자 데이터 대입
        box.content="안녕하세요";
            //3.꺼내기
        System.out.println(box.content);
        String content = (String)box.content; //강제 타입변환
        //자식클래스의 타입을 모르는 경우 => instanceOf 연산자


        //Object타입 필드에 정수 데이터 대입
        box.content =100;
        System.out.println(box.content);
        //int content2 = box.content;
        int content2 = (int)box.content; //강제 타입변환

        //--------------------------------------------------//

        //1. 클래스로 객체를 생성할때 <T> 제네릭 타입 정의
        Box2<String> box2 = new Box2<>();

        //2.
        box2.content = "안녕하세요";
        System.out.println(box2.content);
        String  content3 = box2.content;

        Box2<Integer> box3 = new Box2<>();
        box3.content = 100;
        System.out.println(box3.content);
        int content4 = box3.content;

        //--------------------------------------------------//

        //제네릭에 타입을 지정하지 않았을때 자동으로 Object 로 지정
        Box2 box4 = new Box2();


    }


}
