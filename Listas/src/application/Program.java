package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Naria1");
		list.add("Maria2");
		list.add("Maria3");
		list.add(2, "Joao");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		list.removeIf(x -> x.charAt(0) == 'N');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");

		System.out.println("Index of Maria3 " + list.indexOf("Maria3"));
		System.out.println("Index of Marco " + list.indexOf("Marco"));

		System.out.println("---------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());// converte p/ strem, faz a condicional e o collect volta pra list
		
		for(String x : result) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		
		System.out.println(name);
	}

}
