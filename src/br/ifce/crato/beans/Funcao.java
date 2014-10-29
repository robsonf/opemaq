package br.ifce.crato.beans;

public class Funcao {
	private long id;
	private String descricao;
	private float custoHoraTrabalhada;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getCustoHoraTrabalhada() {
		return custoHoraTrabalhada;
	}
	public void setCustoHoraTrabalhada(float custoHoraTrabalhada) {
		this.custoHoraTrabalhada = custoHoraTrabalhada;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}
