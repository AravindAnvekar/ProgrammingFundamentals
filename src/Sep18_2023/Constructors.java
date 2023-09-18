package Sep18_2023;

class Parent{
	
	Parent(){
		System.out.println("Parent Constructor");
	}
	
	void print(){
		System.out.println("Parent print");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	
	void print(){
//		super.print();
		System.out.println("child print");
	}
}

public class Constructors {

	public static void main(String[] args) {
		Child child = new  Child();
		child.print();
	}

}
