package Exercises;

import java.util.Scanner;

public class SumVectorExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int N;

		System.out.print("How many numbers will you enter? ");
		N = kb.nextInt();

		int[] vA = new int[N];
		int[] vB = new int[N];
		int[] aux = new int[N];

		System.out.println("Enter the values of vector A: ");

		for (int i = 0; i < N; i++) {
			vA[i] = kb.nextInt();
		}

		System.out.println("Enter the values of vector B: ");

		for (int i = 0; i < N; i++) {
			vB[i] = kb.nextInt();
		}

		System.out.print("Sum result: ");

		for (int i = 0; i < N; i++) {
			aux[i] = vA[i] + vB[i];
			System.out.print("[" + aux[i] + "] ");
		}

		kb.close();
	}

}
