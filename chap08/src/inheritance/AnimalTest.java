package inheritance; 

class Animal{
	public void move() {
		System.out.println("동물은 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이는 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void wideEyeSpan() {
		System.out.println("독수리는 멀리 봅니다.");
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
			System.out.println("지원되지 않는 기능입니다.");
		}
	}
}
