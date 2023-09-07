package JYC.CodingTest_class;

import java.util.Scanner;

/*
Q15. 객체지향 프로그래밍 언어의 구성요소인 클래스(Class),
       메소드(Method), 변수(Variable) 등을 활용하여
    Scanner 클래스 활용 키보드로 두개의 정수값을 입력 받아서
       사칙 연산을 수행하는 자바 프로그램을 제작하시기 바랍니다.
       이때, 4가지 사칙 연산 함수를 선언한 라이브러리 클래스(Class)명은
    Calculator 로 하고, 실행 클래스(Class)명은 Coding_Test15로 하시기 바라며,
       다음과 같이 실행 결과값이 나타나도록 하시기 바랍니다.

[실행 결과값]
첫번째 정수값을 입력하시기 바랍니다 ==> 14
두번째 정수값을 입력하시기 바랍니다 ==>  7
계산기의 덧셈 연산 결과값 = 21
계산기의 뺄셈 연산 결과값 = 7
계산기의 곱셈 연산 결과값 = 98
계산기의 나눗셈 연산 결과값 = 2

*/

class Coding_Test15 {
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.print("첫번째 정수값을 입력하시기 바랍니다 ==> ");
			int num1 = scan.nextInt();
			System.out.print("두번째 정수값을 입력하시기 바랍니다 ==> ");
			int num2 = scan.nextInt();
			
			Calculator sample = new Calculator(num1, num2);
			
			System.out.println("계산기의 덧셈 연산 결과값 = " + sample.add());
			System.out.println("계산기의 뺄셈 연산 결과값 = " + sample.sub());
			System.out.println("계산기의 곱셈 연산 결과값 = " + sample.mul());
			System.out.println("계산기의 나눗셈 연산 결과값 = " + sample.div());
		}
}

