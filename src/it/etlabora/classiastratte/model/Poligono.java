package it.etlabora.classiastratte.model;

import java.util.List;

public abstract class Poligono {

	protected List<Double> listaLunghezzeLati;
	
	public Double calcolaPerimetro() {
		Double perimetro = 0d;
		if(listaLunghezzeLati != null) {
			for(Double lunghezzaLato : listaLunghezzeLati) {
				perimetro += lunghezzaLato;
			}
		}
		return perimetro;
	}
	
	public abstract String getNomeFigura();
	
	public abstract void setLati(Double... lati);
}
