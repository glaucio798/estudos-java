package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Departamento: ");
		String dep = sc.nextLine();

		System.out.println("Dados do funcionario: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Level: ");
		String lvl = sc.nextLine();
		System.out.print("Sal?rio base: ");
		Double sal = Double.parseDouble(sc.nextLine());

		Worker func = new Worker(nome, WorkerLevel.valueOf(lvl), sal, new Department(dep));

		System.out.print("Quantidade de contratos desse funcionario: ");
		int n = Integer.parseInt(sc.nextLine());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		for(int i=0; i<n; i++) {
			
			System.out.printf("Dados do contrato #%d%n", i+1);
			System.out.print("Data (DD/MM/AAAA): ");
			String data = sc.nextLine();
			System.out.print("Valor por hora: ");
			Double valHr = Double.parseDouble(sc.nextLine());
			System.out.print("Dura??o (horas): ");
			int hr = Integer.parseInt(sc.nextLine());
			
			func.addContract(new HourContract(sdf1.parse(data), valHr, hr));
		}

		System.out.print("Entre com mes e ano para calcular ganhos (MM/AAAA): ");
		String data = sc.nextLine();

		System.out.printf("Nome: %s%nDepartamento: %s%nRecebimento de %s: %.2f", func.getName(), func.getDepartment(), data,  func.income(Integer.parseInt(data.split("/", 0)[0]), Integer.parseInt(data.split("/", 0)[1])));

		sc.close();

	}

}
