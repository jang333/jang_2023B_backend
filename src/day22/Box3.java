package day22;

public class Box3<T> {
    //제네릭타입 : 클래스 선언시 타입을 정하지 않고 사용할때(객체생성시) 정의

    //1. 필드
    private T t; //t필드는 제네릭타입(타입이 정해져 있지 않다.)

    //2.생성자

    //3.메소드
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}//c e

/*

    Box3<T> box = new Box<>()
    -> ox3<Integer> box = new Box<>()
        box{
            private Integer t
            public Integer getT(){return t;}
            public void setT(Integer t)
        }

    Box3<String> box = new Box<>()
        box{
            private String t
            public String getT(){return t;}
            public void setT(String t)
        }



*/
