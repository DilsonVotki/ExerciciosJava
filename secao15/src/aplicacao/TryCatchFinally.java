package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.hasNextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("Erro de arquivo: " + e.getMessage());
		} finally {
			//ser� executado independentemente se deu erro no try ou n�o
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco finally executou!");
		}
	}

}
