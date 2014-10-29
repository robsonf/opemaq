package br.ifce.crato.actions;

import java.util.Vector;

import br.ifce.crato.beans.Operacao;
import br.ifce.crato.dao.OperacaoDAO;

public class OperacaoAction {
	private OperacaoDAO dao;
	
	public OperacaoAction() {
		super();
		this.dao = new OperacaoDAO();
	}
	public boolean alterar(Operacao antigo, Operacao novo){
		return dao.alterar(antigo, novo);
	}
	public Vector<Operacao> pesquisar(){
		return this.dao.pesquisar();
	}
	public boolean deletar(Operacao Operacao){
		return dao.deletar(Operacao.getId());
	}
	public boolean inserir(Operacao Operacao){
		return dao.inserir(Operacao);
	}

}
