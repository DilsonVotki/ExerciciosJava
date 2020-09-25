package model.entities;

public class Fatura {
	
	private Double cobracaBasica;
	private Double taxa;

	public Fatura() {
	}

	public Fatura(Double cobracaBasica, Double taxa) {
		this.cobracaBasica = cobracaBasica;
		this.taxa = taxa;
	}

	public Double getCobracaBasica() {
		return cobracaBasica;
	}

	public void setCobracaBasica(Double cobracaBasica) {
		this.cobracaBasica = cobracaBasica;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getTotalPagamento() {
		return getCobracaBasica() + getTaxa();
	}

}
