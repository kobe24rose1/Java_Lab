package template;

public class ManualCar extends Car{

	@Override
	public void driveCar() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	public void stopCar() {
		System.out.println("����� �극��ũ�� �����մϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("�����۰� �������� �۵��մϴ�.");
	}

}
