package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("Dilson");
		list.add("Lara");
		list.add("Taina");
		list.add("Yasmin");
		list.add(2,"Yuri");
		
		System.out.println(list.size());
		
		
		for(String nomesLista : list) {
			System.out.println(nomesLista);
		}
		
		System.out.println("**********************");
		
		list.remove("Dilson");
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'Y');
		
		for(String nomesLista : list) {
			System.out.println(nomesLista);
		}
		
		System.out.println("**********************");
		
		System.out.println("posição da Lara: "+ list.indexOf("Lara"));
		System.out.println("posição da Lara: "+ list.indexOf("Dilson"));
		
		System.out.println("**********************");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for(String nomesLista2 : result) {
			System.out.println(nomesLista2);
		}
		
		System.out.println("**********************");
		
		list.add("Dilson");
		list.add("Lara");
		list.add("Taina");
		list.add("Yasmin");
		list.add(2,"Yuri");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'Y').findFirst().orElse(null);
		System.out.println(name);
	}

}
