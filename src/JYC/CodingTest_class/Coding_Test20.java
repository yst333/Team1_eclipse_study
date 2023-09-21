package JYC.CodingTest_class;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/*
Q20 : 람다식을 활용해서 반복문을 처리하는
        자바 프로그램을 만들어 보시기 바랍니다.
*/

public class Coding_Test20 {

	//쌤 풀이
	//합계값을 저장할 static 정수형 sum 변수를 선언하고 0으로 초기화 처리해줍니다.
	static int sum =0;
	
	public static void main(String[] args) {
		
			//내 풀이
//			List<String> list = Arrays.asList("장나라","김희선","김국진");
//			Stream<String> result = list.stream();
//			result.forEach(s->System.out.println(s));

		//컬렉션 프레임워크인 List의 제네릭 Integer 타입으로 list 변수를 선언하고,
		//Arrays.asList 메서드로 1,2,3,4,5 정수를 좌측편 list 변수에 대입해 줍니다.
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//list 변수를 stream API 적용하여, forEach문으로 각각 반복 처리하며,
		//람다식을 활용하여 매개변수 i를 sum변수에 누적 합계 처리해 줍니다.
		list.stream()//스트림 생성
		//최종 연산 처리에 람다식을 활용합니다.
//		.forEach(i -> System.out.print(i + " ")) //1 2 3 4 5 
		.forEach(i -> {sum+= i;}); //sum = sum+i; {}은 생갹가능하다
		System.out.println("합계 = " + sum);
		
		

	}
}



