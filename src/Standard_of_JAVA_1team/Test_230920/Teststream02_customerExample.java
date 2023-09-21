package Standard_of_JAVA_1team.Test_230920;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teststream02_customerExample {
	
	public static void main(String[] args) {
		
		//Teststream02_customer를 객체타입으로 사용해 객체 재빈,보영,윤채,승태,대원을 담음
		List<Teststream02_customer> customerList = Arrays.asList(
									new Teststream02_customer("재빈", "0810", 17, "서울특별시"),
									new Teststream02_customer("보영", "0723", 17, "서울특별시"),
									new Teststream02_customer("윤채", "1223", 16, "인천광역시"),
									new Teststream02_customer("승태", "0810", 15, "서울특별시"),
									new Teststream02_customer("대원", "0810", 15, "경기도고양시"));
		
//		//customerList를 스트림으로 생성																				
//		customerList.stream()
//		//filter메서드 활용하여 지역명으로 데이터 객체 추출
//		.filter(c -> c.getAddr().equals("서울특별시"))
//		//map메서드와 getName활용하여 위 추출된 데이터의 값(이름)을 추출
//		.map(c -> c.getName())
//		//forEach메서드 활용하여 조건에 맞게 추출된 데이터의 값(이름) 출력
//		.forEach(cn -> System.out.println("서울에 거주하는 팀원은 " + cn + "입니다!"));
/* 실행결과 :
 * 서울에 거주하는 팀원은 재빈입니다!
 * 서울에 거주하는 팀원은 보영입니다!
 * 서울에 거주하는 팀원은 승태입니다!
 * 
 * */
		
		
		 String seoulResidents = customerList.stream()
				                .filter(c -> c.getAddr().equals("서울특별시"))
				                .map(c -> c.getName())
				                .collect(Collectors.joining(", "));

	        // 출력 결과
	        System.out.println("서울에 거주하는 팀원은 " + seoulResidents + "입니다!");
	        // 실행결과 : 서울에 거주하는 팀원은 재빈, 보영, 승태입니다!
		
	}

}
