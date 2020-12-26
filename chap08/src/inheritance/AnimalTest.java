package inheritance; 

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̴� �׹߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void wideEyeSpan() {
		System.out.println("�������� �ָ� ���ϴ�.");
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest ani = new AnimalTest();
		
		ani.moveAnimal(new Human());
		ani.moveAnimal(new Tiger());
		ani.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.wideEyeSpan();
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}
}
