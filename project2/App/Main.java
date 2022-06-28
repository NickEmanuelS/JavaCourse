package App;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		double price;
		int quantity;
		String name;
		
		Product product;
		
		System.out.println("Enter the data: ");
		System.out.print("\nName: ");
		name = kb.nextLine();
		System.out.print("\nPrice: ");
		price = kb.nextDouble();
		System.out.print("\nQuantity: ");
		quantity = kb.nextInt();
		
		product = new Product(name, price, quantity);
		
		System.out.print(product);
		
		System.out.print("\nAdd product: ");
		int qnt = kb.nextInt();
		product.addProducts(qnt);
		
		System.out.println("\nUpdated stock: ");
		System.out.print(product);
		
		System.out.println("\nRemove product: ");
		qnt = kb.nextInt();
		product.removeProducts(qnt);
		
		System.out.println("\nUpdated stock: ");
		System.out.print(product);
		
		kb.close();
	}

}
