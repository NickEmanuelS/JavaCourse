package Exercises;

import java.util.Scanner;

public class UnderAvgExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int N;
		double aux = 0, avg;
		
		System.out.print("How many numbers will you enter? ");
		N = kb.nextInt();
		
		double[] v = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			v[i] = kb.nextDouble();
		}
		
		for (int i = 0; i < v.length; i++) {
			aux += v[i];
		}
		
		avg = aux / N;
		
		System.out.printf("Vector's avarage = %.3f\n", avg);
		
		System.out.println("Numbers under the avarage:");
	    for (int i = 0; i < N; i++) {
	        if (v[i] < avg) {
	        	System.out.printf("%.1f\n", v[i]);
	        }
	    }
		
		kb.close();
	}

}
