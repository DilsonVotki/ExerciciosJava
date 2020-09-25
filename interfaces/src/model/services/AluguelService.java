package model.services;

import model.entities.Aluguel;
import model.entities.Fatura;

public class AluguelService {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	private TaxaService taxaService;

	public AluguelService(Double precoPorDia, Double precoPorHora, TaxaService taxaService) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaService = taxaService;
	}
	
	public void faturamento(Aluguel aluguel) {
		long dtInicio = aluguel.getRetirada().getTime();
		long dtFinal = aluguel.getDevolucao().getTime();
		double horas = (double)(dtFinal - dtInicio) / 1000 / 60 / 60;
			
		double valorBasico;
		
		if(horas <= 12) {
			valorBasico = Math.ceil(horas) * precoPorHora; 
		} else {
			valorBasico = Math.ceil(horas / 24) * precoPorDia;
		}
		
		double taxa = taxaService.taxa(valorBasico);
		
		aluguel.setFatura(new Fatura(valorBasico, taxa));
	}

}
