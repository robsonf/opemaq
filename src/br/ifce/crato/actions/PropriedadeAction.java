package br.ifce.crato.actions;

import java.util.Vector;

import br.ifce.crato.beans.Propriedade;
import br.ifce.crato.dao.PropriedadeDAO;

public class PropriedadeAction {
	private PropriedadeDAO dao;
	
	public PropriedadeAction() {
		super();
		this.dao = new PropriedadeDAO();
	}
	public boolean alterar(Propriedade antigo, Propriedade novo){
		return dao.alterar(antigo, novo);
	}
	public Vector<Propriedade> pesquisar(){
		return this.dao.pesquisar();
	}
	public boolean deletar(Propriedade propriedade){
		return dao.deletar(propriedade.getId());
	}
	public boolean inserir(Propriedade propriedade){
		return dao.inserir(propriedade);
	}

}
