package Exercises;

import java.util.Scanner;

public class HeightExc {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int N, underage = 0;
	    double totalheight = 0, avheight, underprc;
		
		System.out.print("How many people will you enter? ");
		N = kb.nextInt();
		
	    String[] names = new String[N];
	    int[] ages = new int[N];
	    double[] heights = new double[N];
	    
	    for (int i = 0; i < N; i++) {
			System.out.printf("Person %d:\n", i+1);	
	    	System.out.print("Nome: ");
	        names[i] = kb.next();
	        System.out.print("Idade: ");
	        ages[i] = kb.nextInt();
	        System.out.print("Altura: ");
	        heights[i] = kb.nextDouble();
		}
		
	    for (int i = 0; i < N; i++) {
			if (ages[i] < 16)
				underage++;
			totalheight += heights[i]; 
		}
	    
	    avheight = totalheight/N;
	    underprc = ((double)underage/N) * 100.0;
	    
	    System.out.printf("\nAvarage height = %.2f\n", avheight);
	    System.out.printf("Under age of 16: %.1f%%\n",underprc);
		
	    for (int i = 0; i < N; i++) {
	        if (ages[i] < 16) {
	        	System.out.printf("%s\n", names[i]);
	        }
	    }
	    
		kb.close();
	}
}
