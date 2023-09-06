import java.util.Scanner;

/*
Q18. 클래스(Class), 메서드(Method)와 매개변수(Parameter), 
       Scanner 클래스 등을 활용하여 키보드를 문자열과 두 정수를 입력 받아서,
       다음의 결과 내용을 화면으로 표시하는 자바 프로그램을 제작하시기 바랍니다.

[문자열을 입력 받고 화면에 반복 출력하고 싶은 횟수를 입력하면
  다음과 같이 결과 내용이 화면에 표시되는 자바 프로그램 제작]
화면에 출력하고 싶은 문자열을 입력해 주세요 ==> 
화이팅입니다!
화면에 반복 출력하고 싶은 횟수를 입력해 주세요 ==> 
3
화이팅입니다!
화이팅입니다!
화이팅입니다!
*/

public class Coding_Test18 {	
	
//	public static void echo(String str, int num) {
//		for (int i = 0; i < num; i++) {
//			System.out.println(str);
//		}
//	}

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("화면에 출력하고 싶은 문자열을 입력해 주세요 ==> ");
//		String inputStr = scan.nextLine();
//		System.out.println("화면에 반복 출력하고 싶은 횟수를 입력해 주세요 ==>");
//		int inputNum = scan.nextInt();
//		
//		echo(inputStr, inputNum);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("화면에 출력하고 싶은 문자열을 입력해 주세요 ==>");
		String str = scan.nextLine();
		System.out.print("화면에 반복 출력하고 싶은 횟수를 입력해 주세요 ==> ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
		


}
}


