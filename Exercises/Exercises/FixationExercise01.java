package Exercises;

import java.util.Scanner;

public class FixationExercise01 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		Account account;
		double deposit;

		System.out.print("Enter account number: ");
		int number = kb.nextInt();

		if(number != 0) {
			System.out.print("Enter account holder: ");
			kb.nextLine();
			String holder = kb.nextLine();
			System.out.print("Is there an initial deposit (y/n)? ");
			char aw = kb.next().toLowerCase().charAt(0);

			//		do{
			//			System.out.print("Not a valid option, try again\n");
			//			System.out.print("Is there an initial deposit (y/n)? ");
			//			aw = kb.next().toLowerCase().charAt(0);
			//		}while(aw != 'y' || aw != 'n');

			if(aw == 'y') {	
				System.out.print("Enter initial deposit value: ");
				deposit = kb.nextDouble();
				account = new Account(number, holder, deposit);
			}
			else
				account = new Account(number, holder);

			System.out.println("\nAccount data:");
			System.out.println(account);

			System.out.print("\nEnter a deposit value: ");
			deposit = kb.nextDouble();
			account.deposit(deposit);

			System.out.println("\nUpdated account data:");
			System.out.println(account);

			System.out.print("\nEnter a withdraw value: ");
			double withdraw = kb.nextDouble();
			account.withdraw(withdraw);

			System.out.println("\nUpdated account data:");
			System.out.println(account);
		}

		kb.close();
	}

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

	@Override
	public String toString() {
		return "Account: " + number + ", Holder: " + name + ", Balance: $" + String.format("%.2f", balance);
	}
}