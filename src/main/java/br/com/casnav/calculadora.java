package br.com.casnav;

import java.io.Serializable;

public class calculadora implements Serializable {
	
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
