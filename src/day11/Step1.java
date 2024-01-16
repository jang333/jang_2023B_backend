package day11;

public class Step1 {

    public static void main(String[] args) {

        //1.객체 생성
        Korean k1 = new Korean("123456-1234567","김자바");

        //2.필드호출
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //3.필드값 수정
        //k1.nation="USA"; / final 초기화 이후 수정불가
        //k1.ssn="123-12-12324";

        k1.name = "박자바";

        //상수호출
        System.out.println("지구반지름: "+Korean.EARTH_RADIUS+"km");
        System.out.println("지구의표면적 : "+Korean.EARTH_SURFACE_AREA+"km^2");

    }
}
