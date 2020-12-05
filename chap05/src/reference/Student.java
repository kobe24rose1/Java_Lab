package reference;

public class Student {
	
	int studentId;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student() {
		korean = new Subject("국어");
		math = new Subject("수학");
	}
	
	public Student(int id, String name) { // constructor overloading
		this.studentId = id;
		this.studentName = name;
	}
	
	public void setKorean (int score) {
		korean.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korean.getScore() + math.getScore();
		System.out.println(studentName + " 학생의 총점은 " +  total + "점 입니다.");
	}
	

}
