
public class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		
		animal.setHeight(15.0);
		animal.setWeight(25.0);
		animal.setName("Muppet");
		
		System.out.println(animal);
		
		Animal cat = new Cat(10.0, 20.0, "Kitty", "black");
		System.out.println(cat);
		System.out.println(cat.makeSound());
		
		Animal kitten = new Kitten(2.0, 5.0, "tiny", 10, "orange");
		System.out.println(kitten);
		System.out.println(kitten.makeSound());
		
		Animal dog = new Dog(20.0, 80.0, "pup", "pitbull");
		System.out.println(dog);
		System.out.println(dog.makeSound());
	}

}
