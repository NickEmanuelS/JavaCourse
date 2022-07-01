package SimpleExercises;

import java.util.Scanner;

public class Exc02 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String name;
		double gs, tax, percentage;

		System.out.println("Enter the data");
		System.out.print("Name: ");
		name = kb.nextLine();
		System.out.print("Gross salary: ");
		gs = kb.nextDouble();
		System.out.print("Tax: ");
		tax = kb.nextDouble();

		Employee employee = new Employee(name, gs, tax);

		System.out.println(employee);

		System.out.print("\nWich percentage to increase the salary? ");
		percentage = kb.nextDouble();

		employee.increaseSalary(percentage);

		kb.close();

	}

}

class Employee {

	private String name;
	private double grossSalary;
	private double tax;

	public Employee() {

	}

	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double netSalary() {

		return this.grossSalary - this.tax;
	}

	public void increaseSalary(double percentage) {

		double increase;

		if (percentage > 0) {
			increase = this.grossSalary / percentage;
			System.out.printf("\nUpdated salary: %s, %.2f", this.name, this.netSalary() + increase);
		} else
			System.out.print(this);
	}

	@Override
	public String toString() {
		return String.format("\nEmployee: " + this.name + ", $" + this.netSalary());
	}

}