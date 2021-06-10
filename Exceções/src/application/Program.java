package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();

		System.out.println("Fim do programa");
	}

	public static void method1() {
		System.out.println("*******START METHOD1********");
		method2();
		System.out.println("*******END METHOD1********");
	}

	public static void method2() {
		System.out.println("*******START METHOD2********");

		Scanner sc = new Scanner(System.in);

		try {
			String[] vec = sc.nextLine().split(" ");
			int p = sc.nextInt();
			System.out.println(vec[p]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Entrada errada");
		}

		sc.close();

		System.out.println("*******END METHOD2********");
	}

}
