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
			//será executado independentemente se deu erro no try ou não
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco finally executou!");
		}
	}

}
