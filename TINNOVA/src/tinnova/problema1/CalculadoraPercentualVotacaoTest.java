package tinnova.problema1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraPercentualVotacaoTest {

	@Test
	public void deveObterPercentualVotosValidosSobreOTotalDeEleitoresTest() {
		//Cenario
		Integer totalDeEleitores = 1000;
		Integer validos = 800;
		Integer votosBrancos = 150;
		Integer nulos = 50;
		
		//Acao
		Double actual = new CalculadoraPercentualVotacao(totalDeEleitores, validos, votosBrancos, nulos).getPercentualVotosValidos();
		
		//Resultado
		assertEquals(0.8d, actual, 0.01);
	}

	@Test
	public void deveObterPercentualVotosBrancosSobreOTotalDeEleitoresTest() {
		//Cenario
		Integer totalDeEleitores = 1000;
		Integer validos = 800;
		Integer votosBrancos = 150;
		Integer nulos = 50;
		
		//Acao
		Double actual = new CalculadoraPercentualVotacao(totalDeEleitores, validos, votosBrancos, nulos).getPercentualVotosEmBranco();
		
		//Resultado
		assertEquals(0.15d, actual, 0.01);
	}
	
	@Test
	public void deveObterPercentualVotosNulosSobreOTotalDeEleitoresTest() {
		//Cenario
		Integer totalDeEleitores = 1000;
		Integer validos = 800;
		Integer votosBrancos = 150;
		Integer nulos = 50;
		
		//Acao
		Double actual = new CalculadoraPercentualVotacao(totalDeEleitores, validos, votosBrancos, nulos).getPercentualVotosNulos();
		
		//Resultado
		assertEquals(0.05d, actual, 0.01);
	}
	
}
