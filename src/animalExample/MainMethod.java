package animalExample;

public class MainMethod {

	public static void main(String[] args) {
		
		Dog smallDog = new Dog();
		System.out.println(smallDog.getFurSoftness("very soft"));
		Dog petDog = new Dog("yes", "eat food", true, "soft", "yes", "red");
		//System.out.println(petDog.fur); //bc fur is private in Dog, we cant access it/not visible
		System.out.println(petDog.value());
		
		Animal newAnimal = new Animal();
		System.out.println(newAnimal.getBreathe(true));
		System.out.println(newAnimal.getBreathe(false));
		
		Animal fish = new Animal("underwater", "planton?", true);
		System.out.println(fish.value());
	}

}
