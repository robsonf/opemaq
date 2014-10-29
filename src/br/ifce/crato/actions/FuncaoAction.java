package br.ifce.crato.actions;

import java.util.Vector;

import br.ifce.crato.beans.Funcao;
import br.ifce.crato.dao.FuncaoDAO;

public class FuncaoAction {
	private FuncaoDAO dao;
	
	public FuncaoAction() {
		super();
		this.dao = new FuncaoDAO();
	}
	public boolean alterar(Funcao antigo, Funcao novo){
		return dao.alterar(antigo.getId(), novo.getDescricao());
	}
	public Vector<Funcao> pesquisar(){
		return this.dao.pesquisar();
	}
	public Vector<Funcao> pesquisar(Funcao funcao){
		return this.dao.pesquisar(funcao.getDescricao());
	}
	public boolean deletar(Funcao funcao){
		return dao.deletar(funcao.getId());
	}
	public boolean inserir(Funcao funcao){
		return dao.inserir(funcao.getDescricao());
	}

}
