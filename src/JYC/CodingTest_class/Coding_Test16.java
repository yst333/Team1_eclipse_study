package JYC.CodingTest_class;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
Q16. Scanner 클래스 활용 키보드로 아이디와 비밀번호를 입력 받아서,
     컬렉션 프레임워크인 Hashtable에 저장 되어 있는 키(아이디)와 값(비밀번호)을
     비교한 후 로그인 여부를 다음의 결과 내용과 같이 출력하는
     자바 프로그램을 제작해 봅니다.

[첫번째 키보드로 아이디와 비밀번호 입력 : 결과 내용]
아이디와 비밀번호를 입력해주세요 ==> 
아이디 : today
비밀번호 : 5678

입력하신 아이디가 존재하지 않습니다!

[두번째 키보드로 아이디와 비밀번호 입력 : 결과 내용]
아이디와 비밀번호를 입력해주세요 ==> 
아이디 : spring
비밀번호 : 1111

비밀번호가 일치하지 않습니다!

[세번째 키보드로 아이디와 비밀번호 입력 : 결과 내용]
아이디와 비밀번호를 입력해주세요 ==> 
아이디 : spring
비밀번호 : 1234

로그인 되었습니다!

*/

public class Coding_Test16{
	public static void main(String[] args) {
		
		
		// Map형 자료구조에 Hashtable 형식으로 String타입의 Key(키)와
		// String타입의 Value(값)으로 데이터를 저장할 수 있도록 합니다.
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "1234");
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요 ==> ");
			System.out.print("아이디 = ");
			String id = scan.nextLine();
			System.out.print("비밀번호 = ");
			String password = scan.nextLine();
			System.out.println("==============================");
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인이 되었습니다!");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다!");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다!");
			}			
		}
	}
}



