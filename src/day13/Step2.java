package day13;

import day11.exam01.package2.C;

public class Step2 {
    public static void main(String[] args) {

        int r = 10;

        //1.상위클래스로 객체 생성해서 메소드 호출시
        Calculator calculator = new Calculator();
        System.out.println("원 면적 : "+calculator.areaCircle(r));

        //2.하위클래스로 객체 생성해서 메소드 호출시
        Computer computer=new Computer();
        System.out.println("원 면적 : "+computer.areaCircle(r));

    }

}
