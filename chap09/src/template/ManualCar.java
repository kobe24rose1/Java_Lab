package template;

public class ManualCar extends Car{

	@Override
	public void driveCar() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stopCar() {
		System.out.println("사람이 브레이크로 정차합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("와이퍼가 수동으로 작동합니다.");
	}

}
