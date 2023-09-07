import java.util.Scanner;

//Q19. for문과 continue문을 사용하여
//2부터 9까지의 구구단 중에서 짝수 단만 출력하는
//자바 프로그램을 제작해 봅니다.

public class Coding_Test19 {

	public static void main(String[] args) {
		
		
		
		//선생님
		int dan;
		int times;
		
		for (dan = 2; dan <= 9; dan++) {
			// 만약에 dan값을 2로 나눈 나머지가 0이 아니라면(홀수라면)
			if (dan %2 != 0) {
				//위에 if문에서 홀수라면 continue문으로 건너뛰고(제외하고), 계속해서 for문을 반복 수행 처리하게 합니다
				continue;
			}
//			System.out.println(dan);
			for (times = 1;  times <= 9; times++) {
				System.out.println(dan + "X" + times + " = " + dan*times);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//MY 풀이
//		Scanner scan = new Scanner(System.in);
//		System.out.println("짝수 구구단을 출력해봅시다");
//		int num = scan.nextInt();
//
//		for (int i = 2; i < 10; i++) {
//			if (i%2==1) {
//				continue;
//			}
//			if (i>10) {
//				break;
//			}
//		for (int j = 1; j < 10; j++) {
//			System.out.println(i + "X" +j + " = " + i*j);
//		}
//		}
//		System.out.println( );


	}
}
