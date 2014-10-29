package br.ifce.crato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import br.ifce.crato.beans.CMecanizado;
import br.ifce.crato.beans.Funcao;
import br.ifce.crato.beans.Funcionario;
import br.ifce.crato.beans.TratoresImplementos;
import br.ifce.crato.util.Conexao;

public class CMecanizadoDAO {

	private Connection con;

	public CMecanizadoDAO() {
		super();
		this.con = Conexao.getConexao();
	}

	public boolean deletar(long id) {
		boolean retorno = false;
		try {

			Statement stm = con.createStatement();
			stm.execute("delete from funcionariosCMecanizado where " +
					" idCMecanizado = "+id);
			int r = stm.executeUpdate("DELETE FROM CMECANIZADO WHERE ID =" + id);
			stm.close();
			con.commit();
			if (r != 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro CMecanizadoDAO.deletar(...): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean inserir(CMecanizado c) {
		boolean retorno = false;
		try {
			String sql = "insert into cmecanizado(apelido, idTrator, idImplemento) "
					+ " values (?,?,?)";
			PreparedStatement stm = null, stm2 = null;
			stm = con.prepareStatement(sql);
			stm.setString(1, c.getApelido());
			stm.setLong(2, c.getTrator().getId());
			stm.setLong(3, c.getImplemento().getId());
			retorno = stm.execute();
			con.commit();
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT MAX(id) AS ID FROM CMECANIZADO");
			int idCMecanizado = -1;
			while (rs.next()) {
				idCMecanizado = rs.getInt("id");
			}
			st.close();
			
			Vector<Funcionario> lista = c.getFuncionarios();
			for (Funcionario f : lista) {
				String sql2 = "insert into funcionarioscmecanizado(idCMecanizado, idFuncionario) "
						+ " values (?,?)";
				stm2 = con.prepareStatement(sql2);
				stm2.setLong(1, idCMecanizado);
				stm2.setLong(2, f.getId());
				stm2.execute();
				con.commit();
				stm2.close();
			}
			stm.close();

		} catch (Exception e) {
			System.out.println("Erro CMecanizadoDAO.inserir(): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean alterar (CMecanizado antigo, CMecanizado novo) {
		boolean retorno = false;
		try {
			String sql = "update cmecanizado set " +
					" apelido =?, idTrator =?, idImplemento =?" +
					" where id = ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, novo.getApelido());
			stm.setLong(2, novo.getTrator().getId());
			stm.setLong(3, novo.getImplemento().getId());
			stm.setLong(4,  antigo.getId());

			int alteracoes = stm.executeUpdate();
			if (alteracoes > 0)
				retorno = true;
			
			sql = "delete from funcionariosCMecanizado where " +
					" idCMecanizado = ?";
			stm = con.prepareStatement(sql);
			stm.setLong(1,  antigo.getId());
			stm.execute();
			
			Vector<Funcionario> f = novo.getFuncionarios();
			for (Funcionario funcionario : f) {
				sql = "insert into funcionariosCMecanizado (idFuncionario, idCMecanizado) values  " +
						"(?,?)";
				stm = con.prepareStatement(sql);
				stm.setLong(1, funcionario.getId());
				stm.setLong(2,  antigo.getId());
				stm.execute();	
			}

			stm.close();
		} catch (Exception e) {
			System.out.println("Erro CMecanizadoDAO.alterar(...): "
					+ e.getMessage());
		}
		return retorno;

	}

	public List<CMecanizado> pesquisar(String apelido, String marca,
			String modelo, String tracao, int ano, String cor, String motor,
			String aspiracao, String cilindros, String potencia) {
		List<CMecanizado> cMecanizadoes = new Vector<CMecanizado>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs;
			if (ano != -1) {
				rs = stm.executeQuery("SELECT * FROM CMECANIZADO WHERE "
						+ "APELIDO='" + apelido + "' or marca='" + marca
						+ "' or modelo='" + modelo + "' or tracao='" + tracao
						+ "' or ano=" + ano + " or cor='" + cor
						+ "' or motor='" + motor + "' or   aspiracao='"
						+ aspiracao + "' or cilindros='" + cilindros
						+ "' or potencia = '" + potencia + "';");
			} else {
				rs = stm.executeQuery("SELECT * FROM CMECANIZADO WHERE "
						+ "APELIDO='" + apelido + "' or marca='" + marca
						+ "' or modelo='" + modelo + "' or tracao='" + tracao
						+ "' or cor='" + cor + "' or motor='" + motor
						+ "' or   aspiracao='" + aspiracao + "' or cilindros='"
						+ cilindros + "' or potencia = '" + potencia + "';");
			}
			while (rs.next()) {
				CMecanizado t = new CMecanizado();
				// t.setId(rs.getInt("id"));
				// t.setApelido(rs.getString("apelido"));
				// t.setAno(rs.getInt("ano"));
				// t.setAspiracao(rs.getString("aspiracao"));
				// t.setCilindros(rs.getString("cilindros"));
				// t.setCor(rs.getString("cor"));
				// t.setMarca(rs.getString("marca"));
				// t.setModelo(rs.getString("modelo"));
				// t.setMotor(rs.getString("motor"));
				// t.setPotencia(rs.getString("potencia"));
				// t.setTracao(rs.getString("tracao"));
				cMecanizadoes.add(t);
			}
			rs.close();
			stm.close();
			con.commit();
		} catch (Exception e) {
			System.out.println("Erro CMecanizadoDAO.pesquisar(...): "
					+ e.getMessage());
		}
		return cMecanizadoes;
	}

	public Vector<CMecanizado> pesquisar() {
		Vector<CMecanizado> cMecanizados = new Vector<CMecanizado>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs;
			rs = stm.executeQuery("SELECT * FROM CMECANIZADO ORDER BY APELIDO");
			while (rs.next()) {

				Vector<Funcionario> f = pesquisarFuncionarios(rs.getInt("id"));
				TratoresImplementos t = new TratoresImplementos();
				TratoresImplementos i = new TratoresImplementos();
				t = pesquisarTrator(rs.getInt("id"));
				i = pesquisarImplemento(rs.getInt("id"));

				CMecanizado cm = new CMecanizado();
				cm.setId(rs.getInt("id"));
				cm.setApelido(rs.getString("apelido"));
				cm.setImplemento(i);
				cm.setTrator(t);
				cm.setFuncionarios(f);
				cMecanizados.add(cm);
			}
		} catch (Exception e) {
			System.out.println("Erro CMecanizadoDAO.pesquisar(): "
					+ e.getMessage());
		}
		return cMecanizados;
	}

	public TratoresImplementos pesquisarTrator(int idCMecanizado){
		TratoresImplementos t = new TratoresImplementos();
		try{
			Statement stm = con.createStatement();

			ResultSet rs2 = stm.executeQuery("select cm.idtrator as idtrator from cmecanizado cm where cm.id="+ idCMecanizado);
			while (rs2.next()) {
				Statement stm3 = con.createStatement();
				ResultSet rs3 = stm3.executeQuery("SELECT * FROM TRATOR where id="+rs2.getInt("idtrator"));
				while (rs3.next()) {
					t = new TratoresImplementos();
					t.setId(rs3.getInt("id"));
					t.seteTrator(rs3.getBoolean("eTrator"));
					t.setApelido(rs3.getString("apelido"));
					t.setMarca(rs3.getString("marca"));
					t.setModelo(rs3.getString("modelo"));
					t.setNovo(rs3.getString("novo"));
					t.setVidaUtil(rs3.getString("vidaUtil"));
					t.setTdp(rs3.getString("tdp"));
					t.setTracao(rs3.getString("tracao"));
					t.setMotor(rs3.getString("motor"));
					t.setCilindros(rs3.getString("cilindros"));
					t.setSucata(rs3.getString("sucata"));
					t.setHorasEstimadas(rs3.getString("horasEstimadas"));
					t.setAspiracao(rs3.getString("aspiracao"));
					t.setPotencia(rs3.getString("potencia"));				
					t.setAno(rs3.getString("ano"));
					t.setUsoAnual(rs3.getString("usoAnual"));
					t.setHidraulico(rs3.getString("hidraulico"));
					t.setCor(rs3.getString("cor"));
				}
			}
		} catch (Exception e) {
			System.out.println("Erro CMecanizadoDAO.pesquisar(): "
					+ e.getMessage());
		}
		return t;
	}
	
	public TratoresImplementos pesquisarImplemento(int idCMecanizado){
		TratoresImplementos i = new TratoresImplementos();
		try{
			Statement stm = con.createStatement();
			ResultSet rs2 = stm.executeQuery("select cm.idimplemento as idimplemento from cmecanizado cm where cm.id="+ idCMecanizado);
			while (rs2.next()) {
				Statement stm3 = con.createStatement();
				ResultSet rs3 = stm3.executeQuery("SELECT * FROM TRATOR where id="+rs2.getInt("idimplemento"));
				while (rs3.next()) {
					i = new TratoresImplementos();
					i.setId(rs3.getInt("id"));
					i.seteTrator(rs3.getBoolean("eTrator"));
					i.setApelido(rs3.getString("apelido"));
					i.setMarca(rs3.getString("marca"));
					i.setModelo(rs3.getString("modelo"));
					i.setNovo(rs3.getString("novo"));
					i.setVidaUtil(rs3.getString("vidaUtil"));
					i.setTdp(rs3.getString("tdp"));
					i.setTracao(rs3.getString("tracao"));
					i.setMotor(rs3.getString("motor"));
					i.setCilindros(rs3.getString("cilindros"));
					i.setSucata(rs3.getString("sucata"));
					i.setHorasEstimadas(rs3.getString("horasEstimadas"));
					i.setAspiracao(rs3.getString("aspiracao"));
					i.setPotencia(rs3.getString("potencia"));				
					i.setAno(rs3.getString("ano"));
					i.setUsoAnual(rs3.getString("usoAnual"));
					i.setHidraulico(rs3.getString("hidraulico"));
					i.setCor(rs3.getString("cor"));
				}
			}
		} catch (Exception e) {
			System.out.println("Erro CMecanizadoDAO.pesquisar(): "
					+ e.getMessage());
		}
		return i;
	}

	public Vector<Funcionario> pesquisarFuncionarios(int idCMecanizado) {
		Vector<Funcionario> funcionarios = new Vector<Funcionario>();
		try {
			Statement stm, stm2, stm3;
			stm = con.createStatement();
			ResultSet rs, rs2, rs3;
			rs = stm.executeQuery("SELECT * FROM FUNCIONARIOSCMECANIZADO where idCMecanizado = "+ idCMecanizado);
			while (rs.next()) {
				int idFuncionario = rs.getInt("idFuncionario");
				stm2 = con.createStatement();
				rs2 = stm2.executeQuery("SELECT * FROM FUNCIONARIO where id = "+ idFuncionario);
				while (rs2.next()) {
					Funcao funcao = new Funcao();
					stm3 = con.createStatement();
					rs3 = stm3.executeQuery("SELECT * FROM FUNCAO WHERE ID=" + rs2.getInt("funcao"));
					while (rs3.next()) {
						funcao.setDescricao(rs3.getString("descricao"));
						funcao.setId(rs3.getLong("id"));
					}
					Funcionario funcionario = new Funcionario();
					funcionario.setId(rs2.getLong("id"));
					funcionario.setNome(rs2.getString("nome"));
					funcionario.setFuncao(funcao);
					funcionario.setDataAdmissao(rs2.getDate("dataAdmissao"));
					funcionario.setIdade(rs2.getInt("idade"));
					funcionario.setInsalubridade(rs2.getDouble("insalubridade"));
					funcionario.setPericulosidade(rs2.getDouble("periculosidade"));
					funcionario.setInss(rs2.getDouble("inss"));
					funcionario.setFgts(rs2.getDouble("fgts"));
					funcionario.setAgua(rs2.getDouble("agua"));
					funcionario.setLuz(rs2.getDouble("luz"));
					funcionario.setAluguel(rs2.getDouble("aluguel"));
					funcionario.setEncargos(rs2.getDouble("encargos"));
					funcionario.setExperiencia(rs2.getString("experiencia"));
					funcionarios.add(funcionario);
					stm3.close();
				}
				stm2.close();
			}
			stm.close();
		} catch (Exception e) {
			System.out.println("Erro CMecanizadoDAO.pesquisar(): "
					+ e.getMessage());
		}
		return funcionarios;
	}
}
