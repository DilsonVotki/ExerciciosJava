package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;
import entidades.OutSourcedEmployee;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Entre com a Quantidade de Funcionarios: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.print("Entre com o nome do funcionario nº"+i + ": ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print(nome+" é um terceiro? (s/n) ");
			char terceiro = sc.next().charAt(0);
			System.out.print("Entre com a Quantidade de Horas: ");
			int horas = sc.nextInt();
			System.out.print("Entre com o valor hora: ");
			double valorHora = sc.nextDouble();
			if (terceiro == 's') {
				System.out.print("Informe a despesa adicional: ");
				double despesa = sc.nextDouble();
				Employee funcionarioTerceiro = new OutSourcedEmployee(nome, horas, valorHora, despesa);
				list.add(funcionarioTerceiro);
			} else {
				Employee funcionarioNormal = new Employee(nome, horas, valorHora);
				list.add(funcionarioNormal);
			}
			
			}
		
		System.out.println();
		System.out.println("Os Respectivos Salários são:");
		for(Employee emp: list) {
			System.out.println(emp.getName()+": R$ "+ emp.payment());
		}
		
		sc.close();
	}
}
