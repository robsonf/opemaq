package br.ifce.crato.actions;

import java.util.List;
import java.util.Vector;

import br.ifce.crato.beans.TratoresImplementos;
import br.ifce.crato.dao.TratorDAO;

public class TratorAction {
	private TratorDAO dao;
	
	public TratorAction() {
		super();
		this.dao = new TratorDAO();
	}
	public boolean alterar(TratoresImplementos antigo, TratoresImplementos novo){
		return dao.alterar(antigo, novo);
	}
	public Vector<TratoresImplementos> pesquisar(){
		return this.dao.pesquisar();
	}
	public List<TratoresImplementos> pesquisar(TratoresImplementos trator){
//		return this.dao.pesquisar(trator.getApelido(), trator.getMarca(), trator.getModelo(), trator.getTracao(), trator.getAno(), trator.getCor(), trator.getMotor(), trator.getAspiracao(), trator.getCilindros(), trator.getPotencia());
		return null;
	}
	public boolean deletar(TratoresImplementos trator){
		return dao.deletar(trator.getId());
	}
	public boolean inserir(TratoresImplementos trator){
		return dao.inserir(trator);
	}

}
