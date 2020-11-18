package staticex;

public class Student {

	static int serialNum = 10000;

	int studentId;
	String studentName;

	public Student() {
		serialNum++;
		studentId = serialNum;
	}

}
