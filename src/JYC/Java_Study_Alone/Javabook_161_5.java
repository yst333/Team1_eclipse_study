package JYC.Java_Study_Alone;
//for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
//*
//**
//***
//**
//*
public class Javabook_161_5 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			for (int j =0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*d");
			}
			System.out.println("");
		}
	}
}
