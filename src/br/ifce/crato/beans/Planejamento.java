package br.ifce.crato.beans;

import java.util.Vector;

public class Planejamento {

	private double td;
	private double ro;
	private double cct;
	private double cce;
	private double tm;
	private double cco;
	private double nc;
	private double ec;
	private double nt;
	private double ndf;
	private double nimp;
	private double jt;
	private double eg;
	private double at;
	private double td2;
	private double lcct;
	private double vcct;
	private double nopcct;
	private double lcce;
	private double vcce;
	private double nopcce;
	private double eccce;
	private double tp;
	private double ti;
	private double tpr;
	private double atcco;
	private double tm2;
	private double ro2;
	private double cco2;
	private double cce2;
	private double cct2;
	private Operacao operacao;
	private Vector<CMecanizado> jlCMecanizados;
	private long id;
	
	
	public Planejamento() {
		super();
	}

	public Planejamento(double td, double ro, double cct, double cce,
			double tm, double cco, double nc, double ec, double nt, double ndf,
			double nimp, double jt, double eg, double at, double td2,
			double lcct, double vcct, double nopcct, double lcce, double vcce,
			double nopcce, double eccce, double tp, double ti, double tpr,
			double atcco, double tm2, double ro2, double cco2, double cce2,
			double cct2, Operacao operacao, Vector<CMecanizado> jlCMecanizados) {
		super();
		this.td = td;
		this.ro = ro;
		this.cct = cct;
		this.cce = cce;
		this.tm = tm;
		this.cco = cco;
		this.nc = nc;
		this.ec = ec;
		this.nt = nt;
		this.ndf = ndf;
		this.nimp = nimp;
		this.jt = jt;
		this.eg = eg;
		this.at = at;
		this.td2 = td2;
		this.lcct = lcct;
		this.vcct = vcct;
		this.nopcct = nopcct;
		this.lcce = lcce;
		this.vcce = vcce;
		this.nopcce = nopcce;
		this.eccce = eccce;
		this.tp = tp;
		this.ti = ti;
		this.tpr = tpr;
		this.atcco = atcco;
		this.tm2 = tm2;
		this.ro2 = ro2;
		this.cco2 = cco2;
		this.cce2 = cce2;
		this.cct2 = cct2;
		this.operacao = operacao;
		this.jlCMecanizados = jlCMecanizados;
	}


	public double getTd() {
		return td;
	}

	public void setTd(double td) {
		this.td = td;
	}

	public double getRo() {
		return ro;
	}

	public void setRo(double ro) {
		this.ro = ro;
	}

	public double getCct() {
		return cct;
	}

	public void setCct(double cct) {
		this.cct = cct;
	}

	public double getCce() {
		return cce;
	}

	public void setCce(double cce) {
		this.cce = cce;
	}

	public double getTm() {
		return tm;
	}

	public void setTm(double tm) {
		this.tm = tm;
	}

	public double getCco() {
		return cco;
	}

	public void setCco(double cco) {
		this.cco = cco;
	}

	public double getNc() {
		return nc;
	}

	public void setNc(double nc) {
		this.nc = nc;
	}

	public double getEc() {
		return ec;
	}

	public void setEc(double ec) {
		this.ec = ec;
	}

	public double getNt() {
		return nt;
	}

	public void setNt(double nt) {
		this.nt = nt;
	}

	public double getNdf() {
		return ndf;
	}

	public void setNdf(double ndf) {
		this.ndf = ndf;
	}

	public double getNimp() {
		return nimp;
	}

	public void setNimp(double nimp) {
		this.nimp = nimp;
	}

	public double getJt() {
		return jt;
	}

	public void setJt(double jt) {
		this.jt = jt;
	}

	public double getEg() {
		return eg;
	}

	public void setEg(double eg) {
		this.eg = eg;
	}

	public double getAt() {
		return at;
	}

	public void setAt(double at) {
		this.at = at;
	}

	public double getTd2() {
		return td2;
	}

	public void setTd2(double td2) {
		this.td2 = td2;
	}

	public double getLcct() {
		return lcct;
	}

	public void setLcct(double lcct) {
		this.lcct = lcct;
	}

	public double getVcct() {
		return vcct;
	}

	public void setVcct(double vcct) {
		this.vcct = vcct;
	}

	public double getNopcct() {
		return nopcct;
	}

	public void setNopcct(double nopcct) {
		this.nopcct = nopcct;
	}

	public double getLcce() {
		return lcce;
	}

	public void setLcce(double lcce) {
		this.lcce = lcce;
	}

	public double getVcce() {
		return vcce;
	}

	public void setVcce(double vcce) {
		this.vcce = vcce;
	}

	public double getNopcce() {
		return nopcce;
	}

	public void setNopcce(double nopcce) {
		this.nopcce = nopcce;
	}

	public double getEccce() {
		return eccce;
	}

	public void setEccce(double eccce) {
		this.eccce = eccce;
	}

	public double getTp() {
		return tp;
	}

	public void setTp(double tp) {
		this.tp = tp;
	}

	public double getTi() {
		return ti;
	}

	public void setTi(double ti) {
		this.ti = ti;
	}

	public double getTpr() {
		return tpr;
	}

	public void setTpr(double tpr) {
		this.tpr = tpr;
	}

	public double getAtcco() {
		return atcco;
	}

	public void setAtcco(double atcco) {
		this.atcco = atcco;
	}

	public double getTm2() {
		return tm2;
	}

	public void setTm2(double tm2) {
		this.tm2 = tm2;
	}

	public double getRo2() {
		return ro2;
	}

	public void setRo2(double ro2) {
		this.ro2 = ro2;
	}

	public double getCco2() {
		return cco2;
	}

	public void setCco2(double cco2) {
		this.cco2 = cco2;
	}

	public double getCce2() {
		return cce2;
	}

	public void setCce2(double cce2) {
		this.cce2 = cce2;
	}

	public double getCct2() {
		return cct2;
	}

	public void setCct2(double cct2) {
		this.cct2 = cct2;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public Vector<CMecanizado> getJlCMecanizados() {
		return jlCMecanizados;
	}

	public void setJlCMecanizados(Vector<CMecanizado> jlCMecanizados) {
		this.jlCMecanizados = jlCMecanizados;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format(" %s %s Cco: %f Ec: %f", id, operacao.getNome(), cco, ec);
	}

}
