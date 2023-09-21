package Standard_of_JAVA_1team.Test_230920;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest01_jby {

	public static void main(String[] args) {
		
		String[] strArray = {"아","아아","아아아", "아아아아", "아아아아아", "아아아아아아"};

		Stream<String> sList = Arrays.stream(strArray);
		
		sList.filter(s-> s.length()>=5)
		.forEach(s->System.out.println(s));
		
		
	}

}