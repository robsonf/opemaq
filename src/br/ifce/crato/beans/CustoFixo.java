package br.ifce.crato.beans;

import java.util.List;

public class CustoFixo {
	private CMecanizado cMecanizado;
	
	//mao-de-obra
	private List<Funcionario> funcionarios;
	
	//depreciacao
	private float depreciacao;
	private float valorEquipamentoNovo;
	private float valorEquipamentoUsado;
	private int numAnosUtilizadosEquipamento;
	private int numHorasPorAnoEquipamento;
	
	//alojamento
	private float alojamento;
	private float taxaAlojamento;
	private float valorBemDepreciadoAlojamento;
	private int numHorasPorAnoAlojamento;
	private float gastoPrevistoPorAnoAlojamento;
	
	//seguro
	private float seguro;
	private float taxaSeguro;
	private float valorBemDepreciadoSeguro;
	private int numHorasPorAnoSeguro;
	private float gastoPrevistoPorAnoSeguro;
	
	//reparo anual
	private float reparo;
	private float taxaReparo;
	private float valorBemDepreciadoReparo;
	private int numHorasPorAnoReparo;
	private float gastoPrevistoPorAnoReparo;
	public CMecanizado getcMecanizado() {
		return cMecanizado;
	}
	public void setcMecanizado(CMecanizado cMecanizado) {
		this.cMecanizado = cMecanizado;
	}
	public float getDepreciacao() {
		return depreciacao;
	}
	public void setDepreciacao(float depreciacao) {
		this.depreciacao = depreciacao;
	}
	public float getValorEquipamentoNovo() {
		return valorEquipamentoNovo;
	}
	public void setValorEquipamentoNovo(float valorEquipamentoNovo) {
		this.valorEquipamentoNovo = valorEquipamentoNovo;
	}
	public float getValorEquipamentoUsado() {
		return valorEquipamentoUsado;
	}
	public void setValorEquipamentoUsado(float valorEquipamentoUsado) {
		this.valorEquipamentoUsado = valorEquipamentoUsado;
	}
	public int getNumAnosUtilizadosEquipamento() {
		return numAnosUtilizadosEquipamento;
	}
	public void setNumAnosUtilizadosEquipamento(int numAnosUtilizadosEquipamento) {
		this.numAnosUtilizadosEquipamento = numAnosUtilizadosEquipamento;
	}
	public int getNumHorasPorAnoEquipamento() {
		return numHorasPorAnoEquipamento;
	}
	public void setNumHorasPorAnoEquipamento(int numHorasPorAnoEquipamento) {
		this.numHorasPorAnoEquipamento = numHorasPorAnoEquipamento;
	}
	public float getAlojamento() {
		return alojamento;
	}
	public void setAlojamento(float alojamento) {
		this.alojamento = alojamento;
	}
	public float getTaxaAlojamento() {
		return taxaAlojamento;
	}
	public void setTaxaAlojamento(float taxaAlojamento) {
		this.taxaAlojamento = taxaAlojamento;
	}
	public float getValorBemDepreciadoAlojamento() {
		return valorBemDepreciadoAlojamento;
	}
	public void setValorBemDepreciadoAlojamento(float valorBemDepreciadoAlojamento) {
		this.valorBemDepreciadoAlojamento = valorBemDepreciadoAlojamento;
	}
	public int getNumHorasPorAnoAlojamento() {
		return numHorasPorAnoAlojamento;
	}
	public void setNumHorasPorAnoAlojamento(int numHorasPorAnoAlojamento) {
		this.numHorasPorAnoAlojamento = numHorasPorAnoAlojamento;
	}
	public float getGastoPrevistoPorAnoAlojamento() {
		return gastoPrevistoPorAnoAlojamento;
	}
	public void setGastoPrevistoPorAnoAlojamento(float gastoPrevistoPorAnoAlojamento) {
		this.gastoPrevistoPorAnoAlojamento = gastoPrevistoPorAnoAlojamento;
	}
	public float getSeguro() {
		return seguro;
	}
	public void setSeguro(float seguro) {
		this.seguro = seguro;
	}
	public float getTaxaSeguro() {
		return taxaSeguro;
	}
	public void setTaxaSeguro(float taxaSeguro) {
		this.taxaSeguro = taxaSeguro;
	}
	public float getValorBemDepreciadoSeguro() {
		return valorBemDepreciadoSeguro;
	}
	public void setValorBemDepreciadoSeguro(float valorBemDepreciadoSeguro) {
		this.valorBemDepreciadoSeguro = valorBemDepreciadoSeguro;
	}
	public int getNumHorasPorAnoSeguro() {
		return numHorasPorAnoSeguro;
	}
	public void setNumHorasPorAnoSeguro(int numHorasPorAnoSeguro) {
		this.numHorasPorAnoSeguro = numHorasPorAnoSeguro;
	}
	public float getGastoPrevistoPorAnoSeguro() {
		return gastoPrevistoPorAnoSeguro;
	}
	public void setGastoPrevistoPorAnoSeguro(float gastoPrevistoPorAnoSeguro) {
		this.gastoPrevistoPorAnoSeguro = gastoPrevistoPorAnoSeguro;
	}
	public float getReparo() {
		return reparo;
	}
	public void setReparo(float reparo) {
		this.reparo = reparo;
	}
	public float getTaxaReparo() {
		return taxaReparo;
	}
	public void setTaxaReparo(float taxaReparo) {
		this.taxaReparo = taxaReparo;
	}
	public float getValorBemDepreciadoReparo() {
		return valorBemDepreciadoReparo;
	}
	public void setValorBemDepreciadoReparo(float valorBemDepreciadoReparo) {
		this.valorBemDepreciadoReparo = valorBemDepreciadoReparo;
	}
	public int getNumHorasPorAnoReparo() {
		return numHorasPorAnoReparo;
	}
	public void setNumHorasPorAnoReparo(int numHorasPorAnoReparo) {
		this.numHorasPorAnoReparo = numHorasPorAnoReparo;
	}
	public float getGastoPrevistoPorAnoReparo() {
		return gastoPrevistoPorAnoReparo;
	}
	public void setGastoPrevistoPorAnoReparo(float gastoPrevistoPorAnoReparo) {
		this.gastoPrevistoPorAnoReparo = gastoPrevistoPorAnoReparo;
	}
	
	
}
