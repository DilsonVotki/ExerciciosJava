package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas: ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		int pessoa=1;
		
		for(int i=0; i<n; i++) {	
			System.out.print("Pessoa "+ pessoa + ": ");
			vetor[i] = sc.nextDouble();
			pessoa = pessoa+1;
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vetor[i];
		}
		double media = soma / n;
		
		System.out.printf("Altura media entre as pessoas é de: %.2f%n", media);
		
		sc.close();
		

	}

}
