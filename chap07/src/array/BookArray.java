package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for(int i= 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("�ﱹ��1", "������");
		library[1] = new Book("�ﱹ��2", "������");
		library[2] = new Book("�ﱹ��3", "������");
		library[3] = new Book("�ﱹ��4", "������");
		library[4] = new Book("�ﱹ��5", "������");
		
		for(int i=0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i=0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}

}


