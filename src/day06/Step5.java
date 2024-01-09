package day06;

import java.util.Scanner;

public class Step5 {//c s
    public static void main(String[] args) {//m s
        Scanner scanner = new Scanner(System.in);
        System.out.print("시간(hhmmss형식) : ");
        String time = scanner.nextLine();
        System.out.print("시간(숫자) : ");
        String second = scanner.nextLine();

        String result = "";
        //입력받은 time에서 second만큼 지난 시간을 hhmmss형식으로 출력

        //1. 입력받은 time의 초만 추출
        int ss = Integer.parseInt(time.substring(4,6));
        System.out.println("ss = " + ss);
        ss+= Integer.parseInt(second);

        //2. 입력받은 time의 분만 추출
        int mm =  Integer.parseInt(time.substring(2,4));
        System.out.println("mm = " + mm);
        mm+=(ss/60); //초->분으로 나눈 값을 분에 더한다.

        //3. 입력받은 time의 시만 추출
        int hh = Integer.parseInt(time.substring(0,2));
        System.out.println("hh = " + hh);
        hh+=(mm/60);
            //만약에 시 가 표현하는 범위보다 커지면
        hh=hh>24 ? hh-24 : hh;


        System.out.printf("%2s:%2s:%2s\n",
                hh < 10 ? "0"+hh : hh ,
                mm%60 < 10 ? "0"+mm%60 : mm%60,
                ss%60 < 10 ? "0+ss%60" : ss%60);

        result = (hh < 10 ? "0"+hh : hh) + ":" + (mm%60 < 10 ? "0"+mm%60 : mm%60) + ":" +(ss%60 < 10 ? "0+ss%60" : ss%60);
        System.out.println("result = " + result);

        /*
            [예]
                time = 145930
                second = 70
                    result = 15:00:40
         */

    }//m e
}//c e
