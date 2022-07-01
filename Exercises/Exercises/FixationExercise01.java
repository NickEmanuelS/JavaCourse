package Exercises;

public class FixationExercise01 {

}

class Account {
	
	private int number;
	private String name;
	private double balance;
	
	public Account() {
	}
	
	public Account(int number, String name, double deposit) {
		this.number = number;
		this.name = name;
		this.deposit(deposit);
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
}