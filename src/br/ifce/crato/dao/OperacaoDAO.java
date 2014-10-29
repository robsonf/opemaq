package br.ifce.crato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;

import br.ifce.crato.beans.Operacao;
import br.ifce.crato.beans.Propriedade;
import br.ifce.crato.util.Conexao;

public class OperacaoDAO {

	private Connection con;
	public OperacaoDAO() {
		super();
		this.con = Conexao.getConexao();
	}
	
	public boolean deletar(long id){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int r = stm.executeUpdate("DELETE FROM Operacao WHERE ID ="+id);
			stm.close();
			con.commit();
			if(r != 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro OperacaoDAO.deletar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public boolean inserir(Operacao operacao){

		boolean retorno = false;
		try {
			String sql = "insert into Operacao (nome , dataInicio , dataFim, idPropriedade) " +
					" values (?,?,?,?)"; 
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, operacao.getNome());
			stm.setDate(2, operacao.getDataInicio());
			stm.setDate(3, operacao.getDataFim());
			stm.setLong(4, operacao.getPropriedade().getId());
			retorno = stm.execute();
			stm.close();
			} catch (Exception e) {
				System.out.println("Erro OperacaoDAO.inserir(): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean alterar(Operacao antigo, Operacao novo){
		boolean retorno = false;
		try {
			String sql = "update Operacao set " +
					" nome = ? , dataInicio = ? , dataFim = ? , idPropriedade = ? "
					+ " where id = ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, novo.getNome());
			stm.setDate(2, novo.getDataInicio());
			stm.setDate(3,  novo.getDataFim());
			stm.setLong(4, novo.getPropriedade().getId());
			stm.setLong(5,  antigo.getId());
			int alteracoes = stm.executeUpdate();
			if (alteracoes > 0)
				retorno = true;
			stm.close();
			
		} catch (Exception e) {
			System.out.println("Erro OperacaoDAO.alterar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	
	public Vector<Operacao> pesquisar(){
		Vector<Operacao> Operacaos = new Vector<Operacao>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM Operacao ORDER BY DATAINICIO ASC");
			while (rs.next()) {
				Operacao p = new Operacao();
				p.setId(rs.getLong("id"));
				p.setNome(rs.getString("nome"));
				p.setDataInicio(rs.getDate("dataInicio"));
				p.setDataFim(rs.getDate("dataFim"));
				p.setPropriedade(pesquisarPropriedade(rs.getInt("idPropriedade")));
				Operacaos.add(p);
			}
		} catch (Exception e) {
			System.out.println("Erro OperacaoDAO.pesquisar(): "
					+ e.getMessage());
		}
		return Operacaos;
	}

	public Propriedade pesquisarPropriedade(int idPropriedade){
		Propriedade p = null;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM propriedade where id = "+idPropriedade);
			while (rs.next()) {
				p = new Propriedade();
				p.setData(rs.getDate("data"));
				p.setValor(rs.getDouble("valor"));
				p.setTipo(rs.getInt("tipo"));
				p.setSolo(rs.getString("solo"));
				p.setRelevo(rs.getString("relevo"));
				p.setFertilidade(rs.getString("fertilidade"));
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setTamanho(rs.getString("tamanho"));
				p.setDeclividade(rs.getString("declividade"));
			}
		} catch (Exception e) {
			System.out.println("Erro OperacaoDAO.pesquisar(): "
					+ e.getMessage());
		}
		return p;
	}

}
