package Exercises;

import java.util.Scanner;

public class OlderExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int N, aux = 0, older = 0;
		
		System.out.print("How many people are you going to get the data? ");
		N = kb.nextInt();
		
	    String[] name = new String[N];
	    int[] age = new int[N];

	    for (int i = 0; i < N; i++) {
	    	System.out.printf("%d person's data:\n", i + 1);
			System.out.print("Name: ");
			name[i] = kb.next();
			System.out.print("Age: ");
			age[i] = kb.nextInt();
	    }
	    
	    for (int i = 0; i < N; i++) {
	        if (age[i] > older) {
	            older = age[i];
	            aux = i;
	        }
	    }
	    
	    System.out.print("Older person: " + name[aux]);
		
		kb.close();
	}

}
