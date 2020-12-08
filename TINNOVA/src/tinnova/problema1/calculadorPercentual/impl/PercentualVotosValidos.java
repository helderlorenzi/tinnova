package tinnova.problema1.calculadorPercentual.impl;

import tinnova.problema1.calculadorPercentual.interf.CalculadorPercentual;

public class PercentualVotosValidos implements CalculadorPercentual{

	private Integer totalDeEleitores;
	private Integer validos;
	
	public PercentualVotosValidos(Integer totalDeEleitores, Integer validos) {
		this.totalDeEleitores = totalDeEleitores;
		this.validos = validos;
	}

	@Override
	public Double calcular() {
		return validos.doubleValue()/totalDeEleitores.doubleValue();
	}

}
