/*
 * Programa para fixa??o de conceitos
 * 
 * Sistema de banco para abrir conta, depositar e sacar
 * 
 * Desenvolvido por Gl?ucio Lima
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("----- Criar conta -----\n" + "N?mero da conta: ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.print("Nome do titular: ");
		String nome = sc.nextLine();

		System.out.print("\nContem valor de entrada? (S/N) ");
		char entrada = sc.next().charAt(0);

		while (entrada != 'S' && entrada != 'N') {
			System.out.print("Op??o inv?lida!\nContem valor de entrada? (S/N) ");
			entrada = sc.next().charAt(0);
		}

		double valor = 0;

		if (entrada == 'S') {
			System.out.print("Valor de entrada: ");
			valor = sc.nextDouble();
		}
		ContaBancaria conta = new ContaBancaria(num, nome, valor);
		System.out.println("\nConta criada com sucesso!!");

		int acao;

		do {
			System.out.println("\n----- Qual a??o deseja realizar? -----\n" + "1 - Deposito\n"
					+ "2 - Saque(Sujeito a taxa)\n" + "3 - Exibir dados\n" + "5 - Sair");

			acao = sc.nextInt();

			switch (acao) {
			case 1:
				System.out.print("Valor do deposito: ");
				valor = sc.nextDouble();
				conta.deposito(valor);
				break;

			case 2:
				System.out.print("Valor do saque: ");
				valor = sc.nextDouble();
				conta.saque(valor);
				break;

			case 3:
				System.out.println(conta);
				break;

			case 5:
				break;

			default:
				System.out.println("Op??o inv?lida!");
			}

		} while (acao != 5);

		sc.close();

	}

}
