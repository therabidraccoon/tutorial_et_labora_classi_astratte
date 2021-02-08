package it.etlabora.classiastratte.model;

import java.util.ArrayList;

public class Quadrilatero extends Poligono {

	@Override
	public String getNomeFigura() {
		return "QUADRILATERO";
	}

	@Override
	public void setLati(Double... lati) {
		if (lati.length != 4) {
			System.out.println("Un quadrato deve avere 4 lati");
		} else {
			this.listaLunghezzeLati = new ArrayList<Double>();
			for (Double lato : lati) {
				this.listaLunghezzeLati.add(lato);
			}
		}
	}

}
