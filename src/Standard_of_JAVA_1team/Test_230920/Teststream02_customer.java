package Standard_of_JAVA_1team.Test_230920;

//고객 클래스에서 고객의 이름만 추출하여 보여주는 외부반복자 스트림을 소스 코딩합니다.
public class Teststream02_customer {
	
	String name;
	String birth;
	int age;
	String addr;
	
	public Teststream02_customer(String name, String birth, int age, String addr) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getBirth() {
		return birth;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
	
	
	
	
	
	
}
