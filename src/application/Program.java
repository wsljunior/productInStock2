package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in Stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println("\nProduct data:\n" + product + "\n");
		System.out.println("Enter the number of product to be added in stock: ");
		quantity = sc.nextInt();

		product.addProducts(quantity);
		System.out.println("Update data: " + product + "\n");
		System.out.println("Enter the number of product to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Update data: " + product + "\n");
		sc.close();
	}

}
