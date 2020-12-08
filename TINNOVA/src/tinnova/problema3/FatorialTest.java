package tinnova.problema3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * Data Driven Test
 * 
 * @author Helder
 *
 */
@RunWith(Parameterized.class)
public class FatorialTest {

	@Parameter(value = 0)
	public String descricao;

	@Parameter(value = 1)
	public Integer entrada;

	@Parameter(value = 2)
	public Integer saida;

	@Test
	public void deveAtenderOCenario() {
		// Cenario

		// Acao
		Integer actual = new Fatorial(entrada).get();

		// Resultado
		assertEquals(descricao, saida, actual);

	}

	/**
	 * Obtem os cenarios para os testes.
	 * 
	 * @return
	 */
	@Parameters(name="Teste {index} = {0}")
	public static List<Object[]> getCenarios() {
		List<Object[]> cenarios = Arrays.asList(
			new Object[][]
			{
				{"Fatorial de zero deve ser 1"	, 0, 1},
				{"Fatorial de 1 deve ser 1"		, 1, 1},
				{"Fatorial de 2 deve ser 2"		, 2, 2},
				{"Fatorial de 3 deve ser 4"		, 3, 6},
				{"Fatorial de 4 deve ser 24"	, 4, 24},
				{"Fatorial de 5 deve ser 120"	, 5, 120},
				{"Fatorial de 6 deve ser 720"	, 6, 720}
			});
		return cenarios;
	}

}
