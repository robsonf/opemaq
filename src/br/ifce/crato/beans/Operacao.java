package br.ifce.crato.beans;

import java.sql.Date;

public class Operacao {
	private long id;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private Propriedade propriedade;

	public Operacao() {
		super();
	}

	public Operacao(String nome, Date dataInicio, Date dataFim, Propriedade propriedade) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.propriedade = propriedade;
	}
	
	public Operacao(long id, String nome, Date dataInicio, Date dataFim, Propriedade propriedade) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public Propriedade getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(Propriedade propriedade) {
		this.propriedade = propriedade;
	}

	@Override
	public String toString() {
		return String.format("%s  %s %s %s", nome, dataInicio, dataFim, propriedade.getTamanho());
	}
}
