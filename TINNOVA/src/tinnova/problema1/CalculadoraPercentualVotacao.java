package tinnova.problema1;

import tinnova.problema1.calculadorPercentual.impl.PercentualVotosEmBranco;
import tinnova.problema1.calculadorPercentual.impl.PercentualVotosNulos;
import tinnova.problema1.calculadorPercentual.impl.PercentualVotosValidos;
import tinnova.problema1.calculadorPercentual.interf.CalculadorPercentual;

public class CalculadoraPercentualVotacao {

	private Integer totalDeEleitores, validos, votosBrancos, nulos;
	
	public CalculadoraPercentualVotacao(Integer totalDeEleitores, Integer validos, Integer votosBrancos, Integer nulos) {
		this.totalDeEleitores = totalDeEleitores;
		this.validos = validos;
		this.votosBrancos = votosBrancos;
		this.nulos = nulos;
	}

	public double getPercentualVotosValidos() {
		return calcular(new PercentualVotosValidos(totalDeEleitores, validos));
	}

	public double getPercentualVotosEmBranco() {
		return calcular(new PercentualVotosEmBranco(totalDeEleitores, votosBrancos));
	}
	
	public double getPercentualVotosNulos() {
		return calcular(new PercentualVotosNulos(totalDeEleitores, nulos));
	}
	
	private double calcular(CalculadorPercentual cp)
	{
		return cp.calcular();
	}
	
}