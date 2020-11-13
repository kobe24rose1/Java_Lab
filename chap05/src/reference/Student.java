package reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student() {
		korean = new Subject("����");
		math = new Subject("����");
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void setKorean(int score) {
		korean.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total  = korean.getScore() + math.getScore();
		System.out.println(studentName+"�� ������ "+total+"�� �Դϴ�.");
	}

}
