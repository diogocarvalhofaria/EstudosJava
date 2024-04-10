package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); //estou declarando um nome para a variavel Product
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine(); //Faço leitura de nome e guardo o product dentro do campo Nome
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + product);
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProcuts(quantity);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("update data: " + product);
		
		
		sc.close();
		
	}

}
