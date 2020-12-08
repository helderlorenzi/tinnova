package tinnova.problema1.calculadorPercentual.impl;

import tinnova.problema1.calculadorPercentual.interf.CalculadorPercentual;

public class PercentualVotosNulos implements CalculadorPercentual{

	private Integer qtdTotalDeEleitores;
	private Integer qtdNulos;

	public PercentualVotosNulos(Integer qtdTotalDeEleitores, Integer qtdNulos) {
		this.qtdTotalDeEleitores = qtdTotalDeEleitores;
		this.qtdNulos = qtdNulos;
	}

	@Override
	public Double calcular() {
		return qtdNulos.doubleValue()/qtdTotalDeEleitores.doubleValue();
	}

}
