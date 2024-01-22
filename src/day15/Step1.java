package day15;

public class Step1 {//c s
    public static void main(String[] args) {//m s

        //1.객체생성
        Driver driver = new Driver();

        //2.객체생성
        Bus bus = new Bus();
        driver.driver(bus); //버스 운전

        //3.객체생성
        Taxi taxi = new Taxi();
        driver.driver(taxi); // 택시 운전


    }//m e
}//c e
