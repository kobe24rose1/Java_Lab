package stream;

import java.util.Arrays;

public class ReduceTest { 

	public static void main(String[] args) {
		
		String[] greetings = {"�ȳ��ϼ���!!!!!!!!","hi","hello","cheers","bordure"};

		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> {
						if(s1.getBytes().length >= s2.getBytes().length) 
							return s1;
						else return s2;}
			));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
	}

}