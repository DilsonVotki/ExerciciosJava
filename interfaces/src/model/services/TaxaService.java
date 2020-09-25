package model.services;

public class TaxaService {

	public double taxa(double total) {
		if(total <= 100) {
			return total * 0.2;
		} else {
			return total * 0.15;
		}
	}
}
