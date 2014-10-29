package br.ifce.crato.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import br.ifce.crato.beans.Funcao;
import br.ifce.crato.util.Conexao;

public class FuncaoDAO {

	private Connection con;
	public FuncaoDAO() {
		super();
		this.con = Conexao.getConexao();
	}
	
	public boolean deletar(long id){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int r = stm.executeUpdate("DELETE FROM FUNCAO WHERE ID ="+id);
			stm.close();
			con.commit();
			if(r != 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro FuncaoDAO.deletar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public boolean inserir(String descricao){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int id = 0;
			ResultSet rs = stm.executeQuery("SELECT MAX(ID) AS ID FROM FUNCAO;");
			while (rs.next()) {
				id = rs.getInt("id");
			}
			int r = stm.executeUpdate("INSERT INTO FUNCAO (id, descricao) VALUES  ("+(id+1)+",'"+descricao+"')");
			rs.close();
			stm.close();
			con.commit();
			if(r != 0)
				retorno=true;
			} catch (Exception e) {
			System.out.println("Erro FuncaoDAO.inserir(): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean alterar(long id, String descricao){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int r = stm.executeUpdate("UPDATE FUNCAO SET DESCRICAO ='"+descricao +"' WHERE id="+ id);
			stm.close();
			con.commit();
			if(r != 0)
				retorno=true;
		} catch (Exception e) {
			System.out.println("Erro FuncaoDAO.alterar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public Vector<Funcao> pesquisar(String descricao){
		Vector<Funcao> funcoes = new Vector<Funcao>();
		try {
			if(descricao != null && !descricao.equals("")){
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM FUNCAO WHERE " +
					"descricao='"+descricao+ "';");
			while (rs.next()) {
				Funcao t = new Funcao();
				t.setId(rs.getLong("id"));
				t.setDescricao(rs.getString("descricao"));
//				t.setCustoHoraTrabalhada(rs.getFloat("custoHoraTrabalhada"));
				funcoes.add(t);
			}
			rs.close();
			stm.close();
			con.commit();
			}
			else{
				funcoes = pesquisar();
			}
		} catch (Exception e) {
			System.out.println("Erro FuncaoDAO.pesquisar(...): "
					+ e.getMessage());
		}
		return funcoes;
	}
	
	public Vector<Funcao> pesquisar(){
		Vector<Funcao> funcoes = new Vector<Funcao>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM FUNCAO");
			while (rs.next()) {
				Funcao t = new Funcao();
				t.setId(rs.getLong("id"));
				t.setDescricao(rs.getString("descricao"));
//				t.setCustoHoraTrabalhada(rs.getFloat("custoHoraTrabalhada"));
				funcoes.add(t);
			}
		} catch (Exception e) {
			System.out.println("Erro FuncaoDAO.pesquisar(): "
					+ e.getMessage());
		}
		return funcoes;
	}
}
