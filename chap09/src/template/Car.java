package template;

public abstract class Car {

	public abstract void driveCar();
	public abstract void stopCar();
	
	public abstract void wiper();
	
	public void washCar() {}
	
	public void turnOn() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public final void run() {
		turnOn();
		driveCar();
		wiper();
		stopCar();
		washCar();
		turnOff();
	}
}
