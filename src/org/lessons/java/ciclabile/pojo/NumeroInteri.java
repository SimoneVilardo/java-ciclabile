package org.lessons.java.ciclabile.pojo;

public class NumeroInteri {

	private int[] elenco;
	private int indice;
	
	public NumeroInteri(int[] elenco) {
		
		setElenco(elenco);
		setIndice(0);
	}
	
	public NumeroInteri() {
		setElenco(new int[0]);
		setIndice(0);
	}

	public int[] getElenco() {
		return elenco;
	}

	public void setElenco(int[] elenco) {
		this.elenco = elenco;
	}

	public int getIndice() {
		return indice;
	}

	private void setIndice(int indice) {
		this.indice = indice;
	}
	
	public int getElementoSuccessivo() {
		
		int[] elencoNumeri = getElenco();

        setIndice(indice + 1);

        return elencoNumeri[getIndice() - 1];
		
	}
	
	public boolean hasAncoraElementi() {
		
		return getIndice() < getElenco().length;
		
	}
	
	public void addElemento(int nuovoElemento) {
		
		int[] nuovoElenco = new int[getElenco().length + 1];
		
        System.arraycopy(getElenco(), 0, nuovoElenco, 0, getElenco().length);
        
        nuovoElenco[getElenco().length] = nuovoElemento;
        
        setElenco(nuovoElenco);
	}
	
}
