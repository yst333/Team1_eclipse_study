package JYC.CodingTest_class;

import java.util.Scanner;

public class Samsung_Calc_BT_Example {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("연산을 수행할 첫번째 정수값을 입력해 주세요 ==> ");
		int num1 = scan.nextInt();
		System.out.print("연산을 수행할 두번째 정수값을 입력해 주세요 ==> ");
		int num2 = scan.nextInt();
		
		Samsung_Calc_BT samCalcBT = new Samsung_Calc_BT(num1, num2);
		System.out.println("삼성 베트남 계산기 덧셈 연산 결과 = " + samCalcBT.add());
		System.out.println("삼성 베트남 계산기 뺄셈 연산 결과 = " + samCalcBT.sub());
		System.out.println("삼성 베트남 계산기 곱셈 연산 결과 = " + samCalcBT.mul());
		System.out.println("삼성 베트남 계산기 나눗셈 연산 결과 = " + samCalcBT.div());	
	}

}
