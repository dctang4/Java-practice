
public class Dog extends Animal {

	// @Override is good practice to show you override a method from the parent class
	@Override
	void speak() {
		System.out.println("The dog goes *bark*");
	}
}
