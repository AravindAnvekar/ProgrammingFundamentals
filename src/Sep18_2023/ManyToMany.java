package Sep18_2023;

import java.util.*;

class Bank {
	String Name;
	List<Customer> customer;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Bank [Name=" + Name + ", customer=" + customer + "]";
	}

}

class Customer {
	String Name;
	List<Bank> bank;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Bank> getBank() {
		return bank;
	}

	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", bank=" + bank + "]";
	}

}

public class ManyToMany {

	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.setName("HDFC");

		Bank bank2 = new Bank();
		bank2.setName("SBI");

		List<Bank> listBank1 = new ArrayList<Bank>();
		listBank1.add(bank1);

		List<Bank> listBank2 = new ArrayList<Bank>();
		listBank2.add(bank2);

		// ==========================

		Customer customer1 = new Customer();
		customer1.setName("Suraj");

		Customer customer2 = new Customer();
		customer2.setName("Raju");

		List<Customer> listCustomer1 = new ArrayList<Customer>();
		listCustomer1.add(customer1);

		List<Customer> listCustomer2 = new ArrayList<Customer>();
		listCustomer2.add(customer2);

		// ==========================

		bank1.setCustomer(listCustomer1);

		bank2.setCustomer(listCustomer2);

		customer1.setBank(listBank1);

		customer2.setBank(listBank2);

		System.out.println("Customer : " + customer1.Name + " Bank : " + customer1.bank.get(0).Name);
		System.out.println("Bank : " + bank2.Name + " Customer : " + bank2.customer.get(0).Name);

		System.out.println("customer : " + customer1.Name + " Bank : " + customer1.bank.get(0).Name);
		System.out.println("Bank : " + bank2.Name + " Customer : " + bank2.customer.get(0).Name);

	}

}
