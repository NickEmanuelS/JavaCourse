package Exercises;

import java.util.Scanner;

public class EvenNumberExc {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int N, even = 0;
		
		System.out.print("How many numbers will you enter? ");
		N = kb.nextInt();
		
		int[] v = new int[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			v[i] = kb.nextInt();
		}
		
		System.out.println("Even numbers:");
		
		for (int i = 0; i < v.length; i++) {
			
			if(v[i] % 2 == 0) {
				System.out.print(v[i] + "  ");
				even++;
			}
		}
		
		System.out.print("\nQuantity of even numbers = " + even);
		
		kb.close();
	}

}
