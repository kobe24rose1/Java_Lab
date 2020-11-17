package cooperation;

public class Student {

	String studentName;
	int money;
	int grade;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1200);
		money -= 1200;
	}

	public void takeSubway(Subway subway) {
		subway.take(1300);
		money -= 1300;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 금액은 " + money + "원 입니다.");
	}
}

