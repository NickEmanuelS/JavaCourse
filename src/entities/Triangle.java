package entities;

public class Triangle {
	
	public double a, b, c;
	
	public Triangle() {


	}

	public void setA(double a) {
		this.a = a;
	}
	public double getA() {
		return this.a;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	public double getB() {
		return this.b;
	}
	
	public void setC(double c) {
		this.c = c;
	}
	public double getC() {
		return this.c;
	}
	
	public double area() {
		double p = (this.a + this.b + this.c) / 2.0;
		
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}
}
