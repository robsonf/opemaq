package br.ifce.crato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import br.ifce.crato.beans.Propriedade;
import br.ifce.crato.util.Conexao;

public class PropriedadeDAO {

	private Connection con;
	public PropriedadeDAO() {
		super();
		this.con = Conexao.getConexao();
	}
	
	public boolean deletar(long id){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int r = stm.executeUpdate("DELETE FROM PROPRIEDADE WHERE ID ="+id);
			stm.close();
			con.commit();
			if(r != 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro PropriedadeDAO.deletar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public boolean inserir(Propriedade propriedade){

		boolean retorno = false;
		try {
			String sql = "insert into propriedade (nome , data , valor , tipo , solo , relevo ,  fertilidade, tamanho, declividade) " +
					" values (?,?,?,?,?,?,?,?,?)"; 
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, propriedade.getNome());
			stm.setDate(2, propriedade.getData());
			stm.setDouble(3,  propriedade.getValor());
			stm.setInt(4, propriedade.getTipo());
			stm.setString(5, propriedade.getSolo());
			stm.setString(6, propriedade.getRelevo());
			stm.setString(7, propriedade.getFertilidade());
			stm.setString(8,  propriedade.getTamanho());
			stm.setString(9,  propriedade.getDeclividade());

			retorno = stm.execute();
			stm.close();
			} catch (Exception e) {
				System.out.println("Erro PropriedadeDAO.inserir(): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean alterar(Propriedade antigo, Propriedade novo){
		boolean retorno = false;
		try {
			String sql = "update propriedade set " +
					" nome = ? , data = ? , valor = ? , tipo = ? , solo = ? , relevo = ? ,  fertilidade = ? , tamanho = ?, declividade = ? " +
					" where id = ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, novo.getNome());
			stm.setDate(2, novo.getData());
			stm.setDouble(3,  novo.getValor());
			stm.setInt(4, novo.getTipo());
			stm.setString(5, novo.getSolo());
			stm.setString(6, novo.getRelevo());
			stm.setString(7, novo.getFertilidade());
			stm.setString(8,  novo.getTamanho());
			stm.setString(9,  novo.getDeclividade());
			stm.setLong(10, antigo.getId());

			int alteracoes = stm.executeUpdate();
			if (alteracoes > 0)
				retorno = true;
			stm.close();
		} catch (Exception e) {
			System.out.println("Erro PropriedadeDAO.alterar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	
	public Vector<Propriedade> pesquisar(){
		Vector<Propriedade> propriedades = new Vector<Propriedade>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM PROPRIEDADE ORDER BY DATA ASC");
			while (rs.next()) {
				Propriedade p = new Propriedade();
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
				propriedades.add(p);
			}
		} catch (Exception e) {
			System.out.println("Erro PropriedadeDAO.pesquisar(): "
					+ e.getMessage());
		}
		return propriedades;
	}
}
