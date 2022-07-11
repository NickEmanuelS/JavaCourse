package Exercises;

import java.util.Scanner;

public class ApprovedExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int N;
		double avg;

		System.out.print("How many students will be entered? ");
		N = kb.nextInt();

		String[] name = new String[N];
		double[] grade1 = new double[N];
		double[] grade2 = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("%d student:\n", i + 1);
			kb.nextLine();
			name[i] = kb.nextLine();
			grade1[i] = kb.nextDouble();
			grade2[i] = kb.nextDouble();
		}

		System.out.println("Approved students:");

		for (int i = 0; i < N; i++) {
			avg = (grade1[i] + grade2[i]) / 2;

			if (avg >= 6.0) {
				System.out.printf("%s\n", name[i]);
			}
		}

		kb.close();
	}

}
