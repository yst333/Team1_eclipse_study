package JYC.Java_Study_Alone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Practice_Stream_Scanner_Arraylist {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 입력 받을 사람의 수를 물어봅니다.
	        System.out.print("입력 받을 사람의 수: ");
	        int numberOfPeople = scanner.nextInt();
	        scanner.nextLine(); // 개행 문자(\ns) 소비

	        List<Person> people = new ArrayList<>();

	        // 사용자로부터 이름과 나이를 입력받아 객체를 만들어 리스트에 추가합니다.
	        for (int i = 0; i < numberOfPeople; i++) {
	            System.out.println("이름: ");
	            String namePerson = scanner.nextLine();
	            System.out.println("나이: ");
	            int agePerson = scanner.nextInt();
	            scanner.nextLine(); // 개행 문자(\n) 소비

	            Person person = new Person(namePerson, agePerson);
	            people.add(person);
	        }

	        // 리스트를 배열로 변환합니다.
	        Person[] personArray = people.toArray(new Person[0]);

	        // 배열을 출력합니다.
	        System.out.println("입력된 사람들:");
	        Stream.of(personArray)
	            .map(person -> "이름: " + person.getName() + ", 나이: " + person.getAge())
	            .forEach(System.out::println);
	    }
	}
//	class Person {
//		private String name;
//		private int age;
//		
//		public Person(String name, int age) {
//			this.name = name;
//			this.age = age;
//		}
//		
//		public String getName() {
//			return name;
//		}
//		
//		public int getAge() {
//			return age;
//		}
//	}


