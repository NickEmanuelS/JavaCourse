package SimpleExercises;

import java.util.Scanner;

public class Exc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		Rectangle rectangle;
		
		System.out.print("Enter width size: ");
		double width = kb.nextDouble();
		
		System.out.print("Enter height size: ");
		double height = kb.nextDouble();
		
		rectangle = new Rectangle(width, height);
		
		System.out.println(rectangle);
		
		kb.close();
	}

}

class Rectangle{
	private double width, height;
	
	public Rectangle(){
		
	}
	public Rectangle(double width, double height){
		this.setWidth(width);
		this.setHeight(height);
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return (this.width * this.height);
	}
	
	public double perimeter() {
		return (this.width * 2) + (this.height * 2);
	}
	
	public double diagonal() {
		double p = ((Math.pow(this.width, 2)) + (Math.pow(this.height, 2)));
		return Math.sqrt(p);
	}
	
	@Override
	public String toString() {
		return String.format("Area = " + this.area() + "\nPerimeter = " + this.perimeter() + "\nDiagonal = " +this.diagonal());
	}
}