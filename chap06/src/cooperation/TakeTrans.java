package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student Lee = new Student("Lee", 10000);
		Student Kim = new Student("Kim", 6000);

		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);

		Lee.takeBus(bus100);
		Lee.showInfo();
		bus100.showInfo();
		System.out.println();

		Kim.takeSubway(subwayGreen);
		Kim.showInfo();
		subwayGreen.showInfo();
	}
}
