package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100,"Lee");
		studentLee.setKorean(97);
		studentLee.setMath(100);
		
		Student studentKim = new Student(101,"Kim");
		studentKim.setKorean(80);
		studentKim.setMath(75);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		

	}

}
