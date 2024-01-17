package 과제.과제5;


public class Member {

    //멤버
    //1. 필드
    String id;
    String pw;
    String name;
    String num;
    int age;

    //2. 생성자

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", age=" + age +
                '}';
    }


    //3. 메소드

}
