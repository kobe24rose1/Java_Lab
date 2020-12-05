package hiding;

class Birthday {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("��¥ �����Դϴ�.");
			}
		} else {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

public class BirthdayTest {

	public static void main(String[] args) {

		Birthday day = new Birthday();

		// day.month = 2; day.year = 2020; day.day = 31;

		day.setMonth(2);
		day.setDay(28);
		day.setYear(2020);

	}

}

