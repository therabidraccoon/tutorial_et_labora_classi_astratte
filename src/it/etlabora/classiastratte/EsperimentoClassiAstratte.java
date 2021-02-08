package it.etlabora.classiastratte;

import it.etlabora.classiastratte.model.Poligono;
import it.etlabora.classiastratte.model.Quadrato;
import it.etlabora.classiastratte.model.Quadrilatero;

public class EsperimentoClassiAstratte {

	public static void main(String[] args) {
		Poligono quadrilatero = new Quadrilatero();
		System.out.println(quadrilatero.getNomeFigura());
		
		quadrilatero.setLati(2d, 3d, 1d, 5d);
		System.out.println(quadrilatero.calcolaPerimetro());
		
		Poligono quadrato = new Quadrato();
		System.out.println(quadrato.getNomeFigura());
		
		quadrato.setLati(10d);
		System.out.println(quadrato.calcolaPerimetro());
	}
	
}
