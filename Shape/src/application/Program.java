package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.printf("Número de formas: ");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da forma #%d:%nRetangulo ou circulo? (r/c) ", i+1);
			char f = sc.nextLine().charAt(0);

			System.out.printf("Cor (BLACK/RED/BLUE): ");
			String color = sc.nextLine();

			if(f == 'c') {
				System.out.printf("Raio: ");
				double raio = Double.parseDouble(sc.nextLine());
				
				list.add(new Circle(Color.valueOf(color), raio));
			}else {
				System.out.printf("Largura: ");
				double l = Double.parseDouble(sc.nextLine());

				System.out.printf("Altura: ");
				double h = Double.parseDouble(sc.nextLine());
				
				
				list.add(new Retangle(Color.valueOf(color), l, h));
			}			
		}
		
		
		System.out.println("AREAS: ");
		for(Shape e: list) {
			System.out.printf("%.2f%n", e.area());
		}
		
		sc.close();

	}

}
