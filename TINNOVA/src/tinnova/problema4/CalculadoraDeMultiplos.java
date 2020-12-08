package tinnova.problema4;

public class CalculadoraDeMultiplos {

	private Integer numero;

	public CalculadoraDeMultiplos(Integer numero) {
		this.numero = numero;
	}

	public Integer getResultado() {
		int soma = 0;
		for (int i = 0; i < numero; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				soma += i;
			}
		}
		return soma;
	}

}
