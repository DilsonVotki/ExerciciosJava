package entidades;

import entidades.enums.Color;

public class Retangulo extends Figuras {

	private Double altura;
	private Double largura;

	public Retangulo() {
		super();
	}

	public Retangulo(Color color, Double altura, Double largura) {
		super(color);
		this.altura = altura;
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	@Override
	public double area() {
		return largura * altura;
	}

	
}
