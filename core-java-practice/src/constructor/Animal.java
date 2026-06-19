package constructor;
class AnimalSound {
	String animalName;

	public AnimalSound() {
		this.animalName = "Monkey";
	}

	AnimalSound(String name) {
		//this();
		this.animalName = name;
	}

	void sound() {
		System.out.println("Animal makes a sound");
	}

	void displayName() {
		System.out.println("Animal name: " + this.animalName);
	}
}

// Subclass
class Dog extends AnimalSound {
	String dogName;

	public Dog() {
		this("Hutch");
		
	}

	Dog(String name) {
		this.dogName = name;
	}

	@Override
	void sound() {
		System.out.println("Dog Barks");
	}

	@Override
	void displayName() {
		System.out.println("Dog name: " + this.dogName);
	}
}

public class Animal {

	public static void main(String[] args) {
		
		AnimalSound animal = new AnimalSound("Lion");
		animal.displayName();
		animal.sound();
		
		AnimalSound animalObj = new AnimalSound();
		animalObj.displayName();
		animalObj.sound();

		Dog dog = new Dog("Tommy");
		dog.displayName();
		dog.sound();

		AnimalSound animalSound = new Dog();
		animalSound.displayName();
		animalSound.sound();
	}
}
