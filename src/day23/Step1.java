package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Step1 {
    public static void main(String[] args) {

        //1. 배열타입 : 고정길이
            //객체{객체,객체,객체}
        String[] strArray = new String[3]; //String타입 데이터/객체 3개를 저장/참조 하는 배열 타입
        strArray[0] = "유재석";
        //strArray[1] = 100; //x 타입이 달라서 오류
        strArray[1] = "강호동";
        strArray[2] = "신동엽";
        //strArray[3] = "서장훈"; //ArrayIndexOutOfBoundsException

        System.out.println("배열 상태 : "+strArray);    // Object클래스 toString()메소드 객체의 주소값 반환
        System.out.println("배열 상태 : "+ Arrays.toString(strArray)); // Arrays.toString(배열타입변수) : 해당 배열 상태호출
        System.out.println("배열 요소 호출 : "+strArray[0]);
        System.out.println("배열 길이 : "+strArray.length);

        System.out.println("=================================================");


        //2. 클래스타입 : 컬렉션프레임워크(수집관련 라이브러리 제공)
            //객체{객체,객체,객체}
            //1. ArrayList : 가변길이
        ArrayList<String> strList = new ArrayList<>();
        //클래스명<제네릭타입> 변수명 = new 클래스명<>();
        strList.add("유재석");
        //strList.add(100);
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");

        System.out.println("리스트 상태 : "+ strList);
        System.out.println("리스트 요소 호출 : "+strList.get(0));
        System.out.println("리스트 길이 : "+strList.size());
        strList.remove(1);
        System.out.println("1번 인덱스 삭제 후 리스트 상태 : "+ strList);

        System.out.println("=================================================");

        //3. 가변길이배열객체 만들기
            //SimpleList{객체,객체,객체}
        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("유재석");
        simpleList.add("강호동");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        System.out.println("리스트 상태 : "+simpleList);
        System.out.println("리스트 요소 호출 : "+simpleList.get(3));
        System.out.println("리스트 길이 : "+simpleList.size());
        simpleList.remove(3);
        System.out.println("1번 인덱스 삭제 후 리스트 상태 : "+ simpleList);
        //simpleList.add(100);

        SimpleList<Integer> intList = new SimpleList<>();
        intList.add(100);

        System.out.println("=================================================");

        SimpleMap<String,Object> simpleMap = new SimpleMap();
        simpleMap.add("name","유재석");
        simpleMap.add("age",100);
        simpleMap.add("name","강호동");
        System.out.println("맵 상태 : "+simpleMap);
        System.out.println("맵 요소 호출 : "+simpleMap.get("age"));
        System.out.println("맵 길이 : "+simpleMap.size());
        simpleMap.remove(1);
        System.out.println("1번 인덱스 삭제 후 리스트 상태 : "+ simpleMap);

        HashMap<Integer,String> map = new HashMap<>(){
             {
                 put(1,"사과");
                 put(1,"바나나");
            }
        };
        System.out.println(map);













    }//m e
}//c e
