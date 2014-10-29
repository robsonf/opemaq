package br.ifce.crato.beans;

public class TratoresImplementos {
	private long id;
	private boolean eTrator;
	private String apelido;
	private String marca;
	private String modelo;
	private String novo;
	private String vidaUtil;
	private String tdp;
	private String tracao;
	private String motor;
	private String cilindros;
	private String sucata;
	private String horasEstimadas;
	private String aspiracao;
	private String potencia;
	private String ano;
	private String usoAnual;
	private String hidraulico;
	private String cor;
	
	public TratoresImplementos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TratoresImplementos(boolean eTrator, String apelido,
			String marca, String modelo, String novo, String vidaUtil,
			String tdp, String tracao, String motor, String cilindros,
			String sucata, String horasEstimadas, String aspiracao,
			String potencia, String ano, String usoAnual, String hidraulico,
			String cor) {
		super();
		this.eTrator = eTrator;
		this.apelido = apelido;
		this.marca = marca;
		this.modelo = modelo;
		this.novo = novo;
		this.vidaUtil = vidaUtil;
		this.tdp = tdp;
		this.tracao = tracao;
		this.motor = motor;
		this.cilindros = cilindros;
		this.sucata = sucata;
		this.horasEstimadas = horasEstimadas;
		this.aspiracao = aspiracao;
		this.potencia = potencia;
		this.ano = ano;
		this.usoAnual = usoAnual;
		this.hidraulico = hidraulico;
		this.cor = cor;
	}
	public TratoresImplementos(long id, boolean eTrator, String apelido,
			String marca, String modelo, String novo, String vidaUtil,
			String tdp, String tracao, String motor, String cilindros,
			String sucata, String horasEstimadas, String aspiracao,
			String potencia, String ano, String usoAnual, String hidraulico,
			String cor) {
		super();
		this.id = id;
		this.eTrator = eTrator;
		this.apelido = apelido;
		this.marca = marca;
		this.modelo = modelo;
		this.novo = novo;
		this.vidaUtil = vidaUtil;
		this.tdp = tdp;
		this.tracao = tracao;
		this.motor = motor;
		this.cilindros = cilindros;
		this.sucata = sucata;
		this.horasEstimadas = horasEstimadas;
		this.aspiracao = aspiracao;
		this.potencia = potencia;
		this.ano = ano;
		this.usoAnual = usoAnual;
		this.hidraulico = hidraulico;
		this.cor = cor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean iseTrator() {
		return eTrator;
	}

	public void seteTrator(boolean eTrator) {
		this.eTrator = eTrator;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNovo() {
		return novo;
	}

	public void setNovo(String novo) {
		this.novo = novo;
	}

	public String getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(String vidaUtil) {
		this.vidaUtil = vidaUtil;
	}

	public String getTdp() {
		return tdp;
	}

	public void setTdp(String tdp) {
		this.tdp = tdp;
	}

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCilindros() {
		return cilindros;
	}

	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}

	public String getSucata() {
		return sucata;
	}

	public void setSucata(String sucata) {
		this.sucata = sucata;
	}

	public String getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(String horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getAspiracao() {
		return aspiracao;
	}

	public void setAspiracao(String aspiracao) {
		this.aspiracao = aspiracao;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getUsoAnual() {
		return usoAnual;
	}

	public void setUsoAnual(String usoAnual) {
		this.usoAnual = usoAnual;
	}

	public String getHidraulico() {
		return hidraulico;
	}

	public void setHidraulico(String hidraulico) {
		this.hidraulico = hidraulico;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return String.format(" %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s ", (eTrator?"Trator":"Implemento"),  apelido,
				 marca,  modelo,  novo,  vidaUtil,
				 tdp,  tracao,  motor,  cilindros,
				 sucata,  horasEstimadas,  aspiracao,
				 potencia,  ano,  usoAnual,  hidraulico, cor);

	}
}
