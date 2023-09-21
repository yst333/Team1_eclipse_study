package Standard_of_JAVA_1team.Test_230920;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//import Customer.Customer_jby;

public class StreamTest02_jby {

	public static void main(String[] args) {
		
		List<Customer_jby> customerList = Arrays.asList(new Customer_jby("김희선", 40), new Customer_jby("장나라", 30), new Customer_jby("김다미", 20));
		
		Stream<Customer_jby> cList = customerList.stream();
		
		cList.map(c -> c.getName())
		.forEach(s -> System.out.println(s));
		
		
	}

}