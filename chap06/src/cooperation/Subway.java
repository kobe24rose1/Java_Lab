package cooperation;

public class Subway {

	int lineNumber;
	int money;
	int passengerCount;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.passengerCount++;
		this.money += money;
	}

	public void showInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}
}
