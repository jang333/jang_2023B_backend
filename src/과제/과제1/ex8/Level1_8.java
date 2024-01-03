package 과제.과제1.ex8;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_8 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_8 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String header = "\n============방문록===============\n번호\t 작성자 \t 방문록\n";
		String boardlist = "";
		String footer = "================================\n";
		String output = "";
		
		/* 문제풀이 위치 */
		//1번
		System.out.print("[1]작성자 : ");
		String name = scanner.nextLine();
		System.out.print("[2]방문록 : ");
		String memo = scanner.nextLine();


		boardlist += "1\t "+name+" \t "+memo;

		System.out.print(header);
		System.out.println(boardlist);
		System.out.println(footer);


		//2번
		System.out.print("[2]작성자 : ");
		String name2 = scanner.nextLine();
		System.out.print("[2]방문록 : ");
		String memo2 = scanner.nextLine();

		boardlist += "\n2\t "+name2+" \t "+memo2;

		System.out.print(header);
		System.out.println(boardlist);
		System.out.println(footer);


		//3번
		System.out.print("[3]작성자 : ");
		String name3 = scanner.nextLine();
		System.out.print("[3]방문록 : ");
		String memo3 = scanner.nextLine();

		boardlist += "\n3\t "+name3+" \t "+memo3;

		System.out.print(header);
		System.out.println(boardlist);
		System.out.println(footer);

		//4번
		System.out.print("[4]작성자 : ");
		String name4 = scanner.next();
		System.out.print("[4]방문록 : ");
		String memo4 = scanner.next();

		boardlist += "\n4\t "+name4+" \t "+memo4;

		System.out.print(header);
		System.out.println(boardlist);
		System.out.println(footer);

		//5번
		System.out.print("[5]작성자 : ");
		String name5 = scanner.next();
		System.out.print("[5]방문록 : ");
		String memo5 = scanner.next();

		boardlist += "\n5\t "+name5+" \t "+memo5;

		System.out.print(header);
		System.out.println(boardlist);
		System.out.println(footer);


		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 문자열클래스를 이용하여 그림과 같이 제목과 내용을 입력받습니다. [ 내용만 띄어쓰기가 가능하도록 입력받습니다 ]
		3. *반복문을 사용하지 않고 총 5개의 방문록이 작성 되도록 작성하시오.
		4. 방문록 1번 작성할때마다 방문록을 목록을 보여줍니다.
		5. 기존에 미리 작성된 변수를 최대한 활용합니다.
*/
