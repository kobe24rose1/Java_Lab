package template;

public abstract class Car {

	public abstract void driveCar();
	public abstract void stopCar();
	
	public abstract void wiper();
	
	public void washCar() {}
	
	public void turnOn() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
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
