package it.etlabora.classiastratte.model;

import java.util.ArrayList;

public class Quadrato extends Poligono {

	@Override
	public String getNomeFigura() {
		return "QUADRATO";
	}

	@Override
	public void setLati(Double... lati) {
		if (lati.length != 1) {
			System.out.println("Un quadrato deve avere 4 lati uguali");
		} else {
			this.listaLunghezzeLati = new ArrayList<Double>();
			for (int i = 0; i < 4; i++) {
				this.listaLunghezzeLati.add(lati[0]);
			}
		}
	}

}
