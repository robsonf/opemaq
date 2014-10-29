package br.ifce.crato.actions;

import java.util.Vector;

import br.ifce.crato.beans.Funcionario;
import br.ifce.crato.dao.FuncionarioDAO;

public class FuncionarioAction {
	private FuncionarioDAO dao;
	
	public FuncionarioAction() {
		super();
		this.dao = new FuncionarioDAO();
	}
	public boolean alterar(Funcionario antigo, Funcionario novo){
		return dao.alterar(antigo, novo);
	}
	public Vector<Funcionario> pesquisar(){
		return this.dao.pesquisar();
	}
	public Vector<Funcionario> pesquisar(Funcionario funcionario){
//		return dao.pesquisar(funcionario.getNome(), funcionario.getFuncao().getId(), Data.data2String(funcionario.getDataAdmissao()), funcionario.getEncargosSociais(), funcionario.getInsalubridade(), funcionario.getPericulosidade(), funcionario.getInss(), funcionario.getFgts(),funcionario.getAgua(), funcionario.getLuz(), funcionario.getAluguel());
		return null;
	}
	public boolean deletar(Funcionario funcionario){
		return dao.deletar(funcionario.getId());
	}
	public boolean inserir(Funcionario funcionario){
		return dao.inserir(funcionario);
	}

}
