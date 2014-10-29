package br.ifce.crato.beans;

import java.sql.Date;

public class Propriedade {
	private long id;
	private String nome;
	private Date data;
	private double valor;
	private int tipo;
	private String solo;
	private String relevo;
	private String fertilidade;
	private String tamanho;
	private String declividade;
	
	public Propriedade() {
		super();
	}

	public Propriedade(String nome, Date data, double valor, int tipo,
			String solo, String relevo, String fertilidade, String tamanho,
			String declividade) {
		super();
		this.nome = nome;
		this.data = data;
		this.valor = valor;
		this.tipo = tipo;
		this.solo = solo;
		this.relevo = relevo;
		this.fertilidade = fertilidade;
		this.tamanho = tamanho;
		this.declividade = declividade;
	}

	public Propriedade(long id, String nome, Date data, double valor, int tipo,
			String solo, String relevo, String fertilidade, String tamanho,
			String declividade) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.valor = valor;
		this.tipo = tipo;
		this.solo = solo;
		this.relevo = relevo;
		this.fertilidade = fertilidade;
		this.tamanho = tamanho;
		this.declividade = declividade;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getSolo() {
		return solo;
	}

	public void setSolo(String solo) {
		this.solo = solo;
	}

	public String getRelevo() {
		return relevo;
	}

	public void setRelevo(String relevo) {
		this.relevo = relevo;
	}

	public String getFertilidade() {
		return fertilidade;
	}

	public void setFertilidade(String fertilidade) {
		this.fertilidade = fertilidade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getDeclividade() {
		return declividade;
	}

	public void setDeclividade(String declividade) {
		this.declividade = declividade;
	}

	@Override
	public String toString() {
		return String.format("%1$td/%1$tm/%1$tY",data) + String.format(" %s %s %s %s %s %s %s %s", nome, valor, tipo, solo, relevo, fertilidade, tamanho, declividade);
	}
}
