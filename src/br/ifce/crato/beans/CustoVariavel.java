package br.ifce.crato.beans;

public class CustoVariavel {
	private CMecanizado cMecanizado;
	
	//combustivel
	private float custoHorarioCombustivel;
	private float precoLitroCombustivel;
	private float consumoHorarioCombustivel;
	
	//lubrificante
	private float custoHorarioLubrificante;
	private float pot, poh, pom;
	private float vot, voh, vom;
	private float tot, toh, tom;
	
	//filtro
	private float custoHorarioFiltro;
	private int numFiltroCombustivel;
	private int numFiltroArSeco;
	private int numFiltroOleoHidraulico;
	private int numFiltroOleoMotor;
	private float precoFiltroCombustivel;
	private float precoFiltroArSeco;
	private float precoFiltroOleoHidraulico;
	private float precoFiltroOleoMotor;
	private int trocaFiltroCombustivel;
	private int trocaFiltroArSeco;
	private int trocaFiltroOleoHidraulico;
	private int trocaFiltroOleoMotor;
	
	
	//graxa
	private float custoHorarioGraxa;
	private float quantidadeTotalGraxa;
	private float precoQuiloGraxa;
	private int tempoLubrificacao;

	//conjunto rodado
	private float custoHorarioConjRodado;
	private int numPneusTraseiros;
	private int numPneusDianteiros;
	private float precoPneusTraseiros;
	private float precoPneusDianteiros;
	private int tempoPneusTraseiros;
	private int tempoPneusDianteiros;
	
	//manutencao
	private float custoHorarioManutencao;
	private float gastosManutencao;
	private int tempoManutencao;
	
	//total
	private float custoVariavelTotal;

	public CMecanizado getcMecanizado() {
		return cMecanizado;
	}

	public void setcMecanizado(CMecanizado cMecanizado) {
		this.cMecanizado = cMecanizado;
	}

	public float getCustoHorarioCombustivel() {
		return custoHorarioCombustivel;
	}

	public void setCustoHorarioCombustivel(float custoHorarioCombustivel) {
		this.custoHorarioCombustivel = custoHorarioCombustivel;
	}

	public float getPrecoLitroCombustivel() {
		return precoLitroCombustivel;
	}

	public void setPrecoLitroCombustivel(float precoLitroCombustivel) {
		this.precoLitroCombustivel = precoLitroCombustivel;
	}

	public float getConsumoHorarioCombustivel() {
		return consumoHorarioCombustivel;
	}

	public void setConsumoHorarioCombustivel(float consumoHorarioCombustivel) {
		this.consumoHorarioCombustivel = consumoHorarioCombustivel;
	}

	public float getCustoHorarioLubrificante() {
		return custoHorarioLubrificante;
	}

	public void setCustoHorarioLubrificante(float custoHorarioLubrificante) {
		this.custoHorarioLubrificante = custoHorarioLubrificante;
	}

	public float getPot() {
		return pot;
	}

	public void setPot(float pot) {
		this.pot = pot;
	}

	public float getPoh() {
		return poh;
	}

	public void setPoh(float poh) {
		this.poh = poh;
	}

	public float getPom() {
		return pom;
	}

	public void setPom(float pom) {
		this.pom = pom;
	}

	public float getVot() {
		return vot;
	}

	public void setVot(float vot) {
		this.vot = vot;
	}

	public float getVoh() {
		return voh;
	}

	public void setVoh(float voh) {
		this.voh = voh;
	}

	public float getVom() {
		return vom;
	}

	public void setVom(float vom) {
		this.vom = vom;
	}

	public float getTot() {
		return tot;
	}

	public void setTot(float tot) {
		this.tot = tot;
	}

	public float getToh() {
		return toh;
	}

	public void setToh(float toh) {
		this.toh = toh;
	}

	public float getTom() {
		return tom;
	}

	public void setTom(float tom) {
		this.tom = tom;
	}

	public float getCustoHorarioFiltro() {
		return custoHorarioFiltro;
	}

	public void setCustoHorarioFiltro(float custoHorarioFiltro) {
		this.custoHorarioFiltro = custoHorarioFiltro;
	}

	public int getNumFiltroCombustivel() {
		return numFiltroCombustivel;
	}

	public void setNumFiltroCombustivel(int numFiltroCombustivel) {
		this.numFiltroCombustivel = numFiltroCombustivel;
	}

	public int getNumFiltroArSeco() {
		return numFiltroArSeco;
	}

	public void setNumFiltroArSeco(int numFiltroArSeco) {
		this.numFiltroArSeco = numFiltroArSeco;
	}

	public int getNumFiltroOleoHidraulico() {
		return numFiltroOleoHidraulico;
	}

	public void setNumFiltroOleoHidraulico(int numFiltroOleoHidraulico) {
		this.numFiltroOleoHidraulico = numFiltroOleoHidraulico;
	}

	public int getNumFiltroOleoMotor() {
		return numFiltroOleoMotor;
	}

	public void setNumFiltroOleoMotor(int numFiltroOleoMotor) {
		this.numFiltroOleoMotor = numFiltroOleoMotor;
	}

	public float getPrecoFiltroCombustivel() {
		return precoFiltroCombustivel;
	}

	public void setPrecoFiltroCombustivel(float precoFiltroCombustivel) {
		this.precoFiltroCombustivel = precoFiltroCombustivel;
	}

