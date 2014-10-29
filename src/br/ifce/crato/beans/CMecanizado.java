package br.ifce.crato.beans;

import java.util.Vector;

public class CMecanizado {
	private long id;
	private String apelido;
	private Vector<Funcionario> funcionarios;
	private TratoresImplementos trator;
	private TratoresImplementos implemento;

	public CMecanizado() {
		super();
	}

	public CMecanizado(String apelido,
			Vector<Funcionario> funcionarios, TratoresImplementos trator,
			TratoresImplementos implemento) {
		super();
		this.apelido = apelido;
		this.funcionarios = funcionarios;
		this.trator = trator;
		this.implemento = implemento;
	}
	
	public CMecanizado(long id, String apelido,
			Vector<Funcionario> funcionarios, TratoresImplementos trator,
			TratoresImplementos implemento) {
		super();
		this.id = id;
		this.apelido = apelido;
		this.funcionarios = funcionarios;
		this.trator = trator;
		this.implemento = implemento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Vector<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Vector<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public TratoresImplementos getTrator() {
		return trator;
	}

	public void setTrator(TratoresImplementos trator) {
		this.trator = trator;
	}

	public TratoresImplementos getImplemento() {
		return implemento;
	}

	public void setImplemento(TratoresImplementos implemento) {
		this.implemento = implemento;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s ", apelido, trator.getApelido(), implemento.getApelido());
	}
}
