package 과제.과제7;

public class Dto {
    //필드
    private String id;
    private String pw;
    private String name;
    private String phone;
    private int age;

    //생성자
    public Dto(String id, String pw, String name, String phone, int age){
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.phone=phone;
        this.age=age;

    }

    //메소드
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
