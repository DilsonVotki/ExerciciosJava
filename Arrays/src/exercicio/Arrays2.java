package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		int produto = 1;
		
		String [] nomeProduto = new String[n];
		double[] valorProduto = new double[n];
		
		for(int i=0; i<n; i++) {	
			System.out.print("Qual o nome do produto "+ produto + ": ");
			nomeProduto[i] = sc.next();
			System.out.print("Qual o preço do produto "+ produto + ": ");
			valorProduto[i] = sc.nextDouble();
			produto = produto+1;	
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += valorProduto[i];
		}
		double media = soma / n;
		
		System.out.printf("A médi de valor dos produtos é: %.2f%n", media);
		
		
		sc.close();

	}

}
