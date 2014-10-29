package br.ifce.crato.actions;

import java.util.Vector;

import br.ifce.crato.beans.CMecanizado;
import br.ifce.crato.beans.Funcionario;
import br.ifce.crato.dao.CMecanizadoDAO;

public class CMecanizadoAction {
	private CMecanizadoDAO dao;
	
	public CMecanizadoAction() {
		super();
		this.dao = new CMecanizadoDAO();
	}
	public boolean alterar(CMecanizado antigo, CMecanizado novo){
		dao.alterar(antigo, novo);
		return false;
	}
	public Vector<CMecanizado> pesquisar(){
		return this.dao.pesquisar();
	}
	
	public Vector<Funcionario> pesquisarFuncionarios(int idCMecanizado){
		return this.dao.pesquisarFuncionarios(idCMecanizado);
	}
	public Vector<CMecanizado> pesquisar(CMecanizado cMecanizado){
//		return this.dao.pesquisar(cMecanizado.getApelido(), cMecanizado.getMarca(), cMecanizado.getModelo(), cMecanizado.getTracao(), cMecanizado.getAno(), cMecanizado.getCor(), cMecanizado.getMotor(), cMecanizado.getAspiracao(), cMecanizado.getCilindros(), cMecanizado.getPotencia());
		return null;
	}
	public boolean deletar(CMecanizado cMecanizado){
		return dao.deletar(cMecanizado.getId());
	}
	public boolean inserir(CMecanizado cMecanizado){
		return dao.inserir(cMecanizado);
	}

}
