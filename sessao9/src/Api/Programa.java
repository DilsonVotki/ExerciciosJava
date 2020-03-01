package Api;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Quer fazer um deposito inicial (S/N)? ");
		char depositoInicial = sc.next().charAt(0);
		
		if(depositoInicial == 's') {
			System.out.print("Entre com o valor inicial: ");
			double valorDeposito = sc.nextDouble();
			conta = new Conta(numero, titular, valorDeposito);
		}else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Entre com o valor de deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados Atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Entre com o valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados Atualizados: ");
		System.out.println(conta);
		
		sc.close();
	}

}
