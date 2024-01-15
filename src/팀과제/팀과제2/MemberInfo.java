package 팀과제.팀과제2;

public class MemberInfo {
    //멤버
    //1.필드
    int no;
    String name;
    String id;
    String pw;
    String num;
    String birth;

    //2.생성자
    MemberInfo(){}

    @Override
    public String toString() {
        return "MemberInfo{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", num='" + num + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }

    MemberInfo(int no , String name, String id, String pw, String num, String birth){
        this.no = no;
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.num = num;
        this.birth = birth;
    }



    //3.메소드

}
