package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLebron = new Student(100, "Lebron");
		studentLebron.setKorean(100);
		studentLebron.setMath(100);
		
		Student studentMelo = new Student(101, "Melo");
		studentMelo.setKorean(92);
		studentMelo.setMath(78);
		
		studentLebron.showStudentInfo();
		studentMelo.showStudentInfo();

	}

}

