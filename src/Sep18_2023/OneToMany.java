package Sep18_2023;

import java.util.*;

class Mobile {
	private String mobile_no;

	public String getMobileNo() {
		return mobile_no;
	}

	public void setMobileNo(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	@Override
	public String toString() {
		return "Mobile [mobile_no=" + mobile_no + "]";
	}
}

class Person {
	private int rollNum;
	
	private String name;
	
	List<Mobile> numbers;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mobile> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Mobile> numbers) {
		this.numbers = numbers;
	}
}

public class OneToMany {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Rastogi");
		person.setRollNum(1);		

		Mobile number1 = new Mobile();
		number1.setMobileNo("1234");
		
		Mobile number2 = new Mobile();
		number2.setMobileNo("4321");

		List<Mobile> numberList = new ArrayList<Mobile>();
		numberList.add(number1);
		numberList.add(number2);

		person.setNumbers(numberList);
		System.out.println(person.getNumbers() + " are mobile numbers of the person " + person.getName() + " : rollNum : " + person.getRollNum());
		
		person = new Person();
		person.setName("Ajay");
//		person.setRollNum(2);

		number1 = new Mobile();
		number1.setMobileNo("0987");
		
		number2 = new Mobile();
		number2.setMobileNo("7890");

		numberList = new ArrayList<Mobile>();
		numberList.add(number1);
		numberList.add(number2);

		person.setNumbers(numberList);
		System.out.println(person.getNumbers() + " are mobile numbers of the person " + person.getName() + " : rollNum : " + person.getRollNum());

	}

}
