package Exercises;

import java.util.Scanner;

public class NegativeExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int N;
		
		System.out.print("How many numbers will you enter? ");
		N = kb.nextInt();
		
		int[] v = new int [N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			v[i] = kb.nextInt();
		}
		
		System.out.println("Negative numbers: ");
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 0)
				System.out.printf("%d\n", v[i]);
		}
		
		kb.close();
	}

}
