package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println();
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList stringList = new ArrayList();
		
		for(int i=0; i < stringList.size(); i++) {
			String s = (String)stringList.get(i);
		}
	}
}

