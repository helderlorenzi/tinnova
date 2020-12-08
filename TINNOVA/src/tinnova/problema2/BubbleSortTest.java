package tinnova.problema2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void deveOrdenarOVetor() {
		// Cenario
		Integer[] valores = { 5, 3, 2, 4, 7, 1, 0, 6 };

		// Acao
		Integer[] actuals = new BubbleSort(valores).sort();

		// Resultado
		Integer[] expecteds = { 0, 1, 2, 3, 4, 5, 6, 7 };

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void deveProduzirConformeIteracao1() {
		// Cenario
		Integer[] valores = { 5, 3, 2, 4, 7, 1, 0, 6 };

		// Acao
		BubbleSort b = new BubbleSort(valores);
		b.sort();

		Integer[] actuals = b.getResultadoIteracao(1);

		// Resultado
		Integer[] expecteds = { 3, 5, 2, 4, 7, 1, 0, 6 };

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void deveProduzirConformeIteracao2() {
		// Cenario
		Integer[] valores = { 5, 3, 2, 4, 7, 1, 0, 6 };

		// Acao
		BubbleSort b = new BubbleSort(valores);
		b.sort();

		Integer[] actuals = b.getResultadoIteracao(2);

		// Resultado
		Integer[] expecteds = { 3, 2, 5, 4, 7, 1, 0, 6 };

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void deveProduzirConformeIteracao3() {
		// Cenario
		Integer[] valores = { 5, 3, 2, 4, 7, 1, 0, 6 };

		// Acao
		BubbleSort b = new BubbleSort(valores);
		b.sort();

		Integer[] actuals = b.getResultadoIteracao(3);

		// Resultado
		Integer[] expecteds = { 3, 2, 4, 5, 7, 1, 0, 6 };

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void deveProduzirConformeIteracao4() {
		// Cenario
		Integer[] valores = { 5, 3, 2, 4, 7, 1, 0, 6 };

		// Acao
		BubbleSort b = new BubbleSort(valores);
		b.sort();

		Integer[] actuals = b.getResultadoIteracao(4);

		// Resultado
		Integer[] expecteds = { 3, 2, 4, 5, 7, 1, 0, 6 };

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void deveProduzirConformeIteracao5() {
		// Cenario
		Integer[] valores = { 5, 3, 2, 4, 7, 1, 0, 6 };

		// Acao
		BubbleSort b = new BubbleSort(valores);
		b.sort();

		Integer[] actuals = b.getResultadoIteracao(5);

		// Resultado
		Integer[] expecteds = { 3, 2, 4, 5, 1, 7, 0, 6 };

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void deveProduzirConformeIteracao6() {
		// Cenario
		Integer[] valores = { 5, 3, 2, 4, 7, 1, 0, 6 };

		// Acao
		BubbleSort b = new BubbleSort(valores);
		b.sort();

		Integer[] actuals = b.getResultadoIteracao(6);

		// Resultado
		Integer[] expecteds = { 3, 2, 4, 5, 1, 0, 7, 6 };

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void deveProduzirConformeIteracao7() {
		// Cenario
		Integer[] valores = { 5, 3, 2, 4, 7, 1, 0, 6 };

		// Acao
		BubbleSort b = new BubbleSort(valores);
		b.sort();

		Integer[] actuals = b.getResultadoIteracao(7);

		// Resultado
		Integer[] expecteds = { 3, 2, 4, 5, 1, 0, 6, 7 };

		assertArrayEquals(expecteds, actuals);
	}

}
