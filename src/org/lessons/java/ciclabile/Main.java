package org.lessons.java.ciclabile;

import org.lessons.java.ciclabile.pojo.NumeroInteri;

public class Main {

	public static void main(String[] args) {
		
		int[] arrayDiNumeri = {4,7,3,2,5};	
		
		NumeroInteri ciclo = new NumeroInteri(arrayDiNumeri);
		
		while (ciclo.hasAncoraElementi()) {
			System.out.println("Elemento corrente: " + ciclo.getElementoSuccessivo());
		}
		
		ciclo.addElemento(6);
		ciclo.addElemento(12);
		ciclo.addElemento(24);
		
		System.out.println("Elementi aggiunti");
		
		while (ciclo.hasAncoraElementi()) {
			System.out.println("Elemento corrente: " + ciclo.getElementoSuccessivo());
		}
	}

}
