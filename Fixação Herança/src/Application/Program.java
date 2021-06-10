package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.printf("Número de empregados: ");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados do empregado #%d:%nTerceirizado? (s/n) ", i+1);
			char o = sc.nextLine().charAt(0);

			System.out.printf("Nome: ");
			String name = sc.nextLine();

			System.out.printf("Horas: ");
			int hours = Integer.parseInt(sc.nextLine());
			
			System.out.printf("Valor/hora: ");
			double valuePerHour = Double.parseDouble(sc.nextLine());

			if(o=='s') {
				System.out.printf("Cobrança adicional: ");
				double additionalCharge = Double.parseDouble(sc.nextLine());
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}			
		}
		
		
		System.out.println("PAGAMENTOS: ");
		for(Employee e: list) {
			System.out.println(e.getName() + " - $" + e.payment());
		}
		
		sc.close();

	}

}
