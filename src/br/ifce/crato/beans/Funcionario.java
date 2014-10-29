package br.ifce.crato.beans;
import java.sql.Date;


public class Funcionario {
	private long id;
	private String nome;
	private Date dataAdmissao;
	private int idade;
	private double fgts;
	private double insalubridade;
	private double periculosidade;
	private double inss;
	private String experiencia;
	private double agua;
	private double luz;
	private double aluguel;
	private double encargos;
	private Funcao funcao;

	public Funcionario() {
		super();
	}
	public Funcionario(String nome, Date dataAdmissao, int idade,
			double fgts, double insalubridade, double periculosidade,
			double inss, String experiencia, double agua, double luz,
			double aluguel, double encargos, Funcao funcao) {
		super();
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.idade = idade;
		this.fgts = fgts;
		this.insalubridade = insalubridade;
		this.periculosidade = periculosidade;
		this.inss = inss;
		this.experiencia = experiencia;
		this.agua = agua;
		this.luz = luz;
		this.aluguel = aluguel;
		this.encargos = encargos;
		this.funcao = funcao;
	}
	
	public Funcionario(long id, String nome, Date dataAdmissao, int idade,
			double fgts, double insalubridade, double periculosidade,
			double inss, String experiencia, double agua, double luz,
			double aluguel, double encargos, Funcao funcao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.idade = idade;
		this.fgts = fgts;
		this.insalubridade = insalubridade;
		this.periculosidade = periculosidade;
		this.inss = inss;
		this.experiencia = experiencia;
		this.agua = agua;
		this.luz = luz;
		this.aluguel = aluguel;
		this.encargos = encargos;
		this.funcao = funcao;
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
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getFgts() {
		return fgts;
	}
	public void setFgts(double fgts) {
		this.fgts = fgts;
	}
	public double getInsalubridade() {
		return insalubridade;
	}
	public void setInsalubridade(double insalubridade) {
		this.insalubridade = insalubridade;
	}
	public double getPericulosidade() {
		return periculosidade;
	}
	public void setPericulosidade(double periculosidade) {
		this.periculosidade = periculosidade;
	}
	public double getInss() {
		return inss;
	}
	public void setInss(double inss) {
		this.inss = inss;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public double getAgua() {
		return agua;
	}
	public void setAgua(double agua) {
		this.agua = agua;
	}
	public double getLuz() {
		return luz;
	}
	public void setLuz(double luz) {
		this.luz = luz;
	}
	public double getAluguel() {
		return aluguel;
	}
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	public double getEncargos() {
		return encargos;
	}
	public void setEncargos(double encargos) {
		this.encargos = encargos;
	}
	public Funcao getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
	@Override
	public String toString() {
		return String.format("%1$td/%1$tm/%1$tY", this.dataAdmissao) + String.format(" %s %s %s %s %s %s %s %s %s %s %s %s %s", nome, funcao, idade, dataAdmissao, encargos, insalubridade, periculosidade, inss, fgts, agua, luz, aluguel, experiencia);
	}
}
