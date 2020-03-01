package arrayClasse;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produtos;

public class ArrayClasses {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		Produtos[] vetor = new Produtos[n];
		int produto = 1;
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			System.out.print("Qual o nome do produto "+ produto + ": ");
			String nome = sc.nextLine();
			System.out.print("Qual o preço do produto "+ produto + ": ");
			double preco = sc.nextDouble();
			vetor[i] = new Produtos(nome, preco);
			produto = produto+1;
		}

		double soma = 0.00;
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPrecoProduto();
		}
		double media = soma / vetor.length;
		
		System.out.printf("O valor médio dos produtos é: %.2f%n", media);
		
		sc.close();
	}

}
