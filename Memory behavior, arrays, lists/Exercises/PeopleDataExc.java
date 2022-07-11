package Exercises;

import java.util.Scanner;

public class PeopleDataExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int N, men = 0, women = 0;
		double shorter = 0, higher = 0, whavg, totalwh = 0;

		System.out.print("How many people will you enter?  ");
		N = kb.nextInt();

		double[] height = new double[N];
		char[] gender = new char[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("%d person height: ", i + 1);
			height[i] = kb.nextDouble();
			System.out.printf("%d person gender: [M - male | F - female] ", i + 1);
			gender[i] = kb.next().charAt(0);
		}

		for (int i = 1; i < N; i++) {
			if (height[i] > higher) {
				higher = height[i];
			}
			if (height[i] < shorter) {
				shorter = height[i];
			}
		}

		for (int i = 0; i < N; i++) {
			if (gender[i] == 'M' || gender[i] == 'm') {
				men++;
			} else {
				women++;
				totalwh = totalwh + height[i];
			}
		}

		whavg = totalwh / women;

		System.out.printf("Shortest height = %.2f\n", shorter);
		System.out.printf("Greatest height = %.2f\n", higher);
		System.out.printf("Average height of women = %.2f\n", whavg);
		System.out.printf("Number of men = %d\n", men);

		kb.close();
	}

}
