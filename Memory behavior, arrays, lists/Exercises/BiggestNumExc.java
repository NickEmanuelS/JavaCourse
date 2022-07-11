package Exercises;

import java.util.Scanner;

public class BiggestNumExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int N, pos = 0;
		double aux = 0;

		System.out.print("How many numbers will you enter? ");
		N = kb.nextInt();

		int[] v = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			v[i] = kb.nextInt();

			if (v[i] > aux) {
				aux = v[i];
				pos = i+1;
			}
		}
		
		System.out.printf("Biggest value = %.0f\n",  aux);
		System.out.println("Position with the biggest value = " + pos);

		kb.close();

	}

}
