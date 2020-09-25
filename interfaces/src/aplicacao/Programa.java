package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Aluguel;
import model.entities.Veiculo;
import model.services.AluguelService;
import model.services.TaxaService;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do Aluguel");
		System.out.println("Entre com o modelo do veiculo: ");
		String modeloCarro = sc.nextLine();
		System.out.println("Entre com a data da Retirada: (dd/MM/yyyy HH:mm)");
		Date dataInicio = sdf.parse(sc.nextLine());
		System.out.println("Entre com a data da Devolução: (dd/MM/yyyy HH:mm)");
		Date dataFinal = sdf.parse(sc.nextLine());
		
		Aluguel aluguel = new Aluguel(dataInicio, dataFinal, new Veiculo(modeloCarro));
		
		System.out.println("Entre com o preço por Hora");
		double precoHora = sc.nextDouble();
		
		System.out.println("Entre com o preço por Dia");
		double precoDia = sc.nextDouble();
		
		AluguelService aluguelservice = new AluguelService(precoDia, precoHora, new TaxaService());
		
		aluguelservice.faturamento(aluguel);
		
		System.out.println("FATURADO: ");
		System.out.println("Pagamento Basico: " + String.format("%.2f", aluguel.getFatura().getCobracaBasica()));
		System.out.println("Taxa Cobrada: " + String.format("%.2f", aluguel.getFatura().getTaxa()));
		System.out.println("Total pagamento: " + String.format("%.2f", aluguel.getFatura().getTotalPagamento()));		
		sc.close();

	}

}
