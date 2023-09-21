package Standard_of_JAVA_1team.Test_230920;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

//문자열의 길이가 5이상인 요소만 출력하는 내부반복자 스트림을 소스 코딩합니다.
public class Teststream01 {

	public static void main(String[] args) {
		
		//스캔으로 값을 받기
		Scanner scan = new Scanner(System.in);
		//sList를 동적배열인 ArrayList로 생성
		List<String> sList = new ArrayList<>();
		
		//for문으로 값을 받고 ArrayList의 add메서드로 sList에 값을 추가하기
		for (int i = 0; i < 3; i++) {
			if (i == 2) {
				System.out.print("마지막 단어를 입력하세요==>");
				String inputStr1 = scan.next();
				sList.add(inputStr1);
			}else {
				System.out.print("기분을 나타내는 단어를 입력하세요==>");
				String inputStr = scan.next();
				sList.add(inputStr);
			}
		}
		System.out.println("입력된 단어는 총" + sList + "입니다!");
		
		//sList을 스트림으로 생성
		sList.stream()
		//filter메서드 활용하여 문자열이 5자 이상인 단어를 추출
		.filter(s -> s.length() >=5)
		//forEach메서드 활용하여 문자열이 5자 이상인 단어를 출력
		.forEach(s -> System.out.print("문자열의 길이가 5자 이상인 단어는" + s + "입니다!"));
		
		scan.close();
	}

}
