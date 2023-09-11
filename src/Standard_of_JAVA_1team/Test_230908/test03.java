package Standard_of_JAVA_1team.Test_230908;

import java.util.Scanner;

// 다음의 문장들을 조건식으로 표현하라.
// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
// 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
// 4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
// 5. char형 변수  ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
// 7. boolean형 변수 powerOn이 false일 때 true인 조건식
// 8. 문자열 참조변수 str이 "yes"일 때 true인 조건식

public class test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		System.out.print("정수를 입력하세요==>");
		int x = scan.nextInt();
		
		if (x >10 && x<20) {
			System.out.println("딩동댕!");
		}else {
			System.out.print("넌 틀렸어");
		}
		
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		System.out.print("정수를 입력하세요==>");
		char ch = (char)scan.nextInt();
		if (ch!==" ") {
			System.out.println("딩동댕!");
		}else {
			System.out.println("넌 틀렸어");
		}
		
		// 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		if (ch==x||X) {
			System.out.println("딩동댕!");
		}else {
			System.out.println("넌 틀렸어");
		}
		
		// 4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
		for (int i = 0; i <= 9; i++) {
			int intNum = i;
			if (ch == i) {
				System.out.println("딩동댕!");
			}else {
				System.out.println("넌 틀렸어");
			}
		}
		
		// 5. char형 변수  ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		
		// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
		System.out.print("정수를 입력하세요==>");
		int year = scan.nextInt();
		if (year%400==0 && year%4==0 && year%100!=0) {
			System.out.println("딩동댕!");
		}else {
			System.out.println("넌 틀렸어");
		}

		
		// 7. boolean형 변수 powerOn이 false일 때 true인 조건식
		boolean powerOn = false;
		if (powerOn) {
			System.out.println("딩동댕!");
		}else if(powerOn!=false){
			System.out.println("넌 틀렸어");
		}
		
		
		// 8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
		System.out.print("yse 또는 no를 입력하세요==>");
		String str = scan.next();
		if (str=="yes") {
			System.out.println("딩동댕!");
		}else {
			System.out.println("넌 틀렸어");
		}
		
		
	}
	
}
