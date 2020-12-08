package tinnova.problema1.calculadorPercentual.impl;

import tinnova.problema1.calculadorPercentual.interf.CalculadorPercentual;

public class PercentualVotosEmBranco implements CalculadorPercentual{

	private Integer qtdTotalDeEleitores;
	private Integer qtdEmBranco;
	
	public PercentualVotosEmBranco(Integer qtdTotalDeEleitores, Integer qtdEmBranco) {
		this.qtdTotalDeEleitores = qtdTotalDeEleitores;
		this.qtdEmBranco = qtdEmBranco;
	}

	@Override
	public Double calcular() {
		return qtdEmBranco.doubleValue()/qtdTotalDeEleitores.doubleValue();
	}

}
