package SimpleExercises;

import java.util.Scanner;

public class Exc03 {

	public static void main(String[] arfirst_grade) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		double first_grade, second_grade, third_grade;

		System.out.println("Enter the data");
		System.out.print("First semester's grade: ");
		first_grade = kb.nextDouble();
		System.out.print("Second semester's grade: ");
		second_grade = kb.nextDouble();
		System.out.print("Third semester's grade: ");
		third_grade = kb.nextDouble();

		Grade grade = new Grade(first_grade, second_grade, third_grade);

		System.out.println(grade);

		kb.close();
	}

}

class Grade {
	private final double FIRST = 30;
	private final double SECOND = 35;
	private final double THIRD = 35;

	private double final_grade, first_grade, second_grade, third_grade;

	public Grade() {

	}

	public Grade(double first_grade, double second_grade, double third_grade) {
		if (first_grade < this.FIRST)
			this.first_grade = first_grade;
		else
			System.out.println("Error!\nInvalid grade");
		if (first_grade < this.SECOND)
			this.second_grade = second_grade;
		else
			System.out.println("Error!\nInvalid grade");
		if (first_grade < this.THIRD)
			this.third_grade = third_grade;
		else
			System.out.println("Error!\nInvalid grade");

		this.final_grade = this.first_grade + this.second_grade + this.third_grade;
	}

	public double getFinal_grade() {
		return final_grade;
	}

	public double getFirst_grade() {
		return first_grade;
	}

	public double getSecond_grade() {
		return second_grade;
	}

	public double getThird_grade() {
		return third_grade;
	}

	public boolean checkGrade() {

		if (this.final_grade < 60)
			return false;
		else
			return true;
	}

	@Override
	public String toString() {
		if (this.checkGrade() == false)
			return String.format("Final Grade = " + this.final_grade + "\nFAILED");
		else
			return String.format("Final Grade = " + this.final_grade + "\nPASS");

	}
}