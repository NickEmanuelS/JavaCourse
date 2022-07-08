package Exercises;

import java.util.Scanner;

public class SumExc {
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int N;
		double aux = 0;
		
		System.out.print("How many numbers will you enter? ");
		N = kb.nextInt();
		
		double[] v = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			v[i] = kb.nextInt();
		}
		
		System.out.print("Values: ");
		
		for (int i = 0; i < v.length; i++) {
			
			System.out.print(v[i] + "  ");
			aux += v[i]; 
		}
		
		System.out.printf("\nSum = %.2f", aux);
		
		double av = aux / v.length;
		
		System.out.printf("\nAvarage: %.2f", av);
		
		
		kb.close();
	}

}
