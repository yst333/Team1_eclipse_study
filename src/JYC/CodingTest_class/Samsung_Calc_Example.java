package JYC.CodingTest_class;

import java.util.Scanner;

public class Samsung_Calc_Example {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수값을 입력해 주시기 바랍니다 ==> ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수값을 입력해 주시기 바랍니다 ==> ");
		int num2 = scan.nextInt();
		
		SamsungCalcST samCalc = new SamsungCalc(num1, num2);
		System.out.println("삼성 계산기의 덧셈 결과값 = " + samCalc.add());
				
		System.out.println("삼성 계산기의 뺄셈 결과값 = " + samCalc.sub());
		
		System.out.println("삼성 계산기의 곱셈 결과값 = " + samCalc.mul());
		
		System.out.println("삼성 계산기의 나눗셈 결과값 = " + samCalc.div());
	}
}


