package br.ifce.crato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import br.ifce.crato.beans.Usuario;
import br.ifce.crato.util.Conexao;

public class UsuarioDAO {

	private Connection con;
	public UsuarioDAO() {
		super();
		this.con = Conexao.getConexao();
	}
	
	public boolean deletar(long id){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int r = stm.executeUpdate("DELETE FROM USUARIO WHERE ID ="+id);
			stm.close();
			con.commit();
			if(r != 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro UsuarioDAO.deletar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public boolean inserir(Usuario usuario){
		boolean retorno = false;
		try {
			String sql = "insert into usuario (nome , email , senha,  ultimoAcesso, qualificacao, idade, experiencia, tempoDeUso , obs ) " +
					" values (?,?,?,?,?,?,?,?,?) ";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, usuario.getNome());
			stm.setString(2, usuario.getEmail());
			stm.setString(3,  usuario.getSenha());
			stm.setDate(4, usuario.getUltimoAcesso());
			stm.setString(5, usuario.getQualificacao());
			stm.setInt(6, usuario.getIdade());
			stm.setString(7, usuario.getExperiencia());
			stm.setDate(8,  usuario.getTempoDeUso());
			stm.setString(9,  usuario.getObs());

			retorno = stm.execute();
			stm.close();
			} catch (Exception e) {
				System.out.println("Erro PropriedadeDAO.inserir(): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean alterar(Usuario usuario){
		boolean retorno = false;
		try {
			String sql = "update usuario set nome = ? , email = ? , senha = ?,  ultimoAcesso = ?, qualificacao = ?, idade = ?, experiencia = ?, tempoDeUso =? , obs = ?  where id = 0";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, usuario.getNome());
			stm.setString(2, usuario.getEmail());
			stm.setString(3,  usuario.getSenha());
			stm.setDate(4, usuario.getUltimoAcesso());
			stm.setString(5, usuario.getQualificacao());
			stm.setInt(6, usuario.getIdade());
			stm.setString(7, usuario.getExperiencia());
			stm.setDate(8,  usuario.getTempoDeUso());
			stm.setString(9,  usuario.getObs());

			int alteracoes = stm.executeUpdate();
			if (alteracoes > 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro UsuarioDAO.alterar(...): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean alterar(Usuario antigo, Usuario novo){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int r = stm.executeUpdate("UPDATE USUARIO SET nome='"+ novo.getNome()+"' , email='"+ novo.getEmail()+"' , senha='"+novo.getSenha()+"'  WHERE id="+ antigo.getId());

			stm.close();
			con.commit();
			if(r != 0)
				retorno=true;
		} catch (Exception e) {
			System.out.println("Erro UsuarioDAO.alterar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public Vector<Usuario> pesquisar(Usuario usuario){
		Vector<Usuario> usuarios = new Vector<Usuario>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs;
			rs = stm.executeQuery("SELECT * FROM Usuario WHERE " +
					"nome='"+ usuario.getNome()+"' or email='"+ usuario.getEmail()+"' or senha='"+usuario.getSenha() +"' ;");
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setEmail(rs.getString("email"));
				u.setSenha(rs.getString("senha"));
				u.setUltimoAcesso(rs.getDate("ultimoAcesso"));
				u.setQualificacao(rs.getString("qualificacao"));
				u.setIdade(rs.getInt("idade"));
				u.setExperiencia(rs.getString("experiencia"));
				u.setTempoDeUso(rs.getDate("tempoDeUso"));
				u.setObs(rs.getString("obs"));
				usuarios.add(u);
			}
			rs.close();
			stm.close();
			con.commit();
		} catch (Exception e) {
			System.out.println("Erro UsuarioDAO.pesquisar(...): "
					+ e.getMessage());
		}
		return usuarios;
	}
	
	public Vector<Usuario> pesquisar(){
		Vector<Usuario> usuarios = new Vector<Usuario>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM USUARIO");
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setEmail(rs.getString("email"));
				u.setSenha(rs.getString("senha"));
				u.setUltimoAcesso(rs.getDate("ultimoAcesso"));
				u.setQualificacao(rs.getString("qualificacao"));
				u.setIdade(rs.getInt("idade"));
				u.setExperiencia(rs.getString("experiencia"));
				u.setTempoDeUso(rs.getDate("tempoDeUso"));
				u.setObs(rs.getString("obs"));
				
				usuarios.add(u);
			}
		} catch (Exception e) {
			System.out.println("Erro UsuarioDAO.pesquisar(): "
					+ e.getMessage());
		}
		return usuarios;
	}
}
