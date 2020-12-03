package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("Sean");
		sList.add("Tom");
		sList.add("Lee");
		
		Stream<String> sStream = sList.stream();
		sStream.forEach(s -> System.out.println(s));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.println(s));
		
	}

}
