package day08;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {


        //0. 기본생성자로 객체생성 //기본생성자를 생성한 후엔 가능
        Korean k3 = new Korean();
        System.out.println("k3 = " + k3);
        k3.name = "이자바";
        k3.ssn="100516-2345678";
        System.out.println("k3 = " + k3);

        //1. 기본생성자로 객체 생성 (불가능) //정의된 생성자가 존재하기 떄문
        //Korean k1 = new Korean();
        //1. 정의된생성자로 객체 생성
        Korean k1 = new Korean("박자바", "011225-1234567");
        System.out.println("k1 = " + k1);

        Korean k2 = new Korean("김자바","930525-0654321");
        System.out.println("k2 = " + k2);


    }
}
