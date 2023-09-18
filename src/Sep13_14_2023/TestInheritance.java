package Sep13_14_2023;

abstract class Animal {
	int num = 10;

	abstract void eat();
}

class Dog extends Animal {
	String name = "happy";

	void bark() {
		System.out.println("barking...");
	}

	void eat() {
		System.out.println("eating...");
	};
	
	int add(int a, int b){
		System.out.println("int");
		return a+b;
	}
	
	String add(String a, String b){
		System.out.println("String");
		return a+b;
	}

}

public class TestInheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		System.out.println(d.name);
		System.out.println(d.num);
		System.out.println("---------------------");
		
		System.out.println(d.add(1, 2));
		System.out.println(d.add("Hi ", "my name is "));
		
	}

}
