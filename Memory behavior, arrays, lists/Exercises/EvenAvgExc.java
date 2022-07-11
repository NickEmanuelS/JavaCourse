package Exercises;

import java.util.Scanner;

public class EvenAvgExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int N, even = 0, aux = 0;
		double avg;

		System.out.print("How many numbers will you enter? ");
		N = kb.nextInt();

		int[] v = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			v[i] = kb.nextInt();
		}

		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				even++;
				aux += v[i];
			}
		}

		if (even != 0) {
			avg = aux / even;
			System.out.printf("Avarage of even numbers = %.1f", avg);
		} else
			System.out.println("There is no even number");

		kb.close();
	}

}
