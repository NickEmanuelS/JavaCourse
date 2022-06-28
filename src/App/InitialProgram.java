package App;

import java.util.Scanner;

public class InitialProgram {

	public static void main(String[] args) {
		
		double xA, xB, xC, yA, yB, yC;
		double p;
		double areaX, areaY;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Triangle X: ");
		xA = kb.nextDouble();
		xB = kb.nextDouble();
		xC = kb.nextDouble();
		
		System.out.println("Triangle Y: ");
		yA = kb.nextDouble();
		yB = kb.nextDouble();
		yC = kb.nextDouble();
		
		//X
		p = (xA + xB + xC) / 2.0;
		areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		//Y
		p = (yA + yB + yC) / 2.0;
		areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("X area: %.2f\n", areaX);
		System.out.printf("Y area: %.2f\n", areaY);
		
		if(areaX < areaY) 
			System.out.println("Triangle Y is larger than X ");
		else if(areaX > areaY) 
			System.out.println("Triangle X is larger than Y ");
		else 
			System.out.println("Both triangles have the same area");
		
		kb.close();
	}
}
