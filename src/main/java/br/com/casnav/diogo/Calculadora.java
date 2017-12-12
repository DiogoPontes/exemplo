package br.com.casnav.diogo;

import java.io.Serializable;

public class Calculadora implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int somar(int a, int b) {
		
		return a + b;
		
	}
	
	public int subtrair(int a, int b) {
		
		return a - b;
		
	}
	
	public int multiplicar(int a, int b) {
		
		return a*b;
		
	}
	
	public int dividir(int a, int b) {
		
		return a/b;
		
	}

}
