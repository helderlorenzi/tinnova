package tinnova.problema3;

public class Fatorial {

	private Integer valor;

	public Fatorial(Integer valor) {
		this.valor = valor;
	}

	public Integer get() {
		if (valor == 0 || valor == 1) {
			return 1;
		}
		int valorTemp = 1;
		for (int i = 1; i <= valor; i++)
		{
			valorTemp = valorTemp * i;
		}
		return valorTemp;
	}

}
