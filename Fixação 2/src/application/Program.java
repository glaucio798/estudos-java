package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();

		System.out.println("Quantos funcionarios deseja cadastrar");
		int n = Integer.parseInt(sc.nextLine());
		int id;
		String nome;
		double salario;

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i + 1));
			System.out.print("Id: ");
			id = Integer.parseInt(sc.nextLine());

			final int tempId = id;
			if (lista.stream().filter(x -> x.getId() == tempId).findFirst().orElse(null) != null) {
				throw new Exception("Id j? cadastrado");
			}

			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Salario: ");
			salario = Double.parseDouble(sc.nextLine());

			lista.add(new Funcionario(id, nome, salario));
		}

		System.out.print("Qual o id do funcionario que ia receber um aumento? ");
		id = Integer.parseInt(sc.nextLine());

		final int tempId = id;

		Funcionario felizardo = lista.stream().filter(x -> x.getId() == tempId).findFirst().orElse(null);

		if (felizardo == null) {
			System.out.println("Id inexistente");
		} else {
			System.out.print("Qual a % de aumento? ");
			double aumento = sc.nextDouble();

			felizardo.setSalario(felizardo.getSalario() * (aumento + 100) / 100);
		}

		for (Funcionario func : lista) {
			System.out.println(func);
		}

		sc.close();
	}

}
