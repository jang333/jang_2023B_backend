package day15;

public class SmartPhone extends Phone{

    //부모생성자 호출
    SmartPhone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }

}
