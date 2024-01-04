package day03;

import java.util.Objects;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        //문제1 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("정수 :"); int i1 = scanner.nextInt();
        System.out.println("7의배수 : "+(i1%7 == 0 ? "O" : "X"));

        //문제2 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("정수2 : "); int i2 = scanner.nextInt();
        System.out.println("홀수"+(i2%2 != 0 ? "O" : "X" ));

        //문제3 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("정수3 : "); int i3 = scanner.nextInt();
        System.out.println("7의 배수이면서 짝수 : "+(i3%7==0 && i3%2==0 ? "O" : "X"));

        //문제4 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("정수4 : "); int i4 = scanner.nextInt();
        System.out.println("11의 배수 이거나 짝수 : "+(i4%11==0 || i4%2==0 ? "O" : "X") );

        //문제5 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
        System.out.print("문제5 정수1 : "); int 정수1 = scanner.nextInt();
        System.out.print("문제5 정수2 : "); int 정수2 = scanner.nextInt();
        System.out.println("더 큰수 : "+(정수1 > 정수2 ? 정수1 : 정수1<정수2 ? 정수2 : "같다"));

        //문제6 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
            //계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
        System.out.print("반지름 : "); int r = scanner.nextInt();
        double 원넓이 = r*r*3.14;
        System.out.printf("원의 넓이 : %.2f", 원넓이);

        //문제7 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
            //예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
        System.out.print("실수1 : "); double 실수1 = scanner.nextDouble();
        System.out.print("실수2 : "); double 실수2 = scanner.nextDouble();
        double 결과 = 실수1 / 실수2 *100;
        System.out.printf("퍼센트 : %.1f", 결과);

        //문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
            //계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
        System.out.print("윗변 : "); int 윗변 = scanner.nextInt();
        System.out.print("밑변 : "); int 밑변 = scanner.nextInt();
        System.out.print("높이 : "); int 높이 = scanner.nextInt();
        double 사다리꼴넓이 = (윗변+밑변)*높이/2;
        System.out.printf("사다리꼴 넓이 : %.1f" , 사다리꼴넓이);


        //문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
                //계산식) 표준체중 계산식 = > (키 - 100) * 0.9
        System.out.print("키 : "); int 키 = scanner.nextInt();
        System.out.println("표준체중 : "+(int)((키-100)*0.9));


        //문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
            //계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
        System.out.print("키 : "); double 키 = scanner.nextDouble();
        System.out.print("몸무게 : "); double 몸무게 = scanner.nextDouble();
        double bmi = (몸무게/((키/100)*(키/100)));
        System.out.printf("BMI : %.2f",bmi);

        //문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
                //계산식) 1 inch -> 2.54cm
        System.out.print("inch : "); int inch = scanner.nextInt();
        System.out.printf("cm : %.2f", (double)(inch*2.54));

        //문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
            //계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
        System.out.print("중간고사 : "); double a = scanner.nextDouble();
        System.out.print("기말고사 : "); double b = scanner.nextDouble();
        System.out.print("수행평가 : "); double c = scanner.nextDouble();
        System.out.printf("중간고사 = %.2f 기말고사 = %.2f 수행평가 = %.2f", a*0.3,b*0.3,c*0.4);

        //문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
        int x = 10;
        int y = x-- + 5 + --x;
        //printf(" x의 값 : %d , y의값 :  %d ", x, y)

        //문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
        System.out.print("나이 : "); int age = scanner.nextInt();
        System.out.println("직업 : "+(age >= 40 ? "중년" : age >= 20 ? "성인" : age >=10 ? "학생" : "미취학"));

        //문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
        System.out.print("국어 : "); double k = scanner.nextDouble();
        System.out.print("국어 : "); double k = scanner.nextDouble();
        System.out.print("영어 : "); double e = scanner.nextDouble();
        System.out.print("수학 : "); double m = scanner.nextDouble();
        int 총점 = (int)(k+e+m);
        System.out.println("총점 : "+총점);
        System.out.printf("평균 : %.2f",((k+e+m)/3));

        //문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
        System.out.print("아이디 :"); String id = scanner.next();
        System.out.print("비밀번호 :"); String pw = scanner.next();

        System.out.println("로그인 : "+ (id.equals("admin") && pw.equals("1234") ? "성공" : "실패"));

        //문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
        System.out.print("정수1 :"); int a= scanner.nextInt();
        System.out.print("정수2 :"); int b= scanner.nextInt();
        System.out.print("정수3 :"); int c= scanner.nextInt();
        System.out.println(a>b && a>c? a : b>a && b>c ? b : c);
*/


    }
}
