package matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] matriz = new int[n][n];
		
		for(int i=0; i<n; i++) {	// usando o tamanho de n
			for(int j=0; j<n; j++) {
				matriz [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal: ");
		for(int i=0; i<n; i++) {
			System.out.print(matriz [i][i] + " ");
		}
		System.out.println();
		
		int contador = 0;
		
		for(int i=0; i<matriz.length; i++) { //usando o tamanho da matriz
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz [i][j]<0) {
					contador++;
				}
			}
		}
		System.out.println("Quantidade de numeros negativos: "+ contador);
		sc.close();
	}

}
