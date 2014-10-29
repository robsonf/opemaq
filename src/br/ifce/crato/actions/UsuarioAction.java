package br.ifce.crato.actions;

import java.util.Vector;

import br.ifce.crato.beans.Usuario;
import br.ifce.crato.dao.UsuarioDAO;

public class UsuarioAction {
	private UsuarioDAO dao;
	
	public UsuarioAction() {
		super();
		this.dao = new UsuarioDAO();
	}
	public boolean alterar(Usuario antigo, Usuario novo){
		return dao.alterar(antigo, novo);
	}
	public boolean alterar(Usuario usuario){
		return dao.alterar(usuario);
	}
	public Vector<Usuario> pesquisar(){
		return this.dao.pesquisar();
	}
	public Vector<Usuario> pesquisar(Usuario usuario){
		return this.dao.pesquisar(usuario);
	}
	public boolean deletar(Usuario usuario){
		return dao.deletar(usuario.getId());
	}
	public boolean inserir(Usuario usuario){
		return dao.inserir(usuario);
	}

}
