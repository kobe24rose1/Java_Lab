package template;

public class AICar extends Car{

	@Override
	public void driveCar() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 전환합니다.");
	}

	@Override
	public void stopCar() {
		System.out.println("자동차가 스스로 정차합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("비나 눈의 양에 따라 자동으로 조절됩니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("자동으로 세차가 완료됩니다.");
	}
	
}
