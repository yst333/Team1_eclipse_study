package JYC.Java_Study_Alone;
//중첩 for문을 이용하여 방정식 4x + 5y =60의 모든 해를 구해서 (x,y)형태로 출력해보세요
//단, x와 y는 10 이하의 자연수 입니다.
//힌트1: 변수 선언할 건 없습니다! 그만 for문만 돌려서 i,j로 출력하세요
//힌트2: 0은 자연수가 아닙니다. 실수입니다
public class Javabook_161_4 {

	public static void main(String[] args) {
		
		int num = 0;
		for (int x = 1; x <= 10; x++) {
		num = 60 - (4 * x);
		for (int y = 1; y <= 10; y++) {
			
			if (num - ( 5 * y)==0) {
				System.out.println(x+","+y);
				//60에서 4x를 뺀 나머지를 5y로 뺐을 때 0이되는애 , x 값
				
			}
		}
	}
		
	}

}
