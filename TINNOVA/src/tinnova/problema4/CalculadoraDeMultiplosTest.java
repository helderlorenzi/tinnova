package tinnova.problema4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraDeMultiplosTest {

	@Test
	public void deveRetornarSomaDosMultiplos23ParaEntrada10() {
		// Cenario
		Integer numero = 10;

		// Acao
		Integer actual = new CalculadoraDeMultiplos(numero).getResultado();

		// Resultado
		assertEquals(new Integer(23), actual);
	}

	@Test
	public void deveRetornarSomaDosMultiplos33ParaEntrada11() {
		// Cenario
		Integer numero = 11;
		
		// Acao
		Integer actual = new CalculadoraDeMultiplos(numero).getResultado();
		
		// Resultado
		assertEquals(new Integer(33), actual);
	}
	
	@Test
	public void deveRetornarSomaDosMultiplos45ParaEntrada13() {
		// Cenario
		Integer numero = 13;
		
		// Acao
		Integer actual = new CalculadoraDeMultiplos(numero).getResultado();
		
		// Resultado
		assertEquals(new Integer(45), actual);
	}
	
	@Test
	public void deveRetornarSomaDosMultiplos543ParaEntrada49() {
		// Cenario
		Integer numero = 49;
		
		// Acao
		Integer actual = new CalculadoraDeMultiplos(numero).getResultado();
		
		// Resultado
		assertEquals(new Integer(543), actual);
	}
	
}
