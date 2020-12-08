package tinnova.problema2;

import java.util.ArrayList;
import java.util.List;

/**
 * Ordena os valores conforme o metodo Bubble Sort.
 * 
 * @author Helder
 */
public class BubbleSort {

	private Integer[] valores;
	private List<Integer[]> historicoIteracao = new ArrayList<>();

	public BubbleSort(Integer[] valores) {
		this.valores = valores;
	}

	private void processa(Integer[] valores, int posicaoEsquerda, int posicaoDireita) {
		if (isForaDeOrdem(valores, posicaoEsquerda, posicaoDireita)) {
			swap(valores, posicaoEsquerda, posicaoDireita);
		}
		add(valores.clone());
	}

	private void add(Integer[] valores) {
		historicoIteracao.add(valores);
	}

	private void swap(Integer[] v, int posicaoEsquerda, int posicaoDireita) {
		int temp = v[posicaoDireita];
		v[posicaoDireita] = v[posicaoEsquerda];
		v[posicaoEsquerda] = temp;
	}

	private boolean isForaDeOrdem(Integer[] v, int posicaoEsquerda, int posicaoDireita) {
		return v[posicaoEsquerda] > v[posicaoDireita];
	}

	public Integer[] sort() {

		int posicaoEsquerda = 0;
		int posicaoDireita = posicaoEsquerda + 1;

		boolean continua = true;
		int contador = 0;

		while (continua) {
			processa(valores, posicaoEsquerda, posicaoDireita);
			posicaoEsquerda++;
			posicaoDireita = posicaoEsquerda + 1;
			if (posicaoDireita >= valores.length - contador) {
				contador++;
				posicaoEsquerda = 0;
				posicaoDireita = posicaoEsquerda + 1;
			}
			if (contador == valores.length) {
				continua = false;
			}
		}
		return valores;
	}

	public Integer[] getResultadoIteracao(int indice) {
		return historicoIteracao.get(indice - 1);
	}

}
