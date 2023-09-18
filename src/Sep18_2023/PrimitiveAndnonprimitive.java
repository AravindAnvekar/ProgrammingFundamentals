package Sep18_2023;

class Student {
	private String name;
	private int rollNumber;
	private double marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}

public class PrimitiveAndnonprimitive {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("Name : " + student.getName() + " RollNumber : " + student.getRollNumber() + " Marks : "
				+ student.getMarks());
		student.setName("Arun");
		student.setRollNumber(1);
		student.setMarks(99.99);
		System.out.println("Name : " + student.getName() + " RollNumber : " + student.getRollNumber() + " Marks : "
				+ student.getMarks());

	}

}
