package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		metodo1();
		System.out.println("FIM PROGRAMA!");

	}
	
	public static void metodo1() {
		System.out.println("INICIO DO METODO 1 ");
		metodo2();
		System.out.println("FIM DO METODO 1");

	}
	
	public static void metodo2() {
		System.out.println("INICIO DO METODO 2");
		Scanner sc = new Scanner(System.in);
		try {
			String [] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro! Posição invalida");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Erro!!! Insira somente numero");
		}
		
		sc.close();
		System.out.println("FIM DO METODO 2");
	}

}
