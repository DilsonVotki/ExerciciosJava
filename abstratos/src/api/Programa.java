package api;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Figuras;
import entidades.Retangulo;
import entidades.enums.Color;

public class Programa {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Figuras> list = new ArrayList<>();

		System.out.print("Entre com a Quantidade de Figuras: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Qual os dados da Figura nº" + i);
			System.out.print("A figura é Circulo ou Retangulo? (r/c)");
			char forma = sc.next().charAt(0);
			System.out.print("A cor da Figura é preto, azul ou vermelho?");
			Color color = Color.valueOf(sc.next());
			if (forma == 'r') {
				System.out.print("Informe a largura: ");
				double largura = sc.nextDouble();
				System.out.print("Informe a altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(color, altura, largura));
			} else {
				System.out.print("Informe o raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(color, raio));
			}

		}

		System.out.println();
		System.out.println("Os respectivas areas são:");
		for (Figuras figuras : list) {
			System.out.println(String.format("%.2f", figuras.area()));
		}

		sc.close();
	}

}
