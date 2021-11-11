
public class Human {
	
	String name;
	int age;
	double weight;
	
	// constructor = special method that is called when an object is instantiated (created)
	Human(String name, int age, double weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	
	void drink() {
		System.out.println(this.name + " is drinking *burp*");
	}

}
