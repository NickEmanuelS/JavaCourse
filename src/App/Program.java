package App;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner kb = new Scanner(System.in);
		double a, b, c;
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Triangle X: ");
		a = kb.nextDouble();
		x.setA(a);
		b = kb.nextDouble();
		x.setB(b);
		c = kb.nextDouble();
		x.setC(c);
		
		System.out.println("Triangle Y: ");
		a = kb.nextDouble();
		y.setA(a);
		b = kb.nextDouble();
		y.setB(b);
		c = kb.nextDouble();
		y.setC(c);
		
		double areaX = x.area();
		
		double areaY = y.area();
		
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
