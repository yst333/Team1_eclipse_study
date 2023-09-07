package JYC.CodingTest_class;

import java.util.Scanner;

/*
Q17. 클래스(Class), 메서드(Method), 인스턴스(Instance) 변수,
       Scanner 클래스 등을 활용하여 키보드를 문자열과 두 정수를 입력 받아서,
       다음의 결과 내용을 화면으로 표시하는 자바 프로그램을 제작하시기 바랍니다.

[문자열을 입력 받고 두 정수를 입력 받아서
  다음의 결과 내용을 화면에 표시하는 자바 프로그램 제작]
화면에 출력하고 싶은 문자열을 입력해 주시기 바랍니다 ==> 
화이팅입니다!
덧셈을 희망하는 첫번째 수를 입력해 주시기 바랍니다 ==> 
10
덧셈을 희망하는 두번째 수를 입력해 주시기 바랍니다 ==> 
5
결과 값 = 15.0
결과 값 = 화이팅입니다!
*/

public class Coding_Test17 { 		

	public void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("결과 값 = " + result);
	}
	
	public void printMessage(String str) {
		System.out.println("결과 값 = " + str);
	}
		
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("화면에 출력하고 싶은 문자열을 입력해 주시기 바랍니다 ==> ");
		String str = scan.nextLine();
		System.out.print("덧셈을 희망하는 첫번째 수를 입력해 주시기 바랍니다 ==> ");
		double num1 = scan.nextDouble();
		System.out.print("덧셈을 희망하는 두번째 수를 입력해 주시기 바랍니다 ==> ");
		double num2 = scan.nextDouble();
		
		Coding_Test17 ct17 = new Coding_Test17();
		ct17.add(num1, num2);
		ct17.printMessage(str);
		scan.close();
		}
}







