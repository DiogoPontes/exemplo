package exemplo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.casnav.diogo.Calculadora;

public class CalculadoraTest {
	
	@Test
	public void somar() {
		Calculadora calc = new Calculadora();
		
		assertEquals(9,calc.somar(4, 5));
	}
	
	@Test
	public void subtrair() {
		Calculadora calc = new Calculadora();
		
		assertEquals(1,calc.subtrair(5, 4));
	}
	
	@Test
	public void multiplicar() {
		Calculadora calc = new Calculadora();
		
		assertEquals(20, calc.multiplicar(4, 5));
	}
	
	@Test
	public void dividir() {
		Calculadora calc = new Calculadora();
		
		assertEquals(2,calc.dividir(10, 5));
	}

}
