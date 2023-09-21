package JYC.Java_Study_Alone.review;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java16_Stream_ {

	public static void main(String[] args) {

		List<Java16_Stream2> list = Arrays.asList(new Java16_Stream2("장나라", 30),
							new Java16_Stream2("이영애", 33));
		
		Stream<Java16_Stream2> result = list.stream();
//		result.forEach(n ->{ System.out.println( n.getName(), n.getScore());}); 오답
		result.forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name + "의 점수는"+score);
		});
		
	}

}
