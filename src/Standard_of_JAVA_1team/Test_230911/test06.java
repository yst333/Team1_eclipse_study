package Standard_of_JAVA_1team.Test_230911;
//랜덤으로 윷을 한번 던지고, 나온 결과 값 만큼 말을 움직이는 자바 프로그램 예시 (아래의 조건을 따르시오.)
//1. 랜덤으로 나온 1,2,3,4,5,6는  도,개,걸,윷,모,빽도의 글자형태로 출력하고, 예) 1-> 도가 나왔습니다.
//2. 랜덤으로 나온 수 만큼 말이 움직이는 문장을 출력하세요. 예) 1칸 만큼 말을 이동하세요.
//3. 단, 4(윷), 5(모)가 나올시 윷을 한 번더 던지고, 나온 수의 합산만큼 말을 움직이는 문장을 출력하세요. 
//ㄴ> 예)윷이 나왔습니다. 개가나왔습니다. 6칸 만큼 말을 이동하세요.

public class test06{

	public static void main(String[] args) {
		
		
		System.out.println("Start 윷놀이");
		int input = 1;
		int sum = 0;
		
		do {
			int num = (int) ((Math.random()*6)+1);
			switch (num) {
			case 1:
				System.out.println("도가 나왔다!");
				sum += num;
				input =0;
				break;
			case 2:
				System.out.println("개가 나왔다!");
				sum += num;
				input =0;
				break;
			case 3:
				System.out.println("걸이 나왔다!");
				sum += num;
				input =0;
				break;
			case 4:
				System.out.println("윷이 나왔다!");
				sum += num;
				break;
			case 5:
				System.out.println("모가 나왔다!");
				sum += num;
				break;
			case 6:
				System.out.println("빽도가 나왔다!");
				sum -= 1;
				input =0;
				break;
			}
		} while (input==1);

		System.out.println(sum+"칸 말을 이동하자!");
		
	}

}
