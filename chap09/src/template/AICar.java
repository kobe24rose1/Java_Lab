package template;

public class AICar extends Car{

	@Override
	public void driveCar() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ ��ȯ�մϴ�.");
	}

	@Override
	public void stopCar() {
		System.out.println("�ڵ����� ������ �����մϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("�� ���� �翡 ���� �ڵ����� �����˴ϴ�.");
	}
	
	@Override
	public void washCar() {
		System.out.println("�ڵ����� ������ �Ϸ�˴ϴ�.");
	}
	
}
