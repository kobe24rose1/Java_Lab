package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3};
		System.out.println(numbers.length);
		
		int[] ids = new int[5];
		for(int i=0; i < ids.length; i++) {
			System.out.println(ids[i]);  // �ʱ�ȭ �ȵ� ���¿��� �����ϱ� 0 ���
		}
	}
}
