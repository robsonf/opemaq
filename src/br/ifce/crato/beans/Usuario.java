package br.ifce.crato.beans;
import java.sql.Date;
import java.util.List;

public class Usuario {
	private long id;
	private String nome;
	private String email;
	private String senha;
	private Date ultimoAcesso;
	private String qualificacao;
	private int idade;
	private String experiencia;
	private Date tempoDeUso;
	private String obs;
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, String email, String senha,
			Date ultimoAcesso, String qualificacao, int idade,
			String experiencia, Date tempoDeUso, String obs) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ultimoAcesso = ultimoAcesso;
		this.qualificacao = qualificacao;
		this.idade = idade;
		this.experiencia = experiencia;
		this.tempoDeUso = tempoDeUso;
		this.obs = obs;
	}

	public Usuario(long id, String nome, String email, String senha,
			Date ultimoAcesso, String qualificacao, int idade,
			String experiencia, Date tempoDeUso, String obs) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ultimoAcesso = ultimoAcesso;
		this.qualificacao = qualificacao;
		this.idade = idade;
		this.experiencia = experiencia;
		this.tempoDeUso = tempoDeUso;
		this.obs = obs;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

	public String getQualificacao() {
		return qualificacao;
	}

	public void setQualificacao(String qualificacao) {
		this.qualificacao = qualificacao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public Date getTempoDeUso() {
		return tempoDeUso;
	}

	public void setTempoDeUso(Date tempoDeUso) {
		this.tempoDeUso = tempoDeUso;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
