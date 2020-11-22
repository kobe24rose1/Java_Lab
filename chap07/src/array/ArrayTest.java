package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3};
		System.out.println(numbers.length);
		
		int[] ids = new int[5];
		for(int i=0; i < ids.length; i++) {
			System.out.println(ids[i]);  // 초기화 안되 상태에서 정수니까 0 출력
		}
	}
}