	public float getPrecoFiltroArSeco() {
		return precoFiltroArSeco;
	}

	public void setPrecoFiltroArSeco(float precoFiltroArSeco) {
		this.precoFiltroArSeco = precoFiltroArSeco;
	}

	public float getPrecoFiltroOleoHidraulico() {
		return precoFiltroOleoHidraulico;
	}

	public void setPrecoFiltroOleoHidraulico(float precoFiltroOleoHidraulico) {
		this.precoFiltroOleoHidraulico = precoFiltroOleoHidraulico;
	}

	public float getPrecoFiltroOleoMotor() {
		return precoFiltroOleoMotor;
	}

	public void setPrecoFiltroOleoMotor(float precoFiltroOleoMotor) {
		this.precoFiltroOleoMotor = precoFiltroOleoMotor;
	}

	public int getTrocaFiltroCombustivel() {
		return trocaFiltroCombustivel;
	}

	public void setTrocaFiltroCombustivel(int trocaFiltroCombustivel) {
		this.trocaFiltroCombustivel = trocaFiltroCombustivel;
	}

	public int getTrocaFiltroArSeco() {
		return trocaFiltroArSeco;
	}

	public void setTrocaFiltroArSeco(int trocaFiltroArSeco) {
		this.trocaFiltroArSeco = trocaFiltroArSeco;
	}

	public int getTrocaFiltroOleoHidraulico() {
		return trocaFiltroOleoHidraulico;
	}

	public void setTrocaFiltroOleoHidraulico(int trocaFiltroOleoHidraulico) {
		this.trocaFiltroOleoHidraulico = trocaFiltroOleoHidraulico;
	}

	public int getTrocaFiltroOleoMotor() {
		return trocaFiltroOleoMotor;
	}

	public void setTrocaFiltroOleoMotor(int trocaFiltroOleoMotor) {
		this.trocaFiltroOleoMotor = trocaFiltroOleoMotor;
	}

	public float getCustoHorarioGraxa() {
		return custoHorarioGraxa;
	}

	public void setCustoHorarioGraxa(float custoHorarioGraxa) {
		this.custoHorarioGraxa = custoHorarioGraxa;
	}

	public float getQuantidadeTotalGraxa() {
		return quantidadeTotalGraxa;
	}

	public void setQuantidadeTotalGraxa(float quantidadeTotalGraxa) {
		this.quantidadeTotalGraxa = quantidadeTotalGraxa;
	}

	public float getPrecoQuiloGraxa() {
		return precoQuiloGraxa;
	}

	public void setPrecoQuiloGraxa(float precoQuiloGraxa) {
		this.precoQuiloGraxa = precoQuiloGraxa;
	}

	public int getTempoLubrificacao() {
		return tempoLubrificacao;
	}

	public void setTempoLubrificacao(int tempoLubrificacao) {
		this.tempoLubrificacao = tempoLubrificacao;
	}

	public float getCustoHorarioConjRodado() {
		return custoHorarioConjRodado;
	}

	public void setCustoHorarioConjRodado(float custoHorarioConjRodado) {
		this.custoHorarioConjRodado = custoHorarioConjRodado;
	}

	public int getNumPneusTraseiros() {
		return numPneusTraseiros;
	}

	public void setNumPneusTraseiros(int numPneusTraseiros) {
		this.numPneusTraseiros = numPneusTraseiros;
	}

	public int getNumPneusDianteiros() {
		return numPneusDianteiros;
	}

	public void setNumPneusDianteiros(int numPneusDianteiros) {
		this.numPneusDianteiros = numPneusDianteiros;
	}

	public float getPrecoPneusTraseiros() {
		return precoPneusTraseiros;
	}

	public void setPrecoPneusTraseiros(float precoPneusTraseiros) {
		this.precoPneusTraseiros = precoPneusTraseiros;
	}

	public float getPrecoPneusDianteiros() {
		return precoPneusDianteiros;
	}

	public void setPrecoPneusDianteiros(float precoPneusDianteiros) {
		this.precoPneusDianteiros = precoPneusDianteiros;
	}

	public int getTempoPneusTraseiros() {
		return tempoPneusTraseiros;
	}

	public void setTempoPneusTraseiros(int tempoPneusTraseiros) {
		this.tempoPneusTraseiros = tempoPneusTraseiros;
	}

	public int getTempoPneusDianteiros() {
		return tempoPneusDianteiros;
	}

	public void setTempoPneusDianteiros(int tempoPneusDianteiros) {
		this.tempoPneusDianteiros = tempoPneusDianteiros;
	}

	public float getCustoHorarioManutencao() {
		return custoHorarioManutencao;
	}

	public void setCustoHorarioManutencao(float custoHorarioManutencao) {
		this.custoHorarioManutencao = custoHorarioManutencao;
	}

	public float getGastosManutencao() {
		return gastosManutencao;
	}

	public void setGastosManutencao(float gastosManutencao) {
		this.gastosManutencao = gastosManutencao;
	}

	public int getTempoManutencao() {
		return tempoManutencao;
	}

	public void setTempoManutencao(int tempoManutencao) {
		this.tempoManutencao = tempoManutencao;
	}

	public float getCustoVariavelTotal() {
		return custoVariavelTotal;
	}

	public void setCustoVariavelTotal(float custoVariavelTotal) {
		this.custoVariavelTotal = custoVariavelTotal;
	}
	
	
}
