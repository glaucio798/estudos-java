package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product A = new Product();

		System.out.println("Dados do produto: ");

		System.out.print("Nome: ");
		A.name = sc.nextLine();

		System.out.print("Pre?o: ");
		A.price = sc.nextDouble();

		System.out.print("Estoque: ");
		A.quantity = sc.nextInt();
		
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
