package entidades;

import entidades.enums.Color;

public abstract class Figuras {

	private Color color;
	
	public Figuras() {
	}

	public Figuras(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
}
