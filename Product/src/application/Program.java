package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Dados do produto: ");

		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Preço: ");
		double price = sc.nextDouble();

		//System.out.print("Estoque: ");
		//int quantity = sc.nextInt();
		

		Product A = new Product(name, price);//, quantity
		
		A.setName("computer");
		System.out.println(A.getName());
		
		System.out.println(A);

		int aux;
		System.out.println("Numero de produtos a ser adicionado");
		aux = sc.nextInt();
		
		A.AddProducts(aux);

		System.out.println(A);
		
		System.out.println("Numero de produtos a ser removido");
		aux = sc.nextInt();
		
		A.RemoveProducts(aux);

		System.out.println(A);
		
		sc.close();

	}

}
