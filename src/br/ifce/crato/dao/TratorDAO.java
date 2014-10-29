package br.ifce.crato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import br.ifce.crato.beans.TratoresImplementos;
import br.ifce.crato.util.Conexao;

public class TratorDAO {

	private Connection con;
	public TratorDAO() {
		super();
		this.con = Conexao.getConexao();
	}
	
	public boolean deletar(long id){
		boolean retorno = false;
		try {
			Statement stm = con.createStatement();
			int r = stm.executeUpdate("DELETE FROM TRATOR WHERE ID ="+id);
			stm.close();
			con.commit();
			if(r != 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro TratorDAO.deletar(...): "
					+ e.getMessage());
		}
		return retorno;
	}

	public boolean inserir(TratoresImplementos t){
		boolean retorno = false;
		try {
			String sql = "insert into trator (eTrator , apelido , marca , modelo , novo , vidaUtil , tdp ,  tracao , motor , cilindros , " +
					" sucata ,  horasEstimadas , aspiracao , potencia , ano ,  usoAnual , hidraulico , cor )"
					+" values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setBoolean(1, t.iseTrator());
			stm.setString(2, t.getApelido());
			stm.setString(3,  t.getMarca());
			stm.setString(4, t.getModelo());
			stm.setString(5, t.getNovo());
			stm.setString(6, t.getVidaUtil());
			stm.setString(7, t.getTdp());
			stm.setString(8,  t.getTracao());
			stm.setString(9,  t.getMotor());
			stm.setString(10, t.getCilindros());
			stm.setString(11, t.getSucata());
			stm.setString(12,  t.getHorasEstimadas());
			stm.setString(13, t.getAspiracao());
			stm.setString(14, t.getPotencia());
			stm.setString(15, t.getAno());
			stm.setString(16, t.getUsoAnual());
			stm.setString(17,  t.getHidraulico());
			stm.setString(18,  t.getCor());

			retorno = stm.execute();
			stm.close();
			} catch (Exception e) {
				System.out.println("Erro TratoresDAO.inserir(): "
					+ e.getMessage());
		}

		return retorno;
	}

	public boolean alterar(TratoresImplementos antigo, TratoresImplementos novo){
		boolean retorno = false;
		try {
			String sql = "update trator set eTrator = ?, apelido = ?, marca = ?, modelo = ?, novo = ?, vidaUtil = ?, tdp = ?,  tracao = ?, motor = ?, cilindros = ?, sucata = ?,  horasEstimadas = ?, aspiracao  = ?, potencia  = ?, ano  = ?,  usoAnual  = ?, hidraulico  = ?, cor = ? where id = ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setBoolean(1, novo.iseTrator());
			stm.setString(2, novo.getApelido());
			stm.setString(3,  novo.getMarca());
			stm.setString(4, novo.getModelo());
			stm.setString(5, novo.getNovo());
			stm.setString(6, novo.getVidaUtil());
			stm.setString(7, novo.getTdp());
			stm.setString(8,  novo.getTracao());
			stm.setString(9,  novo.getMotor());
			stm.setString(10, novo.getCilindros());
			stm.setString(11, novo.getSucata());
			stm.setString(12,  novo.getHorasEstimadas());
			stm.setString(13, novo.getAspiracao());
			stm.setString(14, novo.getPotencia());
			stm.setString(15, novo.getAno());
			stm.setString(16, novo.getUsoAnual());
			stm.setString(17,  novo.getHidraulico());
			stm.setString(18,  novo.getCor());
			stm.setLong(19,  antigo.getId());
			int alteracoes = stm.executeUpdate();
			if (alteracoes > 0)
				retorno = true;
		} catch (Exception e) {
			System.out.println("Erro TratorDAO.alterar(...): "
					+ e.getMessage());
		}
		return retorno;
	}
	public List<TratoresImplementos> pesquisar(String apelido, String marca, String modelo, String tracao, int ano, String cor, String motor, String aspiracao, String cilindros, String potencia){
		List<TratoresImplementos> tratores = new Vector<TratoresImplementos>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs;
			if(ano != -1){
				rs = stm.executeQuery("SELECT * FROM TRATOR WHERE " +
					"APELIDO='"+apelido+ "' or marca='"+ marca+"' or modelo='"+ modelo+"' or tracao='"+tracao+"' or ano="+ ano +" or cor='"+cor+"' or motor='"+motor+"' or   aspiracao='"+aspiracao+"' or cilindros='" + cilindros+"' or potencia = '"+potencia+"';");
			}else{
				rs = stm.executeQuery("SELECT * FROM TRATOR WHERE " +
					"APELIDO='"+apelido+ "' or marca='"+ marca+"' or modelo='"+ modelo+"' or tracao='"+tracao+"' or cor='"+cor+"' or motor='"+motor+"' or   aspiracao='"+aspiracao+"' or cilindros='" + cilindros+"' or potencia = '"+potencia+"';");
			}
			while (rs.next()) {
				TratoresImplementos t = new TratoresImplementos();
				t.setId(rs.getInt("id"));
				t.setApelido(rs.getString("apelido"));
//				t.setAno(rs.getInt("ano"));
				t.setAspiracao(rs.getString("aspiracao"));
				t.setCilindros(rs.getString("cilindros"));
				t.setCor(rs.getString("cor"));
				t.setMarca(rs.getString("marca"));
				t.setModelo(rs.getString("modelo"));
				t.setMotor(rs.getString("motor"));
				t.setPotencia(rs.getString("potencia"));
				t.setTracao(rs.getString("tracao"));
				tratores.add(t);
			}
			rs.close();
			stm.close();
			con.commit();
		} catch (Exception e) {
			System.out.println("Erro TratorDAO.pesquisar(...): "
					+ e.getMessage());
		}
		return tratores;
	}
	
	public Vector<TratoresImplementos> pesquisar(){
		Vector<TratoresImplementos> tratores = new Vector<TratoresImplementos>();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM TRATOR");
			while (rs.next()) {
				TratoresImplementos t = new TratoresImplementos();
				t.setId(rs.getInt("id"));
				t.seteTrator(rs.getBoolean("eTrator"));
				t.setApelido(rs.getString("apelido"));
				t.setMarca(rs.getString("marca"));
				t.setModelo(rs.getString("modelo"));
				t.setNovo(rs.getString("novo"));
				t.setVidaUtil(rs.getString("vidaUtil"));
				t.setTdp(rs.getString("tdp"));
				t.setTracao(rs.getString("tracao"));
				t.setMotor(rs.getString("motor"));
				t.setCilindros(rs.getString("cilindros"));
				t.setSucata(rs.getString("sucata"));
				t.setHorasEstimadas(rs.getString("horasEstimadas"));
				t.setAspiracao(rs.getString("aspiracao"));
				t.setPotencia(rs.getString("potencia"));				
				t.setAno(rs.getString("ano"));
				t.setUsoAnual(rs.getString("usoAnual"));
				t.setHidraulico(rs.getString("hidraulico"));
				t.setCor(rs.getString("cor"));
				tratores.add(t);
			}
		} catch (Exception e) {
			System.out.println("Erro TratorDAO.pesquisar(): "
					+ e.getMessage());
		}
		return tratores;
	}
}
