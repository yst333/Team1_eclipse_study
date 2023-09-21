
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class person {

	private String name;
	private int age;

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class Test06_ljb {
	public static void main(String[] args) {
		// 1.
		List<String> sList = new ArrayList<>(Arrays.asList("james", "mark", "steve", "been"));

		sList.stream()
		.filter(s -> s.length() >= 5)
		.forEach(s -> System.out.println(s));

		System.out.println("======================");

		// 2.
		List<person> customerList = Arrays.asList(new person("james", 30), new person("mark", 31),
				new person("steve", 35), new person("been", 40));
		customerList.stream()
		.map(c -> c.getName())
//		.map(person::getName)
		.forEach(s -> System.out.println(s));
	}
}
