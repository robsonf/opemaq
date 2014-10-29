package br.ifce.crato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import br.ifce.crato.beans.Funcao;
import br.ifce.crato.beans.Funcionario;
import br.ifce.crato.util.Conexao;

public class FuncionarioDAO {

	private Connection con;
	public FuncionarioDAO() {
		super();
		this.con = Conexao.getConexao();
	}
	
	public boolean deletar(long id){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int r = stm.executeUpdate("DELETE FROM FUNCIONARIO WHERE ID ="+id);
			stm.close();
			con.commit();
			if(r != 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro FuncionarioDAO.deletar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public boolean inserir(Funcionario funcionario){
		boolean retorno = false;
		try {
			String sql = "insert into funcionario(nome, funcao, dataAdmissao, idade, encargos, insalubridade, periculosidade, inss, fgts, agua, luz, aluguel, experiencia) " +
					" values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, funcionario.getNome());
			stm.setLong(2, funcionario.getFuncao().getId());
			stm.setDate(3,  funcionario.getDataAdmissao());
			stm.setInt(4, funcionario.getIdade());
			stm.setDouble(5, funcionario.getEncargos());
			stm.setDouble(6, funcionario.getInsalubridade());
			stm.setDouble(7, funcionario.getPericulosidade());
			stm.setDouble(8,  funcionario.getInss());
			stm.setDouble(9,  funcionario.getFgts());
			stm.setDouble(10,  funcionario.getAgua());
			stm.setDouble(11,  funcionario.getLuz());
			stm.setDouble(12,  funcionario.getAluguel());
			stm.setString(13,  funcionario.getExperiencia());
			retorno = stm.execute();
			stm.close();
			con.commit();
		} catch (Exception e) {
			System.out.println("Erro FuncionarioDAO.inserir(): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean alterar(Funcionario antigo, Funcionario novo){
		boolean retorno = false;
		try {
			String sql = "update funcionario set " +
					" nome = ?, funcao = ? , dataAdmissao = ? , idade = ?, encargos = ?, insalubridade = ?, periculosidade = ?, inss = ?, fgts = ? , agua = ?, luz = ?, aluguel = ?, experiencia = ? " +
					" where id = ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, novo.getNome());
			stm.setLong(2, novo.getFuncao().getId());
			stm.setDate(3,  novo.getDataAdmissao());
			stm.setInt(4, novo.getIdade());
			stm.setDouble(5, novo.getEncargos());
			stm.setDouble(6, novo.getInsalubridade());
			stm.setDouble(7, novo.getPericulosidade());
			stm.setDouble(8,  novo.getInss());
			stm.setDouble(9,  novo.getFgts());
			stm.setDouble(10,  novo.getAgua());
			stm.setDouble(11,  novo.getLuz());
			stm.setDouble(12,  novo.getAluguel());
			stm.setString(13,  novo.getExperiencia());
			stm.setDouble(14,  antigo.getId());

			int alteracoes = stm.executeUpdate();
			if (alteracoes > 0)
				retorno = true;
			stm.close();
		} catch (Exception e) {
			System.out.println("Erro FuncioanrioDAO.alterar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public List<Funcionario> pesquisar(String nome, long idFuncao, String dataAdmissao, int encargosSociais, float insalubridade,	float periculosidade, float inss, float fgts, float agua, float luz, float aluguel){
		List<Funcionario> funcionarios = new Vector<Funcionario>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs, rs2;
			rs = stm.executeQuery("SELECT * FROM FUNCIONARIO WHERE " +
					"nome='"+ nome+"' or funcao="+idFuncao+" or dataAdmissao='"+dataAdmissao+"' or encargos="+encargosSociais+" or insalubridade="+insalubridade+" or periculosidade="+periculosidade+" or inss="+inss+" or fgts="+fgts+" or agua="+agua+" or luz= "+luz+" or aluguel="+ aluguel);
			Funcao f;
			if(rs != null)
			while (rs.next()) {
				f = new Funcao();
				rs2 = stm.executeQuery("SELECT * FROM FUNCAO WHERE ID=" + rs.getInt("funcao"));
				while (rs2.next()) {
					f.setDescricao(rs2.getString("descricao"));
					f.setId(rs2.getLong("id"));
				}
				Funcionario t = new Funcionario();
				t.setId(rs.getLong("id"));
				t.setNome(rs.getString("nome"));
				t.setFuncao(f);
				t.setDataAdmissao(rs.getDate("dataAdmissao"));
//				t.setEncargosSociais(rs.getInt("encargos"));
				t.setInsalubridade(rs.getDouble("insalubridade"));
				t.setPericulosidade(rs.getDouble("periculosidade"));
				t.setInss(rs.getDouble("inss"));
				t.setFgts(rs.getDouble("fgts"));
				t.setAgua(rs.getDouble("agua"));
				t.setLuz(rs.getDouble("luz"));
				t.setAluguel(rs.getDouble("aluguel"));
				funcionarios.add(t);
			}
			rs.close();
			stm.close();
			con.commit();
		} catch (Exception e) {
			System.out.println("Erro FuncionarioDAO.pesquisar(...): "
					+ e.getMessage());
		}
		return funcionarios;
	}
	
	public Vector<Funcionario> pesquisar(){
		Vector<Funcionario> funcionarios = new Vector<Funcionario>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs, rs2;
			rs = stm.executeQuery("SELECT * FROM FUNCIONARIO");
			Funcao funcao;
			while (rs.next()) {
				funcao = new Funcao();
				rs2 = stm.executeQuery("SELECT * FROM FUNCAO WHERE ID=" + rs.getInt("funcao"));
				while (rs2.next()) {
					funcao.setDescricao(rs2.getString("descricao"));
					funcao.setId(rs2.getLong("id"));
				}
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getLong("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setFuncao(funcao);
				funcionario.setDataAdmissao(rs.getDate("dataAdmissao"));
				funcionario.setIdade(rs.getInt("idade"));
				funcionario.setInsalubridade(rs.getDouble("insalubridade"));
				funcionario.setPericulosidade(rs.getDouble("periculosidade"));
				funcionario.setInss(rs.getDouble("inss"));
				funcionario.setFgts(rs.getDouble("fgts"));
				funcionario.setAgua(rs.getDouble("agua"));
				funcionario.setLuz(rs.getDouble("luz"));
				funcionario.setAluguel(rs.getDouble("aluguel"));
				funcionario.setEncargos(rs.getDouble("encargos"));
				funcionario.setExperiencia(rs.getString("experiencia"));
				funcionarios.add(funcionario);
			}
		} catch (Exception e) {
			System.out.println("Erro FuncionarioDAO.pesquisar(): "
					+ e.getMessage());
		}
		return funcionarios;
	}
}
